package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmUndoUndoConfigProperties   {
  
  private ConfigNodePropertyBoolean cqWcmUndoEnabled;
  private ConfigNodePropertyString cqWcmUndoPath;
  private ConfigNodePropertyInteger cqWcmUndoValidity;
  private ConfigNodePropertyInteger cqWcmUndoSteps;
  private ConfigNodePropertyString cqWcmUndoPersistence;
  private ConfigNodePropertyBoolean cqWcmUndoPersistenceMode;
  private ConfigNodePropertyString cqWcmUndoMarkermode;
  private ConfigNodePropertyArray cqWcmUndoWhitelist;
  private ConfigNodePropertyArray cqWcmUndoBlacklist;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.undo.blacklist")
  public ConfigNodePropertyArray getCqWcmUndoBlacklist() {
    return cqWcmUndoBlacklist;
  }
  public void setCqWcmUndoBlacklist(ConfigNodePropertyArray cqWcmUndoBlacklist) {
    this.cqWcmUndoBlacklist = cqWcmUndoBlacklist;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmUndoUndoConfigProperties comDayCqWcmUndoUndoConfigProperties = (ComDayCqWcmUndoUndoConfigProperties) o;
    return Objects.equals(this.cqWcmUndoEnabled, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoEnabled) &&
        Objects.equals(this.cqWcmUndoPath, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPath) &&
        Objects.equals(this.cqWcmUndoValidity, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoValidity) &&
        Objects.equals(this.cqWcmUndoSteps, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoSteps) &&
        Objects.equals(this.cqWcmUndoPersistence, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistence) &&
        Objects.equals(this.cqWcmUndoPersistenceMode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoPersistenceMode) &&
        Objects.equals(this.cqWcmUndoMarkermode, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoMarkermode) &&
        Objects.equals(this.cqWcmUndoWhitelist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoWhitelist) &&
        Objects.equals(this.cqWcmUndoBlacklist, comDayCqWcmUndoUndoConfigProperties.cqWcmUndoBlacklist);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

