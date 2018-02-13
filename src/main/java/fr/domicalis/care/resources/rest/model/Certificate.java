package fr.domicalis.care.resources.rest.model;

public class Certificate {

    private String delivery;
    private String expiration;
    private String product;
    private String version;
    private String customer;
    private String type;

    /**
     * @return version
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets new expiration
     *
     * @param expiration new value of expiration.
     */
    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return product;
    }

    /**
     * @return delivery
     */
    public String getDelivery() {
        return delivery;
    }

    /**
     * Sets new product
     *
     * @param product new value of product.
     */
    public void setProduct(String product) {
        this.product = product;
    }

    /**
     * Sets new type
     *
     * @param type new value of type.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Sets new version
     *
     * @param version new value of version.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return customer
     */
    public String getCustomer() {
        return customer;
    }

    /**
     * Sets new delivery
     *
     * @param delivery new value of delivery.
     */
    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    /**
     * @return expiration
     */
    public String getExpiration() {
        return expiration;
    }

    /**
     * Sets new customer
     *
     * @param customer new value of customer.
     */
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }
}
