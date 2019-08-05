package apimodels;

import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties   {
  @JsonProperty("solr.home.path")
  private ConfigNodePropertyString solrHomePath = null;

  @JsonProperty("solr.core.name")
  private ConfigNodePropertyString solrCoreName = null;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties solrHomePath(ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
    return this;
  }

   /**
   * Get solrHomePath
   * @return solrHomePath
  **/
  @Valid
  public ConfigNodePropertyString getSolrHomePath() {
    return solrHomePath;
  }

  public void setSolrHomePath(ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties solrCoreName(ConfigNodePropertyString solrCoreName) {
    this.solrCoreName = solrCoreName;
    return this;
  }

   /**
   * Get solrCoreName
   * @return solrCoreName
  **/
  @Valid
  public ConfigNodePropertyString getSolrCoreName() {
    return solrCoreName;
  }

  public void setSolrCoreName(ConfigNodePropertyString solrCoreName) {
    this.solrCoreName = solrCoreName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties) o;
    return Objects.equals(solrHomePath, orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.solrHomePath) &&
        Objects.equals(solrCoreName, orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.solrCoreName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solrHomePath, solrCoreName);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

