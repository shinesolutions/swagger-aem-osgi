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
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties
 */

@JsonTypeName("orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrHomePath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString solrCoreName;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties solrHomePath(@Nullable ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
    return this;
  }

  /**
   * Get solrHomePath
   * @return solrHomePath
   */
  @Valid 
  @Schema(name = "solr.home.path", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.home.path")
  public @Nullable ConfigNodePropertyString getSolrHomePath() {
    return solrHomePath;
  }

  @JsonProperty("solr.home.path")
  public void setSolrHomePath(@Nullable ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties solrCoreName(@Nullable ConfigNodePropertyString solrCoreName) {
    this.solrCoreName = solrCoreName;
    return this;
  }

  /**
   * Get solrCoreName
   * @return solrCoreName
   */
  @Valid 
  @Schema(name = "solr.core.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("solr.core.name")
  public @Nullable ConfigNodePropertyString getSolrCoreName() {
    return solrCoreName;
  }

  @JsonProperty("solr.core.name")
  public void setSolrCoreName(@Nullable ConfigNodePropertyString solrCoreName) {
    this.solrCoreName = solrCoreName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties) o;
    return Objects.equals(this.solrHomePath, orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.solrHomePath) &&
        Objects.equals(this.solrCoreName, orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.solrCoreName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solrHomePath, solrCoreName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties {\n");
    sb.append("    solrHomePath: ").append(toIndentedString(solrHomePath)).append("\n");
    sb.append("    solrCoreName: ").append(toIndentedString(solrCoreName)).append("\n");
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

