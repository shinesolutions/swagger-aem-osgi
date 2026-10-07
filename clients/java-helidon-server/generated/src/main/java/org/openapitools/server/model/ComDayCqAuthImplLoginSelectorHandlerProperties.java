package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqAuthImplLoginSelectorHandlerProperties   {

    private ConfigNodePropertyString path;
    private ConfigNodePropertyInteger serviceRanking;
    private ConfigNodePropertyArray authLoginselectorMappings;
    private ConfigNodePropertyArray authLoginselectorChangepwMappings;
    private ConfigNodePropertyString authLoginselectorDefaultloginpage;
    private ConfigNodePropertyString authLoginselectorDefaultchangepwpage;
    private ConfigNodePropertyArray authLoginselectorHandle;
    private ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions;

    /**
     * Default constructor.
     */
    public ComDayCqAuthImplLoginSelectorHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqAuthImplLoginSelectorHandlerProperties.
     *
     * @param path path
     * @param serviceRanking serviceRanking
     * @param authLoginselectorMappings authLoginselectorMappings
     * @param authLoginselectorChangepwMappings authLoginselectorChangepwMappings
     * @param authLoginselectorDefaultloginpage authLoginselectorDefaultloginpage
     * @param authLoginselectorDefaultchangepwpage authLoginselectorDefaultchangepwpage
     * @param authLoginselectorHandle authLoginselectorHandle
     * @param authLoginselectorHandleAllExtensions authLoginselectorHandleAllExtensions
     */
    public ComDayCqAuthImplLoginSelectorHandlerProperties(
        ConfigNodePropertyString path, 
        ConfigNodePropertyInteger serviceRanking, 
        ConfigNodePropertyArray authLoginselectorMappings, 
        ConfigNodePropertyArray authLoginselectorChangepwMappings, 
        ConfigNodePropertyString authLoginselectorDefaultloginpage, 
        ConfigNodePropertyString authLoginselectorDefaultchangepwpage, 
        ConfigNodePropertyArray authLoginselectorHandle, 
        ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions
    ) {
        this.path = path;
        this.serviceRanking = serviceRanking;
        this.authLoginselectorMappings = authLoginselectorMappings;
        this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
        this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
        this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
        this.authLoginselectorHandle = authLoginselectorHandle;
        this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
    }



    /**
     * Get path
     * @return path
     */
    public ConfigNodePropertyString getPath() {
        return path;
    }

    public void setPath(ConfigNodePropertyString path) {
        this.path = path;
    }

    /**
     * Get serviceRanking
     * @return serviceRanking
     */
    public ConfigNodePropertyInteger getServiceRanking() {
        return serviceRanking;
    }

    public void setServiceRanking(ConfigNodePropertyInteger serviceRanking) {
        this.serviceRanking = serviceRanking;
    }

    /**
     * Get authLoginselectorMappings
     * @return authLoginselectorMappings
     */
    public ConfigNodePropertyArray getAuthLoginselectorMappings() {
        return authLoginselectorMappings;
    }

    public void setAuthLoginselectorMappings(ConfigNodePropertyArray authLoginselectorMappings) {
        this.authLoginselectorMappings = authLoginselectorMappings;
    }

    /**
     * Get authLoginselectorChangepwMappings
     * @return authLoginselectorChangepwMappings
     */
    public ConfigNodePropertyArray getAuthLoginselectorChangepwMappings() {
        return authLoginselectorChangepwMappings;
    }

    public void setAuthLoginselectorChangepwMappings(ConfigNodePropertyArray authLoginselectorChangepwMappings) {
        this.authLoginselectorChangepwMappings = authLoginselectorChangepwMappings;
    }

    /**
     * Get authLoginselectorDefaultloginpage
     * @return authLoginselectorDefaultloginpage
     */
    public ConfigNodePropertyString getAuthLoginselectorDefaultloginpage() {
        return authLoginselectorDefaultloginpage;
    }

    public void setAuthLoginselectorDefaultloginpage(ConfigNodePropertyString authLoginselectorDefaultloginpage) {
        this.authLoginselectorDefaultloginpage = authLoginselectorDefaultloginpage;
    }

    /**
     * Get authLoginselectorDefaultchangepwpage
     * @return authLoginselectorDefaultchangepwpage
     */
    public ConfigNodePropertyString getAuthLoginselectorDefaultchangepwpage() {
        return authLoginselectorDefaultchangepwpage;
    }

    public void setAuthLoginselectorDefaultchangepwpage(ConfigNodePropertyString authLoginselectorDefaultchangepwpage) {
        this.authLoginselectorDefaultchangepwpage = authLoginselectorDefaultchangepwpage;
    }

    /**
     * Get authLoginselectorHandle
     * @return authLoginselectorHandle
     */
    public ConfigNodePropertyArray getAuthLoginselectorHandle() {
        return authLoginselectorHandle;
    }

    public void setAuthLoginselectorHandle(ConfigNodePropertyArray authLoginselectorHandle) {
        this.authLoginselectorHandle = authLoginselectorHandle;
    }

    /**
     * Get authLoginselectorHandleAllExtensions
     * @return authLoginselectorHandleAllExtensions
     */
    public ConfigNodePropertyBoolean getAuthLoginselectorHandleAllExtensions() {
        return authLoginselectorHandleAllExtensions;
    }

    public void setAuthLoginselectorHandleAllExtensions(ConfigNodePropertyBoolean authLoginselectorHandleAllExtensions) {
        this.authLoginselectorHandleAllExtensions = authLoginselectorHandleAllExtensions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqAuthImplLoginSelectorHandlerProperties {\n");
        
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    serviceRanking: ").append(toIndentedString(serviceRanking)).append("\n");
        sb.append("    authLoginselectorMappings: ").append(toIndentedString(authLoginselectorMappings)).append("\n");
        sb.append("    authLoginselectorChangepwMappings: ").append(toIndentedString(authLoginselectorChangepwMappings)).append("\n");
        sb.append("    authLoginselectorDefaultloginpage: ").append(toIndentedString(authLoginselectorDefaultloginpage)).append("\n");
        sb.append("    authLoginselectorDefaultchangepwpage: ").append(toIndentedString(authLoginselectorDefaultchangepwpage)).append("\n");
        sb.append("    authLoginselectorHandle: ").append(toIndentedString(authLoginselectorHandle)).append("\n");
        sb.append("    authLoginselectorHandleAllExtensions: ").append(toIndentedString(authLoginselectorHandleAllExtensions)).append("\n");
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

