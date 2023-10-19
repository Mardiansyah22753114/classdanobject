public class infotugass {
    private int id;
    private String judul;
    private String deskripsi;
    private String date;

    public infotugass(int id, String judul, String deskripsi, String date) {
        this.id = id;
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.date = date;
    }

    // Metode getter untuk mengambil nilai id
    public int getId() {
        return id;
    }

    // Metode setter untuk mengatur nilai id
    public void setId(int id) {
        this.id = id;
    }

    // Metode getter untuk mengambil nilai judul
    public String getJudul() {
        return judul;
    }

    // Metode setter untuk mengatur nilai judul
    public void setJudul(String judul) {
        this.judul = judul;
    }

    // Metode getter untuk mengambil nilai deskripsi
    public String getDeskripsi() {
        return deskripsi;
    }

    // Metode setter untuk mengatur nilai description
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    // Metode getter untuk mengambil nilai tanggal
    public String getDate() {
        return date;
    }

    // Metode setter untuk mengatur nilai date
    public void setDate(String date) {
        this.date = date;
    }

    public static void main(String[] args) {
        // Contoh penggunaan kelas planingtask
        infotugass task = new infotugass(1, "Membuat Info Tugas", "Mengerjakan Projek Todo List", "2023-10-12");

        // Mengakses nilai properti
        System.out.println("ID: " + task.getId());
        System.out.println("Judul: " + task.getJudul());
        System.out.println("Deskripsi: " + task.getDeskripsi());
        System.out.println("date: " + task.getDate());

        // Mengubah nilai properti
        task.setDeskripsi("Mengubah status task");
        task.setDate("2023-10-20");
        task.setJudul("Mengerjakan project class & object");

        System.out.println("status setelah diubah: " + task.getDeskripsi());
        System.out.println("Tanggal setelah diubah: " + task.getDate());
        System.out.println("Judul setelah diubah: " + task.getJudul());
    }
}

