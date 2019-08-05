package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyArray;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties   {
  
  private ConfigNodePropertyString cdnConfigDistributionDomain = null;
  private ConfigNodePropertyBoolean cdnConfigEnableRewriting = null;
  private ConfigNodePropertyArray cdnConfigPathPrefixes = null;
  private ConfigNodePropertyInteger cdnConfigCdnttl = null;
  private ConfigNodePropertyString cdnConfigApplicationProtocol = null;

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties () {

  }

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties (ConfigNodePropertyString cdnConfigDistributionDomain, ConfigNodePropertyBoolean cdnConfigEnableRewriting, ConfigNodePropertyArray cdnConfigPathPrefixes, ConfigNodePropertyInteger cdnConfigCdnttl, ConfigNodePropertyString cdnConfigApplicationProtocol) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
    this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
    this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
    this.cdnConfigCdnttl = cdnConfigCdnttl;
    this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
  }

    
  @JsonProperty("cdn.config.distribution.domain")
  public ConfigNodePropertyString getCdnConfigDistributionDomain() {
    return cdnConfigDistributionDomain;
  }
  public void setCdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
  }

    
  @JsonProperty("cdn.config.enable.rewriting")
  public ConfigNodePropertyBoolean getCdnConfigEnableRewriting() {
    return cdnConfigEnableRewriting;
  }
  public void setCdnConfigEnableRewriting(ConfigNodePropertyBoolean cdnConfigEnableRewriting) {
    this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
  }

    
  @JsonProperty("cdn.config.path.prefixes")
  public ConfigNodePropertyArray getCdnConfigPathPrefixes() {
    return cdnConfigPathPrefixes;
  }
  public void setCdnConfigPathPrefixes(ConfigNodePropertyArray cdnConfigPathPrefixes) {
    this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
  }

    
  @JsonProperty("cdn.config.cdnttl")
  public ConfigNodePropertyInteger getCdnConfigCdnttl() {
    return cdnConfigCdnttl;
  }
  public void setCdnConfigCdnttl(ConfigNodePropertyInteger cdnConfigCdnttl) {
    this.cdnConfigCdnttl = cdnConfigCdnttl;
  }

    
  @JsonProperty("cdn.config.application.protocol")
  public ConfigNodePropertyString getCdnConfigApplicationProtocol() {
    return cdnConfigApplicationProtocol;
  }
  public void setCdnConfigApplicationProtocol(ConfigNodePropertyString cdnConfigApplicationProtocol) {
    this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
