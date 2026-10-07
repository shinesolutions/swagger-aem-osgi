package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyDropDown;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheFelixJaasConfigurationFactoryProperties   {

    private ConfigNodePropertyDropDown jaasControlFlag;
    private ConfigNodePropertyInteger jaasRanking;
    private ConfigNodePropertyString jaasRealmName;
    private ConfigNodePropertyString jaasClassname;
    private ConfigNodePropertyArray jaasOptions;

    /**
     * Default constructor.
     */
    public OrgApacheFelixJaasConfigurationFactoryProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheFelixJaasConfigurationFactoryProperties.
     *
     * @param jaasControlFlag jaasControlFlag
     * @param jaasRanking jaasRanking
     * @param jaasRealmName jaasRealmName
     * @param jaasClassname jaasClassname
     * @param jaasOptions jaasOptions
     */
    public OrgApacheFelixJaasConfigurationFactoryProperties(
        ConfigNodePropertyDropDown jaasControlFlag, 
        ConfigNodePropertyInteger jaasRanking, 
        ConfigNodePropertyString jaasRealmName, 
        ConfigNodePropertyString jaasClassname, 
        ConfigNodePropertyArray jaasOptions
    ) {
        this.jaasControlFlag = jaasControlFlag;
        this.jaasRanking = jaasRanking;
        this.jaasRealmName = jaasRealmName;
        this.jaasClassname = jaasClassname;
        this.jaasOptions = jaasOptions;
    }



    /**
     * Get jaasControlFlag
     * @return jaasControlFlag
     */
    public ConfigNodePropertyDropDown getJaasControlFlag() {
        return jaasControlFlag;
    }

    public void setJaasControlFlag(ConfigNodePropertyDropDown jaasControlFlag) {
        this.jaasControlFlag = jaasControlFlag;
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
     * Get jaasClassname
     * @return jaasClassname
     */
    public ConfigNodePropertyString getJaasClassname() {
        return jaasClassname;
    }

    public void setJaasClassname(ConfigNodePropertyString jaasClassname) {
        this.jaasClassname = jaasClassname;
    }

    /**
     * Get jaasOptions
     * @return jaasOptions
     */
    public ConfigNodePropertyArray getJaasOptions() {
        return jaasOptions;
    }

    public void setJaasOptions(ConfigNodePropertyArray jaasOptions) {
        this.jaasOptions = jaasOptions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheFelixJaasConfigurationFactoryProperties {\n");
        
        sb.append("    jaasControlFlag: ").append(toIndentedString(jaasControlFlag)).append("\n");
        sb.append("    jaasRanking: ").append(toIndentedString(jaasRanking)).append("\n");
        sb.append("    jaasRealmName: ").append(toIndentedString(jaasRealmName)).append("\n");
        sb.append("    jaasClassname: ").append(toIndentedString(jaasClassname)).append("\n");
        sb.append("    jaasOptions: ").append(toIndentedString(jaasOptions)).append("\n");
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

