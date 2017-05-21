import java.util.ArrayList;
import java.util.Iterator;

public class Bitbucket extends ArrayList<Integer> {

    public Integer minValue() {
        if (this.isEmpty()) {
            return 0;
        }
        Integer min = this.get(0);
        for (Integer value : this) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public Integer maxValue() {
        if (this.isEmpty()) {
            return 0;
        }
        Integer max = this.get(0);
        for (Integer value : this) {
            if (value > max) {
                max = value;
            }
        }
        return max;
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



