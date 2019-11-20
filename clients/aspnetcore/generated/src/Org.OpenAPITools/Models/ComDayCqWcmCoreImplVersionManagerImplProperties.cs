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
    public partial class ComDayCqWcmCoreImplVersionManagerImplProperties : IEquatable<ComDayCqWcmCoreImplVersionManagerImplProperties>
    { 
        /// <summary>
        /// Gets or Sets VersionmanagerCreateVersionOnActivation
        /// </summary>
        [DataMember(Name="versionmanager.createVersionOnActivation")]
        public ConfigNodePropertyBoolean VersionmanagerCreateVersionOnActivation { get; set; }

        /// <summary>
        /// Gets or Sets VersionmanagerPurgingEnabled
        /// </summary>
        [DataMember(Name="versionmanager.purgingEnabled")]
        public ConfigNodePropertyBoolean VersionmanagerPurgingEnabled { get; set; }

        /// <summary>
        /// Gets or Sets VersionmanagerPurgePaths
        /// </summary>
        [DataMember(Name="versionmanager.purgePaths")]
        public ConfigNodePropertyArray VersionmanagerPurgePaths { get; set; }

        /// <summary>
        /// Gets or Sets VersionmanagerIvPaths
        /// </summary>
        [DataMember(Name="versionmanager.ivPaths")]
        public ConfigNodePropertyArray VersionmanagerIvPaths { get; set; }

        /// <summary>
        /// Gets or Sets VersionmanagerMaxAgeDays
        /// </summary>
        [DataMember(Name="versionmanager.maxAgeDays")]
        public ConfigNodePropertyInteger VersionmanagerMaxAgeDays { get; set; }

        /// <summary>
        /// Gets or Sets VersionmanagerMaxNumberVersions
        /// </summary>
        [DataMember(Name="versionmanager.maxNumberVersions")]
        public ConfigNodePropertyInteger VersionmanagerMaxNumberVersions { get; set; }

        /// <summary>
        /// Gets or Sets VersionmanagerMinNumberVersions
        /// </summary>
        [DataMember(Name="versionmanager.minNumberVersions")]
        public ConfigNodePropertyInteger VersionmanagerMinNumberVersions { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqWcmCoreImplVersionManagerImplProperties {\n");
            sb.Append("  VersionmanagerCreateVersionOnActivation: ").Append(VersionmanagerCreateVersionOnActivation).Append("\n");
            sb.Append("  VersionmanagerPurgingEnabled: ").Append(VersionmanagerPurgingEnabled).Append("\n");
            sb.Append("  VersionmanagerPurgePaths: ").Append(VersionmanagerPurgePaths).Append("\n");
            sb.Append("  VersionmanagerIvPaths: ").Append(VersionmanagerIvPaths).Append("\n");
            sb.Append("  VersionmanagerMaxAgeDays: ").Append(VersionmanagerMaxAgeDays).Append("\n");
            sb.Append("  VersionmanagerMaxNumberVersions: ").Append(VersionmanagerMaxNumberVersions).Append("\n");
            sb.Append("  VersionmanagerMinNumberVersions: ").Append(VersionmanagerMinNumberVersions).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComDayCqWcmCoreImplVersionManagerImplProperties)obj);
        }

        /// <summary>
        /// Returns true if ComDayCqWcmCoreImplVersionManagerImplProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComDayCqWcmCoreImplVersionManagerImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqWcmCoreImplVersionManagerImplProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    VersionmanagerCreateVersionOnActivation == other.VersionmanagerCreateVersionOnActivation ||
                    VersionmanagerCreateVersionOnActivation != null &&
                    VersionmanagerCreateVersionOnActivation.Equals(other.VersionmanagerCreateVersionOnActivation)
                ) && 
                (
                    VersionmanagerPurgingEnabled == other.VersionmanagerPurgingEnabled ||
                    VersionmanagerPurgingEnabled != null &&
                    VersionmanagerPurgingEnabled.Equals(other.VersionmanagerPurgingEnabled)
                ) && 
                (
                    VersionmanagerPurgePaths == other.VersionmanagerPurgePaths ||
                    VersionmanagerPurgePaths != null &&
                    VersionmanagerPurgePaths.Equals(other.VersionmanagerPurgePaths)
                ) && 
                (
                    VersionmanagerIvPaths == other.VersionmanagerIvPaths ||
                    VersionmanagerIvPaths != null &&
                    VersionmanagerIvPaths.Equals(other.VersionmanagerIvPaths)
                ) && 
                (
                    VersionmanagerMaxAgeDays == other.VersionmanagerMaxAgeDays ||
                    VersionmanagerMaxAgeDays != null &&
                    VersionmanagerMaxAgeDays.Equals(other.VersionmanagerMaxAgeDays)
                ) && 
                (
                    VersionmanagerMaxNumberVersions == other.VersionmanagerMaxNumberVersions ||
                    VersionmanagerMaxNumberVersions != null &&
                    VersionmanagerMaxNumberVersions.Equals(other.VersionmanagerMaxNumberVersions)
                ) && 
                (
                    VersionmanagerMinNumberVersions == other.VersionmanagerMinNumberVersions ||
                    VersionmanagerMinNumberVersions != null &&
                    VersionmanagerMinNumberVersions.Equals(other.VersionmanagerMinNumberVersions)
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
                    if (VersionmanagerCreateVersionOnActivation != null)
                    hashCode = hashCode * 59 + VersionmanagerCreateVersionOnActivation.GetHashCode();
                    if (VersionmanagerPurgingEnabled != null)
                    hashCode = hashCode * 59 + VersionmanagerPurgingEnabled.GetHashCode();
                    if (VersionmanagerPurgePaths != null)
                    hashCode = hashCode * 59 + VersionmanagerPurgePaths.GetHashCode();
                    if (VersionmanagerIvPaths != null)
                    hashCode = hashCode * 59 + VersionmanagerIvPaths.GetHashCode();
                    if (VersionmanagerMaxAgeDays != null)
                    hashCode = hashCode * 59 + VersionmanagerMaxAgeDays.GetHashCode();
                    if (VersionmanagerMaxNumberVersions != null)
                    hashCode = hashCode * 59 + VersionmanagerMaxNumberVersions.GetHashCode();
                    if (VersionmanagerMinNumberVersions != null)
                    hashCode = hashCode * 59 + VersionmanagerMinNumberVersions.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComDayCqWcmCoreImplVersionManagerImplProperties left, ComDayCqWcmCoreImplVersionManagerImplProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComDayCqWcmCoreImplVersionManagerImplProperties left, ComDayCqWcmCoreImplVersionManagerImplProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}