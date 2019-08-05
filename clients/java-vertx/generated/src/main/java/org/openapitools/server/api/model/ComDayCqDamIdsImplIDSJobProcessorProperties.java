package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.ConfigNodePropertyBoolean;
import org.openapitools.server.api.model.ConfigNodePropertyString;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class ComDayCqDamIdsImplIDSJobProcessorProperties   {
  
  private ConfigNodePropertyBoolean enableMultisession = null;
  private ConfigNodePropertyBoolean idsCcEnable = null;
  private ConfigNodePropertyBoolean enableRetry = null;
  private ConfigNodePropertyBoolean enableRetryScripterror = null;
  private ConfigNodePropertyString externalizerDomainCqhost = null;
  private ConfigNodePropertyString externalizerDomainHttp = null;

  public ComDayCqDamIdsImplIDSJobProcessorProperties () {

  }

  public ComDayCqDamIdsImplIDSJobProcessorProperties (ConfigNodePropertyBoolean enableMultisession, ConfigNodePropertyBoolean idsCcEnable, ConfigNodePropertyBoolean enableRetry, ConfigNodePropertyBoolean enableRetryScripterror, ConfigNodePropertyString externalizerDomainCqhost, ConfigNodePropertyString externalizerDomainHttp) {
    this.enableMultisession = enableMultisession;
    this.idsCcEnable = idsCcEnable;
    this.enableRetry = enableRetry;
    this.enableRetryScripterror = enableRetryScripterror;
    this.externalizerDomainCqhost = externalizerDomainCqhost;
    this.externalizerDomainHttp = externalizerDomainHttp;
  }

    
  @JsonProperty("enable.multisession")
  public ConfigNodePropertyBoolean getEnableMultisession() {
    return enableMultisession;
  }
  public void setEnableMultisession(ConfigNodePropertyBoolean enableMultisession) {
    this.enableMultisession = enableMultisession;
  }

    
  @JsonProperty("ids.cc.enable")
  public ConfigNodePropertyBoolean getIdsCcEnable() {
    return idsCcEnable;
  }
  public void setIdsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
    this.idsCcEnable = idsCcEnable;
  }

    
  @JsonProperty("enable.retry")
  public ConfigNodePropertyBoolean getEnableRetry() {
    return enableRetry;
  }
  public void setEnableRetry(ConfigNodePropertyBoolean enableRetry) {
    this.enableRetry = enableRetry;
  }

    
  @JsonProperty("enable.retry.scripterror")
  public ConfigNodePropertyBoolean getEnableRetryScripterror() {
    return enableRetryScripterror;
  }
  public void setEnableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
    this.enableRetryScripterror = enableRetryScripterror;
  }

    
  @JsonProperty("externalizer.domain.cqhost")
  public ConfigNodePropertyString getExternalizerDomainCqhost() {
    return externalizerDomainCqhost;
  }
  public void setExternalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
    this.externalizerDomainCqhost = externalizerDomainCqhost;
  }

    
  @JsonProperty("externalizer.domain.http")
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
    return Objects.equals(enableMultisession, comDayCqDamIdsImplIDSJobProcessorProperties.enableMultisession) &&
        Objects.equals(idsCcEnable, comDayCqDamIdsImplIDSJobProcessorProperties.idsCcEnable) &&
        Objects.equals(enableRetry, comDayCqDamIdsImplIDSJobProcessorProperties.enableRetry) &&
        Objects.equals(enableRetryScripterror, comDayCqDamIdsImplIDSJobProcessorProperties.enableRetryScripterror) &&
        Objects.equals(externalizerDomainCqhost, comDayCqDamIdsImplIDSJobProcessorProperties.externalizerDomainCqhost) &&
        Objects.equals(externalizerDomainHttp, comDayCqDamIdsImplIDSJobProcessorProperties.externalizerDomainHttp);
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
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
