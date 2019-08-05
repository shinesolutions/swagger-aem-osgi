package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
public class ComAdobeCqCdnRewriterImplCDNRewriterProperties   {
  @JsonProperty("service.ranking")
  private ConfigNodePropertyInteger serviceRanking = null;

  @JsonProperty("cdnrewriter.attributes")
  private ConfigNodePropertyArray cdnrewriterAttributes = null;

  @JsonProperty("cdn.rewriter.distribution.domain")
  private ConfigNodePropertyString cdnRewriterDistributionDomain = null;

  /**
   **/
  public ComAdobeCqCdnRewriterImplCDNRewriterProperties serviceRanking(ConfigNodePropertyInteger serviceRanking) {
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
  public ComAdobeCqCdnRewriterImplCDNRewriterProperties cdnrewriterAttributes(ConfigNodePropertyArray cdnrewriterAttributes) {
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
  public ComAdobeCqCdnRewriterImplCDNRewriterProperties cdnRewriterDistributionDomain(ConfigNodePropertyString cdnRewriterDistributionDomain) {
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
    ComAdobeCqCdnRewriterImplCDNRewriterProperties comAdobeCqCdnRewriterImplCDNRewriterProperties = (ComAdobeCqCdnRewriterImplCDNRewriterProperties) o;
    return Objects.equals(serviceRanking, comAdobeCqCdnRewriterImplCDNRewriterProperties.serviceRanking) &&
        Objects.equals(cdnrewriterAttributes, comAdobeCqCdnRewriterImplCDNRewriterProperties.cdnrewriterAttributes) &&
        Objects.equals(cdnRewriterDistributionDomain, comAdobeCqCdnRewriterImplCDNRewriterProperties.cdnRewriterDistributionDomain);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

