package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import javax.validation.constraints.*;
import javax.validation.Valid;


import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties   {
  
  private @Valid ConfigNodePropertyDropDown serverType = null;

  /**
   **/
  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties serverType(ConfigNodePropertyDropDown serverType) {
    this.serverType = serverType;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("server.type")
  public ConfigNodePropertyDropDown getServerType() {
    return serverType;
  }
  public void setServerType(ConfigNodePropertyDropDown serverType) {
    this.serverType = serverType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

