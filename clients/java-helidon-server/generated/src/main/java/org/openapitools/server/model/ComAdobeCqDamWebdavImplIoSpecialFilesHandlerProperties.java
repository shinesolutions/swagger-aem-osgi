package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties   {

    private ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;

    /**
     * Default constructor.
     */
    public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties.
     *
     * @param comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
     */
    public ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties(
        ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
    ) {
        this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
    }



    /**
     * Get comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
     * @return comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters
     */
    public ConfigNodePropertyArray getComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters() {
        return comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
    }

    public void setComDayCqDamCoreImplIoSpecialFilesHandlerFilepatters(ConfigNodePropertyArray comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters) {
        this.comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters = comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqDamWebdavImplIoSpecialFilesHandlerProperties {\n");
        
        sb.append("    comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters: ").append(toIndentedString(comDayCqDamCoreImplIoSpecialFilesHandlerFilepatters)).append("\n");
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

