package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
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
 * ComDayCqDamIdsImplIDSJobProcessorProperties
 */

@JsonTypeName("comDayCqDamIdsImplIDSJobProcessorProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamIdsImplIDSJobProcessorProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableMultisession;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean idsCcEnable;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableRetry;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableRetryScripterror;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString externalizerDomainCqhost;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString externalizerDomainHttp;

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableMultisession(@Nullable ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
    return this;
  }

  /**
   * Get enableMultisession
   * @return enableMultisession
   */
  @Valid 
  @Schema(name = "enable.multisession", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.multisession")
  public @Nullable ConfigNodePropertyBoolean getEnableMultisession() {
    return enableMultisession;
  }

  @JsonProperty("enable.multisession")
  public void setEnableMultisession(@Nullable ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties idsCcEnable(@Nullable ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
    return this;
  }

  /**
   * Get idsCcEnable
   * @return idsCcEnable
   */
  @Valid 
  @Schema(name = "ids.cc.enable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("ids.cc.enable")
  public @Nullable ConfigNodePropertyBoolean getIdsCcEnable() {
    return idsCcEnable;
  }

  @JsonProperty("ids.cc.enable")
  public void setIdsCcEnable(@Nullable ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetry(@Nullable ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
    return this;
  }

  /**
   * Get enableRetry
   * @return enableRetry
   */
  @Valid 
  @Schema(name = "enable.retry", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.retry")
  public @Nullable ConfigNodePropertyBoolean getEnableRetry() {
    return enableRetry;
  }

  @JsonProperty("enable.retry")
  public void setEnableRetry(@Nullable ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetryScripterror(@Nullable ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
    return this;
  }

  /**
   * Get enableRetryScripterror
   * @return enableRetryScripterror
   */
  @Valid 
  @Schema(name = "enable.retry.scripterror", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enable.retry.scripterror")
  public @Nullable ConfigNodePropertyBoolean getEnableRetryScripterror() {
    return enableRetryScripterror;
  }

  @JsonProperty("enable.retry.scripterror")
  public void setEnableRetryScripterror(@Nullable ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainCqhost(@Nullable ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
    return this;
  }

  /**
   * Get externalizerDomainCqhost
   * @return externalizerDomainCqhost
   */
  @Valid 
  @Schema(name = "externalizer.domain.cqhost", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalizer.domain.cqhost")
  public @Nullable ConfigNodePropertyString getExternalizerDomainCqhost() {
    return externalizerDomainCqhost;
  }

  @JsonProperty("externalizer.domain.cqhost")
  public void setExternalizerDomainCqhost(@Nullable ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainHttp(@Nullable ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
    return this;
  }

  /**
   * Get externalizerDomainHttp
   * @return externalizerDomainHttp
   */
  @Valid 
  @Schema(name = "externalizer.domain.http", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("externalizer.domain.http")
  public @Nullable ConfigNodePropertyString getExternalizerDomainHttp() {
    return externalizerDomainHttp;
  }

  @JsonProperty("externalizer.domain.http")
  public void setExternalizerDomainHttp(@Nullable ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComDayCqDamIdsImplIDSJobProcessorProperties comDayCqDamIdsImplIDSJobProcessorProperties = (ComDayCqDamIdsImplIDSJobProcessorProperties) o;
    return Objects.equals(this.enableMultisession, comDayCqDamIdsImplIDSJobProcessorProperties.enableMultisession) &&
        Objects.equals(this.idsCcEnable, comDayCqDamIdsImplIDSJobProcessorProperties.idsCcEnable) &&
        Objects.equals(this.enableRetry, comDayCqDamIdsImplIDSJobProcessorProperties.enableRetry) &&
        Objects.equals(this.enableRetryScripterror, comDayCqDamIdsImplIDSJobProcessorProperties.enableRetryScripterror) &&
        Objects.equals(this.externalizerDomainCqhost, comDayCqDamIdsImplIDSJobProcessorProperties.externalizerDomainCqhost) &&
        Objects.equals(this.externalizerDomainHttp, comDayCqDamIdsImplIDSJobProcessorProperties.externalizerDomainHttp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enableMultisession, idsCcEnable, enableRetry, enableRetryScripterror, externalizerDomainCqhost, externalizerDomainHttp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ComDayCqDamIdsImplIDSJobProcessorProperties {\n");
    sb.append("    enableMultisession: ").append(toIndentedString(enableMultisession)).append("\n");
    sb.append("    idsCcEnable: ").append(toIndentedString(idsCcEnable)).append("\n");
    sb.append("    enableRetry: ").append(toIndentedString(enableRetry)).append("\n");
    sb.append("    enableRetryScripterror: ").append(toIndentedString(enableRetryScripterror)).append("\n");
    sb.append("    externalizerDomainCqhost: ").append(toIndentedString(externalizerDomainCqhost)).append("\n");
    sb.append("    externalizerDomainHttp: ").append(toIndentedString(externalizerDomainHttp)).append("\n");
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

