package apimodels;

import apimodels.ConfigNodePropertyBoolean;
import apimodels.ConfigNodePropertyInteger;
import apimodels.ConfigNodePropertyString;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * OrgApacheSlingEngineParametersProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-08-05T00:55:42.601Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrgApacheSlingEngineParametersProperties   {
  @JsonProperty("sling.default.parameter.encoding")
  private ConfigNodePropertyString slingDefaultParameterEncoding = null;

  @JsonProperty("sling.default.max.parameters")
  private ConfigNodePropertyInteger slingDefaultMaxParameters = null;

  @JsonProperty("file.location")
  private ConfigNodePropertyString fileLocation = null;

  @JsonProperty("file.threshold")
  private ConfigNodePropertyInteger fileThreshold = null;

  @JsonProperty("file.max")
  private ConfigNodePropertyInteger fileMax = null;

  @JsonProperty("request.max")
  private ConfigNodePropertyInteger requestMax = null;

  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  private ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters = null;

  public OrgApacheSlingEngineParametersProperties slingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
    return this;
  }

   /**
   * Get slingDefaultParameterEncoding
   * @return slingDefaultParameterEncoding
  **/
  @Valid
  public ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }

  public void setSlingDefaultParameterEncoding(ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
    return this;
  }

   /**
   * Get slingDefaultMaxParameters
   * @return slingDefaultMaxParameters
  **/
  @Valid
  public ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }

  public void setSlingDefaultMaxParameters(ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  public OrgApacheSlingEngineParametersProperties fileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

   /**
   * Get fileLocation
   * @return fileLocation
  **/
  @Valid
  public ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }

  public void setFileLocation(ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  public OrgApacheSlingEngineParametersProperties fileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

   /**
   * Get fileThreshold
   * @return fileThreshold
  **/
  @Valid
  public ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  public void setFileThreshold(ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingEngineParametersProperties fileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
    return this;
  }

   /**
   * Get fileMax
   * @return fileMax
  **/
  @Valid
  public ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }

  public void setFileMax(ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  public OrgApacheSlingEngineParametersProperties requestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
    return this;
  }

   /**
   * Get requestMax
   * @return requestMax
  **/
  @Valid
  public ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }

  public void setRequestMax(ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
    return this;
  }

   /**
   * Get slingDefaultParameterCheckForAdditionalContainerParameters
   * @return slingDefaultParameterCheckForAdditionalContainerParameters
  **/
  @Valid
  public ConfigNodePropertyBoolean getSlingDefaultParameterCheckForAdditionalContainerParameters() {
    return slingDefaultParameterCheckForAdditionalContainerParameters;
  }

  public void setSlingDefaultParameterCheckForAdditionalContainerParameters(ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

