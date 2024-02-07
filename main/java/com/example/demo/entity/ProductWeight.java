package com.example.demo.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "ProductWeights")
public class ProductWeight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "weight_id")
    private int weightId;

    @ManyToOne
    @JoinColumn(name = "product_id", referencedColumnName = "product_id")
    private Product product;

    @Column(name = "weight_value")
    private int weightValue;

	public int getWeightId() {
		return weightId;
	}

	public void setWeightId(int weightId) {
		this.weightId = weightId;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getWeightValue() {
		return weightValue;
	}

	public void setWeightValue(int weightValue) {
		this.weightValue = weightValue;
	}

    // Getters and setters
}
