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
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties
 */

@JsonTypeName("comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger serviceRanking;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString keypairId;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString keypairAlias;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray cdnrewriterAttributes;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString cdnRewriterDistributionDomain;

  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties serviceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
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
  public @Nullable ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(@Nullable ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties keypairId(@Nullable ConfigNodePropertyString keypairId) {
    this.keypairId = keypairId;
    return this;
  }

  /**
   * Get keypairId
   * @return keypairId
   */
  @Valid 
  @Schema(name = "keypair.id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keypair.id")
  public @Nullable ConfigNodePropertyString getKeypairId() {
    return keypairId;
  }

  @JsonProperty("keypair.id")
  public void setKeypairId(@Nullable ConfigNodePropertyString keypairId) {
    this.keypairId = keypairId;
  }

  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties keypairAlias(@Nullable ConfigNodePropertyString keypairAlias) {
    this.keypairAlias = keypairAlias;
    return this;
  }

  /**
   * Get keypairAlias
   * @return keypairAlias
   */
  @Valid 
  @Schema(name = "keypair.alias", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("keypair.alias")
  public @Nullable ConfigNodePropertyString getKeypairAlias() {
    return keypairAlias;
  }

  @JsonProperty("keypair.alias")
  public void setKeypairAlias(@Nullable ConfigNodePropertyString keypairAlias) {
    this.keypairAlias = keypairAlias;
  }

  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties cdnrewriterAttributes(@Nullable ConfigNodePropertyArray cdnrewriterAttributes) {
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
  public @Nullable ConfigNodePropertyArray getCdnrewriterAttributes() {
    return cdnrewriterAttributes;
  }

  @JsonProperty("cdnrewriter.attributes")
  public void setCdnrewriterAttributes(@Nullable ConfigNodePropertyArray cdnrewriterAttributes) {
    this.cdnrewriterAttributes = cdnrewriterAttributes;
  }

  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties cdnRewriterDistributionDomain(@Nullable ConfigNodePropertyString cdnRewriterDistributionDomain) {
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
  public @Nullable ConfigNodePropertyString getCdnRewriterDistributionDomain() {
    return cdnRewriterDistributionDomain;
  }

  @JsonProperty("cdn.rewriter.distribution.domain")
  public void setCdnRewriterDistributionDomain(@Nullable ConfigNodePropertyString cdnRewriterDistributionDomain) {
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
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties = (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) o;
    return Objects.equals(this.serviceRanking, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.serviceRanking) &&
        Objects.equals(this.keypairId, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.keypairId) &&
        Objects.equals(this.keypairAlias, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.keypairAlias) &&
        Objects.equals(this.cdnrewriterAttributes, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.cdnrewriterAttributes) &&
        Objects.equals(this.cdnRewriterDistributionDomain, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.cdnRewriterDistributionDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceRanking, keypairId, keypairAlias, cdnrewriterAttributes, cdnRewriterDistributionDomain);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {\n");
    sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
    sb.append("    keypairId: ").append(toIndentedString(keypairId)).append("\n");
    sb.append("    keypairAlias: ").append(toIndentedString(keypairAlias)).append("\n");
    sb.append("    cdnrewriterAttributes: ").append(toIndentedString(cdnrewriterAttributes)).append("\n");
    sb.append("    cdnRewriterDistributionDomain: ").append(toIndentedString(cdnRewriterDistributionDomain)).append("\n");
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

