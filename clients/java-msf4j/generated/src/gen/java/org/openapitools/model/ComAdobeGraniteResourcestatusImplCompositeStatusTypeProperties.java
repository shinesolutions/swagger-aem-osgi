package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;

/**
 * ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2026-10-07T12:53:29.980508721Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties   {
  @JsonProperty("name")
  private ConfigNodePropertyString name;

  @JsonProperty("types")
  private ConfigNodePropertyArray types;

  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties name(ConfigNodePropertyString name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
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
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getTypes() {
    return types;
  }

  public void setTypes(ConfigNodePropertyArray types) {
    this.types = types;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties = (ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties) o;
    return Objects.equals(this.name, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.name) &&
        Objects.equals(this.types, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, types);
  }

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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

