package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqPollingImporterImplManagedPollingImporterImplProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString importerUser = null;
 /**
   * Get importerUser
   * @return importerUser
  **/
  @JsonProperty("importer.user")
  public ConfigNodePropertyString getImporterUser() {
    return importerUser;
  }

  public void setImporterUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
  }

  public ComDayCqPollingImporterImplManagedPollingImporterImplProperties importerUser(ConfigNodePropertyString importerUser) {
    this.importerUser = importerUser;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqPollingImporterImplManagedPollingImporterImplProperties {\n");
    
    sb.append("    importerUser: ").append(toIndentedString(importerUser)).append("\n");
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

