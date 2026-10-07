package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties
 */

@JsonTypeName("comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString providerRoots;

  public ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties providerRoots(@Nullable ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
    return this;
  }

  /**
   * Get providerRoots
   * @return providerRoots
   */
  @Valid 
  @Schema(name = "provider.roots", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.roots")
  public @Nullable ConfigNodePropertyString getProviderRoots() {
    return providerRoots;
  }

  @JsonProperty("provider.roots")
  public void setProviderRoots(@Nullable ConfigNodePropertyString providerRoots) {
    this.providerRoots = providerRoots;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties = (ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties) o;
    return Objects.equals(this.providerRoots, comAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties.providerRoots);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoots);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteRestImplApiEndpointResourceProviderFactoryImplProperties {\n");
    sb.append("    providerRoots: ").append(toIndentedString(providerRoots)).append("\n");
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

