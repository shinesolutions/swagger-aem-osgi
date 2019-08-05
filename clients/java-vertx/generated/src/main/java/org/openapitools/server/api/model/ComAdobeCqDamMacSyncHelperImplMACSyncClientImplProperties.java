package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties   {
  
  private ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout = null;

  public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties () {

  }

  public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties (ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
    this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
  }

    
  @JsonProperty("com.adobe.dam.mac.sync.client.so.timeout")
  public ConfigNodePropertyInteger getComAdobeDamMacSyncClientSoTimeout() {
    return comAdobeDamMacSyncClientSoTimeout;
  }
  public void setComAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
    this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties = (ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties) o;
    return Objects.equals(comAdobeDamMacSyncClientSoTimeout, comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.comAdobeDamMacSyncClientSoTimeout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(comAdobeDamMacSyncClientSoTimeout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties {\n");
    
    sb.append("    comAdobeDamMacSyncClientSoTimeout: ").append(toIndentedString(comAdobeDamMacSyncClientSoTimeout)).append("\n");
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
