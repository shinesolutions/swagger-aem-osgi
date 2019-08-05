package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties   {
  
  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes = null;
  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems = null;
  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops = null;
  private ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate = null;

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties () {

  }

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties (ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes, ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems, ConfigNodePropertyArray cqWcmMsmActionExcludedprops, ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
    this.cqWcmMsmImplActionsPagemovePropReferenceUpdate = cqWcmMsmImplActionsPagemovePropReferenceUpdate;
  }

    
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludednodetypes() {
    return cqWcmMsmActionExcludednodetypes;
  }
  public void setCqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
  }

    
  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedparagraphitems() {
    return cqWcmMsmActionExcludedparagraphitems;
  }
  public void setCqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
    this.cqWcmMsmActionExcludedparagraphitems = cqWcmMsmActionExcludedparagraphitems;
  }

    
  @JsonProperty("cq.wcm.msm.action.excludedprops")
  public ConfigNodePropertyArray getCqWcmMsmActionExcludedprops() {
    return cqWcmMsmActionExcludedprops;
  }
  public void setCqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
    this.cqWcmMsmActionExcludedprops = cqWcmMsmActionExcludedprops;
  }

    
  @JsonProperty("cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
