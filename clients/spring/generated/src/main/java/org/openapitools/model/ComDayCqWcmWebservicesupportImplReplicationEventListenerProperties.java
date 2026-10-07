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
 * ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties
 */

@JsonTypeName("comDayCqWcmWebservicesupportImplReplicationEventListenerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray flushAgents;

  public ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties flushAgents(@Nullable ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
    return this;
  }

  /**
   * Get flushAgents
   * @return flushAgents
   */
  @Valid 
  @Schema(name = "Flush agents", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("Flush agents")
  public @Nullable ConfigNodePropertyArray getFlushAgents() {
    return flushAgents;
  }

  @JsonProperty("Flush agents")
  public void setFlushAgents(@Nullable ConfigNodePropertyArray flushAgents) {
    this.flushAgents = flushAgents;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties comDayCqWcmWebservicesupportImplReplicationEventListenerProperties = (ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties) o;
    return Objects.equals(this.flushAgents, comDayCqWcmWebservicesupportImplReplicationEventListenerProperties.flushAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flushAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqWcmWebservicesupportImplReplicationEventListenerProperties {\n");
    sb.append("    flushAgents: ").append(toIndentedString(flushAgents)).append("\n");
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

