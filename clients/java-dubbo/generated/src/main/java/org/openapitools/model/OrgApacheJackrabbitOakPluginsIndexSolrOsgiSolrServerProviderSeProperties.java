package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyDropDown;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("server.type")
  private ConfigNodePropertyDropDown serverType;

  /**
   * 
   * @return serverType
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
