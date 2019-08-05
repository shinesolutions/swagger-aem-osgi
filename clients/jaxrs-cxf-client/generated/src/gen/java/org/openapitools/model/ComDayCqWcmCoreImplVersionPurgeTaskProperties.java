package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplVersionPurgeTaskProperties  {
  
  @ApiModelProperty(value = "")
  private ConfigNodePropertyArray versionpurgePaths = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyBoolean versionpurgeRecursive = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger versionpurgeMaxVersions = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger versionpurgeMinVersions = null;

  @ApiModelProperty(value = "")
  private ConfigNodePropertyInteger versionpurgeMaxAgeDays = null;
 /**
   * Get versionpurgePaths
   * @return versionpurgePaths
  **/
  @JsonProperty("versionpurge.paths")
  public ConfigNodePropertyArray getVersionpurgePaths() {
    return versionpurgePaths;
  }

  public void setVersionpurgePaths(ConfigNodePropertyArray versionpurgePaths) {
    this.versionpurgePaths = versionpurgePaths;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgePaths(ConfigNodePropertyArray versionpurgePaths) {
    this.versionpurgePaths = versionpurgePaths;
    return this;
  }

 /**
   * Get versionpurgeRecursive
   * @return versionpurgeRecursive
  **/
  @JsonProperty("versionpurge.recursive")
  public ConfigNodePropertyBoolean getVersionpurgeRecursive() {
    return versionpurgeRecursive;
  }

  public void setVersionpurgeRecursive(ConfigNodePropertyBoolean versionpurgeRecursive) {
    this.versionpurgeRecursive = versionpurgeRecursive;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeRecursive(ConfigNodePropertyBoolean versionpurgeRecursive) {
    this.versionpurgeRecursive = versionpurgeRecursive;
    return this;
  }

 /**
   * Get versionpurgeMaxVersions
   * @return versionpurgeMaxVersions
  **/
  @JsonProperty("versionpurge.maxVersions")
  public ConfigNodePropertyInteger getVersionpurgeMaxVersions() {
    return versionpurgeMaxVersions;
  }

  public void setVersionpurgeMaxVersions(ConfigNodePropertyInteger versionpurgeMaxVersions) {
    this.versionpurgeMaxVersions = versionpurgeMaxVersions;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMaxVersions(ConfigNodePropertyInteger versionpurgeMaxVersions) {
    this.versionpurgeMaxVersions = versionpurgeMaxVersions;
    return this;
  }

 /**
   * Get versionpurgeMinVersions
   * @return versionpurgeMinVersions
  **/
  @JsonProperty("versionpurge.minVersions")
  public ConfigNodePropertyInteger getVersionpurgeMinVersions() {
    return versionpurgeMinVersions;
  }

  public void setVersionpurgeMinVersions(ConfigNodePropertyInteger versionpurgeMinVersions) {
    this.versionpurgeMinVersions = versionpurgeMinVersions;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMinVersions(ConfigNodePropertyInteger versionpurgeMinVersions) {
    this.versionpurgeMinVersions = versionpurgeMinVersions;
    return this;
  }

 /**
   * Get versionpurgeMaxAgeDays
   * @return versionpurgeMaxAgeDays
  **/
  @JsonProperty("versionpurge.maxAgeDays")
  public ConfigNodePropertyInteger getVersionpurgeMaxAgeDays() {
    return versionpurgeMaxAgeDays;
  }

  public void setVersionpurgeMaxAgeDays(ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
    this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
  }

  public ComDayCqWcmCoreImplVersionPurgeTaskProperties versionpurgeMaxAgeDays(ConfigNodePropertyInteger versionpurgeMaxAgeDays) {
    this.versionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVersionPurgeTaskProperties {\n");
    
    sb.append("    versionpurgePaths: ").append(toIndentedString(versionpurgePaths)).append("\n");
    sb.append("    versionpurgeRecursive: ").append(toIndentedString(versionpurgeRecursive)).append("\n");
    sb.append("    versionpurgeMaxVersions: ").append(toIndentedString(versionpurgeMaxVersions)).append("\n");
    sb.append("    versionpurgeMinVersions: ").append(toIndentedString(versionpurgeMinVersions)).append("\n");
    sb.append("    versionpurgeMaxAgeDays: ").append(toIndentedString(versionpurgeMaxAgeDays)).append("\n");
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

