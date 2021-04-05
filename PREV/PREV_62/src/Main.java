import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        AdvanceArray array = new AdvanceArray();
        for (int i = 0; i < n; i++){
            array.add(new Line(scanner.nextLine()));
        }
        System.out.println(array.getCount());
    }
}

class AdvanceArray extends ArrayList<Line> {
    private int count = 0;

    @Override
    public boolean add(Line lineTarget) {
        if (this.size() == 0){
            count = 2;
            return super.add(lineTarget);
        }
        ArrayList<Point> array = new ArrayList<>();
        for (Line line : this) {
            if (line.isCoincideWith(lineTarget)) {
                return true;
            }
            Point point = line.getIntersection(lineTarget);
            if (point == null){
                continue;
            }
            if (!array.contains(point)){
                array.add(point);
            }
        }
        this.count += array.size() + 1;
        return super.add(lineTarget);
    }

    public int getCount() {
        return count;
    }
}

class Line {
    private final int a;
    private final int b;

    Line(String line){
        String[] s = line.split(" ");
        a = Integer.parseInt(s[0]);
        b = Integer.parseInt(s[1]);
    }

    public Point getIntersection(Line line){
        if (line.a == this.a){
            return null;
        } else {
            return new Point(
                    ((double) line.b - b) / (a - line.a),
                    ((double) a * line.b - b * line.a) / (a - line.a)
            );
        }
    }

    public boolean isCoincideWith(Line line){
        return a == line.a & b == line.b;
    }
}

class Point {
    private final double x;
    private final double y;

    Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}