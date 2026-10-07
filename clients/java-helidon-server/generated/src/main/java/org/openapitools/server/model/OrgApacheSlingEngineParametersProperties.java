package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingEngineParametersProperties   {

    private ConfigNodePropertyString slingDefaultParameterEncoding;
    private ConfigNodePropertyInteger slingDefaultMaxParameters;
    private ConfigNodePropertyString fileLocation;
    private ConfigNodePropertyInteger fileThreshold;
    private ConfigNodePropertyInteger fileMax;
    private ConfigNodePropertyInteger requestMax;
    private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters;

    /**
     * Default constructor.
     */
    public OrgApacheSlingEngineParametersProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingEngineParametersProperties.
     *
     * @param slingDefaultParameterEncoding slingDefaultParameterEncoding
     * @param slingDefaultMaxParameters slingDefaultMaxParameters
     * @param fileLocation fileLocation
     * @param fileThreshold fileThreshold
     * @param fileMax fileMax
     * @param requestMax requestMax
     * @param slingDefaultParameterCheckForAdditionalContainerParameters slingDefaultParameterCheckForAdditionalContainerParameters
     */
    public OrgApacheSlingEngineParametersProperties(
        ConfigNodePropertyString slingDefaultParameterEncoding, 
        ConfigNodePropertyInteger slingDefaultMaxParameters, 
        ConfigNodePropertyString fileLocation, 
        ConfigNodePropertyInteger fileThreshold, 
        ConfigNodePropertyInteger fileMax, 
        ConfigNodePropertyInteger requestMax, 
        ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters
    ) {
        this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
        this.slingDefaultMaxParameters = slingDefaultMaxParameters;
        this.fileLocation = fileLocation;
        this.fileThreshold = fileThreshold;
        this.fileMax = fileMax;
        this.requestMax = requestMax;
        this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
    }



    /**
     * Get slingDefaultParameterEncoding
     * @return slingDefaultParameterEncoding
     */
    public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
        return slingDefaultParameterEncoding;
    }

    public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
        this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
    }

    /**
     * Get slingDefaultMaxParameters
     * @return slingDefaultMaxParameters
     */
    public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
        return slingDefaultMaxParameters;
    }

    public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
        this.slingDefaultMaxParameters = slingDefaultMaxParameters;
    }

    /**
     * Get fileLocation
     * @return fileLocation
     */
    public ConfigNodePropertyString getFileLocation() {
        return fileLocation;
    }

    public void setFileLocation(ConfigNodePropertyString fileLocation) {
        this.fileLocation = fileLocation;
    }

    /**
     * Get fileThreshold
     * @return fileThreshold
     */
    public ConfigNodePropertyInteger getFileThreshold() {
        return fileThreshold;
    }

    public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
        this.fileThreshold = fileThreshold;
    }

    /**
     * Get fileMax
     * @return fileMax
     */
    public ConfigNodePropertyInteger getFileMax() {
        return fileMax;
    }

    public void setFileMax(ConfigNodePropertyInteger fileMax) {
        this.fileMax = fileMax;
    }

    /**
     * Get requestMax
     * @return requestMax
     */
    public ConfigNodePropertyInteger getRequestMax() {
        return requestMax;
    }

    public void setRequestMax(ConfigNodePropertyInteger requestMax) {
        this.requestMax = requestMax;
    }

    /**
     * Get slingDefaultParameterCheckForAdditionalContainerParameters
     * @return slingDefaultParameterCheckForAdditionalContainerParameters
     */
    public ConfigNodePropertyBoolean getSlingDefaultParameterCheckForAdditionalContainerParameters() {
        return slingDefaultParameterCheckForAdditionalContainerParameters;
    }

    public void setSlingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
        this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingEngineParametersProperties {\n");
        
        sb.append("    slingDefaultParameterEncoding: ").append(toIndentedString(slingDefaultParameterEncoding)).append("\n");
        sb.append("    slingDefaultMaxParameters: ").append(toIndentedString(slingDefaultMaxParameters)).append("\n");
        sb.append("    fileLocation: ").append(toIndentedString(fileLocation)).append("\n");
        sb.append("    fileThreshold: ").append(toIndentedString(fileThreshold)).append("\n");
        sb.append("    fileMax: ").append(toIndentedString(fileMax)).append("\n");
        sb.append("    requestMax: ").append(toIndentedString(requestMax)).append("\n");
        sb.append("    slingDefaultParameterCheckForAdditionalContainerParameters: ").append(toIndentedString(slingDefaultParameterCheckForAdditionalContainerParameters)).append("\n");
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

