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
    public partial class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties : IEquatable<ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties>
    { 
        /// <summary>
        /// Gets or Sets SchedulerPeriod
        /// </summary>
        [DataMember(Name="scheduler.period")]
        public ConfigNodePropertyInteger SchedulerPeriod { get; set; }

        /// <summary>
        /// Gets or Sets SchedulerConcurrent
        /// </summary>
        [DataMember(Name="scheduler.concurrent")]
        public ConfigNodePropertyBoolean SchedulerConcurrent { get; set; }

        /// <summary>
        /// Gets or Sets GoodLinkTestInterval
        /// </summary>
        [DataMember(Name="good_link_test_interval")]
        public ConfigNodePropertyInteger GoodLinkTestInterval { get; set; }

        /// <summary>
        /// Gets or Sets BadLinkTestInterval
        /// </summary>
        [DataMember(Name="bad_link_test_interval")]
        public ConfigNodePropertyInteger BadLinkTestInterval { get; set; }

        /// <summary>
        /// Gets or Sets LinkUnusedInterval
        /// </summary>
        [DataMember(Name="link_unused_interval")]
        public ConfigNodePropertyInteger LinkUnusedInterval { get; set; }

        /// <summary>
        /// Gets or Sets ConnectionTimeout
        /// </summary>
        [DataMember(Name="connection.timeout")]
        public ConfigNodePropertyInteger ConnectionTimeout { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties {\n");
            sb.Append("  SchedulerPeriod: ").Append(SchedulerPeriod).Append("\n");
            sb.Append("  SchedulerConcurrent: ").Append(SchedulerConcurrent).Append("\n");
            sb.Append("  GoodLinkTestInterval: ").Append(GoodLinkTestInterval).Append("\n");
            sb.Append("  BadLinkTestInterval: ").Append(BadLinkTestInterval).Append("\n");
            sb.Append("  LinkUnusedInterval: ").Append(LinkUnusedInterval).Append("\n");
            sb.Append("  ConnectionTimeout: ").Append(ConnectionTimeout).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties)obj);
        }

        /// <summary>
        /// Returns true if ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    SchedulerPeriod == other.SchedulerPeriod ||
                    SchedulerPeriod != null &&
                    SchedulerPeriod.Equals(other.SchedulerPeriod)
                ) && 
                (
                    SchedulerConcurrent == other.SchedulerConcurrent ||
                    SchedulerConcurrent != null &&
                    SchedulerConcurrent.Equals(other.SchedulerConcurrent)
                ) && 
                (
                    GoodLinkTestInterval == other.GoodLinkTestInterval ||
                    GoodLinkTestInterval != null &&
                    GoodLinkTestInterval.Equals(other.GoodLinkTestInterval)
                ) && 
                (
                    BadLinkTestInterval == other.BadLinkTestInterval ||
                    BadLinkTestInterval != null &&
                    BadLinkTestInterval.Equals(other.BadLinkTestInterval)
                ) && 
                (
                    LinkUnusedInterval == other.LinkUnusedInterval ||
                    LinkUnusedInterval != null &&
                    LinkUnusedInterval.Equals(other.LinkUnusedInterval)
                ) && 
                (
                    ConnectionTimeout == other.ConnectionTimeout ||
                    ConnectionTimeout != null &&
                    ConnectionTimeout.Equals(other.ConnectionTimeout)
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
                    if (SchedulerPeriod != null)
                    hashCode = hashCode * 59 + SchedulerPeriod.GetHashCode();
                    if (SchedulerConcurrent != null)
                    hashCode = hashCode * 59 + SchedulerConcurrent.GetHashCode();
                    if (GoodLinkTestInterval != null)
                    hashCode = hashCode * 59 + GoodLinkTestInterval.GetHashCode();
                    if (BadLinkTestInterval != null)
                    hashCode = hashCode * 59 + BadLinkTestInterval.GetHashCode();
                    if (LinkUnusedInterval != null)
                    hashCode = hashCode * 59 + LinkUnusedInterval.GetHashCode();
                    if (ConnectionTimeout != null)
                    hashCode = hashCode * 59 + ConnectionTimeout.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties left, ComDayCqRewriterLinkcheckerImplLinkCheckerTaskProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}