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
    public partial class ComAdobeGraniteAuthImsImplIMSProviderImplProperties : IEquatable<ComAdobeGraniteAuthImsImplIMSProviderImplProperties>
    { 
        /// <summary>
        /// Gets or Sets OauthProviderId
        /// </summary>
        [DataMember(Name="oauth.provider.id")]
        public ConfigNodePropertyString OauthProviderId { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsAuthorizationUrl
        /// </summary>
        [DataMember(Name="oauth.provider.ims.authorization.url")]
        public ConfigNodePropertyString OauthProviderImsAuthorizationUrl { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsTokenUrl
        /// </summary>
        [DataMember(Name="oauth.provider.ims.token.url")]
        public ConfigNodePropertyString OauthProviderImsTokenUrl { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsProfileUrl
        /// </summary>
        [DataMember(Name="oauth.provider.ims.profile.url")]
        public ConfigNodePropertyString OauthProviderImsProfileUrl { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsExtendedDetailsUrls
        /// </summary>
        [DataMember(Name="oauth.provider.ims.extended.details.urls")]
        public ConfigNodePropertyArray OauthProviderImsExtendedDetailsUrls { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsValidateTokenUrl
        /// </summary>
        [DataMember(Name="oauth.provider.ims.validate.token.url")]
        public ConfigNodePropertyString OauthProviderImsValidateTokenUrl { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsSessionProperty
        /// </summary>
        [DataMember(Name="oauth.provider.ims.session.property")]
        public ConfigNodePropertyString OauthProviderImsSessionProperty { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsServiceTokenClientId
        /// </summary>
        [DataMember(Name="oauth.provider.ims.service.token.client.id")]
        public ConfigNodePropertyString OauthProviderImsServiceTokenClientId { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsServiceTokenClientSecret
        /// </summary>
        [DataMember(Name="oauth.provider.ims.service.token.client.secret")]
        public ConfigNodePropertyString OauthProviderImsServiceTokenClientSecret { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsServiceToken
        /// </summary>
        [DataMember(Name="oauth.provider.ims.service.token")]
        public ConfigNodePropertyString OauthProviderImsServiceToken { get; set; }

        /// <summary>
        /// Gets or Sets ImsOrgRef
        /// </summary>
        [DataMember(Name="ims.org.ref")]
        public ConfigNodePropertyString ImsOrgRef { get; set; }

        /// <summary>
        /// Gets or Sets ImsGroupMapping
        /// </summary>
        [DataMember(Name="ims.group.mapping")]
        public ConfigNodePropertyArray ImsGroupMapping { get; set; }

        /// <summary>
        /// Gets or Sets OauthProviderImsOnlyLicenseGroup
        /// </summary>
        [DataMember(Name="oauth.provider.ims.only.license.group")]
        public ConfigNodePropertyBoolean OauthProviderImsOnlyLicenseGroup { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeGraniteAuthImsImplIMSProviderImplProperties {\n");
            sb.Append("  OauthProviderId: ").Append(OauthProviderId).Append("\n");
            sb.Append("  OauthProviderImsAuthorizationUrl: ").Append(OauthProviderImsAuthorizationUrl).Append("\n");
            sb.Append("  OauthProviderImsTokenUrl: ").Append(OauthProviderImsTokenUrl).Append("\n");
            sb.Append("  OauthProviderImsProfileUrl: ").Append(OauthProviderImsProfileUrl).Append("\n");
            sb.Append("  OauthProviderImsExtendedDetailsUrls: ").Append(OauthProviderImsExtendedDetailsUrls).Append("\n");
            sb.Append("  OauthProviderImsValidateTokenUrl: ").Append(OauthProviderImsValidateTokenUrl).Append("\n");
            sb.Append("  OauthProviderImsSessionProperty: ").Append(OauthProviderImsSessionProperty).Append("\n");
            sb.Append("  OauthProviderImsServiceTokenClientId: ").Append(OauthProviderImsServiceTokenClientId).Append("\n");
            sb.Append("  OauthProviderImsServiceTokenClientSecret: ").Append(OauthProviderImsServiceTokenClientSecret).Append("\n");
            sb.Append("  OauthProviderImsServiceToken: ").Append(OauthProviderImsServiceToken).Append("\n");
            sb.Append("  ImsOrgRef: ").Append(ImsOrgRef).Append("\n");
            sb.Append("  ImsGroupMapping: ").Append(ImsGroupMapping).Append("\n");
            sb.Append("  OauthProviderImsOnlyLicenseGroup: ").Append(OauthProviderImsOnlyLicenseGroup).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeGraniteAuthImsImplIMSProviderImplProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeGraniteAuthImsImplIMSProviderImplProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeGraniteAuthImsImplIMSProviderImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeGraniteAuthImsImplIMSProviderImplProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    OauthProviderId == other.OauthProviderId ||
                    OauthProviderId != null &&
                    OauthProviderId.Equals(other.OauthProviderId)
                ) && 
                (
                    OauthProviderImsAuthorizationUrl == other.OauthProviderImsAuthorizationUrl ||
                    OauthProviderImsAuthorizationUrl != null &&
                    OauthProviderImsAuthorizationUrl.Equals(other.OauthProviderImsAuthorizationUrl)
                ) && 
                (
                    OauthProviderImsTokenUrl == other.OauthProviderImsTokenUrl ||
                    OauthProviderImsTokenUrl != null &&
                    OauthProviderImsTokenUrl.Equals(other.OauthProviderImsTokenUrl)
                ) && 
                (
                    OauthProviderImsProfileUrl == other.OauthProviderImsProfileUrl ||
                    OauthProviderImsProfileUrl != null &&
                    OauthProviderImsProfileUrl.Equals(other.OauthProviderImsProfileUrl)
                ) && 
                (
                    OauthProviderImsExtendedDetailsUrls == other.OauthProviderImsExtendedDetailsUrls ||
                    OauthProviderImsExtendedDetailsUrls != null &&
                    OauthProviderImsExtendedDetailsUrls.Equals(other.OauthProviderImsExtendedDetailsUrls)
                ) && 
                (
                    OauthProviderImsValidateTokenUrl == other.OauthProviderImsValidateTokenUrl ||
                    OauthProviderImsValidateTokenUrl != null &&
                    OauthProviderImsValidateTokenUrl.Equals(other.OauthProviderImsValidateTokenUrl)
                ) && 
                (
                    OauthProviderImsSessionProperty == other.OauthProviderImsSessionProperty ||
                    OauthProviderImsSessionProperty != null &&
                    OauthProviderImsSessionProperty.Equals(other.OauthProviderImsSessionProperty)
                ) && 
                (
                    OauthProviderImsServiceTokenClientId == other.OauthProviderImsServiceTokenClientId ||
                    OauthProviderImsServiceTokenClientId != null &&
                    OauthProviderImsServiceTokenClientId.Equals(other.OauthProviderImsServiceTokenClientId)
                ) && 
                (
                    OauthProviderImsServiceTokenClientSecret == other.OauthProviderImsServiceTokenClientSecret ||
                    OauthProviderImsServiceTokenClientSecret != null &&
                    OauthProviderImsServiceTokenClientSecret.Equals(other.OauthProviderImsServiceTokenClientSecret)
                ) && 
                (
                    OauthProviderImsServiceToken == other.OauthProviderImsServiceToken ||
                    OauthProviderImsServiceToken != null &&
                    OauthProviderImsServiceToken.Equals(other.OauthProviderImsServiceToken)
                ) && 
                (
                    ImsOrgRef == other.ImsOrgRef ||
                    ImsOrgRef != null &&
                    ImsOrgRef.Equals(other.ImsOrgRef)
                ) && 
                (
                    ImsGroupMapping == other.ImsGroupMapping ||
                    ImsGroupMapping != null &&
                    ImsGroupMapping.Equals(other.ImsGroupMapping)
                ) && 
                (
                    OauthProviderImsOnlyLicenseGroup == other.OauthProviderImsOnlyLicenseGroup ||
                    OauthProviderImsOnlyLicenseGroup != null &&
                    OauthProviderImsOnlyLicenseGroup.Equals(other.OauthProviderImsOnlyLicenseGroup)
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
                    if (OauthProviderId != null)
                    hashCode = hashCode * 59 + OauthProviderId.GetHashCode();
                    if (OauthProviderImsAuthorizationUrl != null)
                    hashCode = hashCode * 59 + OauthProviderImsAuthorizationUrl.GetHashCode();
                    if (OauthProviderImsTokenUrl != null)
                    hashCode = hashCode * 59 + OauthProviderImsTokenUrl.GetHashCode();
                    if (OauthProviderImsProfileUrl != null)
                    hashCode = hashCode * 59 + OauthProviderImsProfileUrl.GetHashCode();
                    if (OauthProviderImsExtendedDetailsUrls != null)
                    hashCode = hashCode * 59 + OauthProviderImsExtendedDetailsUrls.GetHashCode();
                    if (OauthProviderImsValidateTokenUrl != null)
                    hashCode = hashCode * 59 + OauthProviderImsValidateTokenUrl.GetHashCode();
                    if (OauthProviderImsSessionProperty != null)
                    hashCode = hashCode * 59 + OauthProviderImsSessionProperty.GetHashCode();
                    if (OauthProviderImsServiceTokenClientId != null)
                    hashCode = hashCode * 59 + OauthProviderImsServiceTokenClientId.GetHashCode();
                    if (OauthProviderImsServiceTokenClientSecret != null)
                    hashCode = hashCode * 59 + OauthProviderImsServiceTokenClientSecret.GetHashCode();
                    if (OauthProviderImsServiceToken != null)
                    hashCode = hashCode * 59 + OauthProviderImsServiceToken.GetHashCode();
                    if (ImsOrgRef != null)
                    hashCode = hashCode * 59 + ImsOrgRef.GetHashCode();
                    if (ImsGroupMapping != null)
                    hashCode = hashCode * 59 + ImsGroupMapping.GetHashCode();
                    if (OauthProviderImsOnlyLicenseGroup != null)
                    hashCode = hashCode * 59 + OauthProviderImsOnlyLicenseGroup.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeGraniteAuthImsImplIMSProviderImplProperties left, ComAdobeGraniteAuthImsImplIMSProviderImplProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeGraniteAuthImsImplIMSProviderImplProperties left, ComAdobeGraniteAuthImsImplIMSProviderImplProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}