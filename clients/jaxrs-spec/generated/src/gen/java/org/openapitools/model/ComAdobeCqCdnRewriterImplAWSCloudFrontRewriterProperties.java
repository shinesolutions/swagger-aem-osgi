package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties   {
  private ConfigNodePropertyInteger serviceRanking;
  private ConfigNodePropertyString keypairId;
  private ConfigNodePropertyString keypairAlias;
  private ConfigNodePropertyArray cdnrewriterAttributes;
  private ConfigNodePropertyString cdnRewriterDistributionDomain;

  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties() {
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  @Valid public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }

  @JsonProperty("service.ranking")
  public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties keypairId(ConfigNodePropertyString keypairId) {
    this.keypairId = keypairId;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keypair.id")
  @Valid public ConfigNodePropertyString getKeypairId() {
    return keypairId;
  }

  @JsonProperty("keypair.id")
  public void setKeypairId(ConfigNodePropertyString keypairId) {
    this.keypairId = keypairId;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties keypairAlias(ConfigNodePropertyString keypairAlias) {
    this.keypairAlias = keypairAlias;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("keypair.alias")
  @Valid public ConfigNodePropertyString getKeypairAlias() {
    return keypairAlias;
  }

  @JsonProperty("keypair.alias")
  public void setKeypairAlias(ConfigNodePropertyString keypairAlias) {
    this.keypairAlias = keypairAlias;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties cdnrewriterAttributes(ConfigNodePropertyArray cdnrewriterAttributes) {
    this.cdnrewriterAttributes = cdnrewriterAttributes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdnrewriter.attributes")
  @Valid public ConfigNodePropertyArray getCdnrewriterAttributes() {
    return cdnrewriterAttributes;
  }

  @JsonProperty("cdnrewriter.attributes")
  public void setCdnrewriterAttributes(ConfigNodePropertyArray cdnrewriterAttributes) {
    this.cdnrewriterAttributes = cdnrewriterAttributes;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties cdnRewriterDistributionDomain(ConfigNodePropertyString cdnRewriterDistributionDomain) {
    this.cdnRewriterDistributionDomain = cdnRewriterDistributionDomain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdn.rewriter.distribution.domain")
  @Valid public ConfigNodePropertyString getCdnRewriterDistributionDomain() {
    return cdnRewriterDistributionDomain;
  }

  @JsonProperty("cdn.rewriter.distribution.domain")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
