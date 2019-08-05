package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties   {
  
  private ConfigNodePropertyString orgApacheSlingCommonsLogFile = null;
  private ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber = null;
  private ConfigNodePropertyString orgApacheSlingCommonsLogFileSize = null;
  private ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered = null;

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties () {

  }

  public OrgApacheSlingCommonsLogLogManagerFactoryWriterProperties (ConfigNodePropertyString orgApacheSlingCommonsLogFile, ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber, ConfigNodePropertyString orgApacheSlingCommonsLogFileSize, ConfigNodePropertyBoolean orgApacheSlingCommonsLogFileBuffered) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
    this.orgApacheSlingCommonsLogFileBuffered = orgApacheSlingCommonsLogFileBuffered;
  }

    
  @JsonProperty("org.apache.sling.commons.log.file")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFile() {
    return orgApacheSlingCommonsLogFile;
  }
  public void setOrgApacheSlingCommonsLogFile(ConfigNodePropertyString orgApacheSlingCommonsLogFile) {
    this.orgApacheSlingCommonsLogFile = orgApacheSlingCommonsLogFile;
  }

    
  @JsonProperty("org.apache.sling.commons.log.file.number")
  public ConfigNodePropertyInteger getOrgApacheSlingCommonsLogFileNumber() {
    return orgApacheSlingCommonsLogFileNumber;
  }
  public void setOrgApacheSlingCommonsLogFileNumber(ConfigNodePropertyInteger orgApacheSlingCommonsLogFileNumber) {
    this.orgApacheSlingCommonsLogFileNumber = orgApacheSlingCommonsLogFileNumber;
  }

    
  @JsonProperty("org.apache.sling.commons.log.file.size")
  public ConfigNodePropertyString getOrgApacheSlingCommonsLogFileSize() {
    return orgApacheSlingCommonsLogFileSize;
  }
  public void setOrgApacheSlingCommonsLogFileSize(ConfigNodePropertyString orgApacheSlingCommonsLogFileSize) {
    this.orgApacheSlingCommonsLogFileSize = orgApacheSlingCommonsLogFileSize;
  }

    
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
