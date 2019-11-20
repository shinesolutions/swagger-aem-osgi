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
    public partial class ComAdobeCqAccountApiAccountManagementServiceProperties : IEquatable<ComAdobeCqAccountApiAccountManagementServiceProperties>
    { 
        /// <summary>
        /// Gets or Sets CqAccountmanagerTokenValidityPeriod
        /// </summary>
        [DataMember(Name="cq.accountmanager.token.validity.period")]
        public ConfigNodePropertyInteger CqAccountmanagerTokenValidityPeriod { get; set; }

        /// <summary>
        /// Gets or Sets CqAccountmanagerConfigRequestnewaccountMail
        /// </summary>
        [DataMember(Name="cq.accountmanager.config.requestnewaccount.mail")]
        public ConfigNodePropertyString CqAccountmanagerConfigRequestnewaccountMail { get; set; }

        /// <summary>
        /// Gets or Sets CqAccountmanagerConfigRequestnewpwdMail
        /// </summary>
        [DataMember(Name="cq.accountmanager.config.requestnewpwd.mail")]
        public ConfigNodePropertyString CqAccountmanagerConfigRequestnewpwdMail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqAccountApiAccountManagementServiceProperties {\n");
            sb.Append("  CqAccountmanagerTokenValidityPeriod: ").Append(CqAccountmanagerTokenValidityPeriod).Append("\n");
            sb.Append("  CqAccountmanagerConfigRequestnewaccountMail: ").Append(CqAccountmanagerConfigRequestnewaccountMail).Append("\n");
            sb.Append("  CqAccountmanagerConfigRequestnewpwdMail: ").Append(CqAccountmanagerConfigRequestnewpwdMail).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeCqAccountApiAccountManagementServiceProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeCqAccountApiAccountManagementServiceProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeCqAccountApiAccountManagementServiceProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqAccountApiAccountManagementServiceProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CqAccountmanagerTokenValidityPeriod == other.CqAccountmanagerTokenValidityPeriod ||
                    CqAccountmanagerTokenValidityPeriod != null &&
                    CqAccountmanagerTokenValidityPeriod.Equals(other.CqAccountmanagerTokenValidityPeriod)
                ) && 
                (
                    CqAccountmanagerConfigRequestnewaccountMail == other.CqAccountmanagerConfigRequestnewaccountMail ||
                    CqAccountmanagerConfigRequestnewaccountMail != null &&
                    CqAccountmanagerConfigRequestnewaccountMail.Equals(other.CqAccountmanagerConfigRequestnewaccountMail)
                ) && 
                (
                    CqAccountmanagerConfigRequestnewpwdMail == other.CqAccountmanagerConfigRequestnewpwdMail ||
                    CqAccountmanagerConfigRequestnewpwdMail != null &&
                    CqAccountmanagerConfigRequestnewpwdMail.Equals(other.CqAccountmanagerConfigRequestnewpwdMail)
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
                    if (CqAccountmanagerTokenValidityPeriod != null)
                    hashCode = hashCode * 59 + CqAccountmanagerTokenValidityPeriod.GetHashCode();
                    if (CqAccountmanagerConfigRequestnewaccountMail != null)
                    hashCode = hashCode * 59 + CqAccountmanagerConfigRequestnewaccountMail.GetHashCode();
                    if (CqAccountmanagerConfigRequestnewpwdMail != null)
                    hashCode = hashCode * 59 + CqAccountmanagerConfigRequestnewpwdMail.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeCqAccountApiAccountManagementServiceProperties left, ComAdobeCqAccountApiAccountManagementServiceProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeCqAccountApiAccountManagementServiceProperties left, ComAdobeCqAccountApiAccountManagementServiceProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}