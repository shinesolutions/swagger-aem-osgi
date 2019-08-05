package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;





@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2019-08-05T00:53:46.291Z[GMT]")
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

  /**
   **/
  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdn.config.distribution.domain")
  public ConfigNodePropertyString getCdnConfigDistributionDomain() {
    return cdnConfigDistributionDomain;
  }
  public void setCdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigEnableRewriting(ConfigNodePropertyBoolean cdnConfigEnableRewriting) {
    this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdn.config.enable.rewriting")
  public ConfigNodePropertyBoolean getCdnConfigEnableRewriting() {
    return cdnConfigEnableRewriting;
  }
  public void setCdnConfigEnableRewriting(ConfigNodePropertyBoolean cdnConfigEnableRewriting) {
    this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigPathPrefixes(ConfigNodePropertyArray cdnConfigPathPrefixes) {
    this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdn.config.path.prefixes")
  public ConfigNodePropertyArray getCdnConfigPathPrefixes() {
    return cdnConfigPathPrefixes;
  }
  public void setCdnConfigPathPrefixes(ConfigNodePropertyArray cdnConfigPathPrefixes) {
    this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigCdnttl(ConfigNodePropertyInteger cdnConfigCdnttl) {
    this.cdnConfigCdnttl = cdnConfigCdnttl;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdn.config.cdnttl")
  public ConfigNodePropertyInteger getCdnConfigCdnttl() {
    return cdnConfigCdnttl;
  }
  public void setCdnConfigCdnttl(ConfigNodePropertyInteger cdnConfigCdnttl) {
    this.cdnConfigCdnttl = cdnConfigCdnttl;
  }

  /**
   **/
  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigApplicationProtocol(ConfigNodePropertyString cdnConfigApplicationProtocol) {
    this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cdn.config.application.protocol")
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
    return Objects.equals(cdnConfigDistributionDomain, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigDistributionDomain) &&
        Objects.equals(cdnConfigEnableRewriting, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigEnableRewriting) &&
        Objects.equals(cdnConfigPathPrefixes, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigPathPrefixes) &&
        Objects.equals(cdnConfigCdnttl, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigCdnttl) &&
        Objects.equals(cdnConfigApplicationProtocol, comAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.cdnConfigApplicationProtocol);
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

