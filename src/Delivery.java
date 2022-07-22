public class Delivery {

    public String weight; //��
    public String adres;
    public String number; //��������������� �����
    private final String fragileCargo;
    private final String canting;

    public Delivery (String fragileCargo, String canting){
        this.fragileCargo = fragileCargo;
        this.canting = canting;
    }

    public Delivery () {
        weight = "N/A";
        adres = "N/A";
        number = "N/A";
        fragileCargo = "���������! ������� ����!";
        canting = "���������! �� ��������������!";
    }
    public Delivery setCanting (String canting) {
        return new Delivery(fragileCargo, canting);
    }
    public Delivery setFragileCargo (String fragileCargo) {
        return new Delivery(fragileCargo, canting);
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public void setAdress(String adress) {
        this.adres = adress;
    }

    public void setWeight (String weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight;
    }

    public String getAdress() {
        return adres;
    }

    public String getNumber() {
        return number;
    }

    public String getFragileCargo() {
        return fragileCargo;
    }

    public String getCanting() {
        return canting;
    }
    public String toString () {
        return "���: " + weight + "\n" +
                "�����: " + adres + "\n" +
                "��������������� �����: " + number + "\n" +
                fragileCargo + "\n" +
                canting + "\n";
    }
    }
