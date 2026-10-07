package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties   {

    private ConfigNodePropertyString eventFilter;
    private ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize;
    private ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority;
    private ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification;

    /**
     * Default constructor.
     */
    public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties.
     *
     * @param eventFilter eventFilter
     * @param launchesEventhandlerThreadpoolMaxsize launchesEventhandlerThreadpoolMaxsize
     * @param launchesEventhandlerThreadpoolPriority launchesEventhandlerThreadpoolPriority
     * @param launchesEventhandlerUpdatelastmodification launchesEventhandlerUpdatelastmodification
     */
    public ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties(
        ConfigNodePropertyString eventFilter, 
        ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize, 
        ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority, 
        ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification
    ) {
        this.eventFilter = eventFilter;
        this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
        this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
        this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
    }



    /**
     * Get eventFilter
     * @return eventFilter
     */
    public ConfigNodePropertyString getEventFilter() {
        return eventFilter;
    }

    public void setEventFilter(ConfigNodePropertyString eventFilter) {
        this.eventFilter = eventFilter;
    }

    /**
     * Get launchesEventhandlerThreadpoolMaxsize
     * @return launchesEventhandlerThreadpoolMaxsize
     */
    public ConfigNodePropertyInteger getLaunchesEventhandlerThreadpoolMaxsize() {
        return launchesEventhandlerThreadpoolMaxsize;
    }

    public void setLaunchesEventhandlerThreadpoolMaxsize(ConfigNodePropertyInteger launchesEventhandlerThreadpoolMaxsize) {
        this.launchesEventhandlerThreadpoolMaxsize = launchesEventhandlerThreadpoolMaxsize;
    }

    /**
     * Get launchesEventhandlerThreadpoolPriority
     * @return launchesEventhandlerThreadpoolPriority
     */
    public ConfigNodePropertyDropDown getLaunchesEventhandlerThreadpoolPriority() {
        return launchesEventhandlerThreadpoolPriority;
    }

    public void setLaunchesEventhandlerThreadpoolPriority(ConfigNodePropertyDropDown launchesEventhandlerThreadpoolPriority) {
        this.launchesEventhandlerThreadpoolPriority = launchesEventhandlerThreadpoolPriority;
    }

    /**
     * Get launchesEventhandlerUpdatelastmodification
     * @return launchesEventhandlerUpdatelastmodification
     */
    public ConfigNodePropertyBoolean getLaunchesEventhandlerUpdatelastmodification() {
        return launchesEventhandlerUpdatelastmodification;
    }

    public void setLaunchesEventhandlerUpdatelastmodification(ConfigNodePropertyBoolean launchesEventhandlerUpdatelastmodification) {
        this.launchesEventhandlerUpdatelastmodification = launchesEventhandlerUpdatelastmodification;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqWcmLaunchesImplLaunchesEventHandlerProperties {\n");
        
        sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
        sb.append("    launchesEventhandlerThreadpoolMaxsize: ").append(toIndentedString(launchesEventhandlerThreadpoolMaxsize)).append("\n");
        sb.append("    launchesEventhandlerThreadpoolPriority: ").append(toIndentedString(launchesEventhandlerThreadpoolPriority)).append("\n");
        sb.append("    launchesEventhandlerUpdatelastmodification: ").append(toIndentedString(launchesEventhandlerUpdatelastmodification)).append("\n");
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

