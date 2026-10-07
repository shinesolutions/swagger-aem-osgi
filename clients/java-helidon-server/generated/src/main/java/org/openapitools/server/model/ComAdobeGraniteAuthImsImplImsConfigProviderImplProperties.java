package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties   {

    private ConfigNodePropertyString oauthConfigmanagerImsConfigid;
    private ConfigNodePropertyString imsOwningEntity;
    private ConfigNodePropertyString aemInstanceId;
    private ConfigNodePropertyString imsServiceCode;

    /**
     * Default constructor.
     */
    public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties.
     *
     * @param oauthConfigmanagerImsConfigid oauthConfigmanagerImsConfigid
     * @param imsOwningEntity imsOwningEntity
     * @param aemInstanceId aemInstanceId
     * @param imsServiceCode imsServiceCode
     */
    public ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties(
        ConfigNodePropertyString oauthConfigmanagerImsConfigid, 
        ConfigNodePropertyString imsOwningEntity, 
        ConfigNodePropertyString aemInstanceId, 
        ConfigNodePropertyString imsServiceCode
    ) {
        this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
        this.imsOwningEntity = imsOwningEntity;
        this.aemInstanceId = aemInstanceId;
        this.imsServiceCode = imsServiceCode;
    }



    /**
     * Get oauthConfigmanagerImsConfigid
     * @return oauthConfigmanagerImsConfigid
     */
    public ConfigNodePropertyString getOauthConfigmanagerImsConfigid() {
        return oauthConfigmanagerImsConfigid;
    }

    public void setOauthConfigmanagerImsConfigid(ConfigNodePropertyString oauthConfigmanagerImsConfigid) {
        this.oauthConfigmanagerImsConfigid = oauthConfigmanagerImsConfigid;
    }

    /**
     * Get imsOwningEntity
     * @return imsOwningEntity
     */
    public ConfigNodePropertyString getImsOwningEntity() {
        return imsOwningEntity;
    }

    public void setImsOwningEntity(ConfigNodePropertyString imsOwningEntity) {
        this.imsOwningEntity = imsOwningEntity;
    }

    /**
     * Get aemInstanceId
     * @return aemInstanceId
     */
    public ConfigNodePropertyString getAemInstanceId() {
        return aemInstanceId;
    }

    public void setAemInstanceId(ConfigNodePropertyString aemInstanceId) {
        this.aemInstanceId = aemInstanceId;
    }

    /**
     * Get imsServiceCode
     * @return imsServiceCode
     */
    public ConfigNodePropertyString getImsServiceCode() {
        return imsServiceCode;
    }

    public void setImsServiceCode(ConfigNodePropertyString imsServiceCode) {
        this.imsServiceCode = imsServiceCode;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ComAdobeGraniteAuthImsImplImsConfigProviderImplProperties {\n");
        
        sb.append("    oauthConfigmanagerImsConfigid: ").append(toIndentedString(oauthConfigmanagerImsConfigid)).append("\n");
        sb.append("    imsOwningEntity: ").append(toIndentedString(imsOwningEntity)).append("\n");
        sb.append("    aemInstanceId: ").append(toIndentedString(aemInstanceId)).append("\n");
        sb.append("    imsServiceCode: ").append(toIndentedString(imsServiceCode)).append("\n");
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

