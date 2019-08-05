package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger timeout = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger targetStartLevel = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString targetStartLevelPropName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown type = null;
 /**
   * Get timeout
   * @return timeout
  **/
  @JsonProperty("timeout")
  public ConfigNodePropertyInteger getTimeout() {
    return timeout;
  }

  public void setTimeout(ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties timeout(ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
    return this;
  }

 /**
   * Get targetStartLevel
   * @return targetStartLevel
  **/
  @JsonProperty("target.start.level")
  public ConfigNodePropertyInteger getTargetStartLevel() {
    return targetStartLevel;
  }

  public void setTargetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
    return this;
  }

 /**
   * Get targetStartLevelPropName
   * @return targetStartLevelPropName
  **/
  @JsonProperty("target.start.level.prop.name")
  public ConfigNodePropertyString getTargetStartLevelPropName() {
    return targetStartLevelPropName;
  }

  public void setTargetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
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

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties {\n");
    
    sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
    sb.append("    targetStartLevel: ").append(toIndentedString(targetStartLevel)).append("\n");
    sb.append("    targetStartLevelPropName: ").append(toIndentedString(targetStartLevelPropName)).append("\n");
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

