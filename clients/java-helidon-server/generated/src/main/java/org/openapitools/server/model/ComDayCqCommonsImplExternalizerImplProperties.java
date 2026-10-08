package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqCommonsImplExternalizerImplProperties   {

    private ConfigNodePropertyArray externalizerDomains;
    private ConfigNodePropertyString externalizerHost;
    private ConfigNodePropertyString externalizerContextpath;
    private ConfigNodePropertyBoolean externalizerEncodedpath;

    /**
     * Default constructor.
     */
    public ComDayCqCommonsImplExternalizerImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqCommonsImplExternalizerImplProperties.
     *
     * @param externalizerDomains externalizerDomains
     * @param externalizerHost externalizerHost
     * @param externalizerContextpath externalizerContextpath
     * @param externalizerEncodedpath externalizerEncodedpath
     */
    public ComDayCqCommonsImplExternalizerImplProperties(
        ConfigNodePropertyArray externalizerDomains, 
        ConfigNodePropertyString externalizerHost, 
        ConfigNodePropertyString externalizerContextpath, 
        ConfigNodePropertyBoolean externalizerEncodedpath
    ) {
        this.externalizerDomains = externalizerDomains;
        this.externalizerHost = externalizerHost;
        this.externalizerContextpath = externalizerContextpath;
        this.externalizerEncodedpath = externalizerEncodedpath;
    }



    /**
     * Get externalizerDomains
     * @return externalizerDomains
     */
    public ConfigNodePropertyArray getExternalizerDomains() {
        return externalizerDomains;
    }

    public void setExternalizerDomains(ConfigNodePropertyArray externalizerDomains) {
        this.externalizerDomains = externalizerDomains;
    }

    /**
     * Get externalizerHost
     * @return externalizerHost
     */
    public ConfigNodePropertyString getExternalizerHost() {
        return externalizerHost;
    }

    public void setExternalizerHost(ConfigNodePropertyString externalizerHost) {
        this.externalizerHost = externalizerHost;
    }

    /**
     * Get externalizerContextpath
     * @return externalizerContextpath
     */
    public ConfigNodePropertyString getExternalizerContextpath() {
        return externalizerContextpath;
    }

    public void setExternalizerContextpath(ConfigNodePropertyString externalizerContextpath) {
        this.externalizerContextpath = externalizerContextpath;
    }

    /**
     * Get externalizerEncodedpath
     * @return externalizerEncodedpath
     */
    public ConfigNodePropertyBoolean getExternalizerEncodedpath() {
        return externalizerEncodedpath;
    }

    public void setExternalizerEncodedpath(ConfigNodePropertyBoolean externalizerEncodedpath) {
        this.externalizerEncodedpath = externalizerEncodedpath;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqCommonsImplExternalizerImplProperties {\n");
        
        sb.append("    externalizerDomains: ").append(toIndentedString(externalizerDomains)).append("\n");
        sb.append("    externalizerHost: ").append(toIndentedString(externalizerHost)).append("\n");
        sb.append("    externalizerContextpath: ").append(toIndentedString(externalizerContextpath)).append("\n");
        sb.append("    externalizerEncodedpath: ").append(toIndentedString(externalizerEncodedpath)).append("\n");
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

