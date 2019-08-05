package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties   {
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;

  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;

  @JsonProperty("cq.wcm.msm.action.excludedprops")
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;

  @JsonProperty("cq.wcm.msm.action.ignoredMixin")
  private ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin = null;

  /**
   **/
  public ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }
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
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }
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
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }
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
  public ConfigNodePropertyArray getCqWcmMsmActionIgnoredMixin() {
    return cqWcmMsmActionIgnoredMixin;
  }
  public void setCqWcmMsmActionIgnoredMixin(ConfigNodePropertyArray cqWcmMsmActionIgnoredMixin) {
    this.cqWcmMsmActionIgnoredMixin = cqWcmMsmActionIgnoredMixin;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties = (ComDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties) o;
    return Objects.equals(cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(cqWcmMsmActionIgnoredMixin, comDayCqWcmMsmImplActionsContentUpdateActionFactoryProperties.cqWcmMsmActionIgnoredMixin);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

