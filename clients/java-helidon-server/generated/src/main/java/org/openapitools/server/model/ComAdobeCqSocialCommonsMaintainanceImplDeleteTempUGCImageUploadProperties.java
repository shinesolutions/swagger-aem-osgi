package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties   {

    private ConfigNodePropertyInteger numberOfDays;
    private ConfigNodePropertyInteger ageOfFile;

    /**
     * Default constructor.
     */
    public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties.
     *
     * @param numberOfDays numberOfDays
     * @param ageOfFile ageOfFile
     */
    public ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties(
        ConfigNodePropertyInteger numberOfDays, 
        ConfigNodePropertyInteger ageOfFile
    ) {
        this.numberOfDays = numberOfDays;
        this.ageOfFile = ageOfFile;
    }



    /**
     * Get numberOfDays
     * @return numberOfDays
     */
    public ConfigNodePropertyInteger getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(ConfigNodePropertyInteger numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    /**
     * Get ageOfFile
     * @return ageOfFile
     */
    public ConfigNodePropertyInteger getAgeOfFile() {
        return ageOfFile;
    }

    public void setAgeOfFile(ConfigNodePropertyInteger ageOfFile) {
        this.ageOfFile = ageOfFile;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeCqSocialCommonsMaintainanceImplDeleteTempUGCImageUploadProperties {\n");
        
        sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
        sb.append("    ageOfFile: ").append(toIndentedString(ageOfFile)).append("\n");
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

