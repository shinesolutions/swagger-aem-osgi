package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties   {

    private ConfigNodePropertyInteger deviceRegistrationTimeout;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties.
     *
     * @param deviceRegistrationTimeout deviceRegistrationTimeout
     */
    public ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties(
        ConfigNodePropertyInteger deviceRegistrationTimeout
    ) {
        this.deviceRegistrationTimeout = deviceRegistrationTimeout;
    }



    /**
     * Get deviceRegistrationTimeout
     * @return deviceRegistrationTimeout
     */
    public ConfigNodePropertyInteger getDeviceRegistrationTimeout() {
        return deviceRegistrationTimeout;
    }

    public void setDeviceRegistrationTimeout(ConfigNodePropertyInteger deviceRegistrationTimeout) {
        this.deviceRegistrationTimeout = deviceRegistrationTimeout;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensDeviceRegistrationImplRegistrationServiceImplProperties {\n");
        
        sb.append("    deviceRegistrationTimeout: ").append(toIndentedString(deviceRegistrationTimeout)).append("\n");
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

