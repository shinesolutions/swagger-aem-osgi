package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties
 */

@JsonTypeName("comDayCqWcmMsmImplActionsPageMoveActionFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties {

  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;

  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;

  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;

  private ConfigNodePropertyBoolean cqWcmMsmImplActionsPagemovePropReferenceUpdate;

  public ComDayCqWcmMsmImplActionsPageMoveActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
    this.cqWcmMsmActionExcludednodetypes = cqWcmMsmActionExcludednodetypes;
    return this;
  }

  /**
   * Get cqWcmMsmActionExcludednodetypes
   * @return cqWcmMsmActionExcludednodetypes
   */
  @Valid 
  @Schema(name = "cq.wcm.msm.action.excludednodetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.msm.action.excludednodetypes")
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
   */
  @Valid 
  @Schema(name = "cq.wcm.msm.action.excludedparagraphitems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.msm.action.excludedparagraphitems")
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
   */
  @Valid 
  @Schema(name = "cq.wcm.msm.action.excludedprops", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.wcm.msm.action.excludedprops")
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
   */
  @Valid 
  @Schema(name = "cq.wcm.msm.impl.actions.pagemove.prop_referenceUpdate", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

