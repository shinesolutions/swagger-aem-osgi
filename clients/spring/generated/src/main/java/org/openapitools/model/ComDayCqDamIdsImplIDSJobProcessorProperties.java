package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ComDayCqDamIdsImplIDSJobProcessorProperties
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2019-08-05T01:13:37.880Z[GMT]")

public class ComDayCqDamIdsImplIDSJobProcessorProperties   {
  @JsonProperty("enable.multisession")
  private ConfigNodePropertyBoolean enableMultisession = null;

  @JsonProperty("ids.cc.enable")
  private ConfigNodePropertyBoolean idsCcEnable = null;

  @JsonProperty("enable.retry")
  private ConfigNodePropertyBoolean enableRetry = null;

  @JsonProperty("enable.retry.scripterror")
  private ConfigNodePropertyBoolean enableRetryScripterror = null;

  @JsonProperty("externalizer.domain.cqhost")
  private ConfigNodePropertyString externalizerDomainCqhost = null;

  @JsonProperty("externalizer.domain.http")
  private ConfigNodePropertyString externalizerDomainHttp = null;

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
    return this;
  }

  /**
   * Get enableMultisession
   * @return enableMultisession
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnableMultisession() {
    return enableMultisession;
  }

  public void setEnableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties idsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
    return this;
  }

  /**
   * Get idsCcEnable
   * @return idsCcEnable
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getIdsCcEnable() {
    return idsCcEnable;
  }

  public void setIdsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
    return this;
  }

  /**
   * Get enableRetry
   * @return enableRetry
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnableRetry() {
    return enableRetry;
  }

  public void setEnableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
    return this;
  }

  /**
   * Get enableRetryScripterror
   * @return enableRetryScripterror
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyBoolean getEnableRetryScripterror() {
    return enableRetryScripterror;
  }

  public void setEnableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
    return this;
  }

  /**
   * Get externalizerDomainCqhost
   * @return externalizerDomainCqhost
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getExternalizerDomainCqhost() {
    return externalizerDomainCqhost;
  }

  public void setExternalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
    return this;
  }

  /**
   * Get externalizerDomainHttp
   * @return externalizerDomainHttp
  **/
  @ApiModelProperty(value = "")

  @Valid

  public ConfigNodePropertyString getExternalizerDomainHttp() {
    return externalizerDomainHttp;
  }

  public void setExternalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

