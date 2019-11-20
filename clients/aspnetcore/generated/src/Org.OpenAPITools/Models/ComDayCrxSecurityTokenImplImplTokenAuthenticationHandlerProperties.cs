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
    public partial class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties : IEquatable<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties>
    { 
        /// <summary>
        /// Gets or Sets Path
        /// </summary>
        [DataMember(Name="path")]
        public ConfigNodePropertyString Path { get; set; }

        /// <summary>
        /// Gets or Sets TokenRequiredAttr
        /// </summary>
        [DataMember(Name="token.required.attr")]
        public ConfigNodePropertyDropDown TokenRequiredAttr { get; set; }

        /// <summary>
        /// Gets or Sets TokenAlternateUrl
        /// </summary>
        [DataMember(Name="token.alternate.url")]
        public ConfigNodePropertyString TokenAlternateUrl { get; set; }

        /// <summary>
        /// Gets or Sets TokenEncapsulated
        /// </summary>
        [DataMember(Name="token.encapsulated")]
        public ConfigNodePropertyBoolean TokenEncapsulated { get; set; }

        /// <summary>
        /// Gets or Sets SkipTokenRefresh
        /// </summary>
        [DataMember(Name="skip.token.refresh")]
        public ConfigNodePropertyArray SkipTokenRefresh { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties {\n");
            sb.Append("  Path: ").Append(Path).Append("\n");
            sb.Append("  TokenRequiredAttr: ").Append(TokenRequiredAttr).Append("\n");
            sb.Append("  TokenAlternateUrl: ").Append(TokenAlternateUrl).Append("\n");
            sb.Append("  TokenEncapsulated: ").Append(TokenEncapsulated).Append("\n");
            sb.Append("  SkipTokenRefresh: ").Append(SkipTokenRefresh).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties)obj);
        }

        /// <summary>
        /// Returns true if ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties other)
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
                    TokenRequiredAttr == other.TokenRequiredAttr ||
                    TokenRequiredAttr != null &&
                    TokenRequiredAttr.Equals(other.TokenRequiredAttr)
                ) && 
                (
                    TokenAlternateUrl == other.TokenAlternateUrl ||
                    TokenAlternateUrl != null &&
                    TokenAlternateUrl.Equals(other.TokenAlternateUrl)
                ) && 
                (
                    TokenEncapsulated == other.TokenEncapsulated ||
                    TokenEncapsulated != null &&
                    TokenEncapsulated.Equals(other.TokenEncapsulated)
                ) && 
                (
                    SkipTokenRefresh == other.SkipTokenRefresh ||
                    SkipTokenRefresh != null &&
                    SkipTokenRefresh.Equals(other.SkipTokenRefresh)
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
                    if (TokenRequiredAttr != null)
                    hashCode = hashCode * 59 + TokenRequiredAttr.GetHashCode();
                    if (TokenAlternateUrl != null)
                    hashCode = hashCode * 59 + TokenAlternateUrl.GetHashCode();
                    if (TokenEncapsulated != null)
                    hashCode = hashCode * 59 + TokenEncapsulated.GetHashCode();
                    if (SkipTokenRefresh != null)
                    hashCode = hashCode * 59 + SkipTokenRefresh.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties left, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties left, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}