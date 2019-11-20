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
    /// ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties :  IEquatable<ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties" /> class.
        /// </summary>
        /// <param name="defaultTimeout">defaultTimeout.</param>
        /// <param name="maxTimeout">maxTimeout.</param>
        /// <param name="defaultPeriod">defaultPeriod.</param>
        public ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties(ConfigNodePropertyInteger defaultTimeout = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger maxTimeout = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger defaultPeriod = default(ConfigNodePropertyInteger))
        {
            this.DefaultTimeout = defaultTimeout;
            this.MaxTimeout = maxTimeout;
            this.DefaultPeriod = defaultPeriod;
        }
        
        /// <summary>
        /// Gets or Sets DefaultTimeout
        /// </summary>
        [DataMember(Name="default.timeout", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger DefaultTimeout { get; set; }

        /// <summary>
        /// Gets or Sets MaxTimeout
        /// </summary>
        [DataMember(Name="max.timeout", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MaxTimeout { get; set; }

        /// <summary>
        /// Gets or Sets DefaultPeriod
        /// </summary>
        [DataMember(Name="default.period", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger DefaultPeriod { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {\n");
            sb.Append("  DefaultTimeout: ").Append(DefaultTimeout).Append("\n");
            sb.Append("  MaxTimeout: ").Append(MaxTimeout).Append("\n");
            sb.Append("  DefaultPeriod: ").Append(DefaultPeriod).Append("\n");
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
            return this.Equals(input as ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DefaultTimeout == input.DefaultTimeout ||
                    (this.DefaultTimeout != null &&
                    this.DefaultTimeout.Equals(input.DefaultTimeout))
                ) && 
                (
                    this.MaxTimeout == input.MaxTimeout ||
                    (this.MaxTimeout != null &&
                    this.MaxTimeout.Equals(input.MaxTimeout))
                ) && 
                (
                    this.DefaultPeriod == input.DefaultPeriod ||
                    (this.DefaultPeriod != null &&
                    this.DefaultPeriod.Equals(input.DefaultPeriod))
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
                if (this.DefaultTimeout != null)
                    hashCode = hashCode * 59 + this.DefaultTimeout.GetHashCode();
                if (this.MaxTimeout != null)
                    hashCode = hashCode * 59 + this.MaxTimeout.GetHashCode();
                if (this.DefaultPeriod != null)
                    hashCode = hashCode * 59 + this.DefaultPeriod.GetHashCode();
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