package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyBoolean;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties   {
  
  private ConfigNodePropertyBoolean queryAggregation = null;


  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties queryAggregation(ConfigNodePropertyBoolean queryAggregation) {
    this.queryAggregation = queryAggregation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("query.aggregation")
  public ConfigNodePropertyBoolean getQueryAggregation() {
    return queryAggregation;
  }
  public void setQueryAggregation(ConfigNodePropertyBoolean queryAggregation) {
    this.queryAggregation = queryAggregation;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties) o;
    return Objects.equals(queryAggregation, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.queryAggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryAggregation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties {\n");
    
    sb.append("    queryAggregation: ").append(toIndentedString(queryAggregation)).append("\n");
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

