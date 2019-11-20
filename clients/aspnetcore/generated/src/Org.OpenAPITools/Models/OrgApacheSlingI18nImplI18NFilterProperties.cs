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
    public partial class OrgApacheSlingI18nImplI18NFilterProperties : IEquatable<OrgApacheSlingI18nImplI18NFilterProperties>
    { 
        /// <summary>
        /// Gets or Sets ServiceRanking
        /// </summary>
        [DataMember(Name="service.ranking")]
        public ConfigNodePropertyInteger ServiceRanking { get; set; }

        /// <summary>
        /// Gets or Sets SlingFilterScope
        /// </summary>
        [DataMember(Name="sling.filter.scope")]
        public ConfigNodePropertyArray SlingFilterScope { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheSlingI18nImplI18NFilterProperties {\n");
            sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
            sb.Append("  SlingFilterScope: ").Append(SlingFilterScope).Append("\n");
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
            return obj.GetType() == GetType() && Equals((OrgApacheSlingI18nImplI18NFilterProperties)obj);
        }

        /// <summary>
        /// Returns true if OrgApacheSlingI18nImplI18NFilterProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of OrgApacheSlingI18nImplI18NFilterProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheSlingI18nImplI18NFilterProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    ServiceRanking == other.ServiceRanking ||
                    ServiceRanking != null &&
                    ServiceRanking.Equals(other.ServiceRanking)
                ) && 
                (
                    SlingFilterScope == other.SlingFilterScope ||
                    SlingFilterScope != null &&
                    SlingFilterScope.Equals(other.SlingFilterScope)
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
                    if (ServiceRanking != null)
                    hashCode = hashCode * 59 + ServiceRanking.GetHashCode();
                    if (SlingFilterScope != null)
                    hashCode = hashCode * 59 + SlingFilterScope.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OrgApacheSlingI18nImplI18NFilterProperties left, OrgApacheSlingI18nImplI18NFilterProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OrgApacheSlingI18nImplI18NFilterProperties left, OrgApacheSlingI18nImplI18NFilterProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}