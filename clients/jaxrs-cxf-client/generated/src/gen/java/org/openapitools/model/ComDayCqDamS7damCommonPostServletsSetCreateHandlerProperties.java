package org.openapitools.model;

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

public class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingPostOperation = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyString slingServletMethods = null;
 /**
   * Get slingPostOperation
   * @return slingPostOperation
  **/
  @JsonProperty("sling.post.operation")
  public ConfigNodePropertyString getSlingPostOperation() {
    return slingPostOperation;
  }

  public void setSlingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
  }

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties slingPostOperation(ConfigNodePropertyString slingPostOperation) {
    this.slingPostOperation = slingPostOperation;
    return this;
  }

 /**
   * Get slingServletMethods
   * @return slingServletMethods
  **/
  @JsonProperty("sling.servlet.methods")
  public ConfigNodePropertyString getSlingServletMethods() {
    return slingServletMethods;
  }

  public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
  }

  public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties slingServletMethods(ConfigNodePropertyString slingServletMethods) {
    this.slingServletMethods = slingServletMethods;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {\n");
    
    sb.append("    slingPostOperation: ").append(toIndentedString(slingPostOperation)).append("\n");
    sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

