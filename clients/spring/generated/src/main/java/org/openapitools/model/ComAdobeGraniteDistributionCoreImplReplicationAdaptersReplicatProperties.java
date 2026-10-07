package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties
 */

@JsonTypeName("comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString providerName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean forwardRequests;

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties providerName(@Nullable ConfigNodePropertyString providerName) {
    this.providerName = providerName;
    return this;
  }

  /**
   * Get providerName
   * @return providerName
   */
  @Valid 
  @Schema(name = "providerName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("providerName")
  public @Nullable ConfigNodePropertyString getProviderName() {
    return providerName;
  }

  @JsonProperty("providerName")
  public void setProviderName(@Nullable ConfigNodePropertyString providerName) {
    this.providerName = providerName;
  }

  public ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties forwardRequests(@Nullable ConfigNodePropertyBoolean forwardRequests) {
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
    ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties = (ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties) o;
    return Objects.equals(this.providerName, comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.providerName) &&
        Objects.equals(this.forwardRequests, comAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties.forwardRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerName, forwardRequests);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplReplicationAdaptersReplicatProperties {\n");
    sb.append("    providerName: ").append(toIndentedString(providerName)).append("\n");
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

