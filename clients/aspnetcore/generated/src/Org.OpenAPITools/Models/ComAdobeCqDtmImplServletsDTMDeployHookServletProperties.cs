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
    public partial class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties : IEquatable<ComAdobeCqDtmImplServletsDTMDeployHookServletProperties>
    { 
        /// <summary>
        /// Gets or Sets DtmStagingIpWhitelist
        /// </summary>
        [DataMember(Name="dtm.staging.ip.whitelist")]
        public ConfigNodePropertyArray DtmStagingIpWhitelist { get; set; }

        /// <summary>
        /// Gets or Sets DtmProductionIpWhitelist
        /// </summary>
        [DataMember(Name="dtm.production.ip.whitelist")]
        public ConfigNodePropertyArray DtmProductionIpWhitelist { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqDtmImplServletsDTMDeployHookServletProperties {\n");
            sb.Append("  DtmStagingIpWhitelist: ").Append(DtmStagingIpWhitelist).Append("\n");
            sb.Append("  DtmProductionIpWhitelist: ").Append(DtmProductionIpWhitelist).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeCqDtmImplServletsDTMDeployHookServletProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeCqDtmImplServletsDTMDeployHookServletProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeCqDtmImplServletsDTMDeployHookServletProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqDtmImplServletsDTMDeployHookServletProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    DtmStagingIpWhitelist == other.DtmStagingIpWhitelist ||
                    DtmStagingIpWhitelist != null &&
                    DtmStagingIpWhitelist.Equals(other.DtmStagingIpWhitelist)
                ) && 
                (
                    DtmProductionIpWhitelist == other.DtmProductionIpWhitelist ||
                    DtmProductionIpWhitelist != null &&
                    DtmProductionIpWhitelist.Equals(other.DtmProductionIpWhitelist)
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
                    if (DtmStagingIpWhitelist != null)
                    hashCode = hashCode * 59 + DtmStagingIpWhitelist.GetHashCode();
                    if (DtmProductionIpWhitelist != null)
                    hashCode = hashCode * 59 + DtmProductionIpWhitelist.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeCqDtmImplServletsDTMDeployHookServletProperties left, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeCqDtmImplServletsDTMDeployHookServletProperties left, ComAdobeCqDtmImplServletsDTMDeployHookServletProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}