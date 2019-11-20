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
    /// ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties :  IEquatable<ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties" /> class.
        /// </summary>
        /// <param name="cacheEnable">cacheEnable.</param>
        /// <param name="cacheRootPaths">cacheRootPaths.</param>
        /// <param name="cacheMaxSize">cacheMaxSize.</param>
        /// <param name="cacheMaxEntries">cacheMaxEntries.</param>
        public ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties(ConfigNodePropertyBoolean cacheEnable = default(ConfigNodePropertyBoolean), ConfigNodePropertyArray cacheRootPaths = default(ConfigNodePropertyArray), ConfigNodePropertyInteger cacheMaxSize = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger cacheMaxEntries = default(ConfigNodePropertyInteger))
        {
            this.CacheEnable = cacheEnable;
            this.CacheRootPaths = cacheRootPaths;
            this.CacheMaxSize = cacheMaxSize;
            this.CacheMaxEntries = cacheMaxEntries;
        }
        
        /// <summary>
        /// Gets or Sets CacheEnable
        /// </summary>
        [DataMember(Name="cache.enable", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean CacheEnable { get; set; }

        /// <summary>
        /// Gets or Sets CacheRootPaths
        /// </summary>
        [DataMember(Name="cache.rootPaths", EmitDefaultValue=false)]
        public ConfigNodePropertyArray CacheRootPaths { get; set; }

        /// <summary>
        /// Gets or Sets CacheMaxSize
        /// </summary>
        [DataMember(Name="cache.maxSize", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger CacheMaxSize { get; set; }

        /// <summary>
        /// Gets or Sets CacheMaxEntries
        /// </summary>
        [DataMember(Name="cache.maxEntries", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger CacheMaxEntries { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties {\n");
            sb.Append("  CacheEnable: ").Append(CacheEnable).Append("\n");
            sb.Append("  CacheRootPaths: ").Append(CacheRootPaths).Append("\n");
            sb.Append("  CacheMaxSize: ").Append(CacheMaxSize).Append("\n");
            sb.Append("  CacheMaxEntries: ").Append(CacheMaxEntries).Append("\n");
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
            return this.Equals(input as ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqDamS7imagingImplPsPlatformServerServletProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.CacheEnable == input.CacheEnable ||
                    (this.CacheEnable != null &&
                    this.CacheEnable.Equals(input.CacheEnable))
                ) && 
                (
                    this.CacheRootPaths == input.CacheRootPaths ||
                    (this.CacheRootPaths != null &&
                    this.CacheRootPaths.Equals(input.CacheRootPaths))
                ) && 
                (
                    this.CacheMaxSize == input.CacheMaxSize ||
                    (this.CacheMaxSize != null &&
                    this.CacheMaxSize.Equals(input.CacheMaxSize))
                ) && 
                (
                    this.CacheMaxEntries == input.CacheMaxEntries ||
                    (this.CacheMaxEntries != null &&
                    this.CacheMaxEntries.Equals(input.CacheMaxEntries))
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
                if (this.CacheEnable != null)
                    hashCode = hashCode * 59 + this.CacheEnable.GetHashCode();
                if (this.CacheRootPaths != null)
                    hashCode = hashCode * 59 + this.CacheRootPaths.GetHashCode();
                if (this.CacheMaxSize != null)
                    hashCode = hashCode * 59 + this.CacheMaxSize.GetHashCode();
                if (this.CacheMaxEntries != null)
                    hashCode = hashCode * 59 + this.CacheMaxEntries.GetHashCode();
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