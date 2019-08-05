package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties   {
  

  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;

  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;

  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;

  private ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
  @JsonProperty("cq.wcm.msm.impl.action.referencesupdate.prop_updateNested")
  public ConfigNodePropertyBoolean getCqWcmMsmImplActionReferencesupdatePropUpdateNested() {
    return cqWcmMsmImplActionReferencesupdatePropUpdateNested;
  }
  public void setCqWcmMsmImplActionReferencesupdatePropUpdateNested(ConfigNodePropertyBoolean cqWcmMsmImplActionReferencesupdatePropUpdateNested) {
    this.cqWcmMsmImplActionReferencesupdatePropUpdateNested = cqWcmMsmImplActionReferencesupdatePropUpdateNested;
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
    return Objects.equals(cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(cqWcmMsmImplActionReferencesupdatePropUpdateNested, comDayCqWcmMsmImplActionsReferencesUpdateActionFactoryProperties.cqWcmMsmImplActionReferencesupdatePropUpdateNested);
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

