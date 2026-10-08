package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;



public class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties   {
  
  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel;

  private ConfigNodePropertyString orgApacheSlingCommonsLogFile;

  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern;

  private ConfigNodePropertyArray orgApacheSlingCommonsLogNames;

  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv;

  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.level")
  public ConfigNodePropertyDropDown getOrgApacheSlingCommonsLogLevel() {
    return orgApacheSlingCommonsLogLevel;
  }
  public void setOrgApacheSlingCommonsLogLevel(ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel) {
    this.orgApacheSlingCommonsLogLevel = orgApacheSlingCommonsLogLevel;
  }


  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.file")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }
  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }


  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.pattern")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogPattern() {
    return orgApacheSlingCommonsLogPattern;
  }
  public void setOrgApacheSlingCommonsLogPattern(ConfigNodePropertyString orgApacheSlingCommonsLogPattern) {
    this.orgApacheSlingCommonsLogPattern = orgApacheSlingCommonsLogPattern;
  }


  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogNames(ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
    this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.names")
  public ConfigNodePropertyArray getOrgApacheSlingCommonsLogNames() {
    return orgApacheSlingCommonsLogNames;
  }
  public void setOrgApacheSlingCommonsLogNames(ConfigNodePropertyArray orgApacheSlingCommonsLogNames) {
    this.orgApacheSlingCommonsLogNames = orgApacheSlingCommonsLogNames;
  }


  /**
   **/
  public OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
    this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.additiv")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogAdditiv() {
    return orgApacheSlingCommonsLogAdditiv;
  }
  public void setOrgApacheSlingCommonsLogAdditiv(ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv) {
    this.orgApacheSlingCommonsLogAdditiv = orgApacheSlingCommonsLogAdditiv;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties orgApacheSlingCommonsLogLogManagerFactoryConfigProperties = (OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties) o;
    return Objects.equals(this.orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(this.orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(this.orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(this.orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogNames) &&
        Objects.equals(this.orgApacheSlingCommonsLogAdditiv, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogAdditiv);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogAdditiv);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties {\n");
    
    sb.append("    orgApacheSlingCommonsLogLevel: ").append(toIndentedString(orgApacheSlingCommonsLogLevel)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogPattern: ").append(toIndentedString(orgApacheSlingCommonsLogPattern)).append("\n");
    sb.append("    orgApacheSlingCommonsLogNames: ").append(toIndentedString(orgApacheSlingCommonsLogNames)).append("\n");
    sb.append("    orgApacheSlingCommonsLogAdditiv: ").append(toIndentedString(orgApacheSlingCommonsLogAdditiv)).append("\n");
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

