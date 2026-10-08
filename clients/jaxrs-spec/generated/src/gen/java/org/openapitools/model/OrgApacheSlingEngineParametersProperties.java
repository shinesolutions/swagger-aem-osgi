package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheSlingEngineParametersProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineParametersProperties   {
  private ConfigNodePropertyString slingDefaultParameterEncoding;
  private ConfigNodePropertyInteger slingDefaultMaxParameters;
  private ConfigNodePropertyString fileLocation;
  private ConfigNodePropertyInteger fileThreshold;
  private ConfigNodePropertyInteger fileMax;
  private ConfigNodePropertyInteger requestMax;
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters;

  public OrgApacheSlingEngineParametersProperties() {
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties slingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.default.parameter.encoding")
  @Valid public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }

  @JsonProperty("sling.default.parameter.encoding")
  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties slingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.default.max.parameters")
  @Valid public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }

  @JsonProperty("sling.default.max.parameters")
  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties fileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file.location")
  @Valid public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }

  @JsonProperty("file.location")
  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file.threshold")
  @Valid public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  @JsonProperty("file.threshold")
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties fileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("file.max")
  @Valid public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }

  @JsonProperty("file.max")
  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties requestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("request.max")
  @Valid public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }

  @JsonProperty("request.max")
  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  /**
   **/
  public OrgApacheSlingEngineParametersProperties slingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  @Valid public ConfigNodePropertyBoolean getSlingDefaultParameterCheckForAdditionalContainerParameters() {
    return slingDefaultParameterCheckForAdditionalContainerParameters;
  }

  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
