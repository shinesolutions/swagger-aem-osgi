package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name = null;

  @JsonProperty("types")
  private ConfigNodePropertyArray types = null;

  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Valid
  public ConfigNodePropertyString getName() {
    return name;
  }

  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties types(ConfigNodePropertyArray types) {
    this.types = types;
    return this;
  }

   /**
   * Get types
   * @return types
  **/
  @Valid
  public ConfigNodePropertyArray getTypes() {
    return types;
  }

  public void setTypes(ConfigNodePropertyArray types) {
    this.types = types;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties = (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties) o;
    return Objects.equals(name, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.name) &&
        Objects.equals(types, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, types);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

