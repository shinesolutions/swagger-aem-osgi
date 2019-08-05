package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties   {
  
  private @Valid ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;
  private @Valid ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;
  private @Valid ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;
  private @Valid ConfigNodePropertyDropDown contentcopyactionOrderStyle = null;

  /**
   **/
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
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
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
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
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
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
  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties contentcopyactionOrderStyle(ConfigNodePropertyDropDown contentcopyactionOrderStyle) {
    this.contentcopyactionOrderStyle = contentcopyactionOrderStyle;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("contentcopyaction.order.style")
  public ConfigNodePropertyDropDown getContentcopyactionOrderStyle() {
    return contentcopyactionOrderStyle;
  }
  public void setContentcopyactionOrderStyle(ConfigNodePropertyDropDown contentcopyactionOrderStyle) {
    this.contentcopyactionOrderStyle = contentcopyactionOrderStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties = (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties) o;
    return Objects.equals(cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(contentcopyactionOrderStyle, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.contentcopyactionOrderStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops, contentcopyactionOrderStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {\n");
    
    sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
    sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
    sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
    sb.append("    contentcopyactionOrderStyle: ").append(toIndentedString(contentcopyactionOrderStyle)).append("\n");
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

