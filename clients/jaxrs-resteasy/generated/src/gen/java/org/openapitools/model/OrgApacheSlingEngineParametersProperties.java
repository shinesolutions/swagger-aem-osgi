package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineParametersProperties   {
  
  private ConfigNodePropertyString slingDefaultParameterEncoding;
  private ConfigNodePropertyInteger slingDefaultMaxParameters;
  private ConfigNodePropertyString fileLocation;
  private ConfigNodePropertyInteger fileThreshold;
  private ConfigNodePropertyInteger fileMax;
  private ConfigNodePropertyInteger requestMax;
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.default.parameter.encoding")
  @Valid
  public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }
  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.default.max.parameters")
  @Valid
  public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }
  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file.location")
  @Valid
  public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }
  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file.threshold")
  @Valid
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }
  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("file.max")
  @Valid
  public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }
  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("request.max")
  @Valid
  public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }
  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  @Valid
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

