package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyDropDown;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties
 */

@JsonTypeName("comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties {

  private ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes;

  private ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems;

  private ConfigNodePropertyArray cqWcmMsmActionExcludedprops;

  private ConfigNodePropertyDropDown contentcopyactionOrderStyle;

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludednodetypes(ConfigNodePropertyArray cqWcmMsmActionExcludednodetypes) {
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

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludedparagraphitems(ConfigNodePropertyArray cqWcmMsmActionExcludedparagraphitems) {
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

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties cqWcmMsmActionExcludedprops(ConfigNodePropertyArray cqWcmMsmActionExcludedprops) {
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

  public ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties contentcopyactionOrderStyle(ConfigNodePropertyDropDown contentcopyactionOrderStyle) {
    this.contentcopyactionOrderStyle = contentcopyactionOrderStyle;
    return this;
  }

  /**
   * Get contentcopyactionOrderStyle
   * @return contentcopyactionOrderStyle
   */
  @Valid 
  @Schema(name = "contentcopyaction.order.style", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentcopyaction.order.style")
  public ConfigNodePropertyDropDown getContentcopyactionOrderStyle() {
    return contentcopyactionOrderStyle;
  }

  public void setContentcopyactionOrderStyle(ConfigNodePropertyDropDown contentcopyactionOrderStyle) {
    this.contentcopyactionOrderStyle = contentcopyactionOrderStyle;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties = (ComDayCqWcmMsmImplActionsContentCopyActionFactoryProperties) o;
    return Objects.equals(this.cqWcmMsmActionExcludednodetypes, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludednodetypes) &&
        Objects.equals(this.cqWcmMsmActionExcludedparagraphitems, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludedparagraphitems) &&
        Objects.equals(this.cqWcmMsmActionExcludedprops, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.cqWcmMsmActionExcludedprops) &&
        Objects.equals(this.contentcopyactionOrderStyle, comDayCqWcmMsmImplActionsContentCopyActionFactoryProperties.contentcopyactionOrderStyle);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

