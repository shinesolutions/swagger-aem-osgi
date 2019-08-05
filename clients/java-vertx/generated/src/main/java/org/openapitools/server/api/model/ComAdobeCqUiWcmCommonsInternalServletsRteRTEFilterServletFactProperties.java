package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties   {
  
  private ConfigNodePropertyArray resourceTypes = null;

  public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties () {

  }

  public ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties (ConfigNodePropertyArray resourceTypes) {
    this.resourceTypes = resourceTypes;
  }

    
  @JsonProperty("resource.types")
  public ConfigNodePropertyArray getResourceTypes() {
    return resourceTypes;
  }
  public void setResourceTypes(ConfigNodePropertyArray resourceTypes) {
    this.resourceTypes = resourceTypes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties = (ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties) o;
    return Objects.equals(resourceTypes, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.resourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties {\n");
    
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
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
