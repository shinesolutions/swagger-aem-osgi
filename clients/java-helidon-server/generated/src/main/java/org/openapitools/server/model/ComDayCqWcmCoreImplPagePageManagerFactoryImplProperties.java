package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties   {

    private ConfigNodePropertyString illegalCharMapping;
    private ConfigNodePropertyBoolean pageSubTreeActivationCheck;

    /**
     * Default constructor.
     */
    public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties.
     *
     * @param illegalCharMapping illegalCharMapping
     * @param pageSubTreeActivationCheck pageSubTreeActivationCheck
     */
    public ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties(
        ConfigNodePropertyString illegalCharMapping, 
        ConfigNodePropertyBoolean pageSubTreeActivationCheck
    ) {
        this.illegalCharMapping = illegalCharMapping;
        this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
    }



    /**
     * Get illegalCharMapping
     * @return illegalCharMapping
     */
    public ConfigNodePropertyString getIllegalCharMapping() {
        return illegalCharMapping;
    }

    public void setIllegalCharMapping(ConfigNodePropertyString illegalCharMapping) {
        this.illegalCharMapping = illegalCharMapping;
    }

    /**
     * Get pageSubTreeActivationCheck
     * @return pageSubTreeActivationCheck
     */
    public ConfigNodePropertyBoolean getPageSubTreeActivationCheck() {
        return pageSubTreeActivationCheck;
    }

    public void setPageSubTreeActivationCheck(ConfigNodePropertyBoolean pageSubTreeActivationCheck) {
        this.pageSubTreeActivationCheck = pageSubTreeActivationCheck;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqWcmCoreImplPagePageManagerFactoryImplProperties {\n");
        
        sb.append("    illegalCharMapping: ").append(toIndentedString(illegalCharMapping)).append("\n");
        sb.append("    pageSubTreeActivationCheck: ").append(toIndentedString(pageSubTreeActivationCheck)).append("\n");
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

