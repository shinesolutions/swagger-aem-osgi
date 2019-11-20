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
    /// ComDayCqAuthImplCugCugSupportImplProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqAuthImplCugCugSupportImplProperties :  IEquatable<ComDayCqAuthImplCugCugSupportImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqAuthImplCugCugSupportImplProperties" /> class.
        /// </summary>
        /// <param name="cugExemptedPrincipals">cugExemptedPrincipals.</param>
        /// <param name="cugEnabled">cugEnabled.</param>
        /// <param name="cugPrincipalsRegex">cugPrincipalsRegex.</param>
        /// <param name="cugPrincipalsReplacement">cugPrincipalsReplacement.</param>
        public ComDayCqAuthImplCugCugSupportImplProperties(ConfigNodePropertyArray cugExemptedPrincipals = default(ConfigNodePropertyArray), ConfigNodePropertyBoolean cugEnabled = default(ConfigNodePropertyBoolean), ConfigNodePropertyString cugPrincipalsRegex = default(ConfigNodePropertyString), ConfigNodePropertyString cugPrincipalsReplacement = default(ConfigNodePropertyString))
        {
            this.CugExemptedPrincipals = cugExemptedPrincipals;
            this.CugEnabled = cugEnabled;
            this.CugPrincipalsRegex = cugPrincipalsRegex;
            this.CugPrincipalsReplacement = cugPrincipalsReplacement;
        }
        
        /// <summary>
        /// Gets or Sets CugExemptedPrincipals
        /// </summary>
        [DataMember(Name="cug.exempted.principals", EmitDefaultValue=false)]
        public ConfigNodePropertyArray CugExemptedPrincipals { get; set; }

        /// <summary>
        /// Gets or Sets CugEnabled
        /// </summary>
        [DataMember(Name="cug.enabled", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean CugEnabled { get; set; }

        /// <summary>
        /// Gets or Sets CugPrincipalsRegex
        /// </summary>
        [DataMember(Name="cug.principals.regex", EmitDefaultValue=false)]
        public ConfigNodePropertyString CugPrincipalsRegex { get; set; }

        /// <summary>
        /// Gets or Sets CugPrincipalsReplacement
        /// </summary>
        [DataMember(Name="cug.principals.replacement", EmitDefaultValue=false)]
        public ConfigNodePropertyString CugPrincipalsReplacement { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqAuthImplCugCugSupportImplProperties {\n");
            sb.Append("  CugExemptedPrincipals: ").Append(CugExemptedPrincipals).Append("\n");
            sb.Append("  CugEnabled: ").Append(CugEnabled).Append("\n");
            sb.Append("  CugPrincipalsRegex: ").Append(CugPrincipalsRegex).Append("\n");
            sb.Append("  CugPrincipalsReplacement: ").Append(CugPrincipalsReplacement).Append("\n");
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
            return this.Equals(input as ComDayCqAuthImplCugCugSupportImplProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqAuthImplCugCugSupportImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqAuthImplCugCugSupportImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqAuthImplCugCugSupportImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CugExemptedPrincipals == input.CugExemptedPrincipals ||
                    (this.CugExemptedPrincipals != null &&
                    this.CugExemptedPrincipals.Equals(input.CugExemptedPrincipals))
                ) && 
                (
                    this.CugEnabled == input.CugEnabled ||
                    (this.CugEnabled != null &&
                    this.CugEnabled.Equals(input.CugEnabled))
                ) && 
                (
                    this.CugPrincipalsRegex == input.CugPrincipalsRegex ||
                    (this.CugPrincipalsRegex != null &&
                    this.CugPrincipalsRegex.Equals(input.CugPrincipalsRegex))
                ) && 
                (
                    this.CugPrincipalsReplacement == input.CugPrincipalsReplacement ||
                    (this.CugPrincipalsReplacement != null &&
                    this.CugPrincipalsReplacement.Equals(input.CugPrincipalsReplacement))
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
                if (this.CugExemptedPrincipals != null)
                    hashCode = hashCode * 59 + this.CugExemptedPrincipals.GetHashCode();
                if (this.CugEnabled != null)
                    hashCode = hashCode * 59 + this.CugEnabled.GetHashCode();
                if (this.CugPrincipalsRegex != null)
                    hashCode = hashCode * 59 + this.CugPrincipalsRegex.GetHashCode();
                if (this.CugPrincipalsReplacement != null)
                    hashCode = hashCode * 59 + this.CugPrincipalsReplacement.GetHashCode();
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