package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("org.apache.sling.commons.log.file")
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile;

  @JsonProperty("org.apache.sling.commons.log.file.number")
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber;

  @JsonProperty("org.apache.sling.commons.log.file.size")
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize;

  @JsonProperty("org.apache.sling.commons.log.file.buffered")
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered;

  /**
   * 
   * @return orgApacheSlingCommonsLogFile
   */
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }

  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

  /**
   * 
   * @return orgApacheSlingCommonsLogFileNumber
   */
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }

  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

  /**
   * 
   * @return orgApacheSlingCommonsLogFileSize
   */
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }

  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

  /**
   * 
   * @return orgApacheSlingCommonsLogFileBuffered
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
