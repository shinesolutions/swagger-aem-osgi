package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties   {
  @JsonProperty("timeout")
  private ConfigNodePropertyInteger timeout = null;

  @JsonProperty("target.start.level")
  private ConfigNodePropertyInteger targetStartLevel = null;

  @JsonProperty("target.start.level.prop.name")
  private ConfigNodePropertyString targetStartLevelPropName = null;

  @JsonProperty("type")
  private ConfigNodePropertyDropDown type = null;

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties timeout(ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
    return this;
  }

  /**
   * Get timeout
   * @return timeout
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getTimeout() {
    return timeout;
  }

  public void setTimeout(ConfigNodePropertyInteger timeout) {
    this.timeout = timeout;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
    return this;
  }

  /**
   * Get targetStartLevel
   * @return targetStartLevel
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyInteger getTargetStartLevel() {
    return targetStartLevel;
  }

  public void setTargetStartLevel(ConfigNodePropertyInteger targetStartLevel) {
    this.targetStartLevel = targetStartLevel;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties targetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
    return this;
  }

  /**
   * Get targetStartLevelPropName
   * @return targetStartLevelPropName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getTargetStartLevelPropName() {
    return targetStartLevelPropName;
  }

  public void setTargetStartLevelPropName(ConfigNodePropertyString targetStartLevelPropName) {
    this.targetStartLevelPropName = targetStartLevelPropName;
  }

  public OrgApacheFelixSystemreadyImplFrameworkStartCheckProperties type(ConfigNodePropertyDropDown type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")

  @Valid

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
    return Objects.equals(this.timeout, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.timeout) &&
        Objects.equals(this.targetStartLevel, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.targetStartLevel) &&
        Objects.equals(this.targetStartLevelPropName, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.targetStartLevelPropName) &&
        Objects.equals(this.type, orgApacheFelixSystemreadyImplFrameworkStartCheckProperties.type);
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

