package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString illegalCharMapping = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean pageSubTreeActivationCheck = null;
 /**
   * Get illegalCharMapping
   * @return illegalCharMapping
  **/
  @JsonProperty("illegalCharMapping")
  public ConfigNodePropertyString getIllegalCharMapping() {
    return illegalCharMapping;
  }

  public void setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
    this.illegalCharMapping = illegalCharMapping;
  }

  public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties illegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
    this.illegalCharMapping = illegalCharMapping;
    return this;
  }

 /**
   * Get pageSubTreeActivationCheck
   * @return pageSubTreeActivationCheck
  **/
  @JsonProperty("pageSubTreeActivationCheck")
  public ConfigNodePropertyBoolean getPageSubTreeActivationCheck() {
    return pageSubTreeActivationCheck;
  }

  public void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
  }

  public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties pageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
    this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {\n");
    
    sb.append("    illegalCharMapping: ").append(toIndentedString(illegalCharMapping)).append("\n");
    sb.append("    pageSubTreeActivationCheck: ").append(toIndentedString(pageSubTreeActivationCheck)).append("\n");
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

