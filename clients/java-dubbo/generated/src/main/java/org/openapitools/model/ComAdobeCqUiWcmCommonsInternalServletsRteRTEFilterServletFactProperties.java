package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("resource.types")
  private ConfigNodePropertyArray resourceTypes;

  /**
   * 
   * @return resourceTypes
   */
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
    return Objects.equals(this.resourceTypes, comAdobeCqUiWcmCommonsInternalServletsRteRTEFilterServletFactProperties.resourceTypes);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
