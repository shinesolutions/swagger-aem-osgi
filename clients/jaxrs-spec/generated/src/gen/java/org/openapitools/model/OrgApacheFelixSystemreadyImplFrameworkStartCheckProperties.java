package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties   {
  
  private @Valid ConfigNodePropertyInteger timeout = null;
  private @Valid ConfigNodePropertyInteger targetStartLevel = null;
  private @Valid ConfigNodePropertyString targetStartLevelPropName = null;
  private @Valid ConfigNodePropertyDropDown type = null;

  /**
   **/
  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties timeout(ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("timeout")
  public ConfigNodePropertyInteger getTimeout() {
    return timeout;
  }
  public void setTimeout(ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
  }

  /**
   **/
  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("target.start.level")
  public ConfigNodePropertyInteger getTargetStartLevel() {
    return targetStartLevel;
  }
  public void setTargetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
  }

  /**
   **/
  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("target.start.level.prop.name")
  public ConfigNodePropertyString getTargetStartLevelPropName() {
    return targetStartLevelPropName;
  }
  public void setTargetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
  }

  /**
   **/
  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public ConfigNodePropertyDropDown getType() {
    return type;
  }
  public void setType(ConfigNodePropertyDropDown type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties orgApacheFelixSystemreadyImplFrameworkStartCheckProperties = (OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties) o;
    return Objects.equals(timeout, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.timeout) &&
        Objects.equals(targetStartLevel, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.targetStartLevel) &&
        Objects.equals(targetStartLevelPropName, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.targetStartLevelPropName) &&
        Objects.equals(type, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeout, targetStartLevel, targetStartLevelPropName, type);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

