public class Dimensions {
    public String width; //������
    public String height; //������
    public String length; //�����

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
        return "������: " + width + "\n" +
                "������: " + height + "\n" +
                "�����: " + length;
    }
}

