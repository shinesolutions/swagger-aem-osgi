package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties   {

    private ConfigNodePropertyString fromAddress;
    private ConfigNodePropertyString senderHost;
    private ConfigNodePropertyString maxBounceCount;

    /**
     * Default constructor.
     */
    public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties.
     *
     * @param fromAddress fromAddress
     * @param senderHost senderHost
     * @param maxBounceCount maxBounceCount
     */
    public ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties(
        ConfigNodePropertyString fromAddress, 
        ConfigNodePropertyString senderHost, 
        ConfigNodePropertyString maxBounceCount
    ) {
        this.fromAddress = fromAddress;
        this.senderHost = senderHost;
        this.maxBounceCount = maxBounceCount;
    }



    /**
     * Get fromAddress
     * @return fromAddress
     */
    public ConfigNodePropertyString getFromAddress() {
        return fromAddress;
    }

    public void setFromAddress(ConfigNodePropertyString fromAddress) {
        this.fromAddress = fromAddress;
    }

    /**
     * Get senderHost
     * @return senderHost
     */
    public ConfigNodePropertyString getSenderHost() {
        return senderHost;
    }

    public void setSenderHost(ConfigNodePropertyString senderHost) {
        this.senderHost = senderHost;
    }

    /**
     * Get maxBounceCount
     * @return maxBounceCount
     */
    public ConfigNodePropertyString getMaxBounceCount() {
        return maxBounceCount;
    }

    public void setMaxBounceCount(ConfigNodePropertyString maxBounceCount) {
        this.maxBounceCount = maxBounceCount;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {\n");
        
        sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
        sb.append("    senderHost: ").append(toIndentedString(senderHost)).append("\n");
        sb.append("    maxBounceCount: ").append(toIndentedString(maxBounceCount)).append("\n");
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

