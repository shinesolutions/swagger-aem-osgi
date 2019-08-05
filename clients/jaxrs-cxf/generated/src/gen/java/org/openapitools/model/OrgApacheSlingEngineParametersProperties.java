package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheSlingEngineParametersProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString slingDefaultParameterEncoding = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger slingDefaultMaxParameters = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString fileLocation = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger fileThreshold = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger fileMax = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger requestMax = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters = null;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

