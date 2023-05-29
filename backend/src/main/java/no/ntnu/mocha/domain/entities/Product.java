package no.ntnu.mocha.domain.entities;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Represents a product and it's details.
 * 
 * @since   06.02.2023
 * @version 22.04.2023
 */
@Entity
@Table(name = "product")
public class Product {
    
    /** Product ID (primary key) represented as Long in the database. */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, name = "product_id")
    private long id;

    /** Image ID (foreign key to Image) represented as Long in the database. */
    @OneToOne
    @JoinColumn(name = "image_id")
    private Image image;

    /** Product name, represented as Varchar(255). */
    @Column(name = "name")
    private String name;

    /** Product price, represented as Int(11). */
    @Column(name = "price")
    private double price;

    /** Size of the product measured in weight, represented as Int(11). */
    @Column(name = "amount")
    private String size;

    /** Description text for the product, represented as Text. */
    @Column(name = "description")
    private String description;

    /** Indicating wether to display the product on the website or not, represented as Boolean. */
    @Column(name = "display")
    private boolean display;

    @ManyToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "pc_id")
    private ProductCategory productCategory;

    /** Number of purchases of the given product */
    @Column(name = "purchases")
    private int totalBought = 0;


    /**
     * Empty constructor.
     */
    public Product() {}

    /**
     * Creates an instance of Product.
     * 
     * @param name          the name of the product (e.g., "CofeeDockery")
     * @param price         the price of the product (measured in kr)
     * @param size          the size of the product (e.g., 25.9)
     * @param description   the description of the product (e.g., "This is a dark mocha cofee")
     * @param display       the display of the product (boolean true/false)
     */
    public Product(String name, double price, String size, String description, boolean display, Image image) {
        super();
        this.name = name;
        this.price = price;
        this.size = size;
        this.description = description;
        this.display = display;
        this.image = image;
        this.totalBought = 0;
    }

    /**
     * Returns the id of the product.
     * 
     * @return the id of the product
     */
    public long getId() {
        return id;
    }

    /**
     * Set the id of the product.
     * 
     * @param id the id of the product
     */
    public void setPid(long id) {
        this.id = id;
    }

    /**
     * Returns the name of the product.
     * 
     * @return the name of the product
     */
    public String getName() {
        return name;
    }

    /**
     * Set the name of the product.
     * 
     * @param name the name of the product
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the price of the product.
     * 
     * @return the price of the product
     */
    public double getPrice() {
        return price;
    }

    /**
     * Set the price of the product.
     * 
     * @param price the price of the product
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * Returns the size of the product.
     * 
     * @return the size of the product
     */
    public String getSize() {
        return size;
    }

    /**
     * Set the size of the product.
     * 
     * @param size the size of the product
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * Returns the description of the product.
     * 
     * @return the description of the product
     */
    public String getDescription() {
        return description;
    }

    /**
     * Set the description of the product.
     * 
     * @param description the description of the product
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Returns the display of the product.
     * 
     * @return the display of the product
     */
    public boolean getDisplay() {
        return display;
    }

    /**
     * Set the display of the product.
     * 
     * @param display the display of the product
     */
    public void setDisplay(boolean display) {
        this.display = display;
    }

    /**
     * Returns the product category of the given
     * product.
     * 
     * @return  the product category of the given product.
     */
    public ProductCategory getCategory() {
        return productCategory;
    }

    /**
     * Sets the product category of the given product.
     * 
     * @param productCategory   the product category of the
     *                          given product.
     */
    public void setCategory(ProductCategory productCategory) {
        this.productCategory = productCategory;
    }

    public int getTotalBought() {
        return totalBought;
    }

    public void setTotalBought(int totalBought) {
        this.totalBought = totalBought;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
}