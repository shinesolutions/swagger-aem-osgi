package apimodels;

import apimodels.ConfigNodePropertyDropDown;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties   {
  @JsonProperty("server.type")
  @Valid

  private ConfigNodePropertyDropDown serverType;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties serverType(ConfigNodePropertyDropDown serverType) {
    this.serverType = serverType;
    return this;
  }

   /**
   * Get serverType
   * @return serverType
  **/
  public ConfigNodePropertyDropDown getServerType() {
    return serverType;
  }

  public void setServerType(ConfigNodePropertyDropDown serverType) {
    this.serverType = serverType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties = (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties) o;
    return Objects.equals(serverType, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.serverType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serverType);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties {\n");
    
    sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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

