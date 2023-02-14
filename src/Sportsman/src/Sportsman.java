public class Sportsman {
    int point = 50;
    int point1 = 50;
    int point2 = 50;
    int point3 = 50;
    int point4 = 50;
    public Sportsman(int point1, int point2, int point3, int point4) {
        setPoint1(point1);
        setPoint2(point2);
        setPoint3(point3);
        setPoint4(point4);
    }
    public Sportsman(int...point) {
        for (int i = 0; i < point.length; i++) {
            this.point = point[i];
        }
    }
    public void setPoint1(int point1) {
        if (point1 >= 50 && point1 <= 100) {
            this.point1 = point1;
        } else if (point1 > 100) {
            this.point1 = 100;
        }
    }

    public void setPoint2(int point2) {
        if (point2 >= 50 && point2 <= 100) {
            this.point2 = point2;
        } else if (point2 > 100) {
            this.point2 = 100;
        }
    }

    public void setPoint3(int point3) {
        if (point3 >= 50 && point3 <= 100) {
            this.point3 = point3;
        } else if (point3 > 100) {
            this.point3 = 100;
        }
    }

    public void setPoint4(int point4) {
        if (point4 >= 50 && point4 <= 100) {
            this.point4 = point4;
        } else if (point4 > 100) {
            this.point4 = 100;
        }

    }
    public double theArithmeticMeanOfANumber(int... points) {
        int sum = 0;
        for (int i = 0; i < points.length; i++) {
            sum = (sum + points[i]/2);
        } return sum;
    }
}
