package smallWorld;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import fengci.TestMain;
import ICTCLAS.I3S.AC.ICTCLAS50;

public class PreProcessing {

	public static void main(String[] args) {
		System.out.println(isSmallWorld(0, 0, "C:\\Users\\j\\Desktop\\test.xlsx","test.xlsx"));
	}

	public static boolean chooseNodes(String filePath, String fileName,
			int f_thr) {
		try {

			FileInputStream file = new FileInputStream(new File(filePath));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			int sheetIndex = 0;
			XSSFSheet sheet = workbook.getSheetAt(sheetIndex);

			XSSFWorkbook writeWorkbook = new XSSFWorkbook();
			XSSFSheet writeSheet = writeWorkbook.createSheet("0");
			int writeRowCount = 0;
			String outFile = filePath.replace(fileName, "��ѡ���.xlsx");

			String target;
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				// For each row, iterate through all the columns
				Cell cell_count = row.getCell(1);

				// Check the cell type and format accordingly
				switch (cell_count.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell_count.getNumericCellValue() + "t");
					break;
				case Cell.CELL_TYPE_STRING:
					target = cell_count.getStringCellValue();
					int num = Integer.parseInt(target);
					// if(this.kmp_match(target, pattern){
					if (num >= f_thr) {
						Row writeRow = writeSheet.createRow(writeRowCount++);
						Cell cell_noun = row.getCell(0);
						Cell writeCell_noun = writeRow.createCell(0);
						Cell writeCell_count = writeRow.createCell(1);
						writeCell_noun.setCellValue(cell_noun
								.getStringCellValue());
						writeCell_count.setCellValue(target);

					}

					break;
				}

			}
			file.close();

			System.out.println(outFile);
			FileOutputStream outFileStream = new FileOutputStream(new File(
					outFile));
			writeWorkbook.write(outFileStream);
			outFileStream.close();
			return true;
		}

		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	public static int[][] bulidMatrix(int f_thr, double j_thr,
			String sourceFilePath, String sourceFileName) {
		// �ȷִ�
		TestMain testMain = new TestMain(sourceFilePath, sourceFileName);
		String wordFrequencyPath = sourceFilePath.replace(sourceFileName,
				"��Ƶ.xlsx");
		String nodesChosenPath = sourceFilePath.replace(sourceFileName,
				"��ѡ���.xlsx");
		// ɸѡ���
		chooseNodes(wordFrequencyPath, "��Ƶ.xlsx", f_thr);
		int[][] matrix = null;
		// �����ļ�
		try {
			StringBuffer input = new StringBuffer();
			FileInputStream file = new FileInputStream(new File(sourceFilePath));
			XSSFWorkbook workbook = new XSSFWorkbook(file);
			XSSFSheet sheet = workbook.getSheetAt(0);
			Iterator<Row> rowIterator = sheet.iterator();
			while (rowIterator.hasNext()) {
				Row row = rowIterator.next();
				Iterator<Cell> cellIterator = row.cellIterator();
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cell.getCellType()) {
					case Cell.CELL_TYPE_NUMERIC:
						break;
					case Cell.CELL_TYPE_STRING:
						input.append(cell.getStringCellValue());

					}
				}
			}
			file.close();
			// ��ԭ���з�Ϊ�������
			String[] sentences = Pattern.compile("[������]").split(input);

			// ���ʻ����wordMap;
			Map<Integer, String> wordMap = new HashMap<Integer, String>();
			FileInputStream nodesChosenFile = new FileInputStream(new File(
					nodesChosenPath));
			XSSFWorkbook nodesChosenBook = new XSSFWorkbook(nodesChosenFile);
			XSSFSheet nodesChosenSheet = nodesChosenBook.getSheetAt(0);
			Iterator<Row> nodesChosenRowIterator = nodesChosenSheet.iterator();
			int rowCount = 0;
			while (nodesChosenRowIterator.hasNext()) {
				Row row = nodesChosenRowIterator.next();
				Cell cell = row.getCell(0);

				// Check the cell type and format accordingly
				switch (cell.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue() + "t");
					break;
				case Cell.CELL_TYPE_STRING:
					String target = cell.getStringCellValue();
					wordMap.put(rowCount, target);
					break;
				}
				rowCount++;
			}

			// nw[i]��¼�ʻ�i���ֵľ�����
			int[] nw = new int[rowCount];
			for (int i = 0; i < rowCount; i++) {
				nw[i] = 0;
			}
			// ����ÿ���ʻ��ھ����г��ֵĴ���
			for (int i = 0; i < sentences.length; i++) {
				for (int j = 0; j < rowCount; j++) {
					String word = wordMap.get(j);
					if (BM_algorithm.bm_match(sentences[i], word)) {
						nw[j]++;
					}
				}
			}

			// �ó��ʻ㹲��ͼ���þ����ʾ��matrixΪ�ʻ㹲��ͼ��0��ʾ����ʻ㣬1��ʾ�ʻ���ֱ����ϵ��65535��ʾ�ʻ�û��ֱ����ϵ
			matrix = new int[rowCount][rowCount];
			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < rowCount; j++) {
					int nw_i = nw[i];
					int nw_j = nw[j];
					int nw_i_j = 0;
					for (int k = 0; k < sentences.length; k++) {
						if (BM_algorithm.bm_match(sentences[k], wordMap.get(i))) {
							if (BM_algorithm.bm_match(sentences[k],
									wordMap.get(j))) {
								// һ������ͬʱ���ִʻ�i,�ʻ�j
								nw_i_j++;
							}
						}

					}
					// ��nw_i_j Ϊ0 ������Ϊ�ʻ�i,j�޹�ϵ
					if (nw_i_j == 0) {
						matrix[i][j] = 65535;
					} else {
						// ����ó�Jaccard ϵ��
						double jw_i_j = (nw_i + nw_j) / (double) nw_i_j;
						if (jw_i_j >= j_thr) {
							matrix[i][j] = 1;
						}
					}

				}
			}
			for (int i = 0; i < rowCount; i++) {
				matrix[i][i] = 0;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return matrix;
	}

	// //matrixΪ�ʻ㹲��ͼ��0��ʾ����ʻ㣬1��ʾ�ʻ���ֱ����ϵ��65535��ʾ�ʻ�û��ֱ����ϵ,���յó���matrixΪ�ʻ���ʻ�֮������·��
	public static void findShortestPath(int[][] matrix) {
		int rowCount = matrix.length;
		for (int k = 0; k < rowCount; k++) {
			for (int i = 0; i < rowCount; i++) {
				for (int j = 0; j < rowCount; j++) {
					int old = matrix[i][j];
					int newValue = matrix[i][k] + matrix[k][j];
					matrix[i][j] = old < newValue ? old : newValue;
				}
			}
		}
	}

	// ��������·������,����matrix�Ѿ��Ǳ�ʾ�ʻ���ʻ������·����
	public static double computeFeature(int[][] matrix) {
		int rowCount = matrix.length;
		double sum = 0;
		for (int i = 0; i < rowCount; i++) {
			double dv = 0;
			for (int j = 0; j < rowCount; j++) {
				dv = dv + matrix[i][j];
			}
			dv = dv / rowCount;
			sum += dv;
		}
		double d = sum / rowCount;
		return d;
	}

	// matrixΪ�ʻ㹲��ͼ��0��ʾ����ʻ㣬1��ʾ�ʻ���ֱ����ϵ��65535��ʾ�ʻ�û��ֱ����ϵ
	public static boolean isSmallWorld(int f_thr, double j_thr,
			String sourceFilePath, String sourceFileName) {
		// matrixΪ�ʻ㹲��ͼ��0��ʾ����ʻ㣬1��ʾ�ʻ���ֱ����ϵ��65535��ʾ�ʻ�û��ֱ����ϵ
		int[][] matrix = bulidMatrix(f_thr, j_thr, sourceFilePath,
				sourceFileName);
		// k��¼���дʵ�������
		// k_ave��ʾÿ���ʵ�ƽ��������
		int k = 0;
		double k_ave = 0;
		double c_rand = 0;
		int rowCount = matrix.length;
		for (int i = 0; i < rowCount; i++) {
			for (int j = 0; j < rowCount; j++) {
				if (matrix[i][j] == 1) {
					k += 1;
				}
			}
		}

		k_ave = k / rowCount;
		c_rand = k_ave / rowCount;
		double d_rand = Math.log(rowCount) / Math.log(k_ave);

		// ����ʻ㹲��ͼ�ľۼ���
		double C = Aggregation.calculate(matrix);

		// �ҵ��ʻ㹲��ͼ�����·�����þ����ʾ
		findShortestPath(matrix);
		// ����ʻ㹲��ͼ������·������

		double d = computeFeature(matrix);

		if (C > c_rand && d > d_rand) {
			return true;
		} else {
			return false;
		}

	}
}
