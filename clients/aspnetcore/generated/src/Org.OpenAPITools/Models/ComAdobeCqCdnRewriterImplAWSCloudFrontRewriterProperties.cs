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
    public partial class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties : IEquatable<ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties>
    { 
        /// <summary>
        /// Gets or Sets ServiceRanking
        /// </summary>
        [DataMember(Name="service.ranking")]
        public ConfigNodePropertyInteger ServiceRanking { get; set; }

        /// <summary>
        /// Gets or Sets KeypairId
        /// </summary>
        [DataMember(Name="keypair.id")]
        public ConfigNodePropertyString KeypairId { get; set; }

        /// <summary>
        /// Gets or Sets KeypairAlias
        /// </summary>
        [DataMember(Name="keypair.alias")]
        public ConfigNodePropertyString KeypairAlias { get; set; }

        /// <summary>
        /// Gets or Sets CdnrewriterAttributes
        /// </summary>
        [DataMember(Name="cdnrewriter.attributes")]
        public ConfigNodePropertyArray CdnrewriterAttributes { get; set; }

        /// <summary>
        /// Gets or Sets CdnRewriterDistributionDomain
        /// </summary>
        [DataMember(Name="cdn.rewriter.distribution.domain")]
        public ConfigNodePropertyString CdnRewriterDistributionDomain { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties {\n");
            sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
            sb.Append("  KeypairId: ").Append(KeypairId).Append("\n");
            sb.Append("  KeypairAlias: ").Append(KeypairAlias).Append("\n");
            sb.Append("  CdnrewriterAttributes: ").Append(CdnrewriterAttributes).Append("\n");
            sb.Append("  CdnRewriterDistributionDomain: ").Append(CdnRewriterDistributionDomain).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties other)
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
                    KeypairId == other.KeypairId ||
                    KeypairId != null &&
                    KeypairId.Equals(other.KeypairId)
                ) && 
                (
                    KeypairAlias == other.KeypairAlias ||
                    KeypairAlias != null &&
                    KeypairAlias.Equals(other.KeypairAlias)
                ) && 
                (
                    CdnrewriterAttributes == other.CdnrewriterAttributes ||
                    CdnrewriterAttributes != null &&
                    CdnrewriterAttributes.Equals(other.CdnrewriterAttributes)
                ) && 
                (
                    CdnRewriterDistributionDomain == other.CdnRewriterDistributionDomain ||
                    CdnRewriterDistributionDomain != null &&
                    CdnRewriterDistributionDomain.Equals(other.CdnRewriterDistributionDomain)
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
                    if (KeypairId != null)
                    hashCode = hashCode * 59 + KeypairId.GetHashCode();
                    if (KeypairAlias != null)
                    hashCode = hashCode * 59 + KeypairAlias.GetHashCode();
                    if (CdnrewriterAttributes != null)
                    hashCode = hashCode * 59 + CdnrewriterAttributes.GetHashCode();
                    if (CdnRewriterDistributionDomain != null)
                    hashCode = hashCode * 59 + CdnRewriterDistributionDomain.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties left, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties left, ComAdobeCqCdnRewriterImplAWSCloudFrontRewriterProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}