package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyDropDown;
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

public class ComDayCqWcmMsmImplRolloutManagerImplProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString eventFilter = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray rolloutmgrExcludedpropsDefault = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger rolloutmgrCommitSize = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled = null;
 /**
   * Get eventFilter
   * @return eventFilter
  **/
  @JsonProperty("event.filter")
  public ConfigNodePropertyString getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties eventFilter(ConfigNodePropertyString eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

 /**
   * Get rolloutmgrExcludedpropsDefault
   * @return rolloutmgrExcludedpropsDefault
  **/
  @JsonProperty("rolloutmgr.excludedprops.default")
  public ConfigNodePropertyArray getRolloutmgrExcludedpropsDefault() {
    return rolloutmgrExcludedpropsDefault;
  }

  public void setRolloutmgrExcludedpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludedpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedpropsDefault) {
    this.rolloutmgrExcludedpropsDefault = rolloutmgrExcludedpropsDefault;
    return this;
  }

 /**
   * Get rolloutmgrExcludedparagraphpropsDefault
   * @return rolloutmgrExcludedparagraphpropsDefault
  **/
  @JsonProperty("rolloutmgr.excludedparagraphprops.default")
  public ConfigNodePropertyArray getRolloutmgrExcludedparagraphpropsDefault() {
    return rolloutmgrExcludedparagraphpropsDefault;
  }

  public void setRolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludedparagraphpropsDefault(ConfigNodePropertyArray rolloutmgrExcludedparagraphpropsDefault) {
    this.rolloutmgrExcludedparagraphpropsDefault = rolloutmgrExcludedparagraphpropsDefault;
    return this;
  }

 /**
   * Get rolloutmgrExcludednodetypesDefault
   * @return rolloutmgrExcludednodetypesDefault
  **/
  @JsonProperty("rolloutmgr.excludednodetypes.default")
  public ConfigNodePropertyArray getRolloutmgrExcludednodetypesDefault() {
    return rolloutmgrExcludednodetypesDefault;
  }

  public void setRolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrExcludednodetypesDefault(ConfigNodePropertyArray rolloutmgrExcludednodetypesDefault) {
    this.rolloutmgrExcludednodetypesDefault = rolloutmgrExcludednodetypesDefault;
    return this;
  }

 /**
   * Get rolloutmgrThreadpoolMaxsize
   * @return rolloutmgrThreadpoolMaxsize
  **/
  @JsonProperty("rolloutmgr.threadpool.maxsize")
  public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxsize() {
    return rolloutmgrThreadpoolMaxsize;
  }

  public void setRolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolMaxsize(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxsize) {
    this.rolloutmgrThreadpoolMaxsize = rolloutmgrThreadpoolMaxsize;
    return this;
  }

 /**
   * Get rolloutmgrThreadpoolMaxshutdowntime
   * @return rolloutmgrThreadpoolMaxshutdowntime
  **/
  @JsonProperty("rolloutmgr.threadpool.maxshutdowntime")
  public ConfigNodePropertyInteger getRolloutmgrThreadpoolMaxshutdowntime() {
    return rolloutmgrThreadpoolMaxshutdowntime;
  }

  public void setRolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolMaxshutdowntime(ConfigNodePropertyInteger rolloutmgrThreadpoolMaxshutdowntime) {
    this.rolloutmgrThreadpoolMaxshutdowntime = rolloutmgrThreadpoolMaxshutdowntime;
    return this;
  }

 /**
   * Get rolloutmgrThreadpoolPriority
   * @return rolloutmgrThreadpoolPriority
  **/
  @JsonProperty("rolloutmgr.threadpool.priority")
  public ConfigNodePropertyDropDown getRolloutmgrThreadpoolPriority() {
    return rolloutmgrThreadpoolPriority;
  }

  public void setRolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrThreadpoolPriority(ConfigNodePropertyDropDown rolloutmgrThreadpoolPriority) {
    this.rolloutmgrThreadpoolPriority = rolloutmgrThreadpoolPriority;
    return this;
  }

 /**
   * Get rolloutmgrCommitSize
   * @return rolloutmgrCommitSize
  **/
  @JsonProperty("rolloutmgr.commit.size")
  public ConfigNodePropertyInteger getRolloutmgrCommitSize() {
    return rolloutmgrCommitSize;
  }

  public void setRolloutmgrCommitSize(ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrCommitSize(ConfigNodePropertyInteger rolloutmgrCommitSize) {
    this.rolloutmgrCommitSize = rolloutmgrCommitSize;
    return this;
  }

 /**
   * Get rolloutmgrConflicthandlingEnabled
   * @return rolloutmgrConflicthandlingEnabled
  **/
  @JsonProperty("rolloutmgr.conflicthandling.enabled")
  public ConfigNodePropertyBoolean getRolloutmgrConflicthandlingEnabled() {
    return rolloutmgrConflicthandlingEnabled;
  }

  public void setRolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
  }

  public ComDayCqWcmMsmImplRolloutManagerImplProperties rolloutmgrConflicthandlingEnabled(ConfigNodePropertyBoolean rolloutmgrConflicthandlingEnabled) {
    this.rolloutmgrConflicthandlingEnabled = rolloutmgrConflicthandlingEnabled;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

