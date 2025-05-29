package co.com.LOGIN.models;


public class    CredencialesRegister {

    private String contraseña;

    private String firstName;

    private String apellido;

    private String direccion;


    private String estado;

    private String ciudad;

    private String codigo_Postal;

    private String movil;


    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String Apellido) {
        this.apellido = Apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String Direccion) {
        this.direccion = Direccion;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.ciudad = Ciudad;
    }

    public String getCodigo_Postal() {
        return codigo_Postal;
    }

    public void setCodigo_Postal(String Codigo_Postal) {
        this.codigo_Postal = Codigo_Postal;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String Movil) {
        this.movil = Movil;
    }


    public CredencialesRegister(String Contraseña,  String FirstName, String Apellido, String Direccion, String Estado, String Ciudad, String Codigo_Postal, String Movil) {
        this.contraseña = Contraseña;
        this.firstName = FirstName;
        this.apellido = Apellido;
        this.direccion = Direccion;
        this.estado = Estado;
        this.ciudad = Ciudad;
        this.codigo_Postal = Codigo_Postal;
        this.movil = Movil;
    }
}