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
    /// ComAdobeCqSocialGroupImplGroupServiceImplProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeCqSocialGroupImplGroupServiceImplProperties :  IEquatable<ComAdobeCqSocialGroupImplGroupServiceImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeCqSocialGroupImplGroupServiceImplProperties" /> class.
        /// </summary>
        /// <param name="maxWaitTime">maxWaitTime.</param>
        /// <param name="minWaitBetweenRetries">minWaitBetweenRetries.</param>
        public ComAdobeCqSocialGroupImplGroupServiceImplProperties(ConfigNodePropertyInteger maxWaitTime = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger minWaitBetweenRetries = default(ConfigNodePropertyInteger))
        {
            this.MaxWaitTime = maxWaitTime;
            this.MinWaitBetweenRetries = minWaitBetweenRetries;
        }
        
        /// <summary>
        /// Gets or Sets MaxWaitTime
        /// </summary>
        [DataMember(Name="maxWaitTime", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MaxWaitTime { get; set; }

        /// <summary>
        /// Gets or Sets MinWaitBetweenRetries
        /// </summary>
        [DataMember(Name="minWaitBetweenRetries", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger MinWaitBetweenRetries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqSocialGroupImplGroupServiceImplProperties {\n");
            sb.Append("  MaxWaitTime: ").Append(MaxWaitTime).Append("\n");
            sb.Append("  MinWaitBetweenRetries: ").Append(MinWaitBetweenRetries).Append("\n");
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
            return this.Equals(input as ComAdobeCqSocialGroupImplGroupServiceImplProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeCqSocialGroupImplGroupServiceImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeCqSocialGroupImplGroupServiceImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqSocialGroupImplGroupServiceImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MaxWaitTime == input.MaxWaitTime ||
                    (this.MaxWaitTime != null &&
                    this.MaxWaitTime.Equals(input.MaxWaitTime))
                ) && 
                (
                    this.MinWaitBetweenRetries == input.MinWaitBetweenRetries ||
                    (this.MinWaitBetweenRetries != null &&
                    this.MinWaitBetweenRetries.Equals(input.MinWaitBetweenRetries))
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
                if (this.MaxWaitTime != null)
                    hashCode = hashCode * 59 + this.MaxWaitTime.GetHashCode();
                if (this.MinWaitBetweenRetries != null)
                    hashCode = hashCode * 59 + this.MinWaitBetweenRetries.GetHashCode();
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