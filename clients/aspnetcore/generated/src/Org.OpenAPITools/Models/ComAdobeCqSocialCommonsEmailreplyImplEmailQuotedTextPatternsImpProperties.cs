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
    public partial class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties : IEquatable<ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties>
    { 
        /// <summary>
        /// Gets or Sets PatternTime
        /// </summary>
        [DataMember(Name="pattern.time")]
        public ConfigNodePropertyString PatternTime { get; set; }

        /// <summary>
        /// Gets or Sets PatternNewline
        /// </summary>
        [DataMember(Name="pattern.newline")]
        public ConfigNodePropertyString PatternNewline { get; set; }

        /// <summary>
        /// Gets or Sets PatternDayOfMonth
        /// </summary>
        [DataMember(Name="pattern.dayOfMonth")]
        public ConfigNodePropertyString PatternDayOfMonth { get; set; }

        /// <summary>
        /// Gets or Sets PatternMonth
        /// </summary>
        [DataMember(Name="pattern.month")]
        public ConfigNodePropertyString PatternMonth { get; set; }

        /// <summary>
        /// Gets or Sets PatternYear
        /// </summary>
        [DataMember(Name="pattern.year")]
        public ConfigNodePropertyString PatternYear { get; set; }

        /// <summary>
        /// Gets or Sets PatternDate
        /// </summary>
        [DataMember(Name="pattern.date")]
        public ConfigNodePropertyString PatternDate { get; set; }

        /// <summary>
        /// Gets or Sets PatternDateTime
        /// </summary>
        [DataMember(Name="pattern.dateTime")]
        public ConfigNodePropertyString PatternDateTime { get; set; }

        /// <summary>
        /// Gets or Sets PatternEmail
        /// </summary>
        [DataMember(Name="pattern.email")]
        public ConfigNodePropertyString PatternEmail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {\n");
            sb.Append("  PatternTime: ").Append(PatternTime).Append("\n");
            sb.Append("  PatternNewline: ").Append(PatternNewline).Append("\n");
            sb.Append("  PatternDayOfMonth: ").Append(PatternDayOfMonth).Append("\n");
            sb.Append("  PatternMonth: ").Append(PatternMonth).Append("\n");
            sb.Append("  PatternYear: ").Append(PatternYear).Append("\n");
            sb.Append("  PatternDate: ").Append(PatternDate).Append("\n");
            sb.Append("  PatternDateTime: ").Append(PatternDateTime).Append("\n");
            sb.Append("  PatternEmail: ").Append(PatternEmail).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    PatternTime == other.PatternTime ||
                    PatternTime != null &&
                    PatternTime.Equals(other.PatternTime)
                ) && 
                (
                    PatternNewline == other.PatternNewline ||
                    PatternNewline != null &&
                    PatternNewline.Equals(other.PatternNewline)
                ) && 
                (
                    PatternDayOfMonth == other.PatternDayOfMonth ||
                    PatternDayOfMonth != null &&
                    PatternDayOfMonth.Equals(other.PatternDayOfMonth)
                ) && 
                (
                    PatternMonth == other.PatternMonth ||
                    PatternMonth != null &&
                    PatternMonth.Equals(other.PatternMonth)
                ) && 
                (
                    PatternYear == other.PatternYear ||
                    PatternYear != null &&
                    PatternYear.Equals(other.PatternYear)
                ) && 
                (
                    PatternDate == other.PatternDate ||
                    PatternDate != null &&
                    PatternDate.Equals(other.PatternDate)
                ) && 
                (
                    PatternDateTime == other.PatternDateTime ||
                    PatternDateTime != null &&
                    PatternDateTime.Equals(other.PatternDateTime)
                ) && 
                (
                    PatternEmail == other.PatternEmail ||
                    PatternEmail != null &&
                    PatternEmail.Equals(other.PatternEmail)
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
                    if (PatternTime != null)
                    hashCode = hashCode * 59 + PatternTime.GetHashCode();
                    if (PatternNewline != null)
                    hashCode = hashCode * 59 + PatternNewline.GetHashCode();
                    if (PatternDayOfMonth != null)
                    hashCode = hashCode * 59 + PatternDayOfMonth.GetHashCode();
                    if (PatternMonth != null)
                    hashCode = hashCode * 59 + PatternMonth.GetHashCode();
                    if (PatternYear != null)
                    hashCode = hashCode * 59 + PatternYear.GetHashCode();
                    if (PatternDate != null)
                    hashCode = hashCode * 59 + PatternDate.GetHashCode();
                    if (PatternDateTime != null)
                    hashCode = hashCode * 59 + PatternDateTime.GetHashCode();
                    if (PatternEmail != null)
                    hashCode = hashCode * 59 + PatternEmail.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties left, ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}