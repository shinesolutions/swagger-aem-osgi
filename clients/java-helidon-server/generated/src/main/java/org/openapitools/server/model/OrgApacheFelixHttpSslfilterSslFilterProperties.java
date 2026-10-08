package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixHttpSslfilterSslFilterProperties   {

    private ConfigNodePropertyString sslForwardHeader;
    private ConfigNodePropertyString sslForwardValue;
    private ConfigNodePropertyString sslForwardCertHeader;
    private ConfigNodePropertyBoolean rewriteAbsoluteUrls;

    /**
     * Default constructor.
     */
    public OrgApacheFelixHttpSslfilterSslFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixHttpSslfilterSslFilterProperties.
     *
     * @param sslForwardHeader sslForwardHeader
     * @param sslForwardValue sslForwardValue
     * @param sslForwardCertHeader sslForwardCertHeader
     * @param rewriteAbsoluteUrls rewriteAbsoluteUrls
     */
    public OrgApacheFelixHttpSslfilterSslFilterProperties(
        ConfigNodePropertyString sslForwardHeader, 
        ConfigNodePropertyString sslForwardValue, 
        ConfigNodePropertyString sslForwardCertHeader, 
        ConfigNodePropertyBoolean rewriteAbsoluteUrls
    ) {
        this.sslForwardHeader = sslForwardHeader;
        this.sslForwardValue = sslForwardValue;
        this.sslForwardCertHeader = sslForwardCertHeader;
        this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
    }



    /**
     * Get sslForwardHeader
     * @return sslForwardHeader
     */
    public ConfigNodePropertyString getSslForwardHeader() {
        return sslForwardHeader;
    }

    public void setSslForwardHeader(ConfigNodePropertyString sslForwardHeader) {
        this.sslForwardHeader = sslForwardHeader;
    }

    /**
     * Get sslForwardValue
     * @return sslForwardValue
     */
    public ConfigNodePropertyString getSslForwardValue() {
        return sslForwardValue;
    }

    public void setSslForwardValue(ConfigNodePropertyString sslForwardValue) {
        this.sslForwardValue = sslForwardValue;
    }

    /**
     * Get sslForwardCertHeader
     * @return sslForwardCertHeader
     */
    public ConfigNodePropertyString getSslForwardCertHeader() {
        return sslForwardCertHeader;
    }

    public void setSslForwardCertHeader(ConfigNodePropertyString sslForwardCertHeader) {
        this.sslForwardCertHeader = sslForwardCertHeader;
    }

    /**
     * Get rewriteAbsoluteUrls
     * @return rewriteAbsoluteUrls
     */
    public ConfigNodePropertyBoolean getRewriteAbsoluteUrls() {
        return rewriteAbsoluteUrls;
    }

    public void setRewriteAbsoluteUrls(ConfigNodePropertyBoolean rewriteAbsoluteUrls) {
        this.rewriteAbsoluteUrls = rewriteAbsoluteUrls;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixHttpSslfilterSslFilterProperties {\n");
        
        sb.append("    sslForwardHeader: ").append(toIndentedString(sslForwardHeader)).append("\n");
        sb.append("    sslForwardValue: ").append(toIndentedString(sslForwardValue)).append("\n");
        sb.append("    sslForwardCertHeader: ").append(toIndentedString(sslForwardCertHeader)).append("\n");
        sb.append("    rewriteAbsoluteUrls: ").append(toIndentedString(rewriteAbsoluteUrls)).append("\n");
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

