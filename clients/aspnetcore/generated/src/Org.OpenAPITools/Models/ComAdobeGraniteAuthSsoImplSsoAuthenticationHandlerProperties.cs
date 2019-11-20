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
    public partial class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties : IEquatable<ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties>
    { 
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="path")]
        public ConfigNodePropertyString Path { get; set; }

        /// <summary>
        /// Gets or Sets ServiceRanking
        /// </summary>
        [DataMember(Name="service.ranking")]
        public ConfigNodePropertyInteger ServiceRanking { get; set; }

        /// <summary>
        /// Gets or Sets JaasControlFlag
        /// </summary>
        [DataMember(Name="jaas.controlFlag")]
        public ConfigNodePropertyString JaasControlFlag { get; set; }

        /// <summary>
        /// Gets or Sets JaasRealmName
        /// </summary>
        [DataMember(Name="jaas.realmName")]
        public ConfigNodePropertyString JaasRealmName { get; set; }

        /// <summary>
        /// Gets or Sets JaasRanking
        /// </summary>
        [DataMember(Name="jaas.ranking")]
        public ConfigNodePropertyInteger JaasRanking { get; set; }

        /// <summary>
        /// Gets or Sets Headers
        /// </summary>
        [DataMember(Name="headers")]
        public ConfigNodePropertyArray Headers { get; set; }

        /// <summary>
        /// Gets or Sets Cookies
        /// </summary>
        [DataMember(Name="cookies")]
        public ConfigNodePropertyArray Cookies { get; set; }

        /// <summary>
        /// Gets or Sets Parameters
        /// </summary>
        [DataMember(Name="parameters")]
        public ConfigNodePropertyArray Parameters { get; set; }

        /// <summary>
        /// Gets or Sets Usermap
        /// </summary>
        [DataMember(Name="usermap")]
        public ConfigNodePropertyArray Usermap { get; set; }

        /// <summary>
        /// Gets or Sets Format
        /// </summary>
        [DataMember(Name="format")]
        public ConfigNodePropertyString Format { get; set; }

        /// <summary>
        /// Gets or Sets TrustedCredentialsAttribute
        /// </summary>
        [DataMember(Name="trustedCredentialsAttribute")]
        public ConfigNodePropertyString TrustedCredentialsAttribute { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
            sb.Append("  JaasControlFlag: ").Append(JaasControlFlag).Append("\n");
            sb.Append("  JaasRealmName: ").Append(JaasRealmName).Append("\n");
            sb.Append("  JaasRanking: ").Append(JaasRanking).Append("\n");
            sb.Append("  Headers: ").Append(Headers).Append("\n");
            sb.Append("  Cookies: ").Append(Cookies).Append("\n");
            sb.Append("  Parameters: ").Append(Parameters).Append("\n");
            sb.Append("  Usermap: ").Append(Usermap).Append("\n");
            sb.Append("  Format: ").Append(Format).Append("\n");
            sb.Append("  TrustedCredentialsAttribute: ").Append(TrustedCredentialsAttribute).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Path == other.Path ||
                    Path != null &&
                    Path.Equals(other.Path)
                ) && 
                (
                    ServiceRanking == other.ServiceRanking ||
                    ServiceRanking != null &&
                    ServiceRanking.Equals(other.ServiceRanking)
                ) && 
                (
                    JaasControlFlag == other.JaasControlFlag ||
                    JaasControlFlag != null &&
                    JaasControlFlag.Equals(other.JaasControlFlag)
                ) && 
                (
                    JaasRealmName == other.JaasRealmName ||
                    JaasRealmName != null &&
                    JaasRealmName.Equals(other.JaasRealmName)
                ) && 
                (
                    JaasRanking == other.JaasRanking ||
                    JaasRanking != null &&
                    JaasRanking.Equals(other.JaasRanking)
                ) && 
                (
                    Headers == other.Headers ||
                    Headers != null &&
                    Headers.Equals(other.Headers)
                ) && 
                (
                    Cookies == other.Cookies ||
                    Cookies != null &&
                    Cookies.Equals(other.Cookies)
                ) && 
                (
                    Parameters == other.Parameters ||
                    Parameters != null &&
                    Parameters.Equals(other.Parameters)
                ) && 
                (
                    Usermap == other.Usermap ||
                    Usermap != null &&
                    Usermap.Equals(other.Usermap)
                ) && 
                (
                    Format == other.Format ||
                    Format != null &&
                    Format.Equals(other.Format)
                ) && 
                (
                    TrustedCredentialsAttribute == other.TrustedCredentialsAttribute ||
                    TrustedCredentialsAttribute != null &&
                    TrustedCredentialsAttribute.Equals(other.TrustedCredentialsAttribute)
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
                    if (Path != null)
                    hashCode = hashCode * 59 + Path.GetHashCode();
                    if (ServiceRanking != null)
                    hashCode = hashCode * 59 + ServiceRanking.GetHashCode();
                    if (JaasControlFlag != null)
                    hashCode = hashCode * 59 + JaasControlFlag.GetHashCode();
                    if (JaasRealmName != null)
                    hashCode = hashCode * 59 + JaasRealmName.GetHashCode();
                    if (JaasRanking != null)
                    hashCode = hashCode * 59 + JaasRanking.GetHashCode();
                    if (Headers != null)
                    hashCode = hashCode * 59 + Headers.GetHashCode();
                    if (Cookies != null)
                    hashCode = hashCode * 59 + Cookies.GetHashCode();
                    if (Parameters != null)
                    hashCode = hashCode * 59 + Parameters.GetHashCode();
                    if (Usermap != null)
                    hashCode = hashCode * 59 + Usermap.GetHashCode();
                    if (Format != null)
                    hashCode = hashCode * 59 + Format.GetHashCode();
                    if (TrustedCredentialsAttribute != null)
                    hashCode = hashCode * 59 + TrustedCredentialsAttribute.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties left, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties left, ComAdobeGraniteAuthSsoImplSsoAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}