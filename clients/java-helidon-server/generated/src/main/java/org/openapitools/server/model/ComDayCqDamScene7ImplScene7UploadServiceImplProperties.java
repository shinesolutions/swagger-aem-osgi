package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComDayCqDamScene7ImplScene7UploadServiceImplProperties   {

    private ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel;
    private ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel;

    /**
     * Default constructor.
     */
    public ComDayCqDamScene7ImplScene7UploadServiceImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComDayCqDamScene7ImplScene7UploadServiceImplProperties.
     *
     * @param cqDamScene7UploadserviceActivejobtimeoutLabel cqDamScene7UploadserviceActivejobtimeoutLabel
     * @param cqDamScene7UploadserviceConnectionmaxperrouteLabel cqDamScene7UploadserviceConnectionmaxperrouteLabel
     */
    public ComDayCqDamScene7ImplScene7UploadServiceImplProperties(
        ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel, 
        ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel
    ) {
        this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
        this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
    }



    /**
     * Get cqDamScene7UploadserviceActivejobtimeoutLabel
     * @return cqDamScene7UploadserviceActivejobtimeoutLabel
     */
    public ConfigNodePropertyInteger getCqDamScene7UploadserviceActivejobtimeoutLabel() {
        return cqDamScene7UploadserviceActivejobtimeoutLabel;
    }

    public void setCqDamScene7UploadserviceActivejobtimeoutLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceActivejobtimeoutLabel) {
        this.cqDamScene7UploadserviceActivejobtimeoutLabel = cqDamScene7UploadserviceActivejobtimeoutLabel;
    }

    /**
     * Get cqDamScene7UploadserviceConnectionmaxperrouteLabel
     * @return cqDamScene7UploadserviceConnectionmaxperrouteLabel
     */
    public ConfigNodePropertyInteger getCqDamScene7UploadserviceConnectionmaxperrouteLabel() {
        return cqDamScene7UploadserviceConnectionmaxperrouteLabel;
    }

    public void setCqDamScene7UploadserviceConnectionmaxperrouteLabel(ConfigNodePropertyInteger cqDamScene7UploadserviceConnectionmaxperrouteLabel) {
        this.cqDamScene7UploadserviceConnectionmaxperrouteLabel = cqDamScene7UploadserviceConnectionmaxperrouteLabel;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComDayCqDamScene7ImplScene7UploadServiceImplProperties {\n");
        
        sb.append("    cqDamScene7UploadserviceActivejobtimeoutLabel: ").append(toIndentedString(cqDamScene7UploadserviceActivejobtimeoutLabel)).append("\n");
        sb.append("    cqDamScene7UploadserviceConnectionmaxperrouteLabel: ").append(toIndentedString(cqDamScene7UploadserviceConnectionmaxperrouteLabel)).append("\n");
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

