package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("service.max_links_per_host")
  private ConfigNodePropertyInteger serviceMaxLinksPerHost;

  @JsonProperty("service.save_external_link_references")
  private ConfigNodePropertyBoolean serviceSaveExternalLinkReferences;

  /**
   * 
   * @return serviceMaxLinksPerHost
   */
  public ConfigNodePropertyInteger getServiceMaxLinksPerHost() {
    return serviceMaxLinksPerHost;
  }

  public void setServiceMaxLinksPerHost(ConfigNodePropertyInteger serviceMaxLinksPerHost) {
    this.serviceMaxLinksPerHost = serviceMaxLinksPerHost;
  }

  /**
   * 
   * @return serviceSaveExternalLinkReferences
   */
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
