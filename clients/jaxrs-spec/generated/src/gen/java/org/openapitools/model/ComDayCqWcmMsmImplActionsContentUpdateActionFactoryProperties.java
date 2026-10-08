package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties   {
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;
  private ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin;

  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties() {
  }

  /**
   **/
  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  @Valid public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }

  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  /**
   **/
  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  @Valid public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }

  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  /**
   **/
  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludedprops")
  @Valid public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }

  @JsonProperty("cq.wcm.msm.action.excludedprops")
  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

  /**
   **/
  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionIgnoredMixin(ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin) {
    this.cqWcmMsmActionIgnoredMixin = cqWcmMsmActionIgnoredMixin;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.ignoredMixin")
  @Valid public ConfigNodePropertyArray getCqWcmMsmActionIgnoredMixin() {
    return cqWcmMsmActionIgnoredMixin;
  }

  @JsonProperty("cq.wcm.msm.action.ignoredMixin")
  public void setCqWcmMsmActionIgnoredMixin(ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin) {
    this.cqWcmMsmActionIgnoredMixin = cqWcmMsmActionIgnoredMixin;
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
