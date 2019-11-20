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
    /// ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties :  IEquatable<ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties" /> class.
        /// </summary>
        /// <param name="dimDefaultMode">dimDefaultMode.</param>
        /// <param name="dimAppcacheEnabled">dimAppcacheEnabled.</param>
        public ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties(ConfigNodePropertyDropDown dimDefaultMode = default(ConfigNodePropertyDropDown), ConfigNodePropertyBoolean dimAppcacheEnabled = default(ConfigNodePropertyBoolean))
        {
            this.DimDefaultMode = dimDefaultMode;
            this.DimAppcacheEnabled = dimAppcacheEnabled;
        }
        
        /// <summary>
        /// Gets or Sets DimDefaultMode
        /// </summary>
        [DataMember(Name="dim.default.mode", EmitDefaultValue=false)]
        public ConfigNodePropertyDropDown DimDefaultMode { get; set; }

        /// <summary>
        /// Gets or Sets DimAppcacheEnabled
        /// </summary>
        [DataMember(Name="dim.appcache.enabled", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean DimAppcacheEnabled { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties {\n");
            sb.Append("  DimDefaultMode: ").Append(DimDefaultMode).Append("\n");
            sb.Append("  DimAppcacheEnabled: ").Append(DimAppcacheEnabled).Append("\n");
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
            return this.Equals(input as ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqWcmCoreImplDevicedetectionDeviceIdentificationModeImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.DimDefaultMode == input.DimDefaultMode ||
                    (this.DimDefaultMode != null &&
                    this.DimDefaultMode.Equals(input.DimDefaultMode))
                ) && 
                (
                    this.DimAppcacheEnabled == input.DimAppcacheEnabled ||
                    (this.DimAppcacheEnabled != null &&
                    this.DimAppcacheEnabled.Equals(input.DimAppcacheEnabled))
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
                if (this.DimDefaultMode != null)
                    hashCode = hashCode * 59 + this.DimDefaultMode.GetHashCode();
                if (this.DimAppcacheEnabled != null)
                    hashCode = hashCode * 59 + this.DimAppcacheEnabled.GetHashCode();
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