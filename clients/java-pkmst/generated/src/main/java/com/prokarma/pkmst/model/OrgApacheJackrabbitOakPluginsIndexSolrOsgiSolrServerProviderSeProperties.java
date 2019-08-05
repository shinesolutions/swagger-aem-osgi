package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyDropDown;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties   {
  @JsonProperty("server.type")
  private ConfigNodePropertyDropDown serverType = null;

  public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties serverType(ConfigNodePropertyDropDown serverType) {
    this.serverType = serverType;
    return this;
  }

   /**
   * Get serverType
   * @return serverType
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.serverType, orgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties.serverType);
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

