package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.server.model.ConfigNodePropertyArray;
import org.openapitools.server.model.ConfigNodePropertyBoolean;
import org.openapitools.server.model.ConfigNodePropertyInteger;
import org.openapitools.server.model.ConfigNodePropertyString;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties   {

    private ConfigNodePropertyString handlerName;
    private ConfigNodePropertyString userExpirationTime;
    private ConfigNodePropertyArray userAutoMembership;
    private ConfigNodePropertyArray userPropertyMapping;
    private ConfigNodePropertyString userPathPrefix;
    private ConfigNodePropertyString userMembershipExpTime;
    private ConfigNodePropertyInteger userMembershipNestingDepth;
    private ConfigNodePropertyBoolean userDynamicMembership;
    private ConfigNodePropertyBoolean userDisableMissing;
    private ConfigNodePropertyString groupExpirationTime;
    private ConfigNodePropertyArray groupAutoMembership;
    private ConfigNodePropertyArray groupPropertyMapping;
    private ConfigNodePropertyString groupPathPrefix;
    private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;

    /**
     * Default constructor.
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties() {
    // JSON-B / Jackson
    }

    /**
     * Create OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.
     *
     * @param handlerName handlerName
     * @param userExpirationTime userExpirationTime
     * @param userAutoMembership userAutoMembership
     * @param userPropertyMapping userPropertyMapping
     * @param userPathPrefix userPathPrefix
     * @param userMembershipExpTime userMembershipExpTime
     * @param userMembershipNestingDepth userMembershipNestingDepth
     * @param userDynamicMembership userDynamicMembership
     * @param userDisableMissing userDisableMissing
     * @param groupExpirationTime groupExpirationTime
     * @param groupAutoMembership groupAutoMembership
     * @param groupPropertyMapping groupPropertyMapping
     * @param groupPathPrefix groupPathPrefix
     * @param enableRFC7613UsercaseMappedProfile enableRFC7613UsercaseMappedProfile
     */
    public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties(
        ConfigNodePropertyString handlerName, 
        ConfigNodePropertyString userExpirationTime, 
        ConfigNodePropertyArray userAutoMembership, 
        ConfigNodePropertyArray userPropertyMapping, 
        ConfigNodePropertyString userPathPrefix, 
        ConfigNodePropertyString userMembershipExpTime, 
        ConfigNodePropertyInteger userMembershipNestingDepth, 
        ConfigNodePropertyBoolean userDynamicMembership, 
        ConfigNodePropertyBoolean userDisableMissing, 
        ConfigNodePropertyString groupExpirationTime, 
        ConfigNodePropertyArray groupAutoMembership, 
        ConfigNodePropertyArray groupPropertyMapping, 
        ConfigNodePropertyString groupPathPrefix, 
        ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile
    ) {
        this.handlerName = handlerName;
        this.userExpirationTime = userExpirationTime;
        this.userAutoMembership = userAutoMembership;
        this.userPropertyMapping = userPropertyMapping;
        this.userPathPrefix = userPathPrefix;
        this.userMembershipExpTime = userMembershipExpTime;
        this.userMembershipNestingDepth = userMembershipNestingDepth;
        this.userDynamicMembership = userDynamicMembership;
        this.userDisableMissing = userDisableMissing;
        this.groupExpirationTime = groupExpirationTime;
        this.groupAutoMembership = groupAutoMembership;
        this.groupPropertyMapping = groupPropertyMapping;
        this.groupPathPrefix = groupPathPrefix;
        this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    }



    /**
     * Get handlerName
     * @return handlerName
     */
    public ConfigNodePropertyString getHandlerName() {
        return handlerName;
    }

    public void setHandlerName(ConfigNodePropertyString handlerName) {
        this.handlerName = handlerName;
    }

    /**
     * Get userExpirationTime
     * @return userExpirationTime
     */
    public ConfigNodePropertyString getUserExpirationTime() {
        return userExpirationTime;
    }

    public void setUserExpirationTime(ConfigNodePropertyString userExpirationTime) {
        this.userExpirationTime = userExpirationTime;
    }

    /**
     * Get userAutoMembership
     * @return userAutoMembership
     */
    public ConfigNodePropertyArray getUserAutoMembership() {
        return userAutoMembership;
    }

    public void setUserAutoMembership(ConfigNodePropertyArray userAutoMembership) {
        this.userAutoMembership = userAutoMembership;
    }

    /**
     * Get userPropertyMapping
     * @return userPropertyMapping
     */
    public ConfigNodePropertyArray getUserPropertyMapping() {
        return userPropertyMapping;
    }

    public void setUserPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
        this.userPropertyMapping = userPropertyMapping;
    }

    /**
     * Get userPathPrefix
     * @return userPathPrefix
     */
    public ConfigNodePropertyString getUserPathPrefix() {
        return userPathPrefix;
    }

    public void setUserPathPrefix(ConfigNodePropertyString userPathPrefix) {
        this.userPathPrefix = userPathPrefix;
    }

    /**
     * Get userMembershipExpTime
     * @return userMembershipExpTime
     */
    public ConfigNodePropertyString getUserMembershipExpTime() {
        return userMembershipExpTime;
    }

    public void setUserMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
        this.userMembershipExpTime = userMembershipExpTime;
    }

    /**
     * Get userMembershipNestingDepth
     * @return userMembershipNestingDepth
     */
    public ConfigNodePropertyInteger getUserMembershipNestingDepth() {
        return userMembershipNestingDepth;
    }

    public void setUserMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
        this.userMembershipNestingDepth = userMembershipNestingDepth;
    }

    /**
     * Get userDynamicMembership
     * @return userDynamicMembership
     */
    public ConfigNodePropertyBoolean getUserDynamicMembership() {
        return userDynamicMembership;
    }

    public void setUserDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
        this.userDynamicMembership = userDynamicMembership;
    }

    /**
     * Get userDisableMissing
     * @return userDisableMissing
     */
    public ConfigNodePropertyBoolean getUserDisableMissing() {
        return userDisableMissing;
    }

    public void setUserDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
        this.userDisableMissing = userDisableMissing;
    }

    /**
     * Get groupExpirationTime
     * @return groupExpirationTime
     */
    public ConfigNodePropertyString getGroupExpirationTime() {
        return groupExpirationTime;
    }

    public void setGroupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
        this.groupExpirationTime = groupExpirationTime;
    }

    /**
     * Get groupAutoMembership
     * @return groupAutoMembership
     */
    public ConfigNodePropertyArray getGroupAutoMembership() {
        return groupAutoMembership;
    }

    public void setGroupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
        this.groupAutoMembership = groupAutoMembership;
    }

    /**
     * Get groupPropertyMapping
     * @return groupPropertyMapping
     */
    public ConfigNodePropertyArray getGroupPropertyMapping() {
        return groupPropertyMapping;
    }

    public void setGroupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
        this.groupPropertyMapping = groupPropertyMapping;
    }

    /**
     * Get groupPathPrefix
     * @return groupPathPrefix
     */
    public ConfigNodePropertyString getGroupPathPrefix() {
        return groupPathPrefix;
    }

    public void setGroupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
        this.groupPathPrefix = groupPathPrefix;
    }

    /**
     * Get enableRFC7613UsercaseMappedProfile
     * @return enableRFC7613UsercaseMappedProfile
     */
    public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
        return enableRFC7613UsercaseMappedProfile;
    }

    public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
        this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {\n");
        
        sb.append("    handlerName: ").append(toIndentedString(handlerName)).append("\n");
        sb.append("    userExpirationTime: ").append(toIndentedString(userExpirationTime)).append("\n");
        sb.append("    userAutoMembership: ").append(toIndentedString(userAutoMembership)).append("\n");
        sb.append("    userPropertyMapping: ").append(toIndentedString(userPropertyMapping)).append("\n");
        sb.append("    userPathPrefix: ").append(toIndentedString(userPathPrefix)).append("\n");
        sb.append("    userMembershipExpTime: ").append(toIndentedString(userMembershipExpTime)).append("\n");
        sb.append("    userMembershipNestingDepth: ").append(toIndentedString(userMembershipNestingDepth)).append("\n");
        sb.append("    userDynamicMembership: ").append(toIndentedString(userDynamicMembership)).append("\n");
        sb.append("    userDisableMissing: ").append(toIndentedString(userDisableMissing)).append("\n");
        sb.append("    groupExpirationTime: ").append(toIndentedString(groupExpirationTime)).append("\n");
        sb.append("    groupAutoMembership: ").append(toIndentedString(groupAutoMembership)).append("\n");
        sb.append("    groupPropertyMapping: ").append(toIndentedString(groupPropertyMapping)).append("\n");
        sb.append("    groupPathPrefix: ").append(toIndentedString(groupPathPrefix)).append("\n");
        sb.append("    enableRFC7613UsercaseMappedProfile: ").append(toIndentedString(enableRFC7613UsercaseMappedProfile)).append("\n");
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

