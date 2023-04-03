public class FindMax {
    static class Circle implements Comparable<Circle>{
        private double radius;

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        @Override
        public int compareTo(Circle o) {
            if(this.radius>o.radius)
                return 1;
            else if(this.radius<o.radius)
                return -1;
            else
                return 0;
        }

        public static<E extends Comparable<E>> E max(E[] list){
            E max=list[0];

            for (int i = 0; i < list.length; i++) {
                if(list[i].compareTo(max)>0)
                    max=list[i];
            }

            return max;
        }

        public static void main(String[] args) {
            Integer[] intArray={1,2,3};
            String[] strArray={"red","green","blue"};
            Circle[] c1={new Circle(3.0),new Circle(2.9),new Circle(5.9)};

            System.out.println("Max of intArray is "+max(intArray));
            System.out.println("Max of strArray is "+max(strArray));
            System.out.println("Max of c1 is "+max(c1).getRadius());
        }

    }
}
