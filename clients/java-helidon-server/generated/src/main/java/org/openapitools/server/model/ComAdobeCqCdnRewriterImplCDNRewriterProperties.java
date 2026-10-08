package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCdnRewriterImplCDNRewriterProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyArray cdnrewriterAttributes;
    private ConfigNodePropertyString cdnRewriterDistributionDomain;

    /**
     * Default constructor.
     */
    public ComAdobeCqCdnRewriterImplCDNRewriterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCdnRewriterImplCDNRewriterProperties.
     *
     * @param serviceRanking serviceRanking
     * @param cdnrewriterAttributes cdnrewriterAttributes
     * @param cdnRewriterDistributionDomain cdnRewriterDistributionDomain
     */
    public ComAdobeCqCdnRewriterImplCDNRewriterProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyArray cdnrewriterAttributes, 
        ConfigNodePropertyString cdnRewriterDistributionDomain
    ) {
        this.serviceRanking = serviceRanking;
        this.cdnrewriterAttributes = cdnrewriterAttributes;
        this.cdnRewriterDistributionDomain = cdnRewriterDistributionDomain;
    }



    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get cdnrewriterAttributes
     * @return cdnrewriterAttributes
     */
    public ConfigNodePropertyArray getCdnrewriterAttributes() {
        return cdnrewriterAttributes;
    }

    public void setCdnrewriterAttributes(ConfigNodePropertyArray cdnrewriterAttributes) {
        this.cdnrewriterAttributes = cdnrewriterAttributes;
    }

    /**
     * Get cdnRewriterDistributionDomain
     * @return cdnRewriterDistributionDomain
     */
    public ConfigNodePropertyString getCdnRewriterDistributionDomain() {
        return cdnRewriterDistributionDomain;
    }

    public void setCdnRewriterDistributionDomain(ConfigNodePropertyString cdnRewriterDistributionDomain) {
        this.cdnRewriterDistributionDomain = cdnRewriterDistributionDomain;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

