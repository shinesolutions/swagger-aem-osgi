package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("solr.home.path")
  private ConfigNodePropertyString solrHomePath;

  @JsonProperty("solr.core.name")
  private ConfigNodePropertyString solrCoreName;

  /**
   * 
   * @return solrHomePath
   */
  public ConfigNodePropertyString getSolrHomePath() {
    return solrHomePath;
  }

  public void setSolrHomePath(ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
  }

  /**
   * 
   * @return solrCoreName
   */
  public ConfigNodePropertyString getSolrCoreName() {
    return solrCoreName;
  }

  public void setSolrCoreName(ConfigNodePropertyString solrCoreName) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
