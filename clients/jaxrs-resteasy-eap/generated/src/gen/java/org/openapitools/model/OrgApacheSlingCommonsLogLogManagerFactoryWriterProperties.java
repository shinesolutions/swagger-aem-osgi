package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties   {
  

  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;

  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null;

  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null;

  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered = null;

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
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }
  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }
  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("org.apache.sling.commons.log.file.buffered")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogFileBuffered() {
    return orgApacheSlingCommonsLogFileBuffered;
  }
  public void setOrgApacheSlingCommonsLogFileBuffered(ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
    this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogLogManagerFactoryWriterProperties = (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties) o;
    return Objects.equals(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileNumber) &&
        Objects.equals(orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileSize) &&
        Objects.equals(orgApacheSlingCommonsLogFileBuffered, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileBuffered);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogFileBuffered);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties {\n");
    
    sb.append("    orgApacheSlingCommonsLogFile: ").append(toIndentedString(orgApacheSlingCommonsLogFile)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileNumber: ").append(toIndentedString(orgApacheSlingCommonsLogFileNumber)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileSize: ").append(toIndentedString(orgApacheSlingCommonsLogFileSize)).append("\n");
    sb.append("    orgApacheSlingCommonsLogFileBuffered: ").append(toIndentedString(orgApacheSlingCommonsLogFileBuffered)).append("\n");
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

