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
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2026-10-07T12:54:26.576036107Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplRolloutManagerImplProperties   {
  
  private ConfigNodePropertyString eventFilter;
  private ConfigNodePropertyArray rolloutmgrExcludedpropsDefault;
  private ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault;
  private ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault;
  private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize;
  private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime;
  private ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority;
  private ConfigNodePropertyInteger rolloutmgrCommitSize;
  private ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }
  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.excludedprops.default")
  public ConfigNodePropertyArray getRolloutmgrExcludedpropsDefault() {
    return rolloutmgrExcludedpropsDefault;
  }
  public void setRolloutmgrExcludedpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.excludedparagraphprops.default")
  public ConfigNodePropertyArray getRolloutmgrExcludedparagraphpropsDefault() {
    return rolloutmgrExcludedparagraphpropsDefault;
  }
  public void setRolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.excludednodetypes.default")
  public ConfigNodePropertyArray getRolloutmgrExcludednodetypesDefault() {
    return rolloutmgrExcludednodetypesDefault;
  }
  public void setRolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.threadpool.maxsize")
  public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxsize() {
    return rolloutmgrThreadpoolMaxsize;
  }
  public void setRolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
  public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxshutdowntime() {
    return rolloutmgrThreadpoolMaxshutdowntime;
  }
  public void setRolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.threadpool.priority")
  public ConfigNodePropertyDropDown getRolloutmgrThreadpoolPriority() {
    return rolloutmgrThreadpoolPriority;
  }
  public void setRolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.commit.size")
  public ConfigNodePropertyInteger getRolloutmgrCommitSize() {
    return rolloutmgrCommitSize;
  }
  public void setRolloutmgrCommitSize(ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("rolloutmgr.conflicthandling.enabled")
  public ConfigNodePropertyBoolean getRolloutmgrConflicthandlingEnabled() {
    return rolloutmgrConflicthandlingEnabled;
  }
  public void setRolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplRolloutManagerImplProperties comDayCqWcmMsmImplRolloutManagerImplProperties = (ComDayCqWcmMsmImplRolloutManagerImplProperties) o;
    return Objects.equals(this.eventFilter, comDayCqWcmMsmImplRolloutManagerImplProperties.eventFilter) &&
        Objects.equals(this.rolloutmgrExcludedpropsDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludedpropsDefault) &&
        Objects.equals(this.rolloutmgrExcludedparagraphpropsDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludedparagraphpropsDefault) &&
        Objects.equals(this.rolloutmgrExcludednodetypesDefault, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrExcludednodetypesDefault) &&
        Objects.equals(this.rolloutmgrThreadpoolMaxsize, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolMaxsize) &&
        Objects.equals(this.rolloutmgrThreadpoolMaxshutdowntime, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolMaxshutdowntime) &&
        Objects.equals(this.rolloutmgrThreadpoolPriority, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrThreadpoolPriority) &&
        Objects.equals(this.rolloutmgrCommitSize, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrCommitSize) &&
        Objects.equals(this.rolloutmgrConflicthandlingEnabled, comDayCqWcmMsmImplRolloutManagerImplProperties.rolloutmgrConflicthandlingEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventFilter, rolloutmgrExcludedpropsDefault, rolloutmgrExcludedparagraphpropsDefault, rolloutmgrExcludednodetypesDefault, rolloutmgrThreadpoolMaxsize, rolloutmgrThreadpoolMaxshutdowntime, rolloutmgrThreadpoolPriority, rolloutmgrCommitSize, rolloutmgrConflicthandlingEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplRolloutManagerImplProperties {\n");
    
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    rolloutmgrExcludedpropsDefault: ").append(toIndentedString(rolloutmgrExcludedpropsDefault)).append("\n");
    sb.append("    rolloutmgrExcludedparagraphpropsDefault: ").append(toIndentedString(rolloutmgrExcludedparagraphpropsDefault)).append("\n");
    sb.append("    rolloutmgrExcludednodetypesDefault: ").append(toIndentedString(rolloutmgrExcludednodetypesDefault)).append("\n");
    sb.append("    rolloutmgrThreadpoolMaxsize: ").append(toIndentedString(rolloutmgrThreadpoolMaxsize)).append("\n");
    sb.append("    rolloutmgrThreadpoolMaxshutdowntime: ").append(toIndentedString(rolloutmgrThreadpoolMaxshutdowntime)).append("\n");
    sb.append("    rolloutmgrThreadpoolPriority: ").append(toIndentedString(rolloutmgrThreadpoolPriority)).append("\n");
    sb.append("    rolloutmgrCommitSize: ").append(toIndentedString(rolloutmgrCommitSize)).append("\n");
    sb.append("    rolloutmgrConflicthandlingEnabled: ").append(toIndentedString(rolloutmgrConflicthandlingEnabled)).append("\n");
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

