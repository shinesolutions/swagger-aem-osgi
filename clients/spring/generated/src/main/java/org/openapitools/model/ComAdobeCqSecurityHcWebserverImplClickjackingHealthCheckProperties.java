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
 * ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
 */

@JsonTypeName("comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray hcTags;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString webserverAddress;

  public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties hcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
    return this;
  }

  /**
   * Get hcTags
   * @return hcTags
   */
  @Valid 
  @Schema(name = "hc.tags", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("hc.tags")
  public @Nullable ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  @JsonProperty("hc.tags")
  public void setHcTags(@Nullable ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties webserverAddress(@Nullable ConfigNodePropertyString webserverAddress) {
    this.webserverAddress = webserverAddress;
    return this;
  }

  /**
   * Get webserverAddress
   * @return webserverAddress
   */
  @Valid 
  @Schema(name = "webserver.address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("webserver.address")
  public @Nullable ConfigNodePropertyString getWebserverAddress() {
    return webserverAddress;
  }

  @JsonProperty("webserver.address")
  public void setWebserverAddress(@Nullable ConfigNodePropertyString webserverAddress) {
    this.webserverAddress = webserverAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties = (ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties) o;
    return Objects.equals(this.hcTags, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.hcTags) &&
        Objects.equals(this.webserverAddress, comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties.webserverAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hcTags, webserverAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {\n");
    sb.append("    hcTags: ").append(toIndentedString(hcTags)).append("\n");
    sb.append("    webserverAddress: ").append(toIndentedString(webserverAddress)).append("\n");
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

