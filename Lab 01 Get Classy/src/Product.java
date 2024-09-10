public class Product {
    private String name;
    private String description;
    private String ID;
    private double cost;

    /**
     * Constructor for Product class.
     * @param name The name of the product
     * @param description A short description of the product
     * @param ID The unique identifier for the product
     * @param cost The cost of the product
     */
    public Product(String name, String description, String ID, double cost) {
        this.name = name;
        this.description = description;
        this.ID = ID;
        this.cost = cost;
    }

    // Getters
    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getID() { return ID; }
    public double getCost() { return cost; }

    // Setters (except for ID)
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setCost(double cost) { this.cost = cost; }

    /**
     * Returns a CSV representation of the product.
     * @return String containing product's data in CSV format
     */
    public String toCSV() {
        return String.format("%s,%s,%s,%.2f", ID, name, description, cost);
    }

    /**
     * Returns a JSON representation of the product.
     * @return String containing product's data in JSON format
     */
    public String toJSON() {
        return String.format("{\"ID\":\"%s\",\"name\":\"%s\",\"description\":\"%s\",\"cost\":%.2f}",
                ID, name, description, cost);
    }

    /**
     * Returns an XML representation of the product.
     * @return String containing product's data in XML format
     */
    public String toXML() {
        return String.format("<product><ID>%s</ID><name>%s</name><description>%s</description><cost>%.2f</cost></product>",
                ID, name, description, cost);
    }

    @Override
    public String toString() {
        return String.format("Product{ID='%s', name='%s', description='%s', cost=%.2f}",
                ID, name, description, cost);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.cost, cost) == 0 &&
                name.equals(product.name) &&
                description.equals(product.description) &&
                ID.equals(product.ID);
    }
}