/*package org.launchcode.capstoneproject.models;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Controller
@Entity
public class LessonCategory {
   @NotBlank(message = "Category name required")
   @Size(min=3, max=40, message="Category name must be between 3 and 40 characters.")
   private String name;

   public LessonCategory(String name) {
            this.name = name;
        }

   public LessonCategory() {}

   public String getName() {
            return name;
        }

   public void setName(String name) {
            this.name = name;
        }

    @Override
    public String toString() {return name;}
    }
}*/
