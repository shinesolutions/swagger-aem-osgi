package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2026-10-07T12:54:21.614735164Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class ComDayCqDamIdsImplIDSJobProcessorProperties   {
  
  private ConfigNodePropertyBoolean enableMultisession;
  private ConfigNodePropertyBoolean idsCcEnable;
  private ConfigNodePropertyBoolean enableRetry;
  private ConfigNodePropertyBoolean enableRetryScripterror;
  private ConfigNodePropertyString externalizerDomainCqhost;
  private ConfigNodePropertyString externalizerDomainHttp;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.multisession")
  @Valid
  public ConfigNodePropertyBoolean getEnableMultisession() {
    return enableMultisession;
  }
  public void setEnableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ids.cc.enable")
  @Valid
  public ConfigNodePropertyBoolean getIdsCcEnable() {
    return idsCcEnable;
  }
  public void setIdsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.retry")
  @Valid
  public ConfigNodePropertyBoolean getEnableRetry() {
    return enableRetry;
  }
  public void setEnableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("enable.retry.scripterror")
  @Valid
  public ConfigNodePropertyBoolean getEnableRetryScripterror() {
    return enableRetryScripterror;
  }
  public void setEnableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.domain.cqhost")
  @Valid
  public ConfigNodePropertyString getExternalizerDomainCqhost() {
    return externalizerDomainCqhost;
  }
  public void setExternalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("externalizer.domain.http")
  @Valid
  public ConfigNodePropertyString getExternalizerDomainHttp() {
    return externalizerDomainHttp;
  }
  public void setExternalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

