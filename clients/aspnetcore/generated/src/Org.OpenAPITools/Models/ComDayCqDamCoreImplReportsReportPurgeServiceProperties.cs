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
    public partial class ComDayCqDamCoreImplReportsReportPurgeServiceProperties : IEquatable<ComDayCqDamCoreImplReportsReportPurgeServiceProperties>
    { 
        /// <summary>
        /// Gets or Sets SchedulerExpression
        /// </summary>
        [DataMember(Name="scheduler.expression")]
        public ConfigNodePropertyString SchedulerExpression { get; set; }

        /// <summary>
        /// Gets or Sets MaxSavedReports
        /// </summary>
        [DataMember(Name="maxSavedReports")]
        public ConfigNodePropertyInteger MaxSavedReports { get; set; }

        /// <summary>
        /// Gets or Sets TimeDuration
        /// </summary>
        [DataMember(Name="timeDuration")]
        public ConfigNodePropertyInteger TimeDuration { get; set; }

        /// <summary>
        /// Gets or Sets EnableReportPurge
        /// </summary>
        [DataMember(Name="enableReportPurge")]
        public ConfigNodePropertyBoolean EnableReportPurge { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqDamCoreImplReportsReportPurgeServiceProperties {\n");
            sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
            sb.Append("  MaxSavedReports: ").Append(MaxSavedReports).Append("\n");
            sb.Append("  TimeDuration: ").Append(TimeDuration).Append("\n");
            sb.Append("  EnableReportPurge: ").Append(EnableReportPurge).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComDayCqDamCoreImplReportsReportPurgeServiceProperties)obj);
        }

        /// <summary>
        /// Returns true if ComDayCqDamCoreImplReportsReportPurgeServiceProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComDayCqDamCoreImplReportsReportPurgeServiceProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqDamCoreImplReportsReportPurgeServiceProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    SchedulerExpression == other.SchedulerExpression ||
                    SchedulerExpression != null &&
                    SchedulerExpression.Equals(other.SchedulerExpression)
                ) && 
                (
                    MaxSavedReports == other.MaxSavedReports ||
                    MaxSavedReports != null &&
                    MaxSavedReports.Equals(other.MaxSavedReports)
                ) && 
                (
                    TimeDuration == other.TimeDuration ||
                    TimeDuration != null &&
                    TimeDuration.Equals(other.TimeDuration)
                ) && 
                (
                    EnableReportPurge == other.EnableReportPurge ||
                    EnableReportPurge != null &&
                    EnableReportPurge.Equals(other.EnableReportPurge)
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
                    if (SchedulerExpression != null)
                    hashCode = hashCode * 59 + SchedulerExpression.GetHashCode();
                    if (MaxSavedReports != null)
                    hashCode = hashCode * 59 + MaxSavedReports.GetHashCode();
                    if (TimeDuration != null)
                    hashCode = hashCode * 59 + TimeDuration.GetHashCode();
                    if (EnableReportPurge != null)
                    hashCode = hashCode * 59 + EnableReportPurge.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComDayCqDamCoreImplReportsReportPurgeServiceProperties left, ComDayCqDamCoreImplReportsReportPurgeServiceProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComDayCqDamCoreImplReportsReportPurgeServiceProperties left, ComDayCqDamCoreImplReportsReportPurgeServiceProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}