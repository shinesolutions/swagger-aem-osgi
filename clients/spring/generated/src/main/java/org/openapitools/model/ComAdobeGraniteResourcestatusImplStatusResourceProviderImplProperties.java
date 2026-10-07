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
 * ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties
 */

@JsonTypeName("comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString providerRoot;

  public ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties providerRoot(@Nullable ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
    return this;
  }

  /**
   * Get providerRoot
   * @return providerRoot
   */
  @Valid 
  @Schema(name = "provider.root", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("provider.root")
  public @Nullable ConfigNodePropertyString getProviderRoot() {
    return providerRoot;
  }

  @JsonProperty("provider.root")
  public void setProviderRoot(@Nullable ConfigNodePropertyString providerRoot) {
    this.providerRoot = providerRoot;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties = (ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties) o;
    return Objects.equals(this.providerRoot, comAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties.providerRoot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(providerRoot);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteResourcestatusImplStatusResourceProviderImplProperties {\n");
    sb.append("    providerRoot: ").append(toIndentedString(providerRoot)).append("\n");
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

