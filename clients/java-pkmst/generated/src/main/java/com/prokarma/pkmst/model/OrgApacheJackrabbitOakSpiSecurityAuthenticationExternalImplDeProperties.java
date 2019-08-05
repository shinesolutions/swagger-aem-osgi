package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ConfigNodePropertyArray;
import com.prokarma.pkmst.model.ConfigNodePropertyBoolean;
import com.prokarma.pkmst.model.ConfigNodePropertyInteger;
import com.prokarma.pkmst.model.ConfigNodePropertyString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2019-08-05T00:55:06.958Z[GMT]")

public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties   {
  @JsonProperty("handler.name")
  private ConfigNodePropertyString handlerName = null;

  @JsonProperty("user.expirationTime")
  private ConfigNodePropertyString userExpirationTime = null;

  @JsonProperty("user.autoMembership")
  private ConfigNodePropertyArray userAutoMembership = null;

  @JsonProperty("user.propertyMapping")
  private ConfigNodePropertyArray userPropertyMapping = null;

  @JsonProperty("user.pathPrefix")
  private ConfigNodePropertyString userPathPrefix = null;

  @JsonProperty("user.membershipExpTime")
  private ConfigNodePropertyString userMembershipExpTime = null;

  @JsonProperty("user.membershipNestingDepth")
  private ConfigNodePropertyInteger userMembershipNestingDepth = null;

  @JsonProperty("user.dynamicMembership")
  private ConfigNodePropertyBoolean userDynamicMembership = null;

  @JsonProperty("user.disableMissing")
  private ConfigNodePropertyBoolean userDisableMissing = null;

  @JsonProperty("group.expirationTime")
  private ConfigNodePropertyString groupExpirationTime = null;

  @JsonProperty("group.autoMembership")
  private ConfigNodePropertyArray groupAutoMembership = null;

  @JsonProperty("group.propertyMapping")
  private ConfigNodePropertyArray groupPropertyMapping = null;

  @JsonProperty("group.pathPrefix")
  private ConfigNodePropertyString groupPathPrefix = null;

  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile = null;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties handlerName(ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
    return this;
  }

   /**
   * Get handlerName
   * @return handlerName
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getHandlerName() {
    return handlerName;
  }

  public void setHandlerName(ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userExpirationTime(ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
    return this;
  }

   /**
   * Get userExpirationTime
   * @return userExpirationTime
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserExpirationTime() {
    return userExpirationTime;
  }

  public void setUserExpirationTime(ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userAutoMembership(ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
    return this;
  }

   /**
   * Get userAutoMembership
   * @return userAutoMembership
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getUserAutoMembership() {
    return userAutoMembership;
  }

  public void setUserAutoMembership(ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
    return this;
  }

   /**
   * Get userPropertyMapping
   * @return userPropertyMapping
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getUserPropertyMapping() {
    return userPropertyMapping;
  }

  public void setUserPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPathPrefix(ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
    return this;
  }

   /**
   * Get userPathPrefix
   * @return userPathPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserPathPrefix() {
    return userPathPrefix;
  }

  public void setUserPathPrefix(ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
    return this;
  }

   /**
   * Get userMembershipExpTime
   * @return userMembershipExpTime
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getUserMembershipExpTime() {
    return userMembershipExpTime;
  }

  public void setUserMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
    return this;
  }

   /**
   * Get userMembershipNestingDepth
   * @return userMembershipNestingDepth
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyInteger getUserMembershipNestingDepth() {
    return userMembershipNestingDepth;
  }

  public void setUserMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
    return this;
  }

   /**
   * Get userDynamicMembership
   * @return userDynamicMembership
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUserDynamicMembership() {
    return userDynamicMembership;
  }

  public void setUserDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
    return this;
  }

   /**
   * Get userDisableMissing
   * @return userDisableMissing
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getUserDisableMissing() {
    return userDisableMissing;
  }

  public void setUserDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
    return this;
  }

   /**
   * Get groupExpirationTime
   * @return groupExpirationTime
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupExpirationTime() {
    return groupExpirationTime;
  }

  public void setGroupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
    return this;
  }

   /**
   * Get groupAutoMembership
   * @return groupAutoMembership
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getGroupAutoMembership() {
    return groupAutoMembership;
  }

  public void setGroupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
    return this;
  }

   /**
   * Get groupPropertyMapping
   * @return groupPropertyMapping
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyArray getGroupPropertyMapping() {
    return groupPropertyMapping;
  }

  public void setGroupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
    return this;
  }

   /**
   * Get groupPathPrefix
   * @return groupPathPrefix
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyString getGroupPathPrefix() {
    return groupPathPrefix;
  }

  public void setGroupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties enableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    return this;
  }

   /**
   * Get enableRFC7613UsercaseMappedProfile
   * @return enableRFC7613UsercaseMappedProfile
  **/
  @ApiModelProperty(value = "")
  public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties = (OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties) o;
    return Objects.equals(this.handlerName, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.handlerName) &&
        Objects.equals(this.userExpirationTime, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userExpirationTime) &&
        Objects.equals(this.userAutoMembership, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userAutoMembership) &&
        Objects.equals(this.userPropertyMapping, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userPropertyMapping) &&
        Objects.equals(this.userPathPrefix, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userPathPrefix) &&
        Objects.equals(this.userMembershipExpTime, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userMembershipExpTime) &&
        Objects.equals(this.userMembershipNestingDepth, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userMembershipNestingDepth) &&
        Objects.equals(this.userDynamicMembership, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userDynamicMembership) &&
        Objects.equals(this.userDisableMissing, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.userDisableMissing) &&
        Objects.equals(this.groupExpirationTime, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.groupExpirationTime) &&
        Objects.equals(this.groupAutoMembership, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.groupAutoMembership) &&
        Objects.equals(this.groupPropertyMapping, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.groupPropertyMapping) &&
        Objects.equals(this.groupPathPrefix, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.groupPathPrefix) &&
        Objects.equals(this.enableRFC7613UsercaseMappedProfile, orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties.enableRFC7613UsercaseMappedProfile);
  }

  @Override
  public int hashCode() {
    return Objects.hash(handlerName, userExpirationTime, userAutoMembership, userPropertyMapping, userPathPrefix, userMembershipExpTime, userMembershipNestingDepth, userDynamicMembership, userDisableMissing, groupExpirationTime, groupAutoMembership, groupPropertyMapping, groupPathPrefix, enableRFC7613UsercaseMappedProfile);
  }

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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

