public class GeneradorEmail {
    public static void main(String[] args) {

        System.out.println("*** Generador de Email ***");

        var nombeUsuario = "Chop Wilfredo Gonzalez";
        var nombreUsuarioNorma = nombeUsuario.toLowerCase().replace(" ", ".");
        //System.out.println("nombreUsuarioNorma = " + nombreUsuarioNorma);

        var nombreEmpresa = "Global Splytin";
        var extensionDominio = ".com.es";
        
        var dominioEmailNorma = "@" + nombreEmpresa.toLowerCase().replace(" ", "") + extensionDominio;
        //System.out.println("dominioEmailNorma = " + dominioEmailNorma);

        var emailFinal = nombreUsuarioNorma.concat(dominioEmailNorma);
        System.out.println("emailFinal = " + emailFinal);



    }



}
