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
    /// ComDayCqWcmCoreImplVersionPurgeTaskProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqWcmCoreImplVersionPurgeTaskProperties :  IEquatable<ComDayCqWcmCoreImplVersionPurgeTaskProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqWcmCoreImplVersionPurgeTaskProperties" /> class.
        /// </summary>
        /// <param name="versionpurgePaths">versionpurgePaths.</param>
        /// <param name="versionpurgeRecursive">versionpurgeRecursive.</param>
        /// <param name="versionpurgeMaxVersions">versionpurgeMaxVersions.</param>
        /// <param name="versionpurgeMinVersions">versionpurgeMinVersions.</param>
        /// <param name="versionpurgeMaxAgeDays">versionpurgeMaxAgeDays.</param>
        public ComDayCqWcmCoreImplVersionPurgeTaskProperties(ConfigNodePropertyArray versionpurgePaths = default(ConfigNodePropertyArray), ConfigNodePropertyBoolean versionpurgeRecursive = default(ConfigNodePropertyBoolean), ConfigNodePropertyInteger versionpurgeMaxVersions = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger versionpurgeMinVersions = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger versionpurgeMaxAgeDays = default(ConfigNodePropertyInteger))
        {
            this.VersionpurgePaths = versionpurgePaths;
            this.VersionpurgeRecursive = versionpurgeRecursive;
            this.VersionpurgeMaxVersions = versionpurgeMaxVersions;
            this.VersionpurgeMinVersions = versionpurgeMinVersions;
            this.VersionpurgeMaxAgeDays = versionpurgeMaxAgeDays;
        }
        
        /// <summary>
        /// Gets or Sets VersionpurgePaths
        /// </summary>
        [DataMember(Name="versionpurge.paths", EmitDefaultValue=false)]
        public ConfigNodePropertyArray VersionpurgePaths { get; set; }

        /// <summary>
        /// Gets or Sets VersionpurgeRecursive
        /// </summary>
        [DataMember(Name="versionpurge.recursive", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean VersionpurgeRecursive { get; set; }

        /// <summary>
        /// Gets or Sets VersionpurgeMaxVersions
        /// </summary>
        [DataMember(Name="versionpurge.maxVersions", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger VersionpurgeMaxVersions { get; set; }

        /// <summary>
        /// Gets or Sets VersionpurgeMinVersions
        /// </summary>
        [DataMember(Name="versionpurge.minVersions", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger VersionpurgeMinVersions { get; set; }

        /// <summary>
        /// Gets or Sets VersionpurgeMaxAgeDays
        /// </summary>
        [DataMember(Name="versionpurge.maxAgeDays", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger VersionpurgeMaxAgeDays { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqWcmCoreImplVersionPurgeTaskProperties {\n");
            sb.Append("  VersionpurgePaths: ").Append(VersionpurgePaths).Append("\n");
            sb.Append("  VersionpurgeRecursive: ").Append(VersionpurgeRecursive).Append("\n");
            sb.Append("  VersionpurgeMaxVersions: ").Append(VersionpurgeMaxVersions).Append("\n");
            sb.Append("  VersionpurgeMinVersions: ").Append(VersionpurgeMinVersions).Append("\n");
            sb.Append("  VersionpurgeMaxAgeDays: ").Append(VersionpurgeMaxAgeDays).Append("\n");
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
            return this.Equals(input as ComDayCqWcmCoreImplVersionPurgeTaskProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqWcmCoreImplVersionPurgeTaskProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqWcmCoreImplVersionPurgeTaskProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqWcmCoreImplVersionPurgeTaskProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.VersionpurgePaths == input.VersionpurgePaths ||
                    (this.VersionpurgePaths != null &&
                    this.VersionpurgePaths.Equals(input.VersionpurgePaths))
                ) && 
                (
                    this.VersionpurgeRecursive == input.VersionpurgeRecursive ||
                    (this.VersionpurgeRecursive != null &&
                    this.VersionpurgeRecursive.Equals(input.VersionpurgeRecursive))
                ) && 
                (
                    this.VersionpurgeMaxVersions == input.VersionpurgeMaxVersions ||
                    (this.VersionpurgeMaxVersions != null &&
                    this.VersionpurgeMaxVersions.Equals(input.VersionpurgeMaxVersions))
                ) && 
                (
                    this.VersionpurgeMinVersions == input.VersionpurgeMinVersions ||
                    (this.VersionpurgeMinVersions != null &&
                    this.VersionpurgeMinVersions.Equals(input.VersionpurgeMinVersions))
                ) && 
                (
                    this.VersionpurgeMaxAgeDays == input.VersionpurgeMaxAgeDays ||
                    (this.VersionpurgeMaxAgeDays != null &&
                    this.VersionpurgeMaxAgeDays.Equals(input.VersionpurgeMaxAgeDays))
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
                if (this.VersionpurgePaths != null)
                    hashCode = hashCode * 59 + this.VersionpurgePaths.GetHashCode();
                if (this.VersionpurgeRecursive != null)
                    hashCode = hashCode * 59 + this.VersionpurgeRecursive.GetHashCode();
                if (this.VersionpurgeMaxVersions != null)
                    hashCode = hashCode * 59 + this.VersionpurgeMaxVersions.GetHashCode();
                if (this.VersionpurgeMinVersions != null)
                    hashCode = hashCode * 59 + this.VersionpurgeMinVersions.GetHashCode();
                if (this.VersionpurgeMaxAgeDays != null)
                    hashCode = hashCode * 59 + this.VersionpurgeMaxAgeDays.GetHashCode();
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