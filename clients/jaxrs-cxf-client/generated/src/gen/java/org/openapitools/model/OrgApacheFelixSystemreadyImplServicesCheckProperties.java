package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixSystemreadyImplServicesCheckProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray servicesList = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyDropDown type = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

