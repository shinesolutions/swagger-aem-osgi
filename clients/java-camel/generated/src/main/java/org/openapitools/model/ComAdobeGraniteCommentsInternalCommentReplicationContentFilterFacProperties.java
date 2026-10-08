package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties
 */

@JsonTypeName("comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {

  private ConfigNodePropertyArray replicateCommentResourceTypes;

  public ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties replicateCommentResourceTypes(ConfigNodePropertyArray replicateCommentResourceTypes) {
    this.replicateCommentResourceTypes = replicateCommentResourceTypes;
    return this;
  }

  /**
   * Get replicateCommentResourceTypes
   * @return replicateCommentResourceTypes
   */
  @Valid 
  @Schema(name = "replicate.comment.resourceTypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("replicate.comment.resourceTypes")
  public ConfigNodePropertyArray getReplicateCommentResourceTypes() {
    return replicateCommentResourceTypes;
  }

  public void setReplicateCommentResourceTypes(ConfigNodePropertyArray replicateCommentResourceTypes) {
    this.replicateCommentResourceTypes = replicateCommentResourceTypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties = (ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties) o;
    return Objects.equals(this.replicateCommentResourceTypes, comAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties.replicateCommentResourceTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(replicateCommentResourceTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteCommentsInternalCommentReplicationContentFilterFacProperties {\n");
    sb.append("    replicateCommentResourceTypes: ").append(toIndentedString(replicateCommentResourceTypes)).append("\n");
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

