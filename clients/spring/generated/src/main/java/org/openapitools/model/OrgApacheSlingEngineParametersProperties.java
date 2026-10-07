package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheSlingEngineParametersProperties
 */

@JsonTypeName("orgApacheSlingEngineParametersProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheSlingEngineParametersProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString slingDefaultParameterEncoding;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger slingDefaultMaxParameters;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString fileLocation;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger fileThreshold;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger fileMax;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger requestMax;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters;

  public OrgApacheSlingEngineParametersProperties slingDefaultParameterEncoding(@Nullable ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
    return this;
  }

  /**
   * Get slingDefaultParameterEncoding
   * @return slingDefaultParameterEncoding
   */
  @Valid 
  @Schema(name = "sling.default.parameter.encoding", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.default.parameter.encoding")
  public @Nullable ConfigNodePropertyString getSlingDefaultParameterEncoding() {
    return slingDefaultParameterEncoding;
  }

  @JsonProperty("sling.default.parameter.encoding")
  public void setSlingDefaultParameterEncoding(@Nullable ConfigNodePropertyString slingDefaultParameterEncoding) {
    this.slingDefaultParameterEncoding = slingDefaultParameterEncoding;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultMaxParameters(@Nullable ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
    return this;
  }

  /**
   * Get slingDefaultMaxParameters
   * @return slingDefaultMaxParameters
   */
  @Valid 
  @Schema(name = "sling.default.max.parameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.default.max.parameters")
  public @Nullable ConfigNodePropertyInteger getSlingDefaultMaxParameters() {
    return slingDefaultMaxParameters;
  }

  @JsonProperty("sling.default.max.parameters")
  public void setSlingDefaultMaxParameters(@Nullable ConfigNodePropertyInteger slingDefaultMaxParameters) {
    this.slingDefaultMaxParameters = slingDefaultMaxParameters;
  }

  public OrgApacheSlingEngineParametersProperties fileLocation(@Nullable ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

  /**
   * Get fileLocation
   * @return fileLocation
   */
  @Valid 
  @Schema(name = "file.location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file.location")
  public @Nullable ConfigNodePropertyString getFileLocation() {
    return fileLocation;
  }

  @JsonProperty("file.location")
  public void setFileLocation(@Nullable ConfigNodePropertyString fileLocation) {
    this.fileLocation = fileLocation;
  }

  public OrgApacheSlingEngineParametersProperties fileThreshold(@Nullable ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
    return this;
  }

  /**
   * Get fileThreshold
   * @return fileThreshold
   */
  @Valid 
  @Schema(name = "file.threshold", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file.threshold")
  public @Nullable ConfigNodePropertyInteger getFileThreshold() {
    return fileThreshold;
  }

  @JsonProperty("file.threshold")
  public void setFileThreshold(@Nullable ConfigNodePropertyInteger fileThreshold) {
    this.fileThreshold = fileThreshold;
  }

  public OrgApacheSlingEngineParametersProperties fileMax(@Nullable ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
    return this;
  }

  /**
   * Get fileMax
   * @return fileMax
   */
  @Valid 
  @Schema(name = "file.max", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("file.max")
  public @Nullable ConfigNodePropertyInteger getFileMax() {
    return fileMax;
  }

  @JsonProperty("file.max")
  public void setFileMax(@Nullable ConfigNodePropertyInteger fileMax) {
    this.fileMax = fileMax;
  }

  public OrgApacheSlingEngineParametersProperties requestMax(@Nullable ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
    return this;
  }

  /**
   * Get requestMax
   * @return requestMax
   */
  @Valid 
  @Schema(name = "request.max", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("request.max")
  public @Nullable ConfigNodePropertyInteger getRequestMax() {
    return requestMax;
  }

  @JsonProperty("request.max")
  public void setRequestMax(@Nullable ConfigNodePropertyInteger requestMax) {
    this.requestMax = requestMax;
  }

  public OrgApacheSlingEngineParametersProperties slingDefaultParameterCheckForAdditionalContainerParameters(@Nullable ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
    this.slingDefaultParameterCheckForAdditionalContainerParameters = slingDefaultParameterCheckForAdditionalContainerParameters;
    return this;
  }

  /**
   * Get slingDefaultParameterCheckForAdditionalContainerParameters
   * @return slingDefaultParameterCheckForAdditionalContainerParameters
   */
  @Valid 
  @Schema(name = "sling.default.parameter.checkForAdditionalContainerParameters", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  public @Nullable ConfigNodePropertyBoolean getSlingDefaultParameterCheckForAdditionalContainerParameters() {
    return slingDefaultParameterCheckForAdditionalContainerParameters;
  }

  @JsonProperty("sling.default.parameter.checkForAdditionalContainerParameters")
  public void setSlingDefaultParameterCheckForAdditionalContainerParameters(@Nullable ConfigNodePropertyBoolean slingDefaultParameterCheckForAdditionalContainerParameters) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

