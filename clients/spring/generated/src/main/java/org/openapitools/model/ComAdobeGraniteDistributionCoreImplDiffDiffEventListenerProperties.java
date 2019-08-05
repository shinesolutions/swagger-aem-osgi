package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties   {
  @JsonProperty("diffPath")
  private ConfigNodePropertyString diffPath = null;

  @JsonProperty("serviceName")
  private ConfigNodePropertyString serviceName = null;

  @JsonProperty("serviceUser.target")
  private ConfigNodePropertyString serviceUserTarget = null;

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties diffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

  /**
   * Get diffPath
   * @return diffPath
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  public void setDiffPath(ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties serviceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  public void setServiceName(ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties serviceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

  /**
   * Get serviceUserTarget
   * @return serviceUserTarget
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  public void setServiceUserTarget(ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties = (ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties) o;
    return Objects.equals(this.diffPath, comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.diffPath) &&
        Objects.equals(this.serviceName, comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.serviceName) &&
        Objects.equals(this.serviceUserTarget, comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties.serviceUserTarget);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

