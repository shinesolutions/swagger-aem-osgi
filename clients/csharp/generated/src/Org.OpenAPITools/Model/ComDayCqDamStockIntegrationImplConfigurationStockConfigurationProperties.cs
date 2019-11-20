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
    /// ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties :  IEquatable<ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties" /> class.
        /// </summary>
        /// <param name="name">name.</param>
        /// <param name="locale">locale.</param>
        /// <param name="imsConfig">imsConfig.</param>
        public ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties(ConfigNodePropertyString name = default(ConfigNodePropertyString), ConfigNodePropertyString locale = default(ConfigNodePropertyString), ConfigNodePropertyString imsConfig = default(ConfigNodePropertyString))
        {
            this.Name = name;
            this.Locale = locale;
            this.ImsConfig = imsConfig;
        }
        
        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public ConfigNodePropertyString Name { get; set; }

        /// <summary>
        /// Gets or Sets Locale
        /// </summary>
        [DataMember(Name="locale", EmitDefaultValue=false)]
        public ConfigNodePropertyString Locale { get; set; }

        /// <summary>
        /// Gets or Sets ImsConfig
        /// </summary>
        [DataMember(Name="imsConfig", EmitDefaultValue=false)]
        public ConfigNodePropertyString ImsConfig { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Locale: ").Append(Locale).Append("\n");
            sb.Append("  ImsConfig: ").Append(ImsConfig).Append("\n");
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
            return this.Equals(input as ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqDamStockIntegrationImplConfigurationStockConfigurationProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Locale == input.Locale ||
                    (this.Locale != null &&
                    this.Locale.Equals(input.Locale))
                ) && 
                (
                    this.ImsConfig == input.ImsConfig ||
                    (this.ImsConfig != null &&
                    this.ImsConfig.Equals(input.ImsConfig))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Locale != null)
                    hashCode = hashCode * 59 + this.Locale.GetHashCode();
                if (this.ImsConfig != null)
                    hashCode = hashCode * 59 + this.ImsConfig.GetHashCode();
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