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
    public partial class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties : IEquatable<OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties>
    { 
        /// <summary>
        /// Gets or Sets RequiredServicePids
        /// </summary>
        [DataMember(Name="requiredServicePids")]
        public ConfigNodePropertyArray RequiredServicePids { get; set; }

        /// <summary>
        /// Gets or Sets AuthorizationCompositionType
        /// </summary>
        [DataMember(Name="authorizationCompositionType")]
        public ConfigNodePropertyDropDown AuthorizationCompositionType { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties {\n");
            sb.Append("  RequiredServicePids: ").Append(RequiredServicePids).Append("\n");
            sb.Append("  AuthorizationCompositionType: ").Append(AuthorizationCompositionType).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties)obj);
        }

        /// <summary>
        /// Returns true if OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    RequiredServicePids == other.RequiredServicePids ||
                    RequiredServicePids != null &&
                    RequiredServicePids.Equals(other.RequiredServicePids)
                ) && 
                (
                    AuthorizationCompositionType == other.AuthorizationCompositionType ||
                    AuthorizationCompositionType != null &&
                    AuthorizationCompositionType.Equals(other.AuthorizationCompositionType)
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
                    if (RequiredServicePids != null)
                    hashCode = hashCode * 59 + RequiredServicePids.GetHashCode();
                    if (AuthorizationCompositionType != null)
                    hashCode = hashCode * 59 + AuthorizationCompositionType.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties left, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties left, OrgApacheJackrabbitOakSecurityInternalSecurityProviderRegistratiProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}