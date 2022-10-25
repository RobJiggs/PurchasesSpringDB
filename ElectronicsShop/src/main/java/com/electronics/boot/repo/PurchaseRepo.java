/**
 * 
 */
package com.electronics.boot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electronics.boot.entity.Purchase;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 24, 2022
 */
@Repository
public interface PurchaseRepo extends JpaRepository<Purchase, Integer>{

}
