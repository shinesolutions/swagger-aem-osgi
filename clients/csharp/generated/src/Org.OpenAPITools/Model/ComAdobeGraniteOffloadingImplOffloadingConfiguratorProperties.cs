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
    /// ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties :  IEquatable<ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties" /> class.
        /// </summary>
        /// <param name="offloadingTransporter">offloadingTransporter.</param>
        /// <param name="offloadingCleanupPayload">offloadingCleanupPayload.</param>
        public ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties(ConfigNodePropertyString offloadingTransporter = default(ConfigNodePropertyString), ConfigNodePropertyBoolean offloadingCleanupPayload = default(ConfigNodePropertyBoolean))
        {
            this.OffloadingTransporter = offloadingTransporter;
            this.OffloadingCleanupPayload = offloadingCleanupPayload;
        }
        
        /// <summary>
        /// Gets or Sets OffloadingTransporter
        /// </summary>
        [DataMember(Name="offloading.transporter", EmitDefaultValue=false)]
        public ConfigNodePropertyString OffloadingTransporter { get; set; }

        /// <summary>
        /// Gets or Sets OffloadingCleanupPayload
        /// </summary>
        [DataMember(Name="offloading.cleanup.payload", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean OffloadingCleanupPayload { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties {\n");
            sb.Append("  OffloadingTransporter: ").Append(OffloadingTransporter).Append("\n");
            sb.Append("  OffloadingCleanupPayload: ").Append(OffloadingCleanupPayload).Append("\n");
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
            return this.Equals(input as ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeGraniteOffloadingImplOffloadingConfiguratorProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OffloadingTransporter == input.OffloadingTransporter ||
                    (this.OffloadingTransporter != null &&
                    this.OffloadingTransporter.Equals(input.OffloadingTransporter))
                ) && 
                (
                    this.OffloadingCleanupPayload == input.OffloadingCleanupPayload ||
                    (this.OffloadingCleanupPayload != null &&
                    this.OffloadingCleanupPayload.Equals(input.OffloadingCleanupPayload))
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
                if (this.OffloadingTransporter != null)
                    hashCode = hashCode * 59 + this.OffloadingTransporter.GetHashCode();
                if (this.OffloadingCleanupPayload != null)
                    hashCode = hashCode * 59 + this.OffloadingCleanupPayload.GetHashCode();
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