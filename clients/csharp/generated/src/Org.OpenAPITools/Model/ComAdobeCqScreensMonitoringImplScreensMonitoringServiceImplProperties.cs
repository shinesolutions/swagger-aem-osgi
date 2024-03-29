/* 
 * Adobe Experience Manager OSGI config (AEM) API
 *
 * Swagger AEM OSGI is an OpenAPI specification for Adobe Experience Manager (AEM) OSGI Configurations API
 *
 * OpenAPI spec version: 1.0.0-pre.0
 * Contact: opensource@shinesolutions.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties :  IEquatable<ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties" /> class.
        /// </summary>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername.</param>
        /// <param name="comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword">comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword.</param>
        public ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties(ConfigNodePropertyArray comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = default(ConfigNodePropertyArray), ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = default(ConfigNodePropertyString), ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = default(ConfigNodePropertyInteger), ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = default(ConfigNodePropertyString), ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = default(ConfigNodePropertyString), ConfigNodePropertyInteger comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = default(ConfigNodePropertyInteger), ConfigNodePropertyBoolean comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = default(ConfigNodePropertyBoolean), ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = default(ConfigNodePropertyString), ConfigNodePropertyString comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = default(ConfigNodePropertyString))
        {
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername;
            this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword = comAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword;
        }
        
        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.projectPath", EmitDefaultValue=false)]
        public ConfigNodePropertyArray ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.scheduleFrequency", EmitDefaultValue=false)]
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.pingTimeout", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.recipients", EmitDefaultValue=false)]
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpserver", EmitDefaultValue=false)]
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.smtpport", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.usetls", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.username", EmitDefaultValue=false)]
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername { get; set; }

        /// <summary>
        /// Gets or Sets ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword
        /// </summary>
        [DataMember(Name="com.adobe.cq.screens.monitoring.impl.ScreensMonitoringServiceImpl.password", EmitDefaultValue=false)]
        public ConfigNodePropertyString ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties {\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername).Append("\n");
            sb.Append("  ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword: ").Append(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername))
                ) && 
                (
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword == input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword ||
                    (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword != null &&
                    this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword.Equals(input.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword))
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
                int hashCode = 41;
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplProjectPath.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplScheduleFrequency.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPingTimeout.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplRecipients.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpserver.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplSmtpport.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsetls.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplUsername.GetHashCode();
                if (this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword != null)
                    hashCode = hashCode * 59 + this.ComAdobeCqScreensMonitoringImplScreensMonitoringServiceImplPassword.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
