public class User {
    private String idusers;
    private String roleid;
    private String email;
    private String password;
    private String firstName;
    private String lastname;
    private String office;
    private String birthdate;
    private String activeusers;

    public User(String idusers, String roleid, String email, String password, String firstName, String lastname, String office, String birthdate, String activeusers) {
        this.idusers = idusers;
        this.roleid = roleid;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastname = lastname;
        this.office = office;
        this.birthdate = birthdate;
        this.activeusers = activeusers;
    }

    public String getIdusers() {
        return idusers;
    }

    public void setIdusers(String idusers) {
        this.idusers = idusers;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getActiveusers() {
        return activeusers;
    }

    public void setActiveusers(String activeusers) {
        this.activeusers = activeusers;
    }
}
