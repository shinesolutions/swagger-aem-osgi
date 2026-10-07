package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties
 */

@JsonTypeName("comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes;

  public ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties cqPagesupdatehandlerImageresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
    return this;
  }

  /**
   * Get cqPagesupdatehandlerImageresourcetypes
   * @return cqPagesupdatehandlerImageresourcetypes
   */
  @Valid 
  @Schema(name = "cq.pagesupdatehandler.imageresourcetypes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public @Nullable ConfigNodePropertyArray getCqPagesupdatehandlerImageresourcetypes() {
    return cqPagesupdatehandlerImageresourcetypes;
  }

  @JsonProperty("cq.pagesupdatehandler.imageresourcetypes")
  public void setCqPagesupdatehandlerImageresourcetypes(@Nullable ConfigNodePropertyArray cqPagesupdatehandlerImageresourcetypes) {
    this.cqPagesupdatehandlerImageresourcetypes = cqPagesupdatehandlerImageresourcetypes;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties = (ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties) o;
    return Objects.equals(this.cqPagesupdatehandlerImageresourcetypes, comDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties.cqPagesupdatehandlerImageresourcetypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqPagesupdatehandlerImageresourcetypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmContentsyncImplHandlerPagesUpdateHandlerProperties {\n");
    sb.append("    cqPagesupdatehandlerImageresourcetypes: ").append(toIndentedString(cqPagesupdatehandlerImageresourcetypes)).append("\n");
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

