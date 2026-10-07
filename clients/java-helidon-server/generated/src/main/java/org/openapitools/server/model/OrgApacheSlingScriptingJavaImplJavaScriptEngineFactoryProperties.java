package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties   {

    private ConfigNodePropertyBoolean javaClassdebuginfo;
    private ConfigNodePropertyString javaJavaEncoding;
    private ConfigNodePropertyString javaCompilerSourceVM;
    private ConfigNodePropertyString javaCompilerTargetVM;

    /**
     * Default constructor.
     */
    public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties.
     *
     * @param javaClassdebuginfo javaClassdebuginfo
     * @param javaJavaEncoding javaJavaEncoding
     * @param javaCompilerSourceVM javaCompilerSourceVM
     * @param javaCompilerTargetVM javaCompilerTargetVM
     */
    public OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties(
        ConfigNodePropertyBoolean javaClassdebuginfo, 
        ConfigNodePropertyString javaJavaEncoding, 
        ConfigNodePropertyString javaCompilerSourceVM, 
        ConfigNodePropertyString javaCompilerTargetVM
    ) {
        this.javaClassdebuginfo = javaClassdebuginfo;
        this.javaJavaEncoding = javaJavaEncoding;
        this.javaCompilerSourceVM = javaCompilerSourceVM;
        this.javaCompilerTargetVM = javaCompilerTargetVM;
    }



    /**
     * Get javaClassdebuginfo
     * @return javaClassdebuginfo
     */
    public ConfigNodePropertyBoolean getJavaClassdebuginfo() {
        return javaClassdebuginfo;
    }

    public void setJavaClassdebuginfo(ConfigNodePropertyBoolean javaClassdebuginfo) {
        this.javaClassdebuginfo = javaClassdebuginfo;
    }

    /**
     * Get javaJavaEncoding
     * @return javaJavaEncoding
     */
    public ConfigNodePropertyString getJavaJavaEncoding() {
        return javaJavaEncoding;
    }

    public void setJavaJavaEncoding(ConfigNodePropertyString javaJavaEncoding) {
        this.javaJavaEncoding = javaJavaEncoding;
    }

    /**
     * Get javaCompilerSourceVM
     * @return javaCompilerSourceVM
     */
    public ConfigNodePropertyString getJavaCompilerSourceVM() {
        return javaCompilerSourceVM;
    }

    public void setJavaCompilerSourceVM(ConfigNodePropertyString javaCompilerSourceVM) {
        this.javaCompilerSourceVM = javaCompilerSourceVM;
    }

    /**
     * Get javaCompilerTargetVM
     * @return javaCompilerTargetVM
     */
    public ConfigNodePropertyString getJavaCompilerTargetVM() {
        return javaCompilerTargetVM;
    }

    public void setJavaCompilerTargetVM(ConfigNodePropertyString javaCompilerTargetVM) {
        this.javaCompilerTargetVM = javaCompilerTargetVM;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingScriptingJavaImplJavaScriptEngineFactoryProperties {\n");
        
        sb.append("    javaClassdebuginfo: ").append(toIndentedString(javaClassdebuginfo)).append("\n");
        sb.append("    javaJavaEncoding: ").append(toIndentedString(javaJavaEncoding)).append("\n");
        sb.append("    javaCompilerSourceVM: ").append(toIndentedString(javaCompilerSourceVM)).append("\n");
        sb.append("    javaCompilerTargetVM: ").append(toIndentedString(javaCompilerTargetVM)).append("\n");
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

