package adrianromanski.tacos.models;

import lombok.Data;
import org.hibernate.validator.constraints.CreditCardNumber;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

@Data
public class Order {

  @NotBlank(message="First and last name can't be empty")
  private String name;

  @NotBlank(message="Street can't be empty ")
  private String street;

  @NotBlank(message="City can't be empty")
  private String city;

  @NotBlank(message="State can't be empty")
  private String state;

  @NotBlank(message="Zip code can't be empty")
  private String zip;

  @CreditCardNumber(message="That's not valid credit card number")
  private String ccNumber;

  @Pattern(regexp="^(0[1-9]|1[0-2])([/])([1-9][0-9])$",
           message="Value have to be in format MM/YY")
  private String ccExpiration;

  @Digits(integer=3, fraction=0, message="Incorrect CVC code")
  private String ccCVV;

}