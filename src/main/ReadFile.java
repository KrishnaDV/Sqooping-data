package main;

import java.io.BufferedReader;
//import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import dao.ReadFile_dao;
import dto.ReadFile_dto;

public class ReadFile {

	public static void main(String[] args) throws IOException {

		String input = "/home/hduser/Desktop/NASDAQ_daily_prices_B.csv";

		String line = null;

		FileReader fr = new FileReader(input);

		BufferedReader br = new BufferedReader(fr);
		
		List<ReadFile_dto> list = new ArrayList<ReadFile_dto>();

		while ((line = br.readLine()) != null) {

			String[] a = line.split(",");

			String exchange = a[0];

			String s_sym = a[1];

			String dt = a[2];

			float s_p_o = Float.parseFloat(a[3]);

			float s_p_h = Float.parseFloat(a[4]);

			float s_p_l = Float.parseFloat(a[5]);

			float s_p_c = Float.parseFloat(a[6]);

			int s_v = Integer.parseInt(a[7]);

			float s_p_a_c = Float.parseFloat(a[8]);

			ReadFile_dto rf = new ReadFile_dto(exchange, s_sym, dt, s_p_o,
					s_p_h, s_p_l, s_p_c, s_v, s_p_a_c);

			// System.out.println(rf);

			

			list.add(rf);


		}

		ReadFile_dao r = new ReadFile_dao();

		r.insertrecord(list);
		
		br.close();
		System.out.println("execution completed");

	}

}
