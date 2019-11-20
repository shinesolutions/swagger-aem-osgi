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
    /// ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties :  IEquatable<ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties" /> class.
        /// </summary>
        /// <param name="cqDamDrmEnable">cqDamDrmEnable.</param>
        public ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties(ConfigNodePropertyBoolean cqDamDrmEnable = default(ConfigNodePropertyBoolean))
        {
            this.CqDamDrmEnable = cqDamDrmEnable;
        }
        
        /// <summary>
        /// Gets or Sets CqDamDrmEnable
        /// </summary>
        [DataMember(Name="cq.dam.drm.enable", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean CqDamDrmEnable { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties {\n");
            sb.Append("  CqDamDrmEnable: ").Append(CqDamDrmEnable).Append("\n");
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
            return this.Equals(input as ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqDamCoreImplServletMultipleLicenseAcceptServletProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CqDamDrmEnable == input.CqDamDrmEnable ||
                    (this.CqDamDrmEnable != null &&
                    this.CqDamDrmEnable.Equals(input.CqDamDrmEnable))
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
                if (this.CqDamDrmEnable != null)
                    hashCode = hashCode * 59 + this.CqDamDrmEnable.GetHashCode();
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