package com.cg.frs.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.cg.frs.dto.FlatRegistrationDTO;
import com.cg.frs.exceptions.OwnerIDDoesNotExistException;
import com.cg.frs.service.FlatRegistrationServiceImpl;

public class Client {
	FlatRegistrationDTO flat = new FlatRegistrationDTO();
	FlatRegistrationServiceImpl service = new FlatRegistrationServiceImpl();
	Scanner input = new Scanner(System.in);
	ArrayList list = new ArrayList();

	void selection() {
		list = service.getAllOwnerIds();
		do {
			System.out.println("Menu 1.FlatRegistration 2.Exit");
			int choice = input.nextInt();

			switch (choice) {
			case 1:

				System.out.println("Existing Owner IDS Are:-" + list);

				System.out.println("Please enter your owner id from above list:");
				flat.setOwner_ID(input.nextInt());
				int Owner_ID = flat.getOwner_ID();

				boolean value = service.idCheck(Owner_ID, list);

				if (value) {
					System.out.println("Select flat type:");
					
					flat.setFlat_Type(input.next());
					if(flat.getFlat_Type().contentEquals("a") || flat.getFlat_Type().contentEquals("b")) {
					System.out.println("Enter Flat area in sq.ft:");
					flat.setFlat_Area(input.nextDouble());
					System.out.println("Enter desired rent amount Rs:");
					flat.setRent_Amount(input.nextDouble());
					System.out.println("Enter desired deposit amount Rs:");
					flat.setDeposit_Amount(input.nextDouble());

					flat = service.registerFlat(flat);
					System.out.println("Flat successfully registered. Registration id:" + flat.getFlat_Reg_No());
				}
					}

				break;
			case 2:
				System.exit(0);
				break;
			}

		} while (true);
	}

	public static void main(String[] args) {
		Client client = new Client();
		client.selection();

	}

}
