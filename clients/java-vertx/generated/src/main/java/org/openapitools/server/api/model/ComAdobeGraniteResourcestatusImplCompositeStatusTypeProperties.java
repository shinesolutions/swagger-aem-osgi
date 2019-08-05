package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties   {
  
  private ConfigNodePropertyString name = null;
  private ConfigNodePropertyArray types = null;

  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties () {

  }

  public ComAdobeGraniteResourcestatusImplCompositeStatusTypeProperties (ConfigNodePropertyString name, ConfigNodePropertyArray types) {
    this.name = name;
    this.types = types;
  }

    
  @JsonProperty("name")
  public ConfigNodePropertyString getName() {
    return name;
  }
  public void setName(ConfigNodePropertyString name) {
    this.name = name;
  }

    
  @JsonProperty("types")
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
    return Objects.equals(name, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.name) &&
        Objects.equals(types, comAdobeGraniteResourcestatusImplCompositeStatusTypeProperties.types);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
