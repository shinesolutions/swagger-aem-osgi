package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties
 */

@JsonTypeName("comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean forwardRequests;

  public ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties forwardRequests(@Nullable ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
    return this;
  }

  /**
   * Get forwardRequests
   * @return forwardRequests
   */
  @Valid 
  @Schema(name = "forward.requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("forward.requests")
  public @Nullable ConfigNodePropertyBoolean getForwardRequests() {
    return forwardRequests;
  }

  @JsonProperty("forward.requests")
  public void setForwardRequests(@Nullable ConfigNodePropertyBoolean forwardRequests) {
    this.forwardRequests = forwardRequests;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties = (ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties) o;
    return Objects.equals(this.forwardRequests, comAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties.forwardRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forwardRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplReplicationDistributionTransProperties {\n");
    sb.append("    forwardRequests: ").append(toIndentedString(forwardRequests)).append("\n");
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

