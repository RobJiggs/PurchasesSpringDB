/**
 * 
 */
package com.electronics.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.electronics.boot.entity.Purchase;
import com.electronics.boot.repo.PurchaseRepo;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 24, 2022
 */
@RestController
@RequestMapping("api/purchase")
public class PurchaseController {
	
	
		@Autowired
		PurchaseRepo purchaseRepo;

		@GetMapping("/getpurchase")
		private List<Purchase> getAllPurchase(){
			
			
			return purchaseRepo.findAll();
		}
		@PostMapping("/addpurchase")
		Purchase newPurchase(@RequestBody Purchase purchase) {
			return purchaseRepo.save(purchase);
			
		}
		
		@DeleteMapping("/deletepurchase/{id}")
		String delete(@PathVariable("id") int id){
			purchaseRepo.deleteById(id);
			
			return "Deletion of" + " "+ "purchase "+ " " + id + " " + "success";
			
			
		}

}
