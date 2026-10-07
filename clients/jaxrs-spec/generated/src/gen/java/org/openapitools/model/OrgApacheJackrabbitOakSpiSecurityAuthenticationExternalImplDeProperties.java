package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;



@JsonTypeName("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2026-10-07T12:54:30.880189742Z[Etc/UTC]", comments = "Generator version: 7.24.0")
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

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties() {
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties handlerName(ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("handler.name")
  @Valid public ConfigNodePropertyString getHandlerName() {
    return handlerName;
  }

  @JsonProperty("handler.name")
  public void setHandlerName(ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userExpirationTime(ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.expirationTime")
  @Valid public ConfigNodePropertyString getUserExpirationTime() {
    return userExpirationTime;
  }

  @JsonProperty("user.expirationTime")
  public void setUserExpirationTime(ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userAutoMembership(ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.autoMembership")
  @Valid public ConfigNodePropertyArray getUserAutoMembership() {
    return userAutoMembership;
  }

  @JsonProperty("user.autoMembership")
  public void setUserAutoMembership(ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.propertyMapping")
  @Valid public ConfigNodePropertyArray getUserPropertyMapping() {
    return userPropertyMapping;
  }

  @JsonProperty("user.propertyMapping")
  public void setUserPropertyMapping(ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPathPrefix(ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.pathPrefix")
  @Valid public ConfigNodePropertyString getUserPathPrefix() {
    return userPathPrefix;
  }

  @JsonProperty("user.pathPrefix")
  public void setUserPathPrefix(ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.membershipExpTime")
  @Valid public ConfigNodePropertyString getUserMembershipExpTime() {
    return userMembershipExpTime;
  }

  @JsonProperty("user.membershipExpTime")
  public void setUserMembershipExpTime(ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.membershipNestingDepth")
  @Valid public ConfigNodePropertyInteger getUserMembershipNestingDepth() {
    return userMembershipNestingDepth;
  }

  @JsonProperty("user.membershipNestingDepth")
  public void setUserMembershipNestingDepth(ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.dynamicMembership")
  @Valid public ConfigNodePropertyBoolean getUserDynamicMembership() {
    return userDynamicMembership;
  }

  @JsonProperty("user.dynamicMembership")
  public void setUserDynamicMembership(ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("user.disableMissing")
  @Valid public ConfigNodePropertyBoolean getUserDisableMissing() {
    return userDisableMissing;
  }

  @JsonProperty("user.disableMissing")
  public void setUserDisableMissing(ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.expirationTime")
  @Valid public ConfigNodePropertyString getGroupExpirationTime() {
    return groupExpirationTime;
  }

  @JsonProperty("group.expirationTime")
  public void setGroupExpirationTime(ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.autoMembership")
  @Valid public ConfigNodePropertyArray getGroupAutoMembership() {
    return groupAutoMembership;
  }

  @JsonProperty("group.autoMembership")
  public void setGroupAutoMembership(ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.propertyMapping")
  @Valid public ConfigNodePropertyArray getGroupPropertyMapping() {
    return groupPropertyMapping;
  }

  @JsonProperty("group.propertyMapping")
  public void setGroupPropertyMapping(ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("group.pathPrefix")
  @Valid public ConfigNodePropertyString getGroupPathPrefix() {
    return groupPathPrefix;
  }

  @JsonProperty("group.pathPrefix")
  public void setGroupPathPrefix(ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
  }

  /**
   **/
  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties enableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  @Valid public ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public void setEnableRFC7613UsercaseMappedProfile(ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }


}
