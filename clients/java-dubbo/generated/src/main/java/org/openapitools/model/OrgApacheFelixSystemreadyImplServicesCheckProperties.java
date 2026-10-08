package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheFelixSystemreadyImplServicesCheckProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("services.list")
  private ConfigNodePropertyArray servicesList;

  @JsonProperty("type")
  private ConfigNodePropertyDropDown type;

  /**
   * 
   * @return servicesList
   */
  public ConfigNodePropertyArray getServicesList() {
    return servicesList;
  }

  public void setServicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
  }

  /**
   * 
   * @return type
   */
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixSystemreadyImplServicesCheckProperties orgApacheFelixSystemreadyImplServicesCheckProperties = (OrgApacheFelixSystemreadyImplServicesCheckProperties) o;
    return Objects.equals(this.servicesList, orgApacheFelixSystemreadyImplServicesCheckProperties.servicesList) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplServicesCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(servicesList, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplServicesCheckProperties {\n");
    
    sb.append("    servicesList: ").append(toIndentedString(servicesList)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
