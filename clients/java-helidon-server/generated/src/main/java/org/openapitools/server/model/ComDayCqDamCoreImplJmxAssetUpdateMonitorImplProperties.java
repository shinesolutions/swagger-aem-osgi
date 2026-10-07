package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties   {

    private ConfigNodePropertyString jmxObjectname;
    private ConfigNodePropertyBoolean active;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties.
     *
     * @param jmxObjectname jmxObjectname
     * @param active active
     */
    public ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties(
        ConfigNodePropertyString jmxObjectname, 
        ConfigNodePropertyBoolean active
    ) {
        this.jmxObjectname = jmxObjectname;
        this.active = active;
    }



    /**
     * Get jmxObjectname
     * @return jmxObjectname
     */
    public ConfigNodePropertyString getJmxObjectname() {
        return jmxObjectname;
    }

    public void setJmxObjectname(ConfigNodePropertyString jmxObjectname) {
        this.jmxObjectname = jmxObjectname;
    }

    /**
     * Get active
     * @return active
     */
    public ConfigNodePropertyBoolean getActive() {
        return active;
    }

    public void setActive(ConfigNodePropertyBoolean active) {
        this.active = active;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplJmxAssetUpdateMonitorImplProperties {\n");
        
        sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
        sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

