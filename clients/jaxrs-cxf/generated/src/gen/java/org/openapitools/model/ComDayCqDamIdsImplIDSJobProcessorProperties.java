package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ComDayCqDamIdsImplIDSJobProcessorProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableMultisession = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean idsCcEnable = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableRetry = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableRetryScripterror = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString externalizerDomainCqhost = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString externalizerDomainHttp = null;
 /**
   * Get enableMultisession
   * @return enableMultisession
  **/
  @JsonProperty("enable.multisession")
  public ConfigNodePropertyBoolean getEnableMultisession() {
    return enableMultisession;
  }

  public void setEnableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
    return this;
  }

 /**
   * Get idsCcEnable
   * @return idsCcEnable
  **/
  @JsonProperty("ids.cc.enable")
  public ConfigNodePropertyBoolean getIdsCcEnable() {
    return idsCcEnable;
  }

  public void setIdsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties idsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
    return this;
  }

 /**
   * Get enableRetry
   * @return enableRetry
  **/
  @JsonProperty("enable.retry")
  public ConfigNodePropertyBoolean getEnableRetry() {
    return enableRetry;
  }

  public void setEnableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
    return this;
  }

 /**
   * Get enableRetryScripterror
   * @return enableRetryScripterror
  **/
  @JsonProperty("enable.retry.scripterror")
  public ConfigNodePropertyBoolean getEnableRetryScripterror() {
    return enableRetryScripterror;
  }

  public void setEnableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties enableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
    return this;
  }

 /**
   * Get externalizerDomainCqhost
   * @return externalizerDomainCqhost
  **/
  @JsonProperty("externalizer.domain.cqhost")
  public ConfigNodePropertyString getExternalizerDomainCqhost() {
    return externalizerDomainCqhost;
  }

  public void setExternalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
    return this;
  }

 /**
   * Get externalizerDomainHttp
   * @return externalizerDomainHttp
  **/
  @JsonProperty("externalizer.domain.http")
  public ConfigNodePropertyString getExternalizerDomainHttp() {
    return externalizerDomainHttp;
  }

  public void setExternalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties externalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
    this.externalizerDomainHttp = externalizerDomainHttp;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

