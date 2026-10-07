package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqScreensDeviceImplDeviceServiceProperties   {

    private ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency;
    private ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars;
    private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars;
    private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars;
    private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars;
    private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars;
    private ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength;

    /**
     * Default constructor.
     */
    public ComAdobeCqScreensDeviceImplDeviceServiceProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqScreensDeviceImplDeviceServiceProperties.
     *
     * @param comAdobeAemScreensPlayerPingfrequency comAdobeAemScreensPlayerPingfrequency
     * @param comAdobeAemScreensDevicePaswordSpecialchars comAdobeAemScreensDevicePaswordSpecialchars
     * @param comAdobeAemScreensDevicePaswordMinlowercasechars comAdobeAemScreensDevicePaswordMinlowercasechars
     * @param comAdobeAemScreensDevicePaswordMinuppercasechars comAdobeAemScreensDevicePaswordMinuppercasechars
     * @param comAdobeAemScreensDevicePaswordMinnumberchars comAdobeAemScreensDevicePaswordMinnumberchars
     * @param comAdobeAemScreensDevicePaswordMinspecialchars comAdobeAemScreensDevicePaswordMinspecialchars
     * @param comAdobeAemScreensDevicePaswordMinlength comAdobeAemScreensDevicePaswordMinlength
     */
    public ComAdobeCqScreensDeviceImplDeviceServiceProperties(
        ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency, 
        ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars, 
        ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars, 
        ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars, 
        ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars, 
        ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars, 
        ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength
    ) {
        this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
        this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
        this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
        this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
        this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
        this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
        this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
    }



    /**
     * Get comAdobeAemScreensPlayerPingfrequency
     * @return comAdobeAemScreensPlayerPingfrequency
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensPlayerPingfrequency() {
        return comAdobeAemScreensPlayerPingfrequency;
    }

    public void setComAdobeAemScreensPlayerPingfrequency(ConfigNodePropertyInteger comAdobeAemScreensPlayerPingfrequency) {
        this.comAdobeAemScreensPlayerPingfrequency = comAdobeAemScreensPlayerPingfrequency;
    }

    /**
     * Get comAdobeAemScreensDevicePaswordSpecialchars
     * @return comAdobeAemScreensDevicePaswordSpecialchars
     */
    public ConfigNodePropertyString getComAdobeAemScreensDevicePaswordSpecialchars() {
        return comAdobeAemScreensDevicePaswordSpecialchars;
    }

    public void setComAdobeAemScreensDevicePaswordSpecialchars(ConfigNodePropertyString comAdobeAemScreensDevicePaswordSpecialchars) {
        this.comAdobeAemScreensDevicePaswordSpecialchars = comAdobeAemScreensDevicePaswordSpecialchars;
    }

    /**
     * Get comAdobeAemScreensDevicePaswordMinlowercasechars
     * @return comAdobeAemScreensDevicePaswordMinlowercasechars
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlowercasechars() {
        return comAdobeAemScreensDevicePaswordMinlowercasechars;
    }

    public void setComAdobeAemScreensDevicePaswordMinlowercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlowercasechars) {
        this.comAdobeAemScreensDevicePaswordMinlowercasechars = comAdobeAemScreensDevicePaswordMinlowercasechars;
    }

    /**
     * Get comAdobeAemScreensDevicePaswordMinuppercasechars
     * @return comAdobeAemScreensDevicePaswordMinuppercasechars
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinuppercasechars() {
        return comAdobeAemScreensDevicePaswordMinuppercasechars;
    }

    public void setComAdobeAemScreensDevicePaswordMinuppercasechars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinuppercasechars) {
        this.comAdobeAemScreensDevicePaswordMinuppercasechars = comAdobeAemScreensDevicePaswordMinuppercasechars;
    }

    /**
     * Get comAdobeAemScreensDevicePaswordMinnumberchars
     * @return comAdobeAemScreensDevicePaswordMinnumberchars
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinnumberchars() {
        return comAdobeAemScreensDevicePaswordMinnumberchars;
    }

    public void setComAdobeAemScreensDevicePaswordMinnumberchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinnumberchars) {
        this.comAdobeAemScreensDevicePaswordMinnumberchars = comAdobeAemScreensDevicePaswordMinnumberchars;
    }

    /**
     * Get comAdobeAemScreensDevicePaswordMinspecialchars
     * @return comAdobeAemScreensDevicePaswordMinspecialchars
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinspecialchars() {
        return comAdobeAemScreensDevicePaswordMinspecialchars;
    }

    public void setComAdobeAemScreensDevicePaswordMinspecialchars(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinspecialchars) {
        this.comAdobeAemScreensDevicePaswordMinspecialchars = comAdobeAemScreensDevicePaswordMinspecialchars;
    }

    /**
     * Get comAdobeAemScreensDevicePaswordMinlength
     * @return comAdobeAemScreensDevicePaswordMinlength
     */
    public ConfigNodePropertyInteger getComAdobeAemScreensDevicePaswordMinlength() {
        return comAdobeAemScreensDevicePaswordMinlength;
    }

    public void setComAdobeAemScreensDevicePaswordMinlength(ConfigNodePropertyInteger comAdobeAemScreensDevicePaswordMinlength) {
        this.comAdobeAemScreensDevicePaswordMinlength = comAdobeAemScreensDevicePaswordMinlength;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqScreensDeviceImplDeviceServiceProperties {\n");
        
        sb.append("    comAdobeAemScreensPlayerPingfrequency: ").append(toIndentedString(comAdobeAemScreensPlayerPingfrequency)).append("\n");
        sb.append("    comAdobeAemScreensDevicePaswordSpecialchars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordSpecialchars)).append("\n");
        sb.append("    comAdobeAemScreensDevicePaswordMinlowercasechars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinlowercasechars)).append("\n");
        sb.append("    comAdobeAemScreensDevicePaswordMinuppercasechars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinuppercasechars)).append("\n");
        sb.append("    comAdobeAemScreensDevicePaswordMinnumberchars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinnumberchars)).append("\n");
        sb.append("    comAdobeAemScreensDevicePaswordMinspecialchars: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinspecialchars)).append("\n");
        sb.append("    comAdobeAemScreensDevicePaswordMinlength: ").append(toIndentedString(comAdobeAemScreensDevicePaswordMinlength)).append("\n");
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

