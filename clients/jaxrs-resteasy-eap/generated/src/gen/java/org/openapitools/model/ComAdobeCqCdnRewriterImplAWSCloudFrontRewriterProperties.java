package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyEapServerCodegen", date = "2019-08-05T01:00:05.540Z[GMT]")
public class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties   {
  

  private ConfigNodePropertyInteger serviceRanking = null;

  private ConfigNodePropertyString keypairId = null;

  private ConfigNodePropertyString keypairAlias = null;

  private ConfigNodePropertyArray cdnrewriterAttributes = null;

  private ConfigNodePropertyString cdnRewriterDistributionDomain = null;

  /**
   **/
  
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
  
  @ApiModelProperty(value = "")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

