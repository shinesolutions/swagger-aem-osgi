package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyInteger;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class OrgApacheSlingEngineParametersProperties   {
  
  private ConfigNodePropertyString slingDefaultParameterEncoding = null;
  private ConfigNodePropertyInteger slingDefaultMaxParameters = null;
  private ConfigNodePropertyString fileLocation = null;
  private ConfigNodePropertyInteger fileThreshold = null;
  private ConfigNodePropertyInteger fileMax = null;
  private ConfigNodePropertyInteger requestMax = null;
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters = null;

  public OrgApacheSlingEngineParametersProperties () {

  }

  public OrgApacheSlingEngineParametersProperties (ConfigNodePropertyString slingDefaultParameterEncoding, ConfigNodePropertyInteger slingDefaultMaxParameters, ConfigNodePropertyString fileLocation, ConfigNodePropertyInteger fileThreshold, ConfigNodePropertyInteger fileMax, ConfigNodePropertyInteger requestMax, ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
    this.fileLocation = fileLocation;
    this.fileThreshold = fileThreshold;
    this.fileMax = fileMax;
    this.requestMax = requestMax;
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
  }

    
  @JsonProperty("sling.default.parameter.encoding")
  public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }
  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

    
  @JsonProperty("sling.default.max.parameters")
  public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }
  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

    
  @JsonProperty("file.location")
  public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }
  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

    
  @JsonProperty("file.threshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

    
  @JsonProperty("file.max")
  public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }
  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

    
  @JsonProperty("request.max")
  public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }
  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

    
  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  public ConfigNodePropertyBoolean getSlingDefaultParameterCheckForAdditionalContainerParameters() {
    return slingDefaultParameterCheckForAdditionalContainerParameters;
  }
  public void setSlingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheSlingEngineParametersProperties orgApacheSlingEngineParametersProperties = (OrgApacheSlingEngineParametersProperties) o;
    return Objects.equals(slingDefaultParameterEncoding, orgApacheSlingEngineParametersProperties.slingDefaultParameterEncoding) &&
        Objects.equals(slingDefaultMaxParameters, orgApacheSlingEngineParametersProperties.slingDefaultMaxParameters) &&
        Objects.equals(fileLocation, orgApacheSlingEngineParametersProperties.fileLocation) &&
        Objects.equals(fileThreshold, orgApacheSlingEngineParametersProperties.fileThreshold) &&
        Objects.equals(fileMax, orgApacheSlingEngineParametersProperties.fileMax) &&
        Objects.equals(requestMax, orgApacheSlingEngineParametersProperties.requestMax) &&
        Objects.equals(slingDefaultParameterCheckForAdditionalContainerParameters, orgApacheSlingEngineParametersProperties.slingDefaultParameterCheckForAdditionalContainerParameters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(slingDefaultParameterEncoding, slingDefaultMaxParameters, fileLocation, fileThreshold, fileMax, requestMax, slingDefaultParameterCheckForAdditionalContainerParameters);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
