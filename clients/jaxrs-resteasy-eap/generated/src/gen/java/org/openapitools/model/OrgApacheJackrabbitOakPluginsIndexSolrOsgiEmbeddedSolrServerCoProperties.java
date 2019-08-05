package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties   {
  

  private ConfigNodePropertyString solrHomePath = null;

  private ConfigNodePropertyString solrCoreName = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.home.path")
  public ConfigNodePropertyString getSolrHomePath() {
    return solrHomePath;
  }
  public void setSolrHomePath(ConfigNodePropertyString solrHomePath) {
    this.solrHomePath = solrHomePath;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("solr.core.name")
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
    return Objects.equals(solrHomePath, orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.solrHomePath) &&
        Objects.equals(solrCoreName, orgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties.solrCoreName);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

