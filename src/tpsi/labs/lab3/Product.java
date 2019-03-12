package tpsi.labs.lab3;

public class Product {
    private Integer id;
    private String name;
    private Double price;
    private String category;

    public Product(Integer id, String name, Double price, String category){
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public Integer getId(){
        return id;
    }
    public String getCategory(){
        return category;
    }
    @Override
    public String toString(){
        return id+" "+name+" "+price+" "+category;
    }

}
