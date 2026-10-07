package apimodels;

import apimodels.ConfigNodePropertyInteger;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqDamDmProcessImagePTiffManagerImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties   {
  @JsonProperty("maxMemory")
  @Valid

  private ConfigNodePropertyInteger maxMemory;

  public ComAdobeCqDamDmProcessImagePTiffManagerImplProperties maxMemory(ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
    return this;
  }

   /**
   * Get maxMemory
   * @return maxMemory
  **/
  public ConfigNodePropertyInteger getMaxMemory() {
    return maxMemory;
  }

  public void setMaxMemory(ConfigNodePropertyInteger maxMemory) {
    this.maxMemory = maxMemory;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamDmProcessImagePTiffManagerImplProperties comAdobeCqDamDmProcessImagePTiffManagerImplProperties = (ComAdobeCqDamDmProcessImagePTiffManagerImplProperties) o;
    return Objects.equals(maxMemory, comAdobeCqDamDmProcessImagePTiffManagerImplProperties.maxMemory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxMemory);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamDmProcessImagePTiffManagerImplProperties {\n");
    
    sb.append("    maxMemory: ").append(toIndentedString(maxMemory)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

