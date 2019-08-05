package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties   {
  @JsonProperty("org.apache.sling.commons.log.file")
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;

  @JsonProperty("org.apache.sling.commons.log.file.number")
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null;

  @JsonProperty("org.apache.sling.commons.log.file.size")
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null;

  @JsonProperty("org.apache.sling.commons.log.file.buffered")
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered = null;

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFile
   * @return orgApacheSlingCommonsLogFile
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFileNumber
   * @return orgApacheSlingCommonsLogFileNumber
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }

  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFileSize
   * @return orgApacheSlingCommonsLogFileSize
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }

  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogFileBuffered(ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
    this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
    return this;
  }

   /**
   * Get orgApacheSlingCommonsLogFileBuffered
   * @return orgApacheSlingCommonsLogFileBuffered
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getOrgApacheSlingCommonsLogFileBuffered() {
    return orgApacheSlingCommonsLogFileBuffered;
  }

  public void setOrgApacheSlingCommonsLogFileBuffered(ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
    this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties orgApacheSlingCommonsLogLogManagerFactoryWriterProperties = (OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties) o;
    return Objects.equals(this.orgApacheSlingCommonsLogFile, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFile) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileNumber, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileNumber) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileSize, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileSize) &&
        Objects.equals(this.orgApacheSlingCommonsLogFileBuffered, orgApacheSlingCommonsLogLogManagerFactoryWriterProperties.orgApacheSlingCommonsLogFileBuffered);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

