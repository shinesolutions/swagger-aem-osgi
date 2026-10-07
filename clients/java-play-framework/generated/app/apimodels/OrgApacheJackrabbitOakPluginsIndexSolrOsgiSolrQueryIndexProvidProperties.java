package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties   {
  @JsonProperty("query.aggregation")
  @Valid

  private ConfigNodePropertyBoolean queryAggregation;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties queryAggregation(ConfigNodePropertyBoolean queryAggregation) {
    this.queryAggregation = queryAggregation;
    return this;
  }

   /**
   * Get queryAggregation
   * @return queryAggregation
  **/
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
    return Objects.equals(queryAggregation, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties.queryAggregation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryAggregation);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

