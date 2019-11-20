/**
 * Adobe Experience Manager OSGI config (AEM) API
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import org.openapitools.client.model.ConfigNodePropertyBoolean;
import org.openapitools.client.model.ConfigNodePropertyInteger;
import org.openapitools.client.model.ConfigNodePropertyString;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class OrgApacheSlingEngineParametersProperties {
  
  @SerializedName("sling.default.parameter.encoding")
  private ConfigNodePropertyString slingDefaultParameterEncoding = null;
  @SerializedName("sling.default.max.parameters")
  private ConfigNodePropertyInteger slingDefaultMaxParameters = null;
  @SerializedName("file.location")
  private ConfigNodePropertyString fileLocation = null;
  @SerializedName("file.threshold")
  private ConfigNodePropertyInteger fileThreshold = null;
  @SerializedName("file.max")
  private ConfigNodePropertyInteger fileMax = null;
  @SerializedName("request.max")
  private ConfigNodePropertyInteger requestMax = null;
  @SerializedName("sling.default.parameter.checkForAdditionalContainerParameters")
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }
  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }
  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }
  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }
  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }
  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  /**
   **/
  @ApiModelProperty(value = "")
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
    return (this.slingDefaultParameterEncoding == null ? orgApacheSlingEngineParametersProperties.slingDefaultParameterEncoding == null : this.slingDefaultParameterEncoding.equals(orgApacheSlingEngineParametersProperties.slingDefaultParameterEncoding)) &&
        (this.slingDefaultMaxParameters == null ? orgApacheSlingEngineParametersProperties.slingDefaultMaxParameters == null : this.slingDefaultMaxParameters.equals(orgApacheSlingEngineParametersProperties.slingDefaultMaxParameters)) &&
        (this.fileLocation == null ? orgApacheSlingEngineParametersProperties.fileLocation == null : this.fileLocation.equals(orgApacheSlingEngineParametersProperties.fileLocation)) &&
        (this.fileThreshold == null ? orgApacheSlingEngineParametersProperties.fileThreshold == null : this.fileThreshold.equals(orgApacheSlingEngineParametersProperties.fileThreshold)) &&
        (this.fileMax == null ? orgApacheSlingEngineParametersProperties.fileMax == null : this.fileMax.equals(orgApacheSlingEngineParametersProperties.fileMax)) &&
        (this.requestMax == null ? orgApacheSlingEngineParametersProperties.requestMax == null : this.requestMax.equals(orgApacheSlingEngineParametersProperties.requestMax)) &&
        (this.slingDefaultParameterCheckForAdditionalContainerParameters == null ? orgApacheSlingEngineParametersProperties.slingDefaultParameterCheckForAdditionalContainerParameters == null : this.slingDefaultParameterCheckForAdditionalContainerParameters.equals(orgApacheSlingEngineParametersProperties.slingDefaultParameterCheckForAdditionalContainerParameters));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.slingDefaultParameterEncoding == null ? 0: this.slingDefaultParameterEncoding.hashCode());
    result = 31 * result + (this.slingDefaultMaxParameters == null ? 0: this.slingDefaultMaxParameters.hashCode());
    result = 31 * result + (this.fileLocation == null ? 0: this.fileLocation.hashCode());
    result = 31 * result + (this.fileThreshold == null ? 0: this.fileThreshold.hashCode());
    result = 31 * result + (this.fileMax == null ? 0: this.fileMax.hashCode());
    result = 31 * result + (this.requestMax == null ? 0: this.requestMax.hashCode());
    result = 31 * result + (this.slingDefaultParameterCheckForAdditionalContainerParameters == null ? 0: this.slingDefaultParameterCheckForAdditionalContainerParameters.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrgApacheSlingEngineParametersProperties {\n");
    
    sb.append("  slingDefaultParameterEncoding: ").append(slingDefaultParameterEncoding).append("\n");
    sb.append("  slingDefaultMaxParameters: ").append(slingDefaultMaxParameters).append("\n");
    sb.append("  fileLocation: ").append(fileLocation).append("\n");
    sb.append("  fileThreshold: ").append(fileThreshold).append("\n");
    sb.append("  fileMax: ").append(fileMax).append("\n");
    sb.append("  requestMax: ").append(requestMax).append("\n");
    sb.append("  slingDefaultParameterCheckForAdditionalContainerParameters: ").append(slingDefaultParameterCheckForAdditionalContainerParameters).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}