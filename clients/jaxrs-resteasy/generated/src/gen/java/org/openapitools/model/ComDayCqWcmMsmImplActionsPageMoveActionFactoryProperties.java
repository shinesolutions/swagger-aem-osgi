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
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties   {
  
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;
  private ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  @Valid
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }
  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  @Valid
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }
  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.action.excludedprops")
  @Valid
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }
  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate")
  @Valid
  public ConfigNodePropertyBoolean getCqWcmMsmImplActionsPagemovePropReferenceUpdate() {
    return cqWcmMsmImplActionsPagemovePropReferenceUpdate;
  }
  public void setCqWcmMsmImplActionsPagemovePropReferenceUpdate(ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate) {
    this.cqWcmMsmImplActionsPagemovePropReferenceUpdate = cqWcmMsmImplActionsPagemovePropReferenceUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties = (ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties) o;
    return Objects.equals(this.cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(this.cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(this.cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(this.cqWcmMsmImplActionsPagemovePropReferenceUpdate, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmImplActionsPagemovePropReferenceUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops, cqWcmMsmImplActionsPagemovePropReferenceUpdate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {\n");
    
    sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
    sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
    sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
    sb.append("    cqWcmMsmImplActionsPagemovePropReferenceUpdate: ").append(toIndentedString(cqWcmMsmImplActionsPagemovePropReferenceUpdate)).append("\n");
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

