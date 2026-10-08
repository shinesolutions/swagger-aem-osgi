package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2026-10-07T12:53:33.786893092Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties   {
  @JsonProperty("com.adobe.dam.mac.sync.client.so.timeout")
  private ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout;

  public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties comAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
    this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
    return this;
  }

  /**
   * Get comAdobeDamMacSyncClientSoTimeout
   * @return comAdobeDamMacSyncClientSoTimeout
   */
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.comAdobeDamMacSyncClientSoTimeout, comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties.comAdobeDamMacSyncClientSoTimeout);
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

