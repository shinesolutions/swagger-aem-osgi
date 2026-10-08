package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties   {

    private ConfigNodePropertyString slingPostOperation;
    private ConfigNodePropertyString slingServletMethods;

    /**
     * Default constructor.
     */
    public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties.
     *
     * @param slingPostOperation slingPostOperation
     * @param slingServletMethods slingServletMethods
     */
    public ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties(
        ConfigNodePropertyString slingPostOperation, 
        ConfigNodePropertyString slingServletMethods
    ) {
        this.slingPostOperation = slingPostOperation;
        this.slingServletMethods = slingServletMethods;
    }



    /**
     * Get slingPostOperation
     * @return slingPostOperation
     */
    public ConfigNodePropertyString getSlingPostOperation() {
        return slingPostOperation;
    }

    public void setSlingPostOperation(ConfigNodePropertyString slingPostOperation) {
        this.slingPostOperation = slingPostOperation;
    }

    /**
     * Get slingServletMethods
     * @return slingServletMethods
     */
    public ConfigNodePropertyString getSlingServletMethods() {
        return slingServletMethods;
    }

    public void setSlingServletMethods(ConfigNodePropertyString slingServletMethods) {
        this.slingServletMethods = slingServletMethods;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {\n");
        
        sb.append("    slingPostOperation: ").append(toIndentedString(slingPostOperation)).append("\n");
        sb.append("    slingServletMethods: ").append(toIndentedString(slingServletMethods)).append("\n");
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

