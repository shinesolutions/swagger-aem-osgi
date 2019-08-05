package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties   {
  @JsonProperty("cdn.config.distribution.domain")
  private ConfigNodePropertyString cdnConfigDistributionDomain = null;

  @JsonProperty("cdn.config.enable.rewriting")
  private ConfigNodePropertyBoolean cdnConfigEnableRewriting = null;

  @JsonProperty("cdn.config.path.prefixes")
  private ConfigNodePropertyArray cdnConfigPathPrefixes = null;

  @JsonProperty("cdn.config.cdnttl")
  private ConfigNodePropertyInteger cdnConfigCdnttl = null;

  @JsonProperty("cdn.config.application.protocol")
  private ConfigNodePropertyString cdnConfigApplicationProtocol = null;

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
    return this;
  }

   /**
   * Get cdnConfigDistributionDomain
   * @return cdnConfigDistributionDomain
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCdnConfigDistributionDomain() {
    return cdnConfigDistributionDomain;
  }

  public void setCdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
  }

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigEnableRewriting(ConfigNodePropertyBoolean cdnConfigEnableRewriting) {
    this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
    return this;
  }

   /**
   * Get cdnConfigEnableRewriting
   * @return cdnConfigEnableRewriting
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getCdnConfigEnableRewriting() {
    return cdnConfigEnableRewriting;
  }

  public void setCdnConfigEnableRewriting(ConfigNodePropertyBoolean cdnConfigEnableRewriting) {
    this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
  }

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigPathPrefixes(ConfigNodePropertyArray cdnConfigPathPrefixes) {
    this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
    return this;
  }

   /**
   * Get cdnConfigPathPrefixes
   * @return cdnConfigPathPrefixes
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getCdnConfigPathPrefixes() {
    return cdnConfigPathPrefixes;
  }

  public void setCdnConfigPathPrefixes(ConfigNodePropertyArray cdnConfigPathPrefixes) {
    this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
  }

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigCdnttl(ConfigNodePropertyInteger cdnConfigCdnttl) {
    this.cdnConfigCdnttl = cdnConfigCdnttl;
    return this;
  }

   /**
   * Get cdnConfigCdnttl
   * @return cdnConfigCdnttl
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getCdnConfigCdnttl() {
    return cdnConfigCdnttl;
  }

  public void setCdnConfigCdnttl(ConfigNodePropertyInteger cdnConfigCdnttl) {
    this.cdnConfigCdnttl = cdnConfigCdnttl;
  }

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigApplicationProtocol(ConfigNodePropertyString cdnConfigApplicationProtocol) {
    this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
    return this;
  }

   /**
   * Get cdnConfigApplicationProtocol
   * @return cdnConfigApplicationProtocol
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getCdnConfigApplicationProtocol() {
    return cdnConfigApplicationProtocol;
  }

  public void setCdnConfigApplicationProtocol(ConfigNodePropertyString cdnConfigApplicationProtocol) {
    this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties = (ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties) o;
    return Objects.equals(this.cdnConfigDistributionDomain, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigDistributionDomain) &&
        Objects.equals(this.cdnConfigEnableRewriting, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigEnableRewriting) &&
        Objects.equals(this.cdnConfigPathPrefixes, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigPathPrefixes) &&
        Objects.equals(this.cdnConfigCdnttl, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigCdnttl) &&
        Objects.equals(this.cdnConfigApplicationProtocol, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigApplicationProtocol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdnConfigDistributionDomain, cdnConfigEnableRewriting, cdnConfigPathPrefixes, cdnConfigCdnttl, cdnConfigApplicationProtocol);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties {\n");
    
    sb.append("    cdnConfigDistributionDomain: ").append(toIndentedString(cdnConfigDistributionDomain)).append("\n");
    sb.append("    cdnConfigEnableRewriting: ").append(toIndentedString(cdnConfigEnableRewriting)).append("\n");
    sb.append("    cdnConfigPathPrefixes: ").append(toIndentedString(cdnConfigPathPrefixes)).append("\n");
    sb.append("    cdnConfigCdnttl: ").append(toIndentedString(cdnConfigCdnttl)).append("\n");
    sb.append("    cdnConfigApplicationProtocol: ").append(toIndentedString(cdnConfigApplicationProtocol)).append("\n");
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

