package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties   {

    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyString keypairId;
    private ConfigNodePropertyString keypairAlias;
    private ConfigNodePropertyArray cdnrewriterAttributes;
    private ConfigNodePropertyString cdnRewriterDistributionDomain;

    /**
     * Default constructor.
     */
    public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties.
     *
     * @param serviceRanking serviceRanking
     * @param keypairId keypairId
     * @param keypairAlias keypairAlias
     * @param cdnrewriterAttributes cdnrewriterAttributes
     * @param cdnRewriterDistributionDomain cdnRewriterDistributionDomain
     */
    public ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties(
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyString keypairId, 
        ConfigNodePropertyString keypairAlias, 
        ConfigNodePropertyArray cdnrewriterAttributes, 
        ConfigNodePropertyString cdnRewriterDistributionDomain
    ) {
        this.serviceRanking = serviceRanking;
        this.keypairId = keypairId;
        this.keypairAlias = keypairAlias;
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
     * Get keypairId
     * @return keypairId
     */
    public ConfigNodePropertyString getKeypairId() {
        return keypairId;
    }

    public void setKeypairId(ConfigNodePropertyString keypairId) {
        this.keypairId = keypairId;
    }

    /**
     * Get keypairAlias
     * @return keypairAlias
     */
    public ConfigNodePropertyString getKeypairAlias() {
        return keypairAlias;
    }

    public void setKeypairAlias(ConfigNodePropertyString keypairAlias) {
        this.keypairAlias = keypairAlias;
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

