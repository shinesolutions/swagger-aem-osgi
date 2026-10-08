package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin;
 /**
   * Get cqWcmMsmActionExcludednodetypes
   * @return cqWcmMsmActionExcludednodetypes
  **/
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }

  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

 /**
   * Get cqWcmMsmActionExcludedparagraphitems
   * @return cqWcmMsmActionExcludedparagraphitems
  **/
  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }

  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    return this;
  }

 /**
   * Get cqWcmMsmActionExcludedprops
   * @return cqWcmMsmActionExcludedprops
  **/
  @JsonProperty("cq.wcm.msm.action.excludedprops")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }

  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

 /**
   * Get cqWcmMsmActionIgnoredMixin
   * @return cqWcmMsmActionIgnoredMixin
  **/
  @JsonProperty("cq.wcm.msm.action.ignoredMixin")
  public ConfigNodePropertyArray getCqWcmMsmActionIgnoredMixin() {
    return cqWcmMsmActionIgnoredMixin;
  }

  public void setCqWcmMsmActionIgnoredMixin(ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin) {
    this.cqWcmMsmActionIgnoredMixin = cqWcmMsmActionIgnoredMixin;
  }

  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionIgnoredMixin(ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin) {
    this.cqWcmMsmActionIgnoredMixin = cqWcmMsmActionIgnoredMixin;
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties = (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties) o;
    return Objects.equals(this.cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(this.cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(this.cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(this.cqWcmMsmActionIgnoredMixin, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionIgnoredMixin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops, cqWcmMsmActionIgnoredMixin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties {\n");
    
    sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
    sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
    sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
    sb.append("    cqWcmMsmActionIgnoredMixin: ").append(toIndentedString(cqWcmMsmActionIgnoredMixin)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

