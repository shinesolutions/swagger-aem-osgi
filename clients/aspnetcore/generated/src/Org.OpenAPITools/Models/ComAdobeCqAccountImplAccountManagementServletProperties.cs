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
    public partial class ComAdobeCqAccountImplAccountManagementServletProperties : IEquatable<ComAdobeCqAccountImplAccountManagementServletProperties>
    { 
        /// <summary>
        /// Gets or Sets CqAccountmanagerConfigInformnewaccountMail
        /// </summary>
        [DataMember(Name="cq.accountmanager.config.informnewaccount.mail")]
        public ConfigNodePropertyString CqAccountmanagerConfigInformnewaccountMail { get; set; }

        /// <summary>
        /// Gets or Sets CqAccountmanagerConfigInformnewpwdMail
        /// </summary>
        [DataMember(Name="cq.accountmanager.config.informnewpwd.mail")]
        public ConfigNodePropertyString CqAccountmanagerConfigInformnewpwdMail { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqAccountImplAccountManagementServletProperties {\n");
            sb.Append("  CqAccountmanagerConfigInformnewaccountMail: ").Append(CqAccountmanagerConfigInformnewaccountMail).Append("\n");
            sb.Append("  CqAccountmanagerConfigInformnewpwdMail: ").Append(CqAccountmanagerConfigInformnewpwdMail).Append("\n");
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
            return obj.GetType() == GetType() && Equals((ComAdobeCqAccountImplAccountManagementServletProperties)obj);
        }

        /// <summary>
        /// Returns true if ComAdobeCqAccountImplAccountManagementServletProperties instances are equal
        /// </summary>
        /// <param name="other">Instance of ComAdobeCqAccountImplAccountManagementServletProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqAccountImplAccountManagementServletProperties other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    CqAccountmanagerConfigInformnewaccountMail == other.CqAccountmanagerConfigInformnewaccountMail ||
                    CqAccountmanagerConfigInformnewaccountMail != null &&
                    CqAccountmanagerConfigInformnewaccountMail.Equals(other.CqAccountmanagerConfigInformnewaccountMail)
                ) && 
                (
                    CqAccountmanagerConfigInformnewpwdMail == other.CqAccountmanagerConfigInformnewpwdMail ||
                    CqAccountmanagerConfigInformnewpwdMail != null &&
                    CqAccountmanagerConfigInformnewpwdMail.Equals(other.CqAccountmanagerConfigInformnewpwdMail)
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
                    if (CqAccountmanagerConfigInformnewaccountMail != null)
                    hashCode = hashCode * 59 + CqAccountmanagerConfigInformnewaccountMail.GetHashCode();
                    if (CqAccountmanagerConfigInformnewpwdMail != null)
                    hashCode = hashCode * 59 + CqAccountmanagerConfigInformnewpwdMail.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(ComAdobeCqAccountImplAccountManagementServletProperties left, ComAdobeCqAccountImplAccountManagementServletProperties right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(ComAdobeCqAccountImplAccountManagementServletProperties left, ComAdobeCqAccountImplAccountManagementServletProperties right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}