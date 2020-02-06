package adrianromanski.tacos.models;

import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
public class Taco {

  @NotNull
  @Size(min=5, message="Name have to be longer than 4 signs")
  private String name;
  @NotNull
  @Size(min=2, message="You have to choose at least two ingredients")
  private List<String> ingredients;
}