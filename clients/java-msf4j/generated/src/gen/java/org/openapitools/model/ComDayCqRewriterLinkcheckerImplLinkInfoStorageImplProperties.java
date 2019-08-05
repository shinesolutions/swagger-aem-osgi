package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;

/**
 * ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-08-05T00:54:29.762Z[GMT]")
public class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties   {
  @JsonProperty("service.max_links_per_host")
  private ConfigNodePropertyInteger serviceMaxLinksPerHost = null;

  @JsonProperty("service.save_external_link_references")
  private ConfigNodePropertyBoolean serviceSaveExternalLinkReferences = null;

  public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties serviceMaxLinksPerHost(ConfigNodePropertyInteger serviceMaxLinksPerHost) {
    this.serviceMaxLinksPerHost = serviceMaxLinksPerHost;
    return this;
  }

   /**
   * Get serviceMaxLinksPerHost
   * @return serviceMaxLinksPerHost
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getServiceMaxLinksPerHost() {
    return serviceMaxLinksPerHost;
  }

  public void setServiceMaxLinksPerHost(ConfigNodePropertyInteger serviceMaxLinksPerHost) {
    this.serviceMaxLinksPerHost = serviceMaxLinksPerHost;
  }

  public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties serviceSaveExternalLinkReferences(ConfigNodePropertyBoolean serviceSaveExternalLinkReferences) {
    this.serviceSaveExternalLinkReferences = serviceSaveExternalLinkReferences;
    return this;
  }

   /**
   * Get serviceSaveExternalLinkReferences
   * @return serviceSaveExternalLinkReferences
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getServiceSaveExternalLinkReferences() {
    return serviceSaveExternalLinkReferences;
  }

  public void setServiceSaveExternalLinkReferences(ConfigNodePropertyBoolean serviceSaveExternalLinkReferences) {
    this.serviceSaveExternalLinkReferences = serviceSaveExternalLinkReferences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties = (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties) o;
    return Objects.equals(this.serviceMaxLinksPerHost, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.serviceMaxLinksPerHost) &&
        Objects.equals(this.serviceSaveExternalLinkReferences, comDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.serviceSaveExternalLinkReferences);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

