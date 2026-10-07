package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixSystemreadyImplServicesCheckProperties  {
  
  @ApiModelProperty(value = "")

  private ConfigNodePropertyArray servicesList;

  @ApiModelProperty(value = "")

  private ConfigNodePropertyDropDown type;
 /**
   * Get servicesList
   * @return servicesList
  **/
  @JsonProperty("services.list")
  public ConfigNodePropertyArray getServicesList() {
    return servicesList;
  }

  public void setServicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
  }

  public OrgApacheFelixSystemreadyImplServicesCheckProperties servicesList(ConfigNodePropertyArray servicesList) {
    this.servicesList = servicesList;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }

  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }

  public OrgApacheFelixSystemreadyImplServicesCheckProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

