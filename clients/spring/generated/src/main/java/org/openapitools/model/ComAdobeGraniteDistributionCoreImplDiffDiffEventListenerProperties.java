package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties
 */

@JsonTypeName("comAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString diffPath;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString serviceUserTarget;

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties diffPath(@Nullable ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
    return this;
  }

  /**
   * Get diffPath
   * @return diffPath
   */
  @Valid 
  @Schema(name = "diffPath", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("diffPath")
  public @Nullable ConfigNodePropertyString getDiffPath() {
    return diffPath;
  }

  @JsonProperty("diffPath")
  public void setDiffPath(@Nullable ConfigNodePropertyString diffPath) {
    this.diffPath = diffPath;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties serviceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
    return this;
  }

  /**
   * Get serviceName
   * @return serviceName
   */
  @Valid 
  @Schema(name = "serviceName", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceName")
  public @Nullable ConfigNodePropertyString getServiceName() {
    return serviceName;
  }

  @JsonProperty("serviceName")
  public void setServiceName(@Nullable ConfigNodePropertyString serviceName) {
    this.serviceName = serviceName;
  }

  public ComAdobeGraniteDistributionCoreImplDiffDiffEventListenerProperties serviceUserTarget(@Nullable ConfigNodePropertyString serviceUserTarget) {
    this.serviceUserTarget = serviceUserTarget;
    return this;
  }

  /**
   * Get serviceUserTarget
   * @return serviceUserTarget
   */
  @Valid 
  @Schema(name = "serviceUser.target", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("serviceUser.target")
  public @Nullable ConfigNodePropertyString getServiceUserTarget() {
    return serviceUserTarget;
  }

  @JsonProperty("serviceUser.target")
  public void setServiceUserTarget(@Nullable ConfigNodePropertyString serviceUserTarget) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

