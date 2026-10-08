package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("query.aggregation")
  private ConfigNodePropertyBoolean queryAggregation;

  /**
   * 
   * @return queryAggregation
   */
  public ConfigNodePropertyBoolean getQueryAggregation() {
    return queryAggregation;
  }

  public void setQueryAggregation(ConfigNodePropertyBoolean queryAggregation) {
    this.queryAggregation = queryAggregation;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties) o;
    return Objects.equals(this.queryAggregation, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.queryAggregation);
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
