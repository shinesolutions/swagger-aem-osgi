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
 * ComAdobeGraniteHttpcacheFileFileCacheStoreProperties
 */

@JsonTypeName("comAdobeGraniteHttpcacheFileFileCacheStoreProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost;

  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileDocumentRoot(@Nullable ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
    return this;
  }

  /**
   * Get comAdobeGraniteHttpcacheFileDocumentRoot
   * @return comAdobeGraniteHttpcacheFileDocumentRoot
   */
  @Valid 
  @Schema(name = "com.adobe.granite.httpcache.file.documentRoot", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.httpcache.file.documentRoot")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteHttpcacheFileDocumentRoot() {
    return comAdobeGraniteHttpcacheFileDocumentRoot;
  }

  @JsonProperty("com.adobe.granite.httpcache.file.documentRoot")
  public void setComAdobeGraniteHttpcacheFileDocumentRoot(@Nullable ConfigNodePropertyString comAdobeGraniteHttpcacheFileDocumentRoot) {
    this.comAdobeGraniteHttpcacheFileDocumentRoot = comAdobeGraniteHttpcacheFileDocumentRoot;
  }

  public ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileIncludeHost(@Nullable ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
    return this;
  }

  /**
   * Get comAdobeGraniteHttpcacheFileIncludeHost
   * @return comAdobeGraniteHttpcacheFileIncludeHost
   */
  @Valid 
  @Schema(name = "com.adobe.granite.httpcache.file.includeHost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("com.adobe.granite.httpcache.file.includeHost")
  public @Nullable ConfigNodePropertyString getComAdobeGraniteHttpcacheFileIncludeHost() {
    return comAdobeGraniteHttpcacheFileIncludeHost;
  }

  @JsonProperty("com.adobe.granite.httpcache.file.includeHost")
  public void setComAdobeGraniteHttpcacheFileIncludeHost(@Nullable ConfigNodePropertyString comAdobeGraniteHttpcacheFileIncludeHost) {
    this.comAdobeGraniteHttpcacheFileIncludeHost = comAdobeGraniteHttpcacheFileIncludeHost;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteHttpcacheFileFileCacheStoreProperties comAdobeGraniteHttpcacheFileFileCacheStoreProperties = (ComAdobeGraniteHttpcacheFileFileCacheStoreProperties) o;
    return Objects.equals(this.comAdobeGraniteHttpcacheFileDocumentRoot, comAdobeGraniteHttpcacheFileFileCacheStoreProperties.comAdobeGraniteHttpcacheFileDocumentRoot) &&
        Objects.equals(this.comAdobeGraniteHttpcacheFileIncludeHost, comAdobeGraniteHttpcacheFileFileCacheStoreProperties.comAdobeGraniteHttpcacheFileIncludeHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeGraniteHttpcacheFileDocumentRoot, comAdobeGraniteHttpcacheFileIncludeHost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteHttpcacheFileFileCacheStoreProperties {\n");
    sb.append("    comAdobeGraniteHttpcacheFileDocumentRoot: ").append(toIndentedString(comAdobeGraniteHttpcacheFileDocumentRoot)).append("\n");
    sb.append("    comAdobeGraniteHttpcacheFileIncludeHost: ").append(toIndentedString(comAdobeGraniteHttpcacheFileIncludeHost)).append("\n");
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

