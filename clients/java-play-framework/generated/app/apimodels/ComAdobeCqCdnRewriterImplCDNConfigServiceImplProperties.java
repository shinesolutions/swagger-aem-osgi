package apimodels;

import apimodels.ConfigNodePropertyArray;
import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2026-10-07T12:53:38.087254368Z[Etc/UTC]", comments = "Generator version: 7.24.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties   {
  @JsonProperty("cdn.config.distribution.domain")
  @Valid

  private ConfigNodePropertyString cdnConfigDistributionDomain;

  @JsonProperty("cdn.config.enable.rewriting")
  @Valid

  private ConfigNodePropertyBoolean cdnConfigEnableRewriting;

  @JsonProperty("cdn.config.path.prefixes")
  @Valid

  private ConfigNodePropertyArray cdnConfigPathPrefixes;

  @JsonProperty("cdn.config.cdnttl")
  @Valid

  private ConfigNodePropertyInteger cdnConfigCdnttl;

  @JsonProperty("cdn.config.application.protocol")
  @Valid

  private ConfigNodePropertyString cdnConfigApplicationProtocol;

  public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties cdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
    this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
    return this;
  }

   /**
   * Get cdnConfigDistributionDomain
   * @return cdnConfigDistributionDomain
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

