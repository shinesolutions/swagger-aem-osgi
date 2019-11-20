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
    /// OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties
    /// </summary>
    [DataContract]
    public partial class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties :  IEquatable<OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties" /> class.
        /// </summary>
        /// <param name="description">description.</param>
        /// <param name="overrides">overrides.</param>
        /// <param name="enabled">enabled.</param>
        /// <param name="serviceRanking">serviceRanking.</param>
        public OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties(ConfigNodePropertyString description = default(ConfigNodePropertyString), ConfigNodePropertyArray overrides = default(ConfigNodePropertyArray), ConfigNodePropertyBoolean enabled = default(ConfigNodePropertyBoolean), ConfigNodePropertyInteger serviceRanking = default(ConfigNodePropertyInteger))
        {
            this.Description = description;
            this.Overrides = overrides;
            this.Enabled = enabled;
            this.ServiceRanking = serviceRanking;
        }
        
        /// <summary>
        /// Gets or Sets Description
        /// </summary>
        [DataMember(Name="description", EmitDefaultValue=false)]
        public ConfigNodePropertyString Description { get; set; }

        /// <summary>
        /// Gets or Sets Overrides
        /// </summary>
        [DataMember(Name="overrides", EmitDefaultValue=false)]
        public ConfigNodePropertyArray Overrides { get; set; }

        /// <summary>
        /// Gets or Sets Enabled
        /// </summary>
        [DataMember(Name="enabled", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean Enabled { get; set; }

        /// <summary>
        /// Gets or Sets ServiceRanking
        /// </summary>
        [DataMember(Name="service.ranking", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger ServiceRanking { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties {\n");
            sb.Append("  Description: ").Append(Description).Append("\n");
            sb.Append("  Overrides: ").Append(Overrides).Append("\n");
            sb.Append("  Enabled: ").Append(Enabled).Append("\n");
            sb.Append("  ServiceRanking: ").Append(ServiceRanking).Append("\n");
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
            return this.Equals(input as OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties);
        }

        /// <summary>
        /// Returns true if OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheSlingCaconfigImplOverrideOsgiConfigurationOverrideProviProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Description == input.Description ||
                    (this.Description != null &&
                    this.Description.Equals(input.Description))
                ) && 
                (
                    this.Overrides == input.Overrides ||
                    (this.Overrides != null &&
                    this.Overrides.Equals(input.Overrides))
                ) && 
                (
                    this.Enabled == input.Enabled ||
                    (this.Enabled != null &&
                    this.Enabled.Equals(input.Enabled))
                ) && 
                (
                    this.ServiceRanking == input.ServiceRanking ||
                    (this.ServiceRanking != null &&
                    this.ServiceRanking.Equals(input.ServiceRanking))
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
                if (this.Description != null)
                    hashCode = hashCode * 59 + this.Description.GetHashCode();
                if (this.Overrides != null)
                    hashCode = hashCode * 59 + this.Overrides.GetHashCode();
                if (this.Enabled != null)
                    hashCode = hashCode * 59 + this.Enabled.GetHashCode();
                if (this.ServiceRanking != null)
                    hashCode = hashCode * 59 + this.ServiceRanking.GetHashCode();
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