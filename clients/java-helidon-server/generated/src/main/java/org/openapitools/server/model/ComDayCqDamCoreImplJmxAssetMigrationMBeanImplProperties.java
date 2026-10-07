package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties   {

    private ConfigNodePropertyString jmxObjectname;

    /**
     * Default constructor.
     */
    public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties.
     *
     * @param jmxObjectname jmxObjectname
     */
    public ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties(
        ConfigNodePropertyString jmxObjectname
    ) {
        this.jmxObjectname = jmxObjectname;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamCoreImplJmxAssetMigrationMBeanImplProperties {\n");
        
        sb.append("    jmxObjectname: ").append(toIndentedString(jmxObjectname)).append("\n");
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

