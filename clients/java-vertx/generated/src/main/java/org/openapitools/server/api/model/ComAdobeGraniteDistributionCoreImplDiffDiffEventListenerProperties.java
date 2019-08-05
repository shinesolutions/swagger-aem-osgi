package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties   {
  
  private ConfigNodePropertyString diffPath = null;
  private ConfigNodePropertyString serviceName = null;
  private ConfigNodePropertyString serviceUserTarget = null;

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties () {

  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties (ConfigNodePropertyString diffPath, ConfigNodePropertyString serviceName, ConfigNodePropertyString serviceUserTarget) {
    this.diffPath = diffPath;
    this.serviceName = serviceName;
    this.serviceUserTarget = serviceUserTarget;
  }

    
  @JsonProperty("diffPath")
  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }
  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

    
  @JsonProperty("serviceName")
  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }
  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

    
  @JsonProperty("serviceUser.target")
  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }
  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties = (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties) o;
    return Objects.equals(diffPath, comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.diffPath) &&
        Objects.equals(serviceName, comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.serviceName) &&
        Objects.equals(serviceUserTarget, comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.serviceUserTarget);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diffPath, serviceName, serviceUserTarget);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {\n");
    
    sb.append("    diffPath: ").append(toIndentedString(diffPath)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    serviceUserTarget: ").append(toIndentedString(serviceUserTarget)).append("\n");
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
