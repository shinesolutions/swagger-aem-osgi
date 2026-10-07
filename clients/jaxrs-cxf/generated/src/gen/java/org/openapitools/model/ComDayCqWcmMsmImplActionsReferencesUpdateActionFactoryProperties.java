package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties  {
  
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

  private ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested;
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

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
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

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
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

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

 /**
   * Get cqWcmMsmImplActionReferencesupdatePropUpdateNested
   * @return cqWcmMsmImplActionReferencesupdatePropUpdateNested
  **/
  @JsonProperty("cq.wcm.msm.impl.action.referencesupdate.prop_updateNested")
  public ConfigNodePropertyBoolean getCqWcmMsmImplActionReferencesupdatePropUpdateNested() {
    return cqWcmMsmImplActionReferencesupdatePropUpdateNested;
  }

  public void setCqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested) {
    this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested) {
    this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
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
    ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties = (ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties) o;
    return Objects.equals(this.cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(this.cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(this.cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(this.cqWcmMsmImplActionReferencesupdatePropUpdateNested, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmImplActionReferencesupdatePropUpdateNested);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops, cqWcmMsmImplActionReferencesupdatePropUpdateNested);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties {\n");
    
    sb.append("    cqWcmMsmActionExcludednodetypes: ").append(toIndentedString(cqWcmMsmActionExcludednodetypes)).append("\n");
    sb.append("    cqWcmMsmActionExcludedparagraphitems: ").append(toIndentedString(cqWcmMsmActionExcludedparagraphitems)).append("\n");
    sb.append("    cqWcmMsmActionExcludedprops: ").append(toIndentedString(cqWcmMsmActionExcludedprops)).append("\n");
    sb.append("    cqWcmMsmImplActionReferencesupdatePropUpdateNested: ").append(toIndentedString(cqWcmMsmImplActionReferencesupdatePropUpdateNested)).append("\n");
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

