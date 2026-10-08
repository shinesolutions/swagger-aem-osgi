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
 * ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties
 */

@JsonTypeName("comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletSelectors;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingServletExtensions;

  public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties slingServletSelectors(@Nullable ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
    return this;
  }

  /**
   * Get slingServletSelectors
   * @return slingServletSelectors
   */
  @Valid 
  @Schema(name = "sling.servlet.selectors", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.selectors")
  public @Nullable ConfigNodePropertyString getSlingServletSelectors() {
    return slingServletSelectors;
  }

  @JsonProperty("sling.servlet.selectors")
  public void setSlingServletSelectors(@Nullable ConfigNodePropertyString slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties slingServletExtensions(@Nullable ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
    return this;
  }

  /**
   * Get slingServletExtensions
   * @return slingServletExtensions
   */
  @Valid 
  @Schema(name = "sling.servlet.extensions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.servlet.extensions")
  public @Nullable ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  @JsonProperty("sling.servlet.extensions")
  public void setSlingServletExtensions(@Nullable ConfigNodePropertyString slingServletExtensions) {
    this.slingServletExtensions = slingServletExtensions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties = (ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties) o;
    return Objects.equals(this.slingServletSelectors, comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.slingServletSelectors) &&
        Objects.equals(this.slingServletExtensions, comAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties.slingServletExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, slingServletExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialScfCoreOperationsImplSocialOperationsServletProperties {\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
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

