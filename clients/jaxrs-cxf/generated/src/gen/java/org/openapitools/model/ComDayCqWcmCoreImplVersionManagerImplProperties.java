package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqWcmCoreImplVersionManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean versionmanagerPurgingEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray versionmanagerPurgePaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray versionmanagerIvPaths = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger versionmanagerMaxAgeDays = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger versionmanagerMaxNumberVersions = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger versionmanagerMinNumberVersions = null;
 /**
   * Get versionmanagerCreateVersionOnActivation
   * @return versionmanagerCreateVersionOnActivation
  **/
  @JsonProperty("versionmanager.createVersionOnActivation")
  public ConfigNodePropertyBoolean getVersionmanagerCreateVersionOnActivation() {
    return versionmanagerCreateVersionOnActivation;
  }

  public void setVersionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerCreateVersionOnActivation(ConfigNodePropertyBoolean versionmanagerCreateVersionOnActivation) {
    this.versionmanagerCreateVersionOnActivation = versionmanagerCreateVersionOnActivation;
    return this;
  }

 /**
   * Get versionmanagerPurgingEnabled
   * @return versionmanagerPurgingEnabled
  **/
  @JsonProperty("versionmanager.purgingEnabled")
  public ConfigNodePropertyBoolean getVersionmanagerPurgingEnabled() {
    return versionmanagerPurgingEnabled;
  }

  public void setVersionmanagerPurgingEnabled(ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerPurgingEnabled(ConfigNodePropertyBoolean versionmanagerPurgingEnabled) {
    this.versionmanagerPurgingEnabled = versionmanagerPurgingEnabled;
    return this;
  }

 /**
   * Get versionmanagerPurgePaths
   * @return versionmanagerPurgePaths
  **/
  @JsonProperty("versionmanager.purgePaths")
  public ConfigNodePropertyArray getVersionmanagerPurgePaths() {
    return versionmanagerPurgePaths;
  }

  public void setVersionmanagerPurgePaths(ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerPurgePaths(ConfigNodePropertyArray versionmanagerPurgePaths) {
    this.versionmanagerPurgePaths = versionmanagerPurgePaths;
    return this;
  }

 /**
   * Get versionmanagerIvPaths
   * @return versionmanagerIvPaths
  **/
  @JsonProperty("versionmanager.ivPaths")
  public ConfigNodePropertyArray getVersionmanagerIvPaths() {
    return versionmanagerIvPaths;
  }

  public void setVersionmanagerIvPaths(ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerIvPaths(ConfigNodePropertyArray versionmanagerIvPaths) {
    this.versionmanagerIvPaths = versionmanagerIvPaths;
    return this;
  }

 /**
   * Get versionmanagerMaxAgeDays
   * @return versionmanagerMaxAgeDays
  **/
  @JsonProperty("versionmanager.maxAgeDays")
  public ConfigNodePropertyInteger getVersionmanagerMaxAgeDays() {
    return versionmanagerMaxAgeDays;
  }

  public void setVersionmanagerMaxAgeDays(ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMaxAgeDays(ConfigNodePropertyInteger versionmanagerMaxAgeDays) {
    this.versionmanagerMaxAgeDays = versionmanagerMaxAgeDays;
    return this;
  }

 /**
   * Get versionmanagerMaxNumberVersions
   * @return versionmanagerMaxNumberVersions
  **/
  @JsonProperty("versionmanager.maxNumberVersions")
  public ConfigNodePropertyInteger getVersionmanagerMaxNumberVersions() {
    return versionmanagerMaxNumberVersions;
  }

  public void setVersionmanagerMaxNumberVersions(ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMaxNumberVersions(ConfigNodePropertyInteger versionmanagerMaxNumberVersions) {
    this.versionmanagerMaxNumberVersions = versionmanagerMaxNumberVersions;
    return this;
  }

 /**
   * Get versionmanagerMinNumberVersions
   * @return versionmanagerMinNumberVersions
  **/
  @JsonProperty("versionmanager.minNumberVersions")
  public ConfigNodePropertyInteger getVersionmanagerMinNumberVersions() {
    return versionmanagerMinNumberVersions;
  }

  public void setVersionmanagerMinNumberVersions(ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
  }

  public ComDayCqWcmCoreImplVersionManagerImplProperties versionmanagerMinNumberVersions(ConfigNodePropertyInteger versionmanagerMinNumberVersions) {
    this.versionmanagerMinNumberVersions = versionmanagerMinNumberVersions;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmCoreImplVersionManagerImplProperties {\n");
    
    sb.append("    versionmanagerCreateVersionOnActivation: ").append(toIndentedString(versionmanagerCreateVersionOnActivation)).append("\n");
    sb.append("    versionmanagerPurgingEnabled: ").append(toIndentedString(versionmanagerPurgingEnabled)).append("\n");
    sb.append("    versionmanagerPurgePaths: ").append(toIndentedString(versionmanagerPurgePaths)).append("\n");
    sb.append("    versionmanagerIvPaths: ").append(toIndentedString(versionmanagerIvPaths)).append("\n");
    sb.append("    versionmanagerMaxAgeDays: ").append(toIndentedString(versionmanagerMaxAgeDays)).append("\n");
    sb.append("    versionmanagerMaxNumberVersions: ").append(toIndentedString(versionmanagerMaxNumberVersions)).append("\n");
    sb.append("    versionmanagerMinNumberVersions: ").append(toIndentedString(versionmanagerMinNumberVersions)).append("\n");
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

