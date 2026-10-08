package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties
 */

@JsonTypeName("comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {

  private ConfigNodePropertyArray slingServletSelectors;

  private ConfigNodePropertyString slingServletExtensions;

  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
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
  public ConfigNodePropertyArray getSlingServletSelectors() {
    return slingServletSelectors;
  }

  public void setSlingServletSelectors(ConfigNodePropertyArray slingServletSelectors) {
    this.slingServletSelectors = slingServletSelectors;
  }

  public ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties slingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
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
  public ConfigNodePropertyString getSlingServletExtensions() {
    return slingServletExtensions;
  }

  public void setSlingServletExtensions(ConfigNodePropertyString slingServletExtensions) {
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
    ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties = (ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties) o;
    return Objects.equals(this.slingServletSelectors, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.slingServletSelectors) &&
        Objects.equals(this.slingServletExtensions, comAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties.slingServletExtensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingServletSelectors, slingServletExtensions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSocialScfEndpointsImplDefaultSocialGetServletProperties {\n");
    sb.append("    slingServletSelectors: ").append(toIndentedString(slingServletSelectors)).append("\n");
    sb.append("    slingServletExtensions: ").append(toIndentedString(slingServletExtensions)).append("\n");
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

