package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties   {
  @JsonProperty("com.adobe.dam.mac.sync.client.so.timeout")
  private ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout = null;

  /**
   **/
  public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties comAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
    this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.dam.mac.sync.client.so.timeout")
  public ConfigNodePropertyInteger getComAdobeDamMacSyncClientSoTimeout() {
    return comAdobeDamMacSyncClientSoTimeout;
  }
  public void setComAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
    this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

