public class Dimensions {
    public String width; //ширина
    public String height; //высота
    public String length; //длина

    public Dimensions() {
        width = "N/A";
        height = "N/A";
        length = "N/A";
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getLength() {
        return length;
    }

    public String toString() {
        return "Ширина: " + width + "\n" +
                "Высота: " + height + "\n" +
                "Длина: " + length;
    }
}

