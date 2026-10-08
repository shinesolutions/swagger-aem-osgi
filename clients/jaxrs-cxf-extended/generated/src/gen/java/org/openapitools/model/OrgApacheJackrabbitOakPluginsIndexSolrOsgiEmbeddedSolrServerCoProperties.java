package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrHomePath;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString solrCoreName;
 /**
  * Get solrHomePath
  * @return solrHomePath
  */
  @JsonProperty("solr.home.path")
  public ConfigNodePropertyString getSolrHomePath() {
    return solrHomePath;
  }

  /**
   * Sets the <code>solrHomePath</code> property.
   */
 public void setSolrHomePath(ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
  }

  /**
   * Sets the <code>solrHomePath</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties solrHomePath(ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
    return this;
  }

 /**
  * Get solrCoreName
  * @return solrCoreName
  */
  @JsonProperty("solr.core.name")
  public ConfigNodePropertyString getSolrCoreName() {
    return solrCoreName;
  }

  /**
   * Sets the <code>solrCoreName</code> property.
   */
 public void setSolrCoreName(ConfigNodePropertyString solrCoreName) {
    this.solrCoreName = solrCoreName;
  }

  /**
   * Sets the <code>solrCoreName</code> property.
   */
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties solrCoreName(ConfigNodePropertyString solrCoreName) {
    this.solrCoreName = solrCoreName;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

