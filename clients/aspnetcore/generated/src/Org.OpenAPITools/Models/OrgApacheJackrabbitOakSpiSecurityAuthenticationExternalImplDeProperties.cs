/*
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// 
    /// </summary>
    [DataContract]
    public partial class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties : IEquatable<OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties>
    { 
        /// <summary>
        /// Gets or Sets HandlerName
        /// </summary>
        [DataMember(Name="handler.name")]
        public ConfigNodePropertyString HandlerName { get; set; }

        /// <summary>
        /// Gets or Sets UserExpirationTime
        /// </summary>
        [DataMember(Name="user.expirationTime")]
        public ConfigNodePropertyString UserExpirationTime { get; set; }

        /// <summary>
        /// Gets or Sets UserAutoMembership
        /// </summary>
        [DataMember(Name="user.autoMembership")]
        public ConfigNodePropertyArray UserAutoMembership { get; set; }

        /// <summary>
        /// Gets or Sets UserPropertyMapping
        /// </summary>
        [DataMember(Name="user.propertyMapping")]
        public ConfigNodePropertyArray UserPropertyMapping { get; set; }

        /// <summary>
        /// Gets or Sets UserPathPrefix
        /// </summary>
        [DataMember(Name="user.pathPrefix")]
        public ConfigNodePropertyString UserPathPrefix { get; set; }

        /// <summary>
        /// Gets or Sets UserMembershipExpTime
        /// </summary>
        [DataMember(Name="user.membershipExpTime")]
        public ConfigNodePropertyString UserMembershipExpTime { get; set; }

        /// <summary>
        /// Gets or Sets UserMembershipNestingDepth
        /// </summary>
        [DataMember(Name="user.membershipNestingDepth")]
        public ConfigNodePropertyInteger UserMembershipNestingDepth { get; set; }

        /// <summary>
        /// Gets or Sets UserDynamicMembership
        /// </summary>
        [DataMember(Name="user.dynamicMembership")]
        public ConfigNodePropertyBoolean UserDynamicMembership { get; set; }

        /// <summary>
        /// Gets or Sets UserDisableMissing
        /// </summary>
        [DataMember(Name="user.disableMissing")]
        public ConfigNodePropertyBoolean UserDisableMissing { get; set; }

        /// <summary>
        /// Gets or Sets GroupExpirationTime
        /// </summary>
        [DataMember(Name="group.expirationTime")]
        public ConfigNodePropertyString GroupExpirationTime { get; set; }

        /// <summary>
        /// Gets or Sets GroupAutoMembership
        /// </summary>
        [DataMember(Name="group.autoMembership")]
        public ConfigNodePropertyArray GroupAutoMembership { get; set; }

        /// <summary>
        /// Gets or Sets GroupPropertyMapping
        /// </summary>
        [DataMember(Name="group.propertyMapping")]
        public ConfigNodePropertyArray GroupPropertyMapping { get; set; }

        /// <summary>
        /// Gets or Sets GroupPathPrefix
        /// </summary>
        [DataMember(Name="group.pathPrefix")]
        public ConfigNodePropertyString GroupPathPrefix { get; set; }

        /// <summary>
        /// Gets or Sets EnableRFC7613UsercaseMappedProfile
        /// </summary>
        [DataMember(Name="enableRFC7613UsercaseMappedProfile")]
        public ConfigNodePropertyBoolean EnableRFC7613UsercaseMappedProfile { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties {\n");
            sb.Append("  HandlerName: ").Append(HandlerName).Append("\n");
            sb.Append("  UserExpirationTime: ").Append(UserExpirationTime).Append("\n");
            sb.Append("  UserAutoMembership: ").Append(UserAutoMembership).Append("\n");
            sb.Append("  UserPropertyMapping: ").Append(UserPropertyMapping).Append("\n");
            sb.Append("  UserPathPrefix: ").Append(UserPathPrefix).Append("\n");
            sb.Append("  UserMembershipExpTime: ").Append(UserMembershipExpTime).Append("\n");
            sb.Append("  UserMembershipNestingDepth: ").Append(UserMembershipNestingDepth).Append("\n");
            sb.Append("  UserDynamicMembership: ").Append(UserDynamicMembership).Append("\n");
            sb.Append("  UserDisableMissing: ").Append(UserDisableMissing).Append("\n");
            sb.Append("  GroupExpirationTime: ").Append(GroupExpirationTime).Append("\n");
            sb.Append("  GroupAutoMembership: ").Append(GroupAutoMembership).Append("\n");
            sb.Append("  GroupPropertyMapping: ").Append(GroupPropertyMapping).Append("\n");
            sb.Append("  GroupPathPrefix: ").Append(GroupPathPrefix).Append("\n");
            sb.Append("  EnableRFC7613UsercaseMappedProfile: ").Append(EnableRFC7613UsercaseMappedProfile).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties)obj);
        }

        /// <summary>
        /// Returns true if OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    HandlerName == other.HandlerName ||
                    HandlerName != null &&
                    HandlerName.Equals(other.HandlerName)
                ) && 
                (
                    UserExpirationTime == other.UserExpirationTime ||
                    UserExpirationTime != null &&
                    UserExpirationTime.Equals(other.UserExpirationTime)
                ) && 
                (
                    UserAutoMembership == other.UserAutoMembership ||
                    UserAutoMembership != null &&
                    UserAutoMembership.Equals(other.UserAutoMembership)
                ) && 
                (
                    UserPropertyMapping == other.UserPropertyMapping ||
                    UserPropertyMapping != null &&
                    UserPropertyMapping.Equals(other.UserPropertyMapping)
                ) && 
                (
                    UserPathPrefix == other.UserPathPrefix ||
                    UserPathPrefix != null &&
                    UserPathPrefix.Equals(other.UserPathPrefix)
                ) && 
                (
                    UserMembershipExpTime == other.UserMembershipExpTime ||
                    UserMembershipExpTime != null &&
                    UserMembershipExpTime.Equals(other.UserMembershipExpTime)
                ) && 
                (
                    UserMembershipNestingDepth == other.UserMembershipNestingDepth ||
                    UserMembershipNestingDepth != null &&
                    UserMembershipNestingDepth.Equals(other.UserMembershipNestingDepth)
                ) && 
                (
                    UserDynamicMembership == other.UserDynamicMembership ||
                    UserDynamicMembership != null &&
                    UserDynamicMembership.Equals(other.UserDynamicMembership)
                ) && 
                (
                    UserDisableMissing == other.UserDisableMissing ||
                    UserDisableMissing != null &&
                    UserDisableMissing.Equals(other.UserDisableMissing)
                ) && 
                (
                    GroupExpirationTime == other.GroupExpirationTime ||
                    GroupExpirationTime != null &&
                    GroupExpirationTime.Equals(other.GroupExpirationTime)
                ) && 
                (
                    GroupAutoMembership == other.GroupAutoMembership ||
                    GroupAutoMembership != null &&
                    GroupAutoMembership.Equals(other.GroupAutoMembership)
                ) && 
                (
                    GroupPropertyMapping == other.GroupPropertyMapping ||
                    GroupPropertyMapping != null &&
                    GroupPropertyMapping.Equals(other.GroupPropertyMapping)
                ) && 
                (
                    GroupPathPrefix == other.GroupPathPrefix ||
                    GroupPathPrefix != null &&
                    GroupPathPrefix.Equals(other.GroupPathPrefix)
                ) && 
                (
                    EnableRFC7613UsercaseMappedProfile == other.EnableRFC7613UsercaseMappedProfile ||
                    EnableRFC7613UsercaseMappedProfile != null &&
                    EnableRFC7613UsercaseMappedProfile.Equals(other.EnableRFC7613UsercaseMappedProfile)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (HandlerName != null)
                    hashCode = hashCode * 59 + HandlerName.GetHashCode();
                    if (UserExpirationTime != null)
                    hashCode = hashCode * 59 + UserExpirationTime.GetHashCode();
                    if (UserAutoMembership != null)
                    hashCode = hashCode * 59 + UserAutoMembership.GetHashCode();
                    if (UserPropertyMapping != null)
                    hashCode = hashCode * 59 + UserPropertyMapping.GetHashCode();
                    if (UserPathPrefix != null)
                    hashCode = hashCode * 59 + UserPathPrefix.GetHashCode();
                    if (UserMembershipExpTime != null)
                    hashCode = hashCode * 59 + UserMembershipExpTime.GetHashCode();
                    if (UserMembershipNestingDepth != null)
                    hashCode = hashCode * 59 + UserMembershipNestingDepth.GetHashCode();
                    if (UserDynamicMembership != null)
                    hashCode = hashCode * 59 + UserDynamicMembership.GetHashCode();
                    if (UserDisableMissing != null)
                    hashCode = hashCode * 59 + UserDisableMissing.GetHashCode();
                    if (GroupExpirationTime != null)
                    hashCode = hashCode * 59 + GroupExpirationTime.GetHashCode();
                    if (GroupAutoMembership != null)
                    hashCode = hashCode * 59 + GroupAutoMembership.GetHashCode();
                    if (GroupPropertyMapping != null)
                    hashCode = hashCode * 59 + GroupPropertyMapping.GetHashCode();
                    if (GroupPathPrefix != null)
                    hashCode = hashCode * 59 + GroupPathPrefix.GetHashCode();
                    if (EnableRFC7613UsercaseMappedProfile != null)
                    hashCode = hashCode * 59 + EnableRFC7613UsercaseMappedProfile.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties left, OrgApacheJackrabbitOakSpiSecurityAuthenticationExternalImplDeProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}