public class ManagePost {
    private String[] filmNames = new String[0];
    private String title;
    public int size;

    public ManagePost(){
        size = 10;
    }

    public ManagePost(int size) {
        this.size = size;
    }

    public void save(String title) {
        String[] tmp = new String[filmNames.length + 1];
        for (int i = 0; i < filmNames.length; i++) {
            tmp[i] = filmNames[i];
        }
        tmp[tmp.length - 1] = title;
        filmNames = tmp;
    }

    public String[] findAll()  {
        return filmNames;
    }

    public String[] findLast(int size) {
        int resultLength;
        if (filmNames.length < size) {
            resultLength = filmNames.length;
        } else {
            resultLength = size;
        }
        String[] tmp = new String[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] =filmNames[filmNames.length - 1 - i];
        }
        return tmp;
    }

}
