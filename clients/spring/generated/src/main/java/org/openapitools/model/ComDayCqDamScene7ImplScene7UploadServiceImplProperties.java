package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * ComDayCqDamScene7ImplScene7UploadServiceImplProperties
 */

@JsonTypeName("comDayCqDamScene7ImplScene7UploadServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel;

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties cqDamScene7UploadserviceActivejobtimeoutLabel(@Nullable ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
    return this;
  }

  /**
   * Get cqDamScene7UploadserviceActivejobtimeoutLabel
   * @return cqDamScene7UploadserviceActivejobtimeoutLabel
   */
  @Valid 
  @Schema(name = "cq.dam.scene7.uploadservice.activejobtimeout.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label")
  public @Nullable ConfigNodePropertyInteger getCqDamScene7UploadserviceActivejobtimeoutLabel() {
    return cqDamScene7UploadserviceActivejobtimeoutLabel;
  }

  @JsonProperty("cq.dam.scene7.uploadservice.activejobtimeout.label")
  public void setCqDamScene7UploadserviceActivejobtimeoutLabel(@Nullable ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
    this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
  }

  public ComDayCqDamScene7ImplScene7UploadServiceImplProperties cqDamScene7UploadserviceConnectionmaxperrouteLabel(@Nullable ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
    return this;
  }

  /**
   * Get cqDamScene7UploadserviceConnectionmaxperrouteLabel
   * @return cqDamScene7UploadserviceConnectionmaxperrouteLabel
   */
  @Valid 
  @Schema(name = "cq.dam.scene7.uploadservice.connectionmaxperroute.label", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label")
  public @Nullable ConfigNodePropertyInteger getCqDamScene7UploadserviceConnectionmaxperrouteLabel() {
    return cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }

  @JsonProperty("cq.dam.scene7.uploadservice.connectionmaxperroute.label")
  public void setCqDamScene7UploadserviceConnectionmaxperrouteLabel(@Nullable ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
    this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamScene7ImplScene7UploadServiceImplProperties comDayCqDamScene7ImplScene7UploadServiceImplProperties = (ComDayCqDamScene7ImplScene7UploadServiceImplProperties) o;
    return Objects.equals(this.cqDamScene7UploadserviceActivejobtimeoutLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceActivejobtimeoutLabel) &&
        Objects.equals(this.cqDamScene7UploadserviceConnectionmaxperrouteLabel, comDayCqDamScene7ImplScene7UploadServiceImplProperties.cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamScene7UploadserviceActivejobtimeoutLabel, cqDamScene7UploadserviceConnectionmaxperrouteLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {\n");
    sb.append("    cqDamScene7UploadserviceActivejobtimeoutLabel: ").append(toIndentedString(cqDamScene7UploadserviceActivejobtimeoutLabel)).append("\n");
    sb.append("    cqDamScene7UploadserviceConnectionmaxperrouteLabel: ").append(toIndentedString(cqDamScene7UploadserviceConnectionmaxperrouteLabel)).append("\n");
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

