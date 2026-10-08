package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties   {

    private ConfigNodePropertyBoolean redirectEnabled;
    private ConfigNodePropertyBoolean redirectStatsEnabled;
    private ConfigNodePropertyArray redirectExtensions;
    private ConfigNodePropertyArray redirectPaths;

    /**
     * Default constructor.
     */
    public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties.
     *
     * @param redirectEnabled redirectEnabled
     * @param redirectStatsEnabled redirectStatsEnabled
     * @param redirectExtensions redirectExtensions
     * @param redirectPaths redirectPaths
     */
    public ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties(
        ConfigNodePropertyBoolean redirectEnabled, 
        ConfigNodePropertyBoolean redirectStatsEnabled, 
        ConfigNodePropertyArray redirectExtensions, 
        ConfigNodePropertyArray redirectPaths
    ) {
        this.redirectEnabled = redirectEnabled;
        this.redirectStatsEnabled = redirectStatsEnabled;
        this.redirectExtensions = redirectExtensions;
        this.redirectPaths = redirectPaths;
    }



    /**
     * Get redirectEnabled
     * @return redirectEnabled
     */
    public ConfigNodePropertyBoolean getRedirectEnabled() {
        return redirectEnabled;
    }

    public void setRedirectEnabled(ConfigNodePropertyBoolean redirectEnabled) {
        this.redirectEnabled = redirectEnabled;
    }

    /**
     * Get redirectStatsEnabled
     * @return redirectStatsEnabled
     */
    public ConfigNodePropertyBoolean getRedirectStatsEnabled() {
        return redirectStatsEnabled;
    }

    public void setRedirectStatsEnabled(ConfigNodePropertyBoolean redirectStatsEnabled) {
        this.redirectStatsEnabled = redirectStatsEnabled;
    }

    /**
     * Get redirectExtensions
     * @return redirectExtensions
     */
    public ConfigNodePropertyArray getRedirectExtensions() {
        return redirectExtensions;
    }

    public void setRedirectExtensions(ConfigNodePropertyArray redirectExtensions) {
        this.redirectExtensions = redirectExtensions;
    }

    /**
     * Get redirectPaths
     * @return redirectPaths
     */
    public ConfigNodePropertyArray getRedirectPaths() {
        return redirectPaths;
    }

    public void setRedirectPaths(ConfigNodePropertyArray redirectPaths) {
        this.redirectPaths = redirectPaths;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmMobileCoreImplRedirectRedirectFilterProperties {\n");
        
        sb.append("    redirectEnabled: ").append(toIndentedString(redirectEnabled)).append("\n");
        sb.append("    redirectStatsEnabled: ").append(toIndentedString(redirectStatsEnabled)).append("\n");
        sb.append("    redirectExtensions: ").append(toIndentedString(redirectExtensions)).append("\n");
        sb.append("    redirectPaths: ").append(toIndentedString(redirectPaths)).append("\n");
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

