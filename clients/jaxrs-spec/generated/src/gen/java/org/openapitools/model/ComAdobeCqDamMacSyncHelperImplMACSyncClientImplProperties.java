package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties   {
  private ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout;

  public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties() {
  }

  /**
   **/
  public ComAdobeCqDamMacSyncHelperImplMACSyncClientImplProperties comAdobeDamMacSyncClientSoTimeout(ConfigNodePropertyInteger comAdobeDamMacSyncClientSoTimeout) {
    this.comAdobeDamMacSyncClientSoTimeout = comAdobeDamMacSyncClientSoTimeout;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("com.adobe.dam.mac.sync.client.so.timeout")
  @Valid public ConfigNodePropertyInteger getComAdobeDamMacSyncClientSoTimeout() {
    return comAdobeDamMacSyncClientSoTimeout;
  }

  @JsonProperty("com.adobe.dam.mac.sync.client.so.timeout")
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
