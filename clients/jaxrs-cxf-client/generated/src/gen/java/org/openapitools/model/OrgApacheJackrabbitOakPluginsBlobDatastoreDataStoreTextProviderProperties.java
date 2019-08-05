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

public class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyString dir = null;
 /**
   * Get dir
   * @return dir
  **/
  @JsonProperty("dir")
  public ConfigNodePropertyString getDir() {
    return dir;
  }

  public void setDir(ConfigNodePropertyString dir) {
    this.dir = dir;
  }

  public OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties dir(ConfigNodePropertyString dir) {
    this.dir = dir;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsBlobDatastoreDataStoreTextProviderProperties {\n");
    
    sb.append("    dir: ").append(toIndentedString(dir)).append("\n");
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

