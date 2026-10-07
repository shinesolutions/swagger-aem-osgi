package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamIdsImplIDSJobProcessorProperties   {

    private ConfigNodePropertyBoolean enableMultisession;
    private ConfigNodePropertyBoolean idsCcEnable;
    private ConfigNodePropertyBoolean enableRetry;
    private ConfigNodePropertyBoolean enableRetryScripterror;
    private ConfigNodePropertyString externalizerDomainCqhost;
    private ConfigNodePropertyString externalizerDomainHttp;

    /**
     * Default constructor.
     */
    public ComDayCqDamIdsImplIDSJobProcessorProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamIdsImplIDSJobProcessorProperties.
     *
     * @param enableMultisession enableMultisession
     * @param idsCcEnable idsCcEnable
     * @param enableRetry enableRetry
     * @param enableRetryScripterror enableRetryScripterror
     * @param externalizerDomainCqhost externalizerDomainCqhost
     * @param externalizerDomainHttp externalizerDomainHttp
     */
    public ComDayCqDamIdsImplIDSJobProcessorProperties(
        ConfigNodePropertyBoolean enableMultisession, 
        ConfigNodePropertyBoolean idsCcEnable, 
        ConfigNodePropertyBoolean enableRetry, 
        ConfigNodePropertyBoolean enableRetryScripterror, 
        ConfigNodePropertyString externalizerDomainCqhost, 
        ConfigNodePropertyString externalizerDomainHttp
    ) {
        this.enableMultisession = enableMultisession;
        this.idsCcEnable = idsCcEnable;
        this.enableRetry = enableRetry;
        this.enableRetryScripterror = enableRetryScripterror;
        this.externalizerDomainCqhost = externalizerDomainCqhost;
        this.externalizerDomainHttp = externalizerDomainHttp;
    }



    /**
     * Get enableMultisession
     * @return enableMultisession
     */
    public ConfigNodePropertyBoolean getEnableMultisession() {
        return enableMultisession;
    }

    public void setEnableMultisession(ConfigNodePropertyBoolean enableMultisession) {
        this.enableMultisession = enableMultisession;
    }

    /**
     * Get idsCcEnable
     * @return idsCcEnable
     */
    public ConfigNodePropertyBoolean getIdsCcEnable() {
        return idsCcEnable;
    }

    public void setIdsCcEnable(ConfigNodePropertyBoolean idsCcEnable) {
        this.idsCcEnable = idsCcEnable;
    }

    /**
     * Get enableRetry
     * @return enableRetry
     */
    public ConfigNodePropertyBoolean getEnableRetry() {
        return enableRetry;
    }

    public void setEnableRetry(ConfigNodePropertyBoolean enableRetry) {
        this.enableRetry = enableRetry;
    }

    /**
     * Get enableRetryScripterror
     * @return enableRetryScripterror
     */
    public ConfigNodePropertyBoolean getEnableRetryScripterror() {
        return enableRetryScripterror;
    }

    public void setEnableRetryScripterror(ConfigNodePropertyBoolean enableRetryScripterror) {
        this.enableRetryScripterror = enableRetryScripterror;
    }

    /**
     * Get externalizerDomainCqhost
     * @return externalizerDomainCqhost
     */
    public ConfigNodePropertyString getExternalizerDomainCqhost() {
        return externalizerDomainCqhost;
    }

    public void setExternalizerDomainCqhost(ConfigNodePropertyString externalizerDomainCqhost) {
        this.externalizerDomainCqhost = externalizerDomainCqhost;
    }

    /**
     * Get externalizerDomainHttp
     * @return externalizerDomainHttp
     */
    public ConfigNodePropertyString getExternalizerDomainHttp() {
        return externalizerDomainHttp;
    }

    public void setExternalizerDomainHttp(ConfigNodePropertyString externalizerDomainHttp) {
        this.externalizerDomainHttp = externalizerDomainHttp;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

