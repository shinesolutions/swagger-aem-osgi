package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties   {

    private ConfigNodePropertyString cdnConfigDistributionDomain;
    private ConfigNodePropertyBoolean cdnConfigEnableRewriting;
    private ConfigNodePropertyArray cdnConfigPathPrefixes;
    private ConfigNodePropertyInteger cdnConfigCdnttl;
    private ConfigNodePropertyString cdnConfigApplicationProtocol;

    /**
     * Default constructor.
     */
    public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties.
     *
     * @param cdnConfigDistributionDomain cdnConfigDistributionDomain
     * @param cdnConfigEnableRewriting cdnConfigEnableRewriting
     * @param cdnConfigPathPrefixes cdnConfigPathPrefixes
     * @param cdnConfigCdnttl cdnConfigCdnttl
     * @param cdnConfigApplicationProtocol cdnConfigApplicationProtocol
     */
    public ComAdobeCqCdnRewriterImplCDNConfigServiceImplProperties(
        ConfigNodePropertyString cdnConfigDistributionDomain, 
        ConfigNodePropertyBoolean cdnConfigEnableRewriting, 
        ConfigNodePropertyArray cdnConfigPathPrefixes, 
        ConfigNodePropertyInteger cdnConfigCdnttl, 
        ConfigNodePropertyString cdnConfigApplicationProtocol
    ) {
        this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
        this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
        this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
        this.cdnConfigCdnttl = cdnConfigCdnttl;
        this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
    }



    /**
     * Get cdnConfigDistributionDomain
     * @return cdnConfigDistributionDomain
     */
    public ConfigNodePropertyString getCdnConfigDistributionDomain() {
        return cdnConfigDistributionDomain;
    }

    public void setCdnConfigDistributionDomain(ConfigNodePropertyString cdnConfigDistributionDomain) {
        this.cdnConfigDistributionDomain = cdnConfigDistributionDomain;
    }

    /**
     * Get cdnConfigEnableRewriting
     * @return cdnConfigEnableRewriting
     */
    public ConfigNodePropertyBoolean getCdnConfigEnableRewriting() {
        return cdnConfigEnableRewriting;
    }

    public void setCdnConfigEnableRewriting(ConfigNodePropertyBoolean cdnConfigEnableRewriting) {
        this.cdnConfigEnableRewriting = cdnConfigEnableRewriting;
    }

    /**
     * Get cdnConfigPathPrefixes
     * @return cdnConfigPathPrefixes
     */
    public ConfigNodePropertyArray getCdnConfigPathPrefixes() {
        return cdnConfigPathPrefixes;
    }

    public void setCdnConfigPathPrefixes(ConfigNodePropertyArray cdnConfigPathPrefixes) {
        this.cdnConfigPathPrefixes = cdnConfigPathPrefixes;
    }

    /**
     * Get cdnConfigCdnttl
     * @return cdnConfigCdnttl
     */
    public ConfigNodePropertyInteger getCdnConfigCdnttl() {
        return cdnConfigCdnttl;
    }

    public void setCdnConfigCdnttl(ConfigNodePropertyInteger cdnConfigCdnttl) {
        this.cdnConfigCdnttl = cdnConfigCdnttl;
    }

    /**
     * Get cdnConfigApplicationProtocol
     * @return cdnConfigApplicationProtocol
     */
    public ConfigNodePropertyString getCdnConfigApplicationProtocol() {
        return cdnConfigApplicationProtocol;
    }

    public void setCdnConfigApplicationProtocol(ConfigNodePropertyString cdnConfigApplicationProtocol) {
        this.cdnConfigApplicationProtocol = cdnConfigApplicationProtocol;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

