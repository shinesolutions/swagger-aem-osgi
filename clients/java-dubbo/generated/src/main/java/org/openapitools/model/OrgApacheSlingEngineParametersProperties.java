package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public class OrgApacheSlingEngineParametersProperties implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("sling.default.parameter.encoding")
  private ConfigNodePropertyString slingDefaultParameterEncoding;

  @JsonProperty("sling.default.max.parameters")
  private ConfigNodePropertyInteger slingDefaultMaxParameters;

  @JsonProperty("file.location")
  private ConfigNodePropertyString fileLocation;

  @JsonProperty("file.threshold")
  private ConfigNodePropertyInteger fileThreshold;

  @JsonProperty("file.max")
  private ConfigNodePropertyInteger fileMax;

  @JsonProperty("request.max")
  private ConfigNodePropertyInteger requestMax;

  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters;

  /**
   * 
   * @return slingDefaultParameterEncoding
   */
  public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }

  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  /**
   * 
   * @return slingDefaultMaxParameters
   */
  public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }

  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  /**
   * 
   * @return fileLocation
   */
  public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  /**
   * 
   * @return fileThreshold
   */
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  /**
   * 
   * @return fileMax
   */
  public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }

  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  /**
   * 
   * @return requestMax
   */
  public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }

  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  /**
   * 
   * @return slingDefaultParameterCheckForAdditionalContainerParameters
   */
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
