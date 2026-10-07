package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties
 */

@JsonTypeName("comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString group2memberRelationshipOutgoing;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray group2memberExcludedOutgoing;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString group2memberRelationshipIncoming;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray group2memberExcludedIncoming;

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberRelationshipOutgoing(@Nullable ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
    return this;
  }

  /**
   * Get group2memberRelationshipOutgoing
   * @return group2memberRelationshipOutgoing
   */
  @Valid 
  @Schema(name = "group2member.relationship.outgoing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group2member.relationship.outgoing")
  public @Nullable ConfigNodePropertyString getGroup2memberRelationshipOutgoing() {
    return group2memberRelationshipOutgoing;
  }

  @JsonProperty("group2member.relationship.outgoing")
  public void setGroup2memberRelationshipOutgoing(@Nullable ConfigNodePropertyString group2memberRelationshipOutgoing) {
    this.group2memberRelationshipOutgoing = group2memberRelationshipOutgoing;
  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberExcludedOutgoing(@Nullable ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
    return this;
  }

  /**
   * Get group2memberExcludedOutgoing
   * @return group2memberExcludedOutgoing
   */
  @Valid 
  @Schema(name = "group2member.excluded.outgoing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group2member.excluded.outgoing")
  public @Nullable ConfigNodePropertyArray getGroup2memberExcludedOutgoing() {
    return group2memberExcludedOutgoing;
  }

  @JsonProperty("group2member.excluded.outgoing")
  public void setGroup2memberExcludedOutgoing(@Nullable ConfigNodePropertyArray group2memberExcludedOutgoing) {
    this.group2memberExcludedOutgoing = group2memberExcludedOutgoing;
  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberRelationshipIncoming(@Nullable ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
    return this;
  }

  /**
   * Get group2memberRelationshipIncoming
   * @return group2memberRelationshipIncoming
   */
  @Valid 
  @Schema(name = "group2member.relationship.incoming", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group2member.relationship.incoming")
  public @Nullable ConfigNodePropertyString getGroup2memberRelationshipIncoming() {
    return group2memberRelationshipIncoming;
  }

  @JsonProperty("group2member.relationship.incoming")
  public void setGroup2memberRelationshipIncoming(@Nullable ConfigNodePropertyString group2memberRelationshipIncoming) {
    this.group2memberRelationshipIncoming = group2memberRelationshipIncoming;
  }

  public ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties group2memberExcludedIncoming(@Nullable ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
    return this;
  }

  /**
   * Get group2memberExcludedIncoming
   * @return group2memberExcludedIncoming
   */
  @Valid 
  @Schema(name = "group2member.excluded.incoming", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group2member.excluded.incoming")
  public @Nullable ConfigNodePropertyArray getGroup2memberExcludedIncoming() {
    return group2memberExcludedIncoming;
  }

  @JsonProperty("group2member.excluded.incoming")
  public void setGroup2memberExcludedIncoming(@Nullable ConfigNodePropertyArray group2memberExcludedIncoming) {
    this.group2memberExcludedIncoming = group2memberExcludedIncoming;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties = (ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties) o;
    return Objects.equals(this.group2memberRelationshipOutgoing, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipOutgoing) &&
        Objects.equals(this.group2memberExcludedOutgoing, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedOutgoing) &&
        Objects.equals(this.group2memberRelationshipIncoming, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberRelationshipIncoming) &&
        Objects.equals(this.group2memberExcludedIncoming, comAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties.group2memberExcludedIncoming);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group2memberRelationshipOutgoing, group2memberExcludedOutgoing, group2memberRelationshipIncoming, group2memberExcludedIncoming);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {\n");
    sb.append("    group2memberRelationshipOutgoing: ").append(toIndentedString(group2memberRelationshipOutgoing)).append("\n");
    sb.append("    group2memberExcludedOutgoing: ").append(toIndentedString(group2memberExcludedOutgoing)).append("\n");
    sb.append("    group2memberRelationshipIncoming: ").append(toIndentedString(group2memberRelationshipIncoming)).append("\n");
    sb.append("    group2memberExcludedIncoming: ").append(toIndentedString(group2memberExcludedIncoming)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

