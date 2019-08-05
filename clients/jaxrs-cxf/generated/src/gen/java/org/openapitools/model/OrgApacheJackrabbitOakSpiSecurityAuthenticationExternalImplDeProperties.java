package org.openapitools.model;

import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString handlerName = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userExpirationTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray userAutoMembership = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray userPropertyMapping = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userPathPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString userMembershipExpTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyInteger userMembershipNestingDepth = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean userDynamicMembership = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean userDisableMissing = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupExpirationTime = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray groupAutoMembership = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyArray groupPropertyMapping = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyString groupPathPrefix = null;

  @ApiModelProperty(value = "")
  @Valid
  private ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile = null;
 /**
   * Get handlerName
   * @return handlerName
  **/
  @JsonProperty("handler.name")
  public ConfigNodePropertyString getHandlerName() {
    return handlerName;
  }

  public void setHandlerName(ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties handlerName(ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
    return this;
  }

 /**
   * Get userExpirationTime
   * @return userExpirationTime
  **/
  @JsonProperty("user.expirationTime")
  public ConfigNodePropertyString getUserExpirationTime() {
    return userExpirationTime;
  }

  public void setUserExpirationTime(ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userExpirationTime(ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
    return this;
  }

 /**
   * Get userAutoMembership
   * @return userAutoMembership
  **/
  @JsonProperty("user.autoMembership")
  public ConfigNodePropertyArray getUserAutoMembership() {
    return userAutoMembership;
  }

  public void setUserAutoMembership(ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userAutoMembership(ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
    return this;
  }

 /**
   * Get userPropertyMapping
   * @return userPropertyMapping
  **/
  @JsonProperty("user.propertyMapping")
  public ConfigNodePropertyArray getUserPropertyMapping() {
    return userPropertyMapping;
  }

  public void setUserPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
    return this;
  }

 /**
   * Get userPathPrefix
   * @return userPathPrefix
  **/
  @JsonProperty("user.pathPrefix")
  public ConfigNodePropertyString getUserPathPrefix() {
    return userPathPrefix;
  }

  public void setUserPathPrefix(ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPathPrefix(ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
    return this;
  }

 /**
   * Get userMembershipExpTime
   * @return userMembershipExpTime
  **/
  @JsonProperty("user.membershipExpTime")
  public ConfigNodePropertyString getUserMembershipExpTime() {
    return userMembershipExpTime;
  }

  public void setUserMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
    return this;
  }

 /**
   * Get userMembershipNestingDepth
   * @return userMembershipNestingDepth
  **/
  @JsonProperty("user.membershipNestingDepth")
  public ConfigNodePropertyInteger getUserMembershipNestingDepth() {
    return userMembershipNestingDepth;
  }

  public void setUserMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
    return this;
  }

 /**
   * Get userDynamicMembership
   * @return userDynamicMembership
  **/
  @JsonProperty("user.dynamicMembership")
  public ConfigNodePropertyBoolean getUserDynamicMembership() {
    return userDynamicMembership;
  }

  public void setUserDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
    return this;
  }

 /**
   * Get userDisableMissing
   * @return userDisableMissing
  **/
  @JsonProperty("user.disableMissing")
  public ConfigNodePropertyBoolean getUserDisableMissing() {
    return userDisableMissing;
  }

  public void setUserDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
    return this;
  }

 /**
   * Get groupExpirationTime
   * @return groupExpirationTime
  **/
  @JsonProperty("group.expirationTime")
  public ConfigNodePropertyString getGroupExpirationTime() {
    return groupExpirationTime;
  }

  public void setGroupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
    return this;
  }

 /**
   * Get groupAutoMembership
   * @return groupAutoMembership
  **/
  @JsonProperty("group.autoMembership")
  public ConfigNodePropertyArray getGroupAutoMembership() {
    return groupAutoMembership;
  }

  public void setGroupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
    return this;
  }

 /**
   * Get groupPropertyMapping
   * @return groupPropertyMapping
  **/
  @JsonProperty("group.propertyMapping")
  public ConfigNodePropertyArray getGroupPropertyMapping() {
    return groupPropertyMapping;
  }

  public void setGroupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
    return this;
  }

 /**
   * Get groupPathPrefix
   * @return groupPathPrefix
  **/
  @JsonProperty("group.pathPrefix")
  public ConfigNodePropertyString getGroupPathPrefix() {
    return groupPathPrefix;
  }

  public void setGroupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
    return this;
  }

 /**
   * Get enableRFC7613UsercaseMappedProfile
   * @return enableRFC7613UsercaseMappedProfile
  **/
  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties enableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

