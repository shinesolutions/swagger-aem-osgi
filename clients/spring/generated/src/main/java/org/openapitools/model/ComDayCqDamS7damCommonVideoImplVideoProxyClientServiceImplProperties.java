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
 * ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties
 */

@JsonTypeName("comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpReadtimeoutName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpMaxretrycountName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceUploadprogressIntervalName;

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName) {
    this.cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName = cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName
   * @return cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName() {
    return cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.minsize.name")
  public void setCqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName) {
    this.cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName = cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName;
  }

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName) {
    this.cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName = cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName
   * @return cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName() {
    return cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.partsize.name")
  public void setCqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName) {
    this.cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName = cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName;
  }

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName) {
    this.cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName = cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName
   * @return cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName() {
    return cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.multipartupload.numthread.name")
  public void setCqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName) {
    this.cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName = cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName;
  }

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceHttpReadtimeoutName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpReadtimeoutName) {
    this.cqDamS7damVideoproxyclientserviceHttpReadtimeoutName = cqDamS7damVideoproxyclientserviceHttpReadtimeoutName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceHttpReadtimeoutName
   * @return cqDamS7damVideoproxyclientserviceHttpReadtimeoutName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceHttpReadtimeoutName() {
    return cqDamS7damVideoproxyclientserviceHttpReadtimeoutName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.readtimeout.name")
  public void setCqDamS7damVideoproxyclientserviceHttpReadtimeoutName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpReadtimeoutName) {
    this.cqDamS7damVideoproxyclientserviceHttpReadtimeoutName = cqDamS7damVideoproxyclientserviceHttpReadtimeoutName;
  }

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName) {
    this.cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName = cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName
   * @return cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName() {
    return cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.connectiontimeout.name")
  public void setCqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName) {
    this.cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName = cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName;
  }

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceHttpMaxretrycountName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpMaxretrycountName) {
    this.cqDamS7damVideoproxyclientserviceHttpMaxretrycountName = cqDamS7damVideoproxyclientserviceHttpMaxretrycountName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceHttpMaxretrycountName
   * @return cqDamS7damVideoproxyclientserviceHttpMaxretrycountName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceHttpMaxretrycountName() {
    return cqDamS7damVideoproxyclientserviceHttpMaxretrycountName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.http.maxretrycount.name")
  public void setCqDamS7damVideoproxyclientserviceHttpMaxretrycountName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceHttpMaxretrycountName) {
    this.cqDamS7damVideoproxyclientserviceHttpMaxretrycountName = cqDamS7damVideoproxyclientserviceHttpMaxretrycountName;
  }

  public ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties cqDamS7damVideoproxyclientserviceUploadprogressIntervalName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceUploadprogressIntervalName) {
    this.cqDamS7damVideoproxyclientserviceUploadprogressIntervalName = cqDamS7damVideoproxyclientserviceUploadprogressIntervalName;
    return this;
  }

  /**
   * Get cqDamS7damVideoproxyclientserviceUploadprogressIntervalName
   * @return cqDamS7damVideoproxyclientserviceUploadprogressIntervalName
   */
  @Valid 
  @Schema(name = "cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")
  public @Nullable ConfigNodePropertyInteger getCqDamS7damVideoproxyclientserviceUploadprogressIntervalName() {
    return cqDamS7damVideoproxyclientserviceUploadprogressIntervalName;
  }

  @JsonProperty("cq.dam.s7dam.videoproxyclientservice.uploadprogress.interval.name")
  public void setCqDamS7damVideoproxyclientserviceUploadprogressIntervalName(@Nullable ConfigNodePropertyInteger cqDamS7damVideoproxyclientserviceUploadprogressIntervalName) {
    this.cqDamS7damVideoproxyclientserviceUploadprogressIntervalName = cqDamS7damVideoproxyclientserviceUploadprogressIntervalName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties = (ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties) o;
    return Objects.equals(this.cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName) &&
        Objects.equals(this.cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName) &&
        Objects.equals(this.cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName) &&
        Objects.equals(this.cqDamS7damVideoproxyclientserviceHttpReadtimeoutName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceHttpReadtimeoutName) &&
        Objects.equals(this.cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName) &&
        Objects.equals(this.cqDamS7damVideoproxyclientserviceHttpMaxretrycountName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceHttpMaxretrycountName) &&
        Objects.equals(this.cqDamS7damVideoproxyclientserviceUploadprogressIntervalName, comDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties.cqDamS7damVideoproxyclientserviceUploadprogressIntervalName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName, cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName, cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName, cqDamS7damVideoproxyclientserviceHttpReadtimeoutName, cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName, cqDamS7damVideoproxyclientserviceHttpMaxretrycountName, cqDamS7damVideoproxyclientserviceUploadprogressIntervalName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamS7damCommonVideoImplVideoProxyClientServiceImplProperties {\n");
    sb.append("    cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceMultipartuploadMinsizeName)).append("\n");
    sb.append("    cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceMultipartuploadPartsizeName)).append("\n");
    sb.append("    cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceMultipartuploadNumthreadName)).append("\n");
    sb.append("    cqDamS7damVideoproxyclientserviceHttpReadtimeoutName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceHttpReadtimeoutName)).append("\n");
    sb.append("    cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceHttpConnectiontimeoutName)).append("\n");
    sb.append("    cqDamS7damVideoproxyclientserviceHttpMaxretrycountName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceHttpMaxretrycountName)).append("\n");
    sb.append("    cqDamS7damVideoproxyclientserviceUploadprogressIntervalName: ").append(toIndentedString(cqDamS7damVideoproxyclientserviceUploadprogressIntervalName)).append("\n");
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

