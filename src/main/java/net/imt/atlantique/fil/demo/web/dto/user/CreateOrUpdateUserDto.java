package net.imt.atlantique.fil.demo.web.dto.user;

public class CreateOrUpdateUserDto {
    public String name;
    public String email;

    public CreateOrUpdateUserDto(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
