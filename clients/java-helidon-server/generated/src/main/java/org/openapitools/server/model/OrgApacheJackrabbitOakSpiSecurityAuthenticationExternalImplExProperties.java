package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties   {

    private ConfigNodePropertyInteger jaasRanking;
    private ConfigNodePropertyString jaasControlFlag;
    private ConfigNodePropertyString jaasRealmName;
    private ConfigNodePropertyString idpName;
    private ConfigNodePropertyString syncHandlerName;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties.
     *
     * @param jaasRanking jaasRanking
     * @param jaasControlFlag jaasControlFlag
     * @param jaasRealmName jaasRealmName
     * @param idpName idpName
     * @param syncHandlerName syncHandlerName
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties(
        ConfigNodePropertyInteger jaasRanking, 
        ConfigNodePropertyString jaasControlFlag, 
        ConfigNodePropertyString jaasRealmName, 
        ConfigNodePropertyString idpName, 
        ConfigNodePropertyString syncHandlerName
    ) {
        this.jaasRanking = jaasRanking;
        this.jaasControlFlag = jaasControlFlag;
        this.jaasRealmName = jaasRealmName;
        this.idpName = idpName;
        this.syncHandlerName = syncHandlerName;
    }



    /**
     * Get jaasRanking
     * @return jaasRanking
     */
    public ConfigNodePropertyInteger getJaasRanking() {
        return jaasRanking;
    }

    public void setJaasRanking(ConfigNodePropertyInteger jaasRanking) {
        this.jaasRanking = jaasRanking;
    }

    /**
     * Get jaasControlFlag
     * @return jaasControlFlag
     */
    public ConfigNodePropertyString getJaasControlFlag() {
        return jaasControlFlag;
    }

    public void setJaasControlFlag(ConfigNodePropertyString jaasControlFlag) {
        this.jaasControlFlag = jaasControlFlag;
    }

    /**
     * Get jaasRealmName
     * @return jaasRealmName
     */
    public ConfigNodePropertyString getJaasRealmName() {
        return jaasRealmName;
    }

    public void setJaasRealmName(ConfigNodePropertyString jaasRealmName) {
        this.jaasRealmName = jaasRealmName;
    }

    /**
     * Get idpName
     * @return idpName
     */
    public ConfigNodePropertyString getIdpName() {
        return idpName;
    }

    public void setIdpName(ConfigNodePropertyString idpName) {
        this.idpName = idpName;
    }

    /**
     * Get syncHandlerName
     * @return syncHandlerName
     */
    public ConfigNodePropertyString getSyncHandlerName() {
        return syncHandlerName;
    }

    public void setSyncHandlerName(ConfigNodePropertyString syncHandlerName) {
        this.syncHandlerName = syncHandlerName;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplExProperties {\n");
        
        sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
        sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
        sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
        sb.append("    idpName: ").append(toIndentedString(idpName)).append("\n");
        sb.append("    syncHandlerName: ").append(toIndentedString(syncHandlerName)).append("\n");
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

