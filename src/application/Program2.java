package application;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
//import model.dao.SellerDao;
import model.entities.Department;
//import model.entities.Seller;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== TESTE 1: seller findById ===");
		Department department = departmentDao.findById(3);
		System.out.println(department);
		
		
		System.out.println("\n=== TESTE 3: seller findAll ===");
		List<Department> list = departmentDao.findAll();
		for (Department obj : list) {
			System.out.println(obj);	
		}
		
		
		System.out.println("\n=== TESTE 4: seller insert ===");
		Department newDepartment = new Department(null,"IT");
		departmentDao.insert(newDepartment);
		System.out.println("Incluido ! Novo Id = "+newDepartment.getId());

		System.out.println("\n=== TESTE 5: seller update ===");
		department = departmentDao.findById(1);
		department.setName("New Name");
		departmentDao.update(department);
		System.out.println("Update completo !");

		System.out.println("\n=== TESTE 6: seller delete ===");
		System.out.println("Enter id for delete test: ");
		int id = sc.nextInt();

		departmentDao.deleteById(id);
		System.out.println("Delete completo !");
		
		sc.close();

	}

}
