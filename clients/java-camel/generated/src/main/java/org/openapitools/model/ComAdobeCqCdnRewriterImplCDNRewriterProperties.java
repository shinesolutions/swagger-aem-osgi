package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqCdnRewriterImplCDNRewriterProperties
 */

@JsonTypeName("comAdobeCqCdnRewriterImplCDNRewriterProperties")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2026-10-07T12:53:52.330827711Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCdnRewriterImplCDNRewriterProperties {

  private ConfigNodePropertyInteger serviceRanking;

  private ConfigNodePropertyArray cdnrewriterAttributes;

  private ConfigNodePropertyString cdnRewriterDistributionDomain;

  public ComAdobeCqCdnRewriterImplCDNRewriterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  /**
   * Get serviceRanking
   * @return serviceRanking
   */
  @Valid 
  @Schema(name = "service.ranking", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqCdnRewriterImplCDNRewriterProperties cdnrewriterAttributes(ConfigNodePropertyArray cdnrewriterAttributes) {
    this.cdnrewriterAttributes = cdnrewriterAttributes;
    return this;
  }

  /**
   * Get cdnrewriterAttributes
   * @return cdnrewriterAttributes
   */
  @Valid 
  @Schema(name = "cdnrewriter.attributes", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cdnrewriter.attributes")
  public ConfigNodePropertyArray getCdnrewriterAttributes() {
    return cdnrewriterAttributes;
  }

  public void setCdnrewriterAttributes(ConfigNodePropertyArray cdnrewriterAttributes) {
    this.cdnrewriterAttributes = cdnrewriterAttributes;
  }

  public ComAdobeCqCdnRewriterImplCDNRewriterProperties cdnRewriterDistributionDomain(ConfigNodePropertyString cdnRewriterDistributionDomain) {
    this.cdnRewriterDistributionDomain = cdnRewriterDistributionDomain;
    return this;
  }

  /**
   * Get cdnRewriterDistributionDomain
   * @return cdnRewriterDistributionDomain
   */
  @Valid 
  @Schema(name = "cdn.rewriter.distribution.domain", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cdn.rewriter.distribution.domain")
  public ConfigNodePropertyString getCdnRewriterDistributionDomain() {
    return cdnRewriterDistributionDomain;
  }

  public void setCdnRewriterDistributionDomain(ConfigNodePropertyString cdnRewriterDistributionDomain) {
    this.cdnRewriterDistributionDomain = cdnRewriterDistributionDomain;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCdnRewriterImplCDNRewriterProperties comAdobeCqCdnRewriterImplCDNRewriterProperties = (ComAdobeCqCdnRewriterImplCDNRewriterProperties) o;
    return Objects.equals(this.serviceRanking, comAdobeCqCdnRewriterImplCDNRewriterProperties.serviceRanking) &&
        Objects.equals(this.cdnrewriterAttributes, comAdobeCqCdnRewriterImplCDNRewriterProperties.cdnrewriterAttributes) &&
        Objects.equals(this.cdnRewriterDistributionDomain, comAdobeCqCdnRewriterImplCDNRewriterProperties.cdnRewriterDistributionDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, cdnrewriterAttributes, cdnRewriterDistributionDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCdnRewriterImplCDNRewriterProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    cdnrewriterAttributes: ").append(toIndentedString(cdnrewriterAttributes)).append("\n");
    sb.append("    cdnRewriterDistributionDomain: ").append(toIndentedString(cdnRewriterDistributionDomain)).append("\n");
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

