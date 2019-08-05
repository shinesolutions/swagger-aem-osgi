package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
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

public class ComDayCqWcmUndoUndoConfigProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqWcmUndoEnabled = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqWcmUndoPath = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqWcmUndoValidity = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger cqWcmUndoSteps = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqWcmUndoPersistence = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString cqWcmUndoMarkermode = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqWcmUndoWhitelist = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray cqWcmUndoBlacklist = null;
 /**
   * Get cqWcmUndoEnabled
   * @return cqWcmUndoEnabled
  **/
  @JsonProperty("cq.wcm.undo.enabled")
  public ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
    return cqWcmUndoEnabled;
  }

  public void setCqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
    return this;
  }

 /**
   * Get cqWcmUndoPath
   * @return cqWcmUndoPath
  **/
  @JsonProperty("cq.wcm.undo.path")
  public ConfigNodePropertyString getCqWcmUndoPath() {
    return cqWcmUndoPath;
  }

  public void setCqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
    return this;
  }

 /**
   * Get cqWcmUndoValidity
   * @return cqWcmUndoValidity
  **/
  @JsonProperty("cq.wcm.undo.validity")
  public ConfigNodePropertyInteger getCqWcmUndoValidity() {
    return cqWcmUndoValidity;
  }

  public void setCqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
    return this;
  }

 /**
   * Get cqWcmUndoSteps
   * @return cqWcmUndoSteps
  **/
  @JsonProperty("cq.wcm.undo.steps")
  public ConfigNodePropertyInteger getCqWcmUndoSteps() {
    return cqWcmUndoSteps;
  }

  public void setCqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
    return this;
  }

 /**
   * Get cqWcmUndoPersistence
   * @return cqWcmUndoPersistence
  **/
  @JsonProperty("cq.wcm.undo.persistence")
  public ConfigNodePropertyString getCqWcmUndoPersistence() {
    return cqWcmUndoPersistence;
  }

  public void setCqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
    return this;
  }

 /**
   * Get cqWcmUndoPersistenceMode
   * @return cqWcmUndoPersistenceMode
  **/
  @JsonProperty("cq.wcm.undo.persistence.mode")
  public ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
    return cqWcmUndoPersistenceMode;
  }

  public void setCqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
    return this;
  }

 /**
   * Get cqWcmUndoMarkermode
   * @return cqWcmUndoMarkermode
  **/
  @JsonProperty("cq.wcm.undo.markermode")
  public ConfigNodePropertyString getCqWcmUndoMarkermode() {
    return cqWcmUndoMarkermode;
  }

  public void setCqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
    return this;
  }

 /**
   * Get cqWcmUndoWhitelist
   * @return cqWcmUndoWhitelist
  **/
  @JsonProperty("cq.wcm.undo.whitelist")
  public ConfigNodePropertyArray getCqWcmUndoWhitelist() {
    return cqWcmUndoWhitelist;
  }

  public void setCqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
    return this;
  }

 /**
   * Get cqWcmUndoBlacklist
   * @return cqWcmUndoBlacklist
  **/
  @JsonProperty("cq.wcm.undo.blacklist")
  public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }

  public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }

  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmUndoUndoConfigProperties {\n");
    
    sb.append("    cqWcmUndoEnabled: ").append(toIndentedString(cqWcmUndoEnabled)).append("\n");
    sb.append("    cqWcmUndoPath: ").append(toIndentedString(cqWcmUndoPath)).append("\n");
    sb.append("    cqWcmUndoValidity: ").append(toIndentedString(cqWcmUndoValidity)).append("\n");
    sb.append("    cqWcmUndoSteps: ").append(toIndentedString(cqWcmUndoSteps)).append("\n");
    sb.append("    cqWcmUndoPersistence: ").append(toIndentedString(cqWcmUndoPersistence)).append("\n");
    sb.append("    cqWcmUndoPersistenceMode: ").append(toIndentedString(cqWcmUndoPersistenceMode)).append("\n");
    sb.append("    cqWcmUndoMarkermode: ").append(toIndentedString(cqWcmUndoMarkermode)).append("\n");
    sb.append("    cqWcmUndoWhitelist: ").append(toIndentedString(cqWcmUndoWhitelist)).append("\n");
    sb.append("    cqWcmUndoBlacklist: ").append(toIndentedString(cqWcmUndoBlacklist)).append("\n");
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

