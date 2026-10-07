package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties   {
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;

  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;

  @JsonProperty("cq.wcm.msm.action.excludedprops")
  @Valid

  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;

  @JsonProperty("cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate")
  @Valid

  private ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate;

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludednodetypes
   * @return cqWcmMsmActionExcludednodetypes
  **/
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }

  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedparagraphitems
   * @return cqWcmMsmActionExcludedparagraphitems
  **/
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }

  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    return this;
  }

   /**
   * Get cqWcmMsmActionExcludedprops
   * @return cqWcmMsmActionExcludedprops
  **/
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }

  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties cqWcmMsmImplActionsPagemovePropReferenceUpdate(ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate) {
    this.cqWcmMsmImplActionsPagemovePropReferenceUpdate = cqWcmMsmImplActionsPagemovePropReferenceUpdate;
    return this;
  }

   /**
   * Get cqWcmMsmImplActionsPagemovePropReferenceUpdate
   * @return cqWcmMsmImplActionsPagemovePropReferenceUpdate
  **/
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
    return Objects.equals(cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(cqWcmMsmImplActionsPagemovePropReferenceUpdate, comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties.cqWcmMsmImplActionsPagemovePropReferenceUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqWcmMsmActionExcludednodetypes, cqWcmMsmActionExcludedparagraphitems, cqWcmMsmActionExcludedprops, cqWcmMsmImplActionsPagemovePropReferenceUpdate);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

