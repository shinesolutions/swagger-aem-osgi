package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties   {
  

  private ConfigNodePropertyDropDown orgApacheSlingCommonsLogLevel = null;

  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;

  private ConfigNodePropertyString orgApacheSlingCommonsLogPattern = null;

  private ConfigNodePropertyArray orgApacheSlingCommonsLogNames = null;

  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogAdditiv = null;

  /**
   **/
  
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
    return Objects.equals(orgApacheSlingCommonsLogLevel, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogLevel) &&
        Objects.equals(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(orgApacheSlingCommonsLogPattern, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogPattern) &&
        Objects.equals(orgApacheSlingCommonsLogNames, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogNames) &&
        Objects.equals(orgApacheSlingCommonsLogAdditiv, orgApacheSlingCommonsLogLogManagerFactoryConfigProperties.orgApacheSlingCommonsLogAdditiv);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

