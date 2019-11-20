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
    /// ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties :  IEquatable<ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties" /> class.
        /// </summary>
        /// <param name="cqDamScene7AssetmimetypeserviceMapping">cqDamScene7AssetmimetypeserviceMapping.</param>
        public ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties(ConfigNodePropertyArray cqDamScene7AssetmimetypeserviceMapping = default(ConfigNodePropertyArray))
        {
            this.CqDamScene7AssetmimetypeserviceMapping = cqDamScene7AssetmimetypeserviceMapping;
        }
        
        /// <summary>
        /// Gets or Sets CqDamScene7AssetmimetypeserviceMapping
        /// </summary>
        [DataMember(Name="cq.dam.scene7.assetmimetypeservice.mapping", EmitDefaultValue=false)]
        public ConfigNodePropertyArray CqDamScene7AssetmimetypeserviceMapping { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties {\n");
            sb.Append("  CqDamScene7AssetmimetypeserviceMapping: ").Append(CqDamScene7AssetmimetypeserviceMapping).Append("\n");
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
            return this.Equals(input as ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqDamScene7ImplScene7AssetMimeTypeServiceImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CqDamScene7AssetmimetypeserviceMapping == input.CqDamScene7AssetmimetypeserviceMapping ||
                    (this.CqDamScene7AssetmimetypeserviceMapping != null &&
                    this.CqDamScene7AssetmimetypeserviceMapping.Equals(input.CqDamScene7AssetmimetypeserviceMapping))
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
                if (this.CqDamScene7AssetmimetypeserviceMapping != null)
                    hashCode = hashCode * 59 + this.CqDamScene7AssetmimetypeserviceMapping.GetHashCode();
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