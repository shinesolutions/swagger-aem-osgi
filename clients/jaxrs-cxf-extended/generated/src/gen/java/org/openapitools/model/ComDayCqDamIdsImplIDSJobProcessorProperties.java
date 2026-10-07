package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ComDayCqDamIdsImplIDSJobProcessorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableMultisession;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean idsCcEnable;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableRetry;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableRetryScripterror;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString externalizerDomainCqhost;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString externalizerDomainHttp;
 /**
  * Get enableMultisession
  * @return enableMultisession
  */
  @JsonProperty("enable.multisession")
  public ConfigNodePropertyBoolean getEnableMultisession() {
    return enableMultisession;
  }

  /**
   * Sets the <code>enableMultisession</code> property.
   */
 public void setEnableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
  }

  /**
   * Sets the <code>enableMultisession</code> property.
   */
  public ComDayCqDamIdsImplIDSJobProcessorProperties enableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
    return this;
  }

 /**
  * Get idsCcEnable
  * @return idsCcEnable
  */
  @JsonProperty("ids.cc.enable")
  public ConfigNodePropertyBoolean getIdsCcEnable() {
    return idsCcEnable;
  }

  /**
   * Sets the <code>idsCcEnable</code> property.
   */
 public void setIdsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
  }

  /**
   * Sets the <code>idsCcEnable</code> property.
   */
  public ComDayCqDamIdsImplIDSJobProcessorProperties idsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
    return this;
  }

 /**
  * Get enableRetry
  * @return enableRetry
  */
  @JsonProperty("enable.retry")
  public ConfigNodePropertyBoolean getEnableRetry() {
    return enableRetry;
  }

  /**
   * Sets the <code>enableRetry</code> property.
   */
 public void setEnableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
  }

  /**
   * Sets the <code>enableRetry</code> property.
   */
  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
    return this;
  }

 /**
  * Get enableRetryScripterror
  * @return enableRetryScripterror
  */
  @JsonProperty("enable.retry.scripterror")
  public ConfigNodePropertyBoolean getEnableRetryScripterror() {
    return enableRetryScripterror;
  }

  /**
   * Sets the <code>enableRetryScripterror</code> property.
   */
 public void setEnableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
  }

  /**
   * Sets the <code>enableRetryScripterror</code> property.
   */
  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
    return this;
  }

 /**
  * Get externalizerDomainCqhost
  * @return externalizerDomainCqhost
  */
  @JsonProperty("externalizer.domain.cqhost")
  public ConfigNodePropertyString getExternalizerDomainCqhost() {
    return externalizerDomainCqhost;
  }

  /**
   * Sets the <code>externalizerDomainCqhost</code> property.
   */
 public void setExternalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
  }

  /**
   * Sets the <code>externalizerDomainCqhost</code> property.
   */
  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
    return this;
  }

 /**
  * Get externalizerDomainHttp
  * @return externalizerDomainHttp
  */
  @JsonProperty("externalizer.domain.http")
  public ConfigNodePropertyString getExternalizerDomainHttp() {
    return externalizerDomainHttp;
  }

  /**
   * Sets the <code>externalizerDomainHttp</code> property.
   */
 public void setExternalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
  }

  /**
   * Sets the <code>externalizerDomainHttp</code> property.
   */
  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
    return this;
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
  private static String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

