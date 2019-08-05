package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;

/**
 * ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties   {
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;

  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;

  @JsonProperty("cq.wcm.msm.action.excludedprops")
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;

  @JsonProperty("cq.wcm.msm.impl.action.referencesupdate.prop_updateNested")
  private ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested = null;

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludednodetypes
   * @return cqWcmMsmActionExcludednodetypes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }

  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedparagraphitems
   * @return cqWcmMsmActionExcludedparagraphitems
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }

  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedprops
   * @return cqWcmMsmActionExcludedprops
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }

  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

  public ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties cqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested) {
    this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
    return this;
  }

   /**
   * Get cqWcmMsmImplActionReferencesupdatePropUpdateNested
   * @return cqWcmMsmImplActionReferencesupdatePropUpdateNested
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCqWcmMsmImplActionReferencesupdatePropUpdateNested() {
    return cqWcmMsmImplActionReferencesupdatePropUpdateNested;
  }

  public void setCqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested) {
    this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

