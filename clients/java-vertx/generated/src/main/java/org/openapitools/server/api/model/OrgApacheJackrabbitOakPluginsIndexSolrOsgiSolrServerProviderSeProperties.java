package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyDropDown;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties   {
  
  private ConfigNodePropertyDropDown serverType = null;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties () {

  }

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties (ConfigNodePropertyDropDown serverType) {
    this.serverType = serverType;
  }

    
  @JsonProperty("server.type")
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
