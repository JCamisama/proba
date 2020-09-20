package com.isad.bertsioak;

import java.util.ArrayList;

public class Hauteskundeak {

	private ArrayList<String> mahaiak = new ArrayList<>();

	@Override
	public String toString() {
		StringBuilder emaitza = new StringBuilder();
		for (var mahai : mahaiak) {
			emaitza.append(mahai).append(" ");
		}
		return emaitza.toString();
	}
	private void gehituMahaia(String mahai) {
			mahaiak .add(mahai);
	}

	public static void main(String[] args) {
		Hauteskundeak h2021 = new Hauteskundeak();

		h2021.gehituMahaia("Irun");
		h2021.gehituMahaia("Donostia");
		h2021.gehituMahaia("Tolosa");
		h2021.gehituMahaia("Bergara");
		h2021.gehituMahaia("Andoain");
		h2021.gehituMahaia("Hernani");
		h2021.gehituMahaia("Jonport");
		h2021.gehituMahaia("Talka");


		h2021.gehituMahaia("Nada que decir");

		System.out.println(h2021);
	}

}
