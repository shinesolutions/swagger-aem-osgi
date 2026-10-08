package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class OrgApacheSlingEngineParametersProperties  {
  
  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString slingDefaultParameterEncoding;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger slingDefaultMaxParameters;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyString fileLocation;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger fileThreshold;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger fileMax;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyInteger requestMax;

  @ApiModelProperty(value = "")

  @Valid

  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters;
 /**
   * Get slingDefaultParameterEncoding
   * @return slingDefaultParameterEncoding
  **/
  @JsonProperty("sling.default.parameter.encoding")
  public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }

  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
    return this;
  }

 /**
   * Get slingDefaultMaxParameters
   * @return slingDefaultMaxParameters
  **/
  @JsonProperty("sling.default.max.parameters")
  public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }

  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
    return this;
  }

 /**
   * Get fileLocation
   * @return fileLocation
  **/
  @JsonProperty("file.location")
  public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  public OrgApacheSlingEngineParametersProperties fileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

 /**
   * Get fileThreshold
   * @return fileThreshold
  **/
  @JsonProperty("file.threshold")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingEngineParametersProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

 /**
   * Get fileMax
   * @return fileMax
  **/
  @JsonProperty("file.max")
  public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }

  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  public OrgApacheSlingEngineParametersProperties fileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
    return this;
  }

 /**
   * Get requestMax
   * @return requestMax
  **/
  @JsonProperty("request.max")
  public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }

  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  public OrgApacheSlingEngineParametersProperties requestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
    return this;
  }

 /**
   * Get slingDefaultParameterCheckForAdditionalContainerParameters
   * @return slingDefaultParameterCheckForAdditionalContainerParameters
  **/
  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  public ConfigNodePropertyBoolean getSlingDefaultParameterCheckForAdditionalContainerParameters() {
    return slingDefaultParameterCheckForAdditionalContainerParameters;
  }

  public void setSlingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
    return this;
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
    return Objects.equals(this.slingDefaultParameterEncoding, orgApacheSlingEngineParametersProperties.slingDefaultParameterEncoding) &&
        Objects.equals(this.slingDefaultMaxParameters, orgApacheSlingEngineParametersProperties.slingDefaultMaxParameters) &&
        Objects.equals(this.fileLocation, orgApacheSlingEngineParametersProperties.fileLocation) &&
        Objects.equals(this.fileThreshold, orgApacheSlingEngineParametersProperties.fileThreshold) &&
        Objects.equals(this.fileMax, orgApacheSlingEngineParametersProperties.fileMax) &&
        Objects.equals(this.requestMax, orgApacheSlingEngineParametersProperties.requestMax) &&
        Objects.equals(this.slingDefaultParameterCheckForAdditionalContainerParameters, orgApacheSlingEngineParametersProperties.slingDefaultParameterCheckForAdditionalContainerParameters);
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

