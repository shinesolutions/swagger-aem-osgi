package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqWcmUndoUndoConfigProperties   {
  @JsonProperty("cq.wcm.undo.enabled")
  private ConfigNodePropertyBoolean cqWcmUndoEnabled = null;

  @JsonProperty("cq.wcm.undo.path")
  private ConfigNodePropertyString cqWcmUndoPath = null;

  @JsonProperty("cq.wcm.undo.validity")
  private ConfigNodePropertyInteger cqWcmUndoValidity = null;

  @JsonProperty("cq.wcm.undo.steps")
  private ConfigNodePropertyInteger cqWcmUndoSteps = null;

  @JsonProperty("cq.wcm.undo.persistence")
  private ConfigNodePropertyString cqWcmUndoPersistence = null;

  @JsonProperty("cq.wcm.undo.persistence.mode")
  private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode = null;

  @JsonProperty("cq.wcm.undo.markermode")
  private ConfigNodePropertyString cqWcmUndoMarkermode = null;

  @JsonProperty("cq.wcm.undo.whitelist")
  private ConfigNodePropertyArray cqWcmUndoWhitelist = null;

  @JsonProperty("cq.wcm.undo.blacklist")
  private ConfigNodePropertyArray cqWcmUndoBlacklist = null;

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.enabled")
  public ConfigNodePropertyBoolean getCqWcmUndoEnabled() {
    return cqWcmUndoEnabled;
  }
  public void setCqWcmUndoEnabled(ConfigNodePropertyBoolean cqWcmUndoEnabled) {
    this.cqWcmUndoEnabled = cqWcmUndoEnabled;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.path")
  public ConfigNodePropertyString getCqWcmUndoPath() {
    return cqWcmUndoPath;
  }
  public void setCqWcmUndoPath(ConfigNodePropertyString cqWcmUndoPath) {
    this.cqWcmUndoPath = cqWcmUndoPath;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.validity")
  public ConfigNodePropertyInteger getCqWcmUndoValidity() {
    return cqWcmUndoValidity;
  }
  public void setCqWcmUndoValidity(ConfigNodePropertyInteger cqWcmUndoValidity) {
    this.cqWcmUndoValidity = cqWcmUndoValidity;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.steps")
  public ConfigNodePropertyInteger getCqWcmUndoSteps() {
    return cqWcmUndoSteps;
  }
  public void setCqWcmUndoSteps(ConfigNodePropertyInteger cqWcmUndoSteps) {
    this.cqWcmUndoSteps = cqWcmUndoSteps;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.persistence")
  public ConfigNodePropertyString getCqWcmUndoPersistence() {
    return cqWcmUndoPersistence;
  }
  public void setCqWcmUndoPersistence(ConfigNodePropertyString cqWcmUndoPersistence) {
    this.cqWcmUndoPersistence = cqWcmUndoPersistence;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.persistence.mode")
  public ConfigNodePropertyBoolean getCqWcmUndoPersistenceMode() {
    return cqWcmUndoPersistenceMode;
  }
  public void setCqWcmUndoPersistenceMode(ConfigNodePropertyBoolean cqWcmUndoPersistenceMode) {
    this.cqWcmUndoPersistenceMode = cqWcmUndoPersistenceMode;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.markermode")
  public ConfigNodePropertyString getCqWcmUndoMarkermode() {
    return cqWcmUndoMarkermode;
  }
  public void setCqWcmUndoMarkermode(ConfigNodePropertyString cqWcmUndoMarkermode) {
    this.cqWcmUndoMarkermode = cqWcmUndoMarkermode;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.whitelist")
  public ConfigNodePropertyArray getCqWcmUndoWhitelist() {
    return cqWcmUndoWhitelist;
  }
  public void setCqWcmUndoWhitelist(ConfigNodePropertyArray cqWcmUndoWhitelist) {
    this.cqWcmUndoWhitelist = cqWcmUndoWhitelist;
  }

  /**
   **/
  public ComDayCqWcmUndoUndoConfigProperties cqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.blacklist")
  public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }
  public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmUndoUndoConfigProperties comDayCqWcmUndoUndoConfigProperties = (ComDayCqWcmUndoUndoConfigProperties) o;
    return Objects.equals(cqWcmUndoEnabled, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoEnabled) &&
        Objects.equals(cqWcmUndoPath, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPath) &&
        Objects.equals(cqWcmUndoValidity, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoValidity) &&
        Objects.equals(cqWcmUndoSteps, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoSteps) &&
        Objects.equals(cqWcmUndoPersistence, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistence) &&
        Objects.equals(cqWcmUndoPersistenceMode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistenceMode) &&
        Objects.equals(cqWcmUndoMarkermode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoMarkermode) &&
        Objects.equals(cqWcmUndoWhitelist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoWhitelist) &&
        Objects.equals(cqWcmUndoBlacklist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoBlacklist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmUndoEnabled, cqWcmUndoPath, cqWcmUndoValidity, cqWcmUndoSteps, cqWcmUndoPersistence, cqWcmUndoPersistenceMode, cqWcmUndoMarkermode, cqWcmUndoWhitelist, cqWcmUndoBlacklist);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

