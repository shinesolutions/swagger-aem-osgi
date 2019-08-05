package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;


import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;



public class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties   {
  
  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyString keypairId = null;

  private ConfigNodePropertyString keypairAlias = null;

  private ConfigNodePropertyArray cdnrewriterAttributes = null;

  private ConfigNodePropertyString cdnRewriterDistributionDomain = null;


  /**
   **/
  public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
    this.serviceRanking = serviceRanking;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("service.ranking")
  public ConfigNodePropertyInteger getServiceRanking() {
    return serviceRanking;
  }
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
  public ConfigNodePropertyString getKeypairId() {
    return keypairId;
  }
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
  public ConfigNodePropertyString getKeypairAlias() {
    return keypairAlias;
  }
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
  public ConfigNodePropertyArray getCdnrewriterAttributes() {
    return cdnrewriterAttributes;
  }
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
  public ConfigNodePropertyString getCdnRewriterDistributionDomain() {
    return cdnRewriterDistributionDomain;
  }
  public void setCdnRewriterDistributionDomain(ConfigNodePropertyString cdnRewriterDistributionDomain) {
    this.cdnRewriterDistributionDomain = cdnRewriterDistributionDomain;
  }



  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties = (ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties) o;
    return Objects.equals(serviceRanking, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.serviceRanking) &&
        Objects.equals(keypairId, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.keypairId) &&
        Objects.equals(keypairAlias, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.keypairAlias) &&
        Objects.equals(cdnrewriterAttributes, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.cdnrewriterAttributes) &&
        Objects.equals(cdnRewriterDistributionDomain, comAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.cdnRewriterDistributionDomain);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

