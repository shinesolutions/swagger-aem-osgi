package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.ConfigNodePropertyArray;
import org.openapitools.model.ConfigNodePropertyBoolean;
import org.openapitools.model.ConfigNodePropertyInteger;
import org.openapitools.model.ConfigNodePropertyString;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties
 */

@JsonTypeName("orgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-07T13:01:07.358715110Z[Etc/UTC]", comments = "Generator version: 7.24.0")
public class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString handlerName;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userExpirationTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray userAutoMembership;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray userPropertyMapping;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userPathPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString userMembershipExpTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyInteger userMembershipNestingDepth;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean userDynamicMembership;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean userDisableMissing;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupExpirationTime;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray groupAutoMembership;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyArray groupPropertyMapping;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyString groupPathPrefix;

  @JsonInclude(JsonInclude.Include.NON_NULL)
  private @Nullable ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile;

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties handlerName(@Nullable ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
    return this;
  }

  /**
   * Get handlerName
   * @return handlerName
   */
  @Valid 
  @Schema(name = "handler.name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("handler.name")
  public @Nullable ConfigNodePropertyString getHandlerName() {
    return handlerName;
  }

  @JsonProperty("handler.name")
  public void setHandlerName(@Nullable ConfigNodePropertyString handlerName) {
    this.handlerName = handlerName;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userExpirationTime(@Nullable ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
    return this;
  }

  /**
   * Get userExpirationTime
   * @return userExpirationTime
   */
  @Valid 
  @Schema(name = "user.expirationTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.expirationTime")
  public @Nullable ConfigNodePropertyString getUserExpirationTime() {
    return userExpirationTime;
  }

  @JsonProperty("user.expirationTime")
  public void setUserExpirationTime(@Nullable ConfigNodePropertyString userExpirationTime) {
    this.userExpirationTime = userExpirationTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userAutoMembership(@Nullable ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
    return this;
  }

  /**
   * Get userAutoMembership
   * @return userAutoMembership
   */
  @Valid 
  @Schema(name = "user.autoMembership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.autoMembership")
  public @Nullable ConfigNodePropertyArray getUserAutoMembership() {
    return userAutoMembership;
  }

  @JsonProperty("user.autoMembership")
  public void setUserAutoMembership(@Nullable ConfigNodePropertyArray userAutoMembership) {
    this.userAutoMembership = userAutoMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPropertyMapping(@Nullable ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
    return this;
  }

  /**
   * Get userPropertyMapping
   * @return userPropertyMapping
   */
  @Valid 
  @Schema(name = "user.propertyMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.propertyMapping")
  public @Nullable ConfigNodePropertyArray getUserPropertyMapping() {
    return userPropertyMapping;
  }

  @JsonProperty("user.propertyMapping")
  public void setUserPropertyMapping(@Nullable ConfigNodePropertyArray userPropertyMapping) {
    this.userPropertyMapping = userPropertyMapping;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userPathPrefix(@Nullable ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
    return this;
  }

  /**
   * Get userPathPrefix
   * @return userPathPrefix
   */
  @Valid 
  @Schema(name = "user.pathPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.pathPrefix")
  public @Nullable ConfigNodePropertyString getUserPathPrefix() {
    return userPathPrefix;
  }

  @JsonProperty("user.pathPrefix")
  public void setUserPathPrefix(@Nullable ConfigNodePropertyString userPathPrefix) {
    this.userPathPrefix = userPathPrefix;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipExpTime(@Nullable ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
    return this;
  }

  /**
   * Get userMembershipExpTime
   * @return userMembershipExpTime
   */
  @Valid 
  @Schema(name = "user.membershipExpTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.membershipExpTime")
  public @Nullable ConfigNodePropertyString getUserMembershipExpTime() {
    return userMembershipExpTime;
  }

  @JsonProperty("user.membershipExpTime")
  public void setUserMembershipExpTime(@Nullable ConfigNodePropertyString userMembershipExpTime) {
    this.userMembershipExpTime = userMembershipExpTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userMembershipNestingDepth(@Nullable ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
    return this;
  }

  /**
   * Get userMembershipNestingDepth
   * @return userMembershipNestingDepth
   */
  @Valid 
  @Schema(name = "user.membershipNestingDepth", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.membershipNestingDepth")
  public @Nullable ConfigNodePropertyInteger getUserMembershipNestingDepth() {
    return userMembershipNestingDepth;
  }

  @JsonProperty("user.membershipNestingDepth")
  public void setUserMembershipNestingDepth(@Nullable ConfigNodePropertyInteger userMembershipNestingDepth) {
    this.userMembershipNestingDepth = userMembershipNestingDepth;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDynamicMembership(@Nullable ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
    return this;
  }

  /**
   * Get userDynamicMembership
   * @return userDynamicMembership
   */
  @Valid 
  @Schema(name = "user.dynamicMembership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.dynamicMembership")
  public @Nullable ConfigNodePropertyBoolean getUserDynamicMembership() {
    return userDynamicMembership;
  }

  @JsonProperty("user.dynamicMembership")
  public void setUserDynamicMembership(@Nullable ConfigNodePropertyBoolean userDynamicMembership) {
    this.userDynamicMembership = userDynamicMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties userDisableMissing(@Nullable ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
    return this;
  }

  /**
   * Get userDisableMissing
   * @return userDisableMissing
   */
  @Valid 
  @Schema(name = "user.disableMissing", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user.disableMissing")
  public @Nullable ConfigNodePropertyBoolean getUserDisableMissing() {
    return userDisableMissing;
  }

  @JsonProperty("user.disableMissing")
  public void setUserDisableMissing(@Nullable ConfigNodePropertyBoolean userDisableMissing) {
    this.userDisableMissing = userDisableMissing;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupExpirationTime(@Nullable ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
    return this;
  }

  /**
   * Get groupExpirationTime
   * @return groupExpirationTime
   */
  @Valid 
  @Schema(name = "group.expirationTime", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.expirationTime")
  public @Nullable ConfigNodePropertyString getGroupExpirationTime() {
    return groupExpirationTime;
  }

  @JsonProperty("group.expirationTime")
  public void setGroupExpirationTime(@Nullable ConfigNodePropertyString groupExpirationTime) {
    this.groupExpirationTime = groupExpirationTime;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupAutoMembership(@Nullable ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
    return this;
  }

  /**
   * Get groupAutoMembership
   * @return groupAutoMembership
   */
  @Valid 
  @Schema(name = "group.autoMembership", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.autoMembership")
  public @Nullable ConfigNodePropertyArray getGroupAutoMembership() {
    return groupAutoMembership;
  }

  @JsonProperty("group.autoMembership")
  public void setGroupAutoMembership(@Nullable ConfigNodePropertyArray groupAutoMembership) {
    this.groupAutoMembership = groupAutoMembership;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPropertyMapping(@Nullable ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
    return this;
  }

  /**
   * Get groupPropertyMapping
   * @return groupPropertyMapping
   */
  @Valid 
  @Schema(name = "group.propertyMapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.propertyMapping")
  public @Nullable ConfigNodePropertyArray getGroupPropertyMapping() {
    return groupPropertyMapping;
  }

  @JsonProperty("group.propertyMapping")
  public void setGroupPropertyMapping(@Nullable ConfigNodePropertyArray groupPropertyMapping) {
    this.groupPropertyMapping = groupPropertyMapping;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties groupPathPrefix(@Nullable ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
    return this;
  }

  /**
   * Get groupPathPrefix
   * @return groupPathPrefix
   */
  @Valid 
  @Schema(name = "group.pathPrefix", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("group.pathPrefix")
  public @Nullable ConfigNodePropertyString getGroupPathPrefix() {
    return groupPathPrefix;
  }

  @JsonProperty("group.pathPrefix")
  public void setGroupPathPrefix(@Nullable ConfigNodePropertyString groupPathPrefix) {
    this.groupPathPrefix = groupPathPrefix;
  }

  public OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties enableRFC7613UsercaseMappedProfile(@Nullable ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
    this.enableRFC7613UsercaseMappedProfile = enableRFC7613UsercaseMappedProfile;
    return this;
  }

  /**
   * Get enableRFC7613UsercaseMappedProfile
   * @return enableRFC7613UsercaseMappedProfile
   */
  @Valid 
  @Schema(name = "enableRFC7613UsercaseMappedProfile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public @Nullable ConfigNodePropertyBoolean getEnableRFC7613UsercaseMappedProfile() {
    return enableRFC7613UsercaseMappedProfile;
  }

  @JsonProperty("enableRFC7613UsercaseMappedProfile")
  public void setEnableRFC7613UsercaseMappedProfile(@Nullable ConfigNodePropertyBoolean enableRFC7613UsercaseMappedProfile) {
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
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

