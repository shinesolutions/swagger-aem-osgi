package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties   {

    private ConfigNodePropertyBoolean enabled;
    private ConfigNodePropertyInteger intervalSeconds;
    private ConfigNodePropertyInteger commitsPerIntervalThreshold;
    private ConfigNodePropertyInteger maxLocationLength;
    private ConfigNodePropertyInteger maxDetailsShown;
    private ConfigNodePropertyInteger minDetailsPercentage;
    private ConfigNodePropertyArray threadMatchers;
    private ConfigNodePropertyInteger maxGreedyDepth;
    private ConfigNodePropertyString greedyStackMatchers;
    private ConfigNodePropertyArray stackFilters;
    private ConfigNodePropertyArray stackMatchers;
    private ConfigNodePropertyArray stackCategorizers;
    private ConfigNodePropertyArray stackShorteners;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteRepositoryImplCommitStatsConfigProperties.
     *
     * @param enabled enabled
     * @param intervalSeconds intervalSeconds
     * @param commitsPerIntervalThreshold commitsPerIntervalThreshold
     * @param maxLocationLength maxLocationLength
     * @param maxDetailsShown maxDetailsShown
     * @param minDetailsPercentage minDetailsPercentage
     * @param threadMatchers threadMatchers
     * @param maxGreedyDepth maxGreedyDepth
     * @param greedyStackMatchers greedyStackMatchers
     * @param stackFilters stackFilters
     * @param stackMatchers stackMatchers
     * @param stackCategorizers stackCategorizers
     * @param stackShorteners stackShorteners
     */
    public ComAdobeGraniteRepositoryImplCommitStatsConfigProperties(
        ConfigNodePropertyBoolean enabled, 
        ConfigNodePropertyInteger intervalSeconds, 
        ConfigNodePropertyInteger commitsPerIntervalThreshold, 
        ConfigNodePropertyInteger maxLocationLength, 
        ConfigNodePropertyInteger maxDetailsShown, 
        ConfigNodePropertyInteger minDetailsPercentage, 
        ConfigNodePropertyArray threadMatchers, 
        ConfigNodePropertyInteger maxGreedyDepth, 
        ConfigNodePropertyString greedyStackMatchers, 
        ConfigNodePropertyArray stackFilters, 
        ConfigNodePropertyArray stackMatchers, 
        ConfigNodePropertyArray stackCategorizers, 
        ConfigNodePropertyArray stackShorteners
    ) {
        this.enabled = enabled;
        this.intervalSeconds = intervalSeconds;
        this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
        this.maxLocationLength = maxLocationLength;
        this.maxDetailsShown = maxDetailsShown;
        this.minDetailsPercentage = minDetailsPercentage;
        this.threadMatchers = threadMatchers;
        this.maxGreedyDepth = maxGreedyDepth;
        this.greedyStackMatchers = greedyStackMatchers;
        this.stackFilters = stackFilters;
        this.stackMatchers = stackMatchers;
        this.stackCategorizers = stackCategorizers;
        this.stackShorteners = stackShorteners;
    }



    /**
     * Get enabled
     * @return enabled
     */
    public ConfigNodePropertyBoolean getEnabled() {
        return enabled;
    }

    public void setEnabled(ConfigNodePropertyBoolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Get intervalSeconds
     * @return intervalSeconds
     */
    public ConfigNodePropertyInteger getIntervalSeconds() {
        return intervalSeconds;
    }

    public void setIntervalSeconds(ConfigNodePropertyInteger intervalSeconds) {
        this.intervalSeconds = intervalSeconds;
    }

    /**
     * Get commitsPerIntervalThreshold
     * @return commitsPerIntervalThreshold
     */
    public ConfigNodePropertyInteger getCommitsPerIntervalThreshold() {
        return commitsPerIntervalThreshold;
    }

    public void setCommitsPerIntervalThreshold(ConfigNodePropertyInteger commitsPerIntervalThreshold) {
        this.commitsPerIntervalThreshold = commitsPerIntervalThreshold;
    }

    /**
     * Get maxLocationLength
     * @return maxLocationLength
     */
    public ConfigNodePropertyInteger getMaxLocationLength() {
        return maxLocationLength;
    }

    public void setMaxLocationLength(ConfigNodePropertyInteger maxLocationLength) {
        this.maxLocationLength = maxLocationLength;
    }

    /**
     * Get maxDetailsShown
     * @return maxDetailsShown
     */
    public ConfigNodePropertyInteger getMaxDetailsShown() {
        return maxDetailsShown;
    }

    public void setMaxDetailsShown(ConfigNodePropertyInteger maxDetailsShown) {
        this.maxDetailsShown = maxDetailsShown;
    }

    /**
     * Get minDetailsPercentage
     * @return minDetailsPercentage
     */
    public ConfigNodePropertyInteger getMinDetailsPercentage() {
        return minDetailsPercentage;
    }

    public void setMinDetailsPercentage(ConfigNodePropertyInteger minDetailsPercentage) {
        this.minDetailsPercentage = minDetailsPercentage;
    }

    /**
     * Get threadMatchers
     * @return threadMatchers
     */
    public ConfigNodePropertyArray getThreadMatchers() {
        return threadMatchers;
    }

    public void setThreadMatchers(ConfigNodePropertyArray threadMatchers) {
        this.threadMatchers = threadMatchers;
    }

    /**
     * Get maxGreedyDepth
     * @return maxGreedyDepth
     */
    public ConfigNodePropertyInteger getMaxGreedyDepth() {
        return maxGreedyDepth;
    }

    public void setMaxGreedyDepth(ConfigNodePropertyInteger maxGreedyDepth) {
        this.maxGreedyDepth = maxGreedyDepth;
    }

    /**
     * Get greedyStackMatchers
     * @return greedyStackMatchers
     */
    public ConfigNodePropertyString getGreedyStackMatchers() {
        return greedyStackMatchers;
    }

    public void setGreedyStackMatchers(ConfigNodePropertyString greedyStackMatchers) {
        this.greedyStackMatchers = greedyStackMatchers;
    }

    /**
     * Get stackFilters
     * @return stackFilters
     */
    public ConfigNodePropertyArray getStackFilters() {
        return stackFilters;
    }

    public void setStackFilters(ConfigNodePropertyArray stackFilters) {
        this.stackFilters = stackFilters;
    }

    /**
     * Get stackMatchers
     * @return stackMatchers
     */
    public ConfigNodePropertyArray getStackMatchers() {
        return stackMatchers;
    }

    public void setStackMatchers(ConfigNodePropertyArray stackMatchers) {
        this.stackMatchers = stackMatchers;
    }

    /**
     * Get stackCategorizers
     * @return stackCategorizers
     */
    public ConfigNodePropertyArray getStackCategorizers() {
        return stackCategorizers;
    }

    public void setStackCategorizers(ConfigNodePropertyArray stackCategorizers) {
        this.stackCategorizers = stackCategorizers;
    }

    /**
     * Get stackShorteners
     * @return stackShorteners
     */
    public ConfigNodePropertyArray getStackShorteners() {
        return stackShorteners;
    }

    public void setStackShorteners(ConfigNodePropertyArray stackShorteners) {
        this.stackShorteners = stackShorteners;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {\n");
        
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
        sb.append("    commitsPerIntervalThreshold: ").append(toIndentedString(commitsPerIntervalThreshold)).append("\n");
        sb.append("    maxLocationLength: ").append(toIndentedString(maxLocationLength)).append("\n");
        sb.append("    maxDetailsShown: ").append(toIndentedString(maxDetailsShown)).append("\n");
        sb.append("    minDetailsPercentage: ").append(toIndentedString(minDetailsPercentage)).append("\n");
        sb.append("    threadMatchers: ").append(toIndentedString(threadMatchers)).append("\n");
        sb.append("    maxGreedyDepth: ").append(toIndentedString(maxGreedyDepth)).append("\n");
        sb.append("    greedyStackMatchers: ").append(toIndentedString(greedyStackMatchers)).append("\n");
        sb.append("    stackFilters: ").append(toIndentedString(stackFilters)).append("\n");
        sb.append("    stackMatchers: ").append(toIndentedString(stackMatchers)).append("\n");
        sb.append("    stackCategorizers: ").append(toIndentedString(stackCategorizers)).append("\n");
        sb.append("    stackShorteners: ").append(toIndentedString(stackShorteners)).append("\n");
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

