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
    /// ComDayCqMcmCampaignImplIntegrationConfigImplProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqMcmCampaignImplIntegrationConfigImplProperties :  IEquatable<ComDayCqMcmCampaignImplIntegrationConfigImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqMcmCampaignImplIntegrationConfigImplProperties" /> class.
        /// </summary>
        /// <param name="aemMcmCampaignFormConstraints">aemMcmCampaignFormConstraints.</param>
        /// <param name="aemMcmCampaignPublicUrl">aemMcmCampaignPublicUrl.</param>
        /// <param name="aemMcmCampaignRelaxedSSL">aemMcmCampaignRelaxedSSL.</param>
        public ComDayCqMcmCampaignImplIntegrationConfigImplProperties(ConfigNodePropertyArray aemMcmCampaignFormConstraints = default(ConfigNodePropertyArray), ConfigNodePropertyString aemMcmCampaignPublicUrl = default(ConfigNodePropertyString), ConfigNodePropertyBoolean aemMcmCampaignRelaxedSSL = default(ConfigNodePropertyBoolean))
        {
            this.AemMcmCampaignFormConstraints = aemMcmCampaignFormConstraints;
            this.AemMcmCampaignPublicUrl = aemMcmCampaignPublicUrl;
            this.AemMcmCampaignRelaxedSSL = aemMcmCampaignRelaxedSSL;
        }
        
        /// <summary>
        /// Gets or Sets AemMcmCampaignFormConstraints
        /// </summary>
        [DataMember(Name="aem.mcm.campaign.formConstraints", EmitDefaultValue=false)]
        public ConfigNodePropertyArray AemMcmCampaignFormConstraints { get; set; }

        /// <summary>
        /// Gets or Sets AemMcmCampaignPublicUrl
        /// </summary>
        [DataMember(Name="aem.mcm.campaign.publicUrl", EmitDefaultValue=false)]
        public ConfigNodePropertyString AemMcmCampaignPublicUrl { get; set; }

        /// <summary>
        /// Gets or Sets AemMcmCampaignRelaxedSSL
        /// </summary>
        [DataMember(Name="aem.mcm.campaign.relaxedSSL", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean AemMcmCampaignRelaxedSSL { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqMcmCampaignImplIntegrationConfigImplProperties {\n");
            sb.Append("  AemMcmCampaignFormConstraints: ").Append(AemMcmCampaignFormConstraints).Append("\n");
            sb.Append("  AemMcmCampaignPublicUrl: ").Append(AemMcmCampaignPublicUrl).Append("\n");
            sb.Append("  AemMcmCampaignRelaxedSSL: ").Append(AemMcmCampaignRelaxedSSL).Append("\n");
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
            return this.Equals(input as ComDayCqMcmCampaignImplIntegrationConfigImplProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqMcmCampaignImplIntegrationConfigImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqMcmCampaignImplIntegrationConfigImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqMcmCampaignImplIntegrationConfigImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.AemMcmCampaignFormConstraints == input.AemMcmCampaignFormConstraints ||
                    (this.AemMcmCampaignFormConstraints != null &&
                    this.AemMcmCampaignFormConstraints.Equals(input.AemMcmCampaignFormConstraints))
                ) && 
                (
                    this.AemMcmCampaignPublicUrl == input.AemMcmCampaignPublicUrl ||
                    (this.AemMcmCampaignPublicUrl != null &&
                    this.AemMcmCampaignPublicUrl.Equals(input.AemMcmCampaignPublicUrl))
                ) && 
                (
                    this.AemMcmCampaignRelaxedSSL == input.AemMcmCampaignRelaxedSSL ||
                    (this.AemMcmCampaignRelaxedSSL != null &&
                    this.AemMcmCampaignRelaxedSSL.Equals(input.AemMcmCampaignRelaxedSSL))
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
                if (this.AemMcmCampaignFormConstraints != null)
                    hashCode = hashCode * 59 + this.AemMcmCampaignFormConstraints.GetHashCode();
                if (this.AemMcmCampaignPublicUrl != null)
                    hashCode = hashCode * 59 + this.AemMcmCampaignPublicUrl.GetHashCode();
                if (this.AemMcmCampaignRelaxedSSL != null)
                    hashCode = hashCode * 59 + this.AemMcmCampaignRelaxedSSL.GetHashCode();
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