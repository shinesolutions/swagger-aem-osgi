package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties   {

    private ConfigNodePropertyArray watchwordsPositive;
    private ConfigNodePropertyArray watchwordsNegative;
    private ConfigNodePropertyString watchwordsPath;
    private ConfigNodePropertyString sentimentPath;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties.
     *
     * @param watchwordsPositive watchwordsPositive
     * @param watchwordsNegative watchwordsNegative
     * @param watchwordsPath watchwordsPath
     * @param sentimentPath sentimentPath
     */
    public ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties(
        ConfigNodePropertyArray watchwordsPositive, 
        ConfigNodePropertyArray watchwordsNegative, 
        ConfigNodePropertyString watchwordsPath, 
        ConfigNodePropertyString sentimentPath
    ) {
        this.watchwordsPositive = watchwordsPositive;
        this.watchwordsNegative = watchwordsNegative;
        this.watchwordsPath = watchwordsPath;
        this.sentimentPath = sentimentPath;
    }



    /**
     * Get watchwordsPositive
     * @return watchwordsPositive
     */
    public ConfigNodePropertyArray getWatchwordsPositive() {
        return watchwordsPositive;
    }

    public void setWatchwordsPositive(ConfigNodePropertyArray watchwordsPositive) {
        this.watchwordsPositive = watchwordsPositive;
    }

    /**
     * Get watchwordsNegative
     * @return watchwordsNegative
     */
    public ConfigNodePropertyArray getWatchwordsNegative() {
        return watchwordsNegative;
    }

    public void setWatchwordsNegative(ConfigNodePropertyArray watchwordsNegative) {
        this.watchwordsNegative = watchwordsNegative;
    }

    /**
     * Get watchwordsPath
     * @return watchwordsPath
     */
    public ConfigNodePropertyString getWatchwordsPath() {
        return watchwordsPath;
    }

    public void setWatchwordsPath(ConfigNodePropertyString watchwordsPath) {
        this.watchwordsPath = watchwordsPath;
    }

    /**
     * Get sentimentPath
     * @return sentimentPath
     */
    public ConfigNodePropertyString getSentimentPath() {
        return sentimentPath;
    }

    public void setSentimentPath(ConfigNodePropertyString sentimentPath) {
        this.sentimentPath = sentimentPath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {\n");
        
        sb.append("    watchwordsPositive: ").append(toIndentedString(watchwordsPositive)).append("\n");
        sb.append("    watchwordsNegative: ").append(toIndentedString(watchwordsNegative)).append("\n");
        sb.append("    watchwordsPath: ").append(toIndentedString(watchwordsPath)).append("\n");
        sb.append("    sentimentPath: ").append(toIndentedString(sentimentPath)).append("\n");
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

