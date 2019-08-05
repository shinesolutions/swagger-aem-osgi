package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties   {
  

  private ConfigNodePropertyInteger serviceMaxLinksPerHost = null;

  private ConfigNodePropertyBoolean serviceSaveExternalLinkReferences = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service.max_links_per_host")
  public ConfigNodePropertyInteger getServiceMaxLinksPerHost() {
    return serviceMaxLinksPerHost;
  }
  public void setServiceMaxLinksPerHost(ConfigNodePropertyInteger serviceMaxLinksPerHost) {
    this.serviceMaxLinksPerHost = serviceMaxLinksPerHost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("service.save_external_link_references")
  public ConfigNodePropertyBoolean getServiceSaveExternalLinkReferences() {
    return serviceSaveExternalLinkReferences;
  }
  public void setServiceSaveExternalLinkReferences(ConfigNodePropertyBoolean serviceSaveExternalLinkReferences) {
    this.serviceSaveExternalLinkReferences = serviceSaveExternalLinkReferences;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties = (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties) o;
    return Objects.equals(serviceMaxLinksPerHost, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.serviceMaxLinksPerHost) &&
        Objects.equals(serviceSaveExternalLinkReferences, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.serviceSaveExternalLinkReferences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceMaxLinksPerHost, serviceSaveExternalLinkReferences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties {\n");
    
    sb.append("    serviceMaxLinksPerHost: ").append(toIndentedString(serviceMaxLinksPerHost)).append("\n");
    sb.append("    serviceSaveExternalLinkReferences: ").append(toIndentedString(serviceSaveExternalLinkReferences)).append("\n");
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

