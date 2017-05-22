import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Bitbucket extends ArrayList<Integer> {

    public Integer minValue() {
        return Collections.min(this);
    }

    public Integer maxValue() {
        return Collections.max(this);
    }

    public double getArithmeticMean(){
        Integer sum = 0;
        for (Integer value:this) { sum += value;}
        return (double) sum / this.size();
    }

    @Override
    public boolean add(Integer integer) {
        Iterator<Integer> a = this.iterator();
        for (int i = 0; a.hasNext(); ++i) {
            this.set(i, (a.next() + integer));
        }
        return super.add(integer);
    }

    @Override
    public Integer remove(int index) {
        Iterator<Integer> a = this.iterator();
        Integer value = this.get(index);
        for (int i = 0; a.hasNext(); ++i) {
            this.set(i, (a.next() - value));
        }
        return super.remove(index);
    }
}



