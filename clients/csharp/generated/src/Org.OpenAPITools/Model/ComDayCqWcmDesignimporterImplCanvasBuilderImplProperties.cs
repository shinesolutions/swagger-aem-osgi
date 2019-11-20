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
    /// ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties :  IEquatable<ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties" /> class.
        /// </summary>
        /// <param name="filepattern">filepattern.</param>
        /// <param name="buildPageNodes">buildPageNodes.</param>
        /// <param name="buildClientLibs">buildClientLibs.</param>
        /// <param name="buildCanvasComponent">buildCanvasComponent.</param>
        public ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties(ConfigNodePropertyString filepattern = default(ConfigNodePropertyString), ConfigNodePropertyBoolean buildPageNodes = default(ConfigNodePropertyBoolean), ConfigNodePropertyBoolean buildClientLibs = default(ConfigNodePropertyBoolean), ConfigNodePropertyBoolean buildCanvasComponent = default(ConfigNodePropertyBoolean))
        {
            this.Filepattern = filepattern;
            this.BuildPageNodes = buildPageNodes;
            this.BuildClientLibs = buildClientLibs;
            this.BuildCanvasComponent = buildCanvasComponent;
        }
        
        /// <summary>
        /// Gets or Sets Filepattern
        /// </summary>
        [DataMember(Name="filepattern", EmitDefaultValue=false)]
        public ConfigNodePropertyString Filepattern { get; set; }

        /// <summary>
        /// Gets or Sets BuildPageNodes
        /// </summary>
        [DataMember(Name="build.page.nodes", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean BuildPageNodes { get; set; }

        /// <summary>
        /// Gets or Sets BuildClientLibs
        /// </summary>
        [DataMember(Name="build.client.libs", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean BuildClientLibs { get; set; }

        /// <summary>
        /// Gets or Sets BuildCanvasComponent
        /// </summary>
        [DataMember(Name="build.canvas.component", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean BuildCanvasComponent { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties {\n");
            sb.Append("  Filepattern: ").Append(Filepattern).Append("\n");
            sb.Append("  BuildPageNodes: ").Append(BuildPageNodes).Append("\n");
            sb.Append("  BuildClientLibs: ").Append(BuildClientLibs).Append("\n");
            sb.Append("  BuildCanvasComponent: ").Append(BuildCanvasComponent).Append("\n");
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
            return this.Equals(input as ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqWcmDesignimporterImplCanvasBuilderImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Filepattern == input.Filepattern ||
                    (this.Filepattern != null &&
                    this.Filepattern.Equals(input.Filepattern))
                ) && 
                (
                    this.BuildPageNodes == input.BuildPageNodes ||
                    (this.BuildPageNodes != null &&
                    this.BuildPageNodes.Equals(input.BuildPageNodes))
                ) && 
                (
                    this.BuildClientLibs == input.BuildClientLibs ||
                    (this.BuildClientLibs != null &&
                    this.BuildClientLibs.Equals(input.BuildClientLibs))
                ) && 
                (
                    this.BuildCanvasComponent == input.BuildCanvasComponent ||
                    (this.BuildCanvasComponent != null &&
                    this.BuildCanvasComponent.Equals(input.BuildCanvasComponent))
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
                if (this.Filepattern != null)
                    hashCode = hashCode * 59 + this.Filepattern.GetHashCode();
                if (this.BuildPageNodes != null)
                    hashCode = hashCode * 59 + this.BuildPageNodes.GetHashCode();
                if (this.BuildClientLibs != null)
                    hashCode = hashCode * 59 + this.BuildClientLibs.GetHashCode();
                if (this.BuildCanvasComponent != null)
                    hashCode = hashCode * 59 + this.BuildCanvasComponent.GetHashCode();
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