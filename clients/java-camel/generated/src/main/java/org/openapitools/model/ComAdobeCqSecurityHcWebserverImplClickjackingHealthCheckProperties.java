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
 * ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties
 */

@JsonTypeName("comAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties {

  private ConfigNodePropertyArray hcTags;

  private ConfigNodePropertyString webserverAddress;

  public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties hcTags(ConfigNodePropertyArray hcTags) {
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
  public ConfigNodePropertyArray getHcTags() {
    return hcTags;
  }

  public void setHcTags(ConfigNodePropertyArray hcTags) {
    this.hcTags = hcTags;
  }

  public ComAdobeCqSecurityHcWebserverImplClickjackingHealthCheckProperties webserverAddress(ConfigNodePropertyString webserverAddress) {
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
  public ConfigNodePropertyString getWebserverAddress() {
    return webserverAddress;
  }

  public void setWebserverAddress(ConfigNodePropertyString webserverAddress) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

