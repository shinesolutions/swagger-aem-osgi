package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties   {

    private ConfigNodePropertyString scene7FlashTemplatesRti;
    private ConfigNodePropertyString scene7FlashTemplatesRsi;
    private ConfigNodePropertyString scene7FlashTemplatesRb;
    private ConfigNodePropertyString scene7FlashTemplatesRurl;
    private ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter;

    /**
     * Default constructor.
     */
    public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties.
     *
     * @param scene7FlashTemplatesRti scene7FlashTemplatesRti
     * @param scene7FlashTemplatesRsi scene7FlashTemplatesRsi
     * @param scene7FlashTemplatesRb scene7FlashTemplatesRb
     * @param scene7FlashTemplatesRurl scene7FlashTemplatesRurl
     * @param scene7FlashTemplateUrlFormatParameter scene7FlashTemplateUrlFormatParameter
     */
    public ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties(
        ConfigNodePropertyString scene7FlashTemplatesRti, 
        ConfigNodePropertyString scene7FlashTemplatesRsi, 
        ConfigNodePropertyString scene7FlashTemplatesRb, 
        ConfigNodePropertyString scene7FlashTemplatesRurl, 
        ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter
    ) {
        this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
        this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
        this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
        this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
        this.scene7FlashTemplateUrlFormatParameter = scene7FlashTemplateUrlFormatParameter;
    }



    /**
     * Get scene7FlashTemplatesRti
     * @return scene7FlashTemplatesRti
     */
    public ConfigNodePropertyString getScene7FlashTemplatesRti() {
        return scene7FlashTemplatesRti;
    }

    public void setScene7FlashTemplatesRti(ConfigNodePropertyString scene7FlashTemplatesRti) {
        this.scene7FlashTemplatesRti = scene7FlashTemplatesRti;
    }

    /**
     * Get scene7FlashTemplatesRsi
     * @return scene7FlashTemplatesRsi
     */
    public ConfigNodePropertyString getScene7FlashTemplatesRsi() {
        return scene7FlashTemplatesRsi;
    }

    public void setScene7FlashTemplatesRsi(ConfigNodePropertyString scene7FlashTemplatesRsi) {
        this.scene7FlashTemplatesRsi = scene7FlashTemplatesRsi;
    }

    /**
     * Get scene7FlashTemplatesRb
     * @return scene7FlashTemplatesRb
     */
    public ConfigNodePropertyString getScene7FlashTemplatesRb() {
        return scene7FlashTemplatesRb;
    }

    public void setScene7FlashTemplatesRb(ConfigNodePropertyString scene7FlashTemplatesRb) {
        this.scene7FlashTemplatesRb = scene7FlashTemplatesRb;
    }

    /**
     * Get scene7FlashTemplatesRurl
     * @return scene7FlashTemplatesRurl
     */
    public ConfigNodePropertyString getScene7FlashTemplatesRurl() {
        return scene7FlashTemplatesRurl;
    }

    public void setScene7FlashTemplatesRurl(ConfigNodePropertyString scene7FlashTemplatesRurl) {
        this.scene7FlashTemplatesRurl = scene7FlashTemplatesRurl;
    }

    /**
     * Get scene7FlashTemplateUrlFormatParameter
     * @return scene7FlashTemplateUrlFormatParameter
     */
    public ConfigNodePropertyString getScene7FlashTemplateUrlFormatParameter() {
        return scene7FlashTemplateUrlFormatParameter;
    }

    public void setScene7FlashTemplateUrlFormatParameter(ConfigNodePropertyString scene7FlashTemplateUrlFormatParameter) {
        this.scene7FlashTemplateUrlFormatParameter = scene7FlashTemplateUrlFormatParameter;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamScene7ImplScene7FlashTemplatesServiceImplProperties {\n");
        
        sb.append("    scene7FlashTemplatesRti: ").append(toIndentedString(scene7FlashTemplatesRti)).append("\n");
        sb.append("    scene7FlashTemplatesRsi: ").append(toIndentedString(scene7FlashTemplatesRsi)).append("\n");
        sb.append("    scene7FlashTemplatesRb: ").append(toIndentedString(scene7FlashTemplatesRb)).append("\n");
        sb.append("    scene7FlashTemplatesRurl: ").append(toIndentedString(scene7FlashTemplatesRurl)).append("\n");
        sb.append("    scene7FlashTemplateUrlFormatParameter: ").append(toIndentedString(scene7FlashTemplateUrlFormatParameter)).append("\n");
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

