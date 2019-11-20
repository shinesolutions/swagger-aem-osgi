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
    public partial class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties : IEquatable<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties>
    { 
        /// <summary>
        /// Gets or Sets NuiEnabled
        /// </summary>
        [DataMember(Name="nuiEnabled")]
        public ConfigNodePropertyBoolean NuiEnabled { get; set; }

        /// <summary>
        /// Gets or Sets NuiServiceUrl
        /// </summary>
        [DataMember(Name="nuiServiceUrl")]
        public ConfigNodePropertyString NuiServiceUrl { get; set; }

        /// <summary>
        /// Gets or Sets NuiApiKey
        /// </summary>
        [DataMember(Name="nuiApiKey")]
        public ConfigNodePropertyString NuiApiKey { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties {\n");
            sb.Append("  NuiEnabled: ").Append(NuiEnabled).Append("\n");
            sb.Append("  NuiServiceUrl: ").Append(NuiServiceUrl).Append("\n");
            sb.Append("  NuiApiKey: ").Append(NuiApiKey).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    NuiEnabled == other.NuiEnabled ||
                    NuiEnabled != null &&
                    NuiEnabled.Equals(other.NuiEnabled)
                ) && 
                (
                    NuiServiceUrl == other.NuiServiceUrl ||
                    NuiServiceUrl != null &&
                    NuiServiceUrl.Equals(other.NuiServiceUrl)
                ) && 
                (
                    NuiApiKey == other.NuiApiKey ||
                    NuiApiKey != null &&
                    NuiApiKey.Equals(other.NuiApiKey)
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
                    if (NuiEnabled != null)
                    hashCode = hashCode * 59 + NuiEnabled.GetHashCode();
                    if (NuiServiceUrl != null)
                    hashCode = hashCode * 59 + NuiServiceUrl.GetHashCode();
                    if (NuiApiKey != null)
                    hashCode = hashCode * 59 + NuiApiKey.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties left, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties left, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}