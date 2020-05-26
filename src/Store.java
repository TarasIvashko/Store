import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Store {
    private List<Product> list;

    public Store() {
        this.list = new ArrayList<Product>();
    }

    public List<Product> getList() {
        return list;
    }

    public void setList(Product p) {
        boolean b=false;
        char[] chars =p.getName().toCharArray();
        for (char c:chars) {
            if(Character.isDigit(c)) b=true;
        }
        if(p.getCost()>0 && !b){
            this.list.add(p);
        }
    }
    public void add(Product p){
        setList(p);
    }

    public void delite(String name) {
        Iterator<Product> i =list.iterator();
        while (i.hasNext()){
           if(i.next().getName().equals(name)){
               i.remove();
           }

        }
        System.out.println(this.list);
    }
    public void multipliCost(Type t){
        for (Product p: this.list) {
            if(p.getType() == t){
                p.setCost(p.getCost()*2);
            }
        }
        System.out.println(list);
    }
    public void luxuriProduct(double cost){
        List <Product>l = new ArrayList<Product>();
        for (Product p: this.list) {
            if(p.getCost() > cost){
                l.add(p);
            }
        }

            System.out.println(l);

    }
}
