package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties   {

    private ConfigNodePropertyString name;
    private ConfigNodePropertyString packageBuilderTarget;

    /**
     * Default constructor.
     */
    public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties.
     *
     * @param name name
     * @param packageBuilderTarget packageBuilderTarget
     */
    public OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties(
        ConfigNodePropertyString name, 
        ConfigNodePropertyString packageBuilderTarget
    ) {
        this.name = name;
        this.packageBuilderTarget = packageBuilderTarget;
    }



    /**
     * Get name
     * @return name
     */
    public ConfigNodePropertyString getName() {
        return name;
    }

    public void setName(ConfigNodePropertyString name) {
        this.name = name;
    }

    /**
     * Get packageBuilderTarget
     * @return packageBuilderTarget
     */
    public ConfigNodePropertyString getPackageBuilderTarget() {
        return packageBuilderTarget;
    }

    public void setPackageBuilderTarget(ConfigNodePropertyString packageBuilderTarget) {
        this.packageBuilderTarget = packageBuilderTarget;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheSlingDistributionPackagingImplImporterLocalDistributioProperties {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    packageBuilderTarget: ").append(toIndentedString(packageBuilderTarget)).append("\n");
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

