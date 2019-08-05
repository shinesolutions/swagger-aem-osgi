package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-08-05T00:59:30.156Z[GMT]")
public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties   {
  
  private ConfigNodePropertyInteger timeout = null;
  private ConfigNodePropertyInteger targetStartLevel = null;
  private ConfigNodePropertyString targetStartLevelPropName = null;
  private ConfigNodePropertyDropDown type = null;

  /**
   **/
  
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

