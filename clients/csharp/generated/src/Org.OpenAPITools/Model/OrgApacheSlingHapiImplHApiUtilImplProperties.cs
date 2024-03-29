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
    /// OrgApacheSlingHapiImplHApiUtilImplProperties
    /// </summary>
    [DataContract]
    public partial class OrgApacheSlingHapiImplHApiUtilImplProperties :  IEquatable<OrgApacheSlingHapiImplHApiUtilImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrgApacheSlingHapiImplHApiUtilImplProperties" /> class.
        /// </summary>
        /// <param name="orgApacheSlingHapiToolsResourcetype">orgApacheSlingHapiToolsResourcetype.</param>
        /// <param name="orgApacheSlingHapiToolsCollectionresourcetype">orgApacheSlingHapiToolsCollectionresourcetype.</param>
        /// <param name="orgApacheSlingHapiToolsSearchpaths">orgApacheSlingHapiToolsSearchpaths.</param>
        /// <param name="orgApacheSlingHapiToolsExternalurl">orgApacheSlingHapiToolsExternalurl.</param>
        /// <param name="orgApacheSlingHapiToolsEnabled">orgApacheSlingHapiToolsEnabled.</param>
        public OrgApacheSlingHapiImplHApiUtilImplProperties(ConfigNodePropertyString orgApacheSlingHapiToolsResourcetype = default(ConfigNodePropertyString), ConfigNodePropertyString orgApacheSlingHapiToolsCollectionresourcetype = default(ConfigNodePropertyString), ConfigNodePropertyArray orgApacheSlingHapiToolsSearchpaths = default(ConfigNodePropertyArray), ConfigNodePropertyString orgApacheSlingHapiToolsExternalurl = default(ConfigNodePropertyString), ConfigNodePropertyBoolean orgApacheSlingHapiToolsEnabled = default(ConfigNodePropertyBoolean))
        {
            this.OrgApacheSlingHapiToolsResourcetype = orgApacheSlingHapiToolsResourcetype;
            this.OrgApacheSlingHapiToolsCollectionresourcetype = orgApacheSlingHapiToolsCollectionresourcetype;
            this.OrgApacheSlingHapiToolsSearchpaths = orgApacheSlingHapiToolsSearchpaths;
            this.OrgApacheSlingHapiToolsExternalurl = orgApacheSlingHapiToolsExternalurl;
            this.OrgApacheSlingHapiToolsEnabled = orgApacheSlingHapiToolsEnabled;
        }
        
        /// <summary>
        /// Gets or Sets OrgApacheSlingHapiToolsResourcetype
        /// </summary>
        [DataMember(Name="org.apache.sling.hapi.tools.resourcetype", EmitDefaultValue=false)]
        public ConfigNodePropertyString OrgApacheSlingHapiToolsResourcetype { get; set; }

        /// <summary>
        /// Gets or Sets OrgApacheSlingHapiToolsCollectionresourcetype
        /// </summary>
        [DataMember(Name="org.apache.sling.hapi.tools.collectionresourcetype", EmitDefaultValue=false)]
        public ConfigNodePropertyString OrgApacheSlingHapiToolsCollectionresourcetype { get; set; }

        /// <summary>
        /// Gets or Sets OrgApacheSlingHapiToolsSearchpaths
        /// </summary>
        [DataMember(Name="org.apache.sling.hapi.tools.searchpaths", EmitDefaultValue=false)]
        public ConfigNodePropertyArray OrgApacheSlingHapiToolsSearchpaths { get; set; }

        /// <summary>
        /// Gets or Sets OrgApacheSlingHapiToolsExternalurl
        /// </summary>
        [DataMember(Name="org.apache.sling.hapi.tools.externalurl", EmitDefaultValue=false)]
        public ConfigNodePropertyString OrgApacheSlingHapiToolsExternalurl { get; set; }

        /// <summary>
        /// Gets or Sets OrgApacheSlingHapiToolsEnabled
        /// </summary>
        [DataMember(Name="org.apache.sling.hapi.tools.enabled", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean OrgApacheSlingHapiToolsEnabled { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheSlingHapiImplHApiUtilImplProperties {\n");
            sb.Append("  OrgApacheSlingHapiToolsResourcetype: ").Append(OrgApacheSlingHapiToolsResourcetype).Append("\n");
            sb.Append("  OrgApacheSlingHapiToolsCollectionresourcetype: ").Append(OrgApacheSlingHapiToolsCollectionresourcetype).Append("\n");
            sb.Append("  OrgApacheSlingHapiToolsSearchpaths: ").Append(OrgApacheSlingHapiToolsSearchpaths).Append("\n");
            sb.Append("  OrgApacheSlingHapiToolsExternalurl: ").Append(OrgApacheSlingHapiToolsExternalurl).Append("\n");
            sb.Append("  OrgApacheSlingHapiToolsEnabled: ").Append(OrgApacheSlingHapiToolsEnabled).Append("\n");
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
            return this.Equals(input as OrgApacheSlingHapiImplHApiUtilImplProperties);
        }

        /// <summary>
        /// Returns true if OrgApacheSlingHapiImplHApiUtilImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of OrgApacheSlingHapiImplHApiUtilImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheSlingHapiImplHApiUtilImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.OrgApacheSlingHapiToolsResourcetype == input.OrgApacheSlingHapiToolsResourcetype ||
                    (this.OrgApacheSlingHapiToolsResourcetype != null &&
                    this.OrgApacheSlingHapiToolsResourcetype.Equals(input.OrgApacheSlingHapiToolsResourcetype))
                ) && 
                (
                    this.OrgApacheSlingHapiToolsCollectionresourcetype == input.OrgApacheSlingHapiToolsCollectionresourcetype ||
                    (this.OrgApacheSlingHapiToolsCollectionresourcetype != null &&
                    this.OrgApacheSlingHapiToolsCollectionresourcetype.Equals(input.OrgApacheSlingHapiToolsCollectionresourcetype))
                ) && 
                (
                    this.OrgApacheSlingHapiToolsSearchpaths == input.OrgApacheSlingHapiToolsSearchpaths ||
                    (this.OrgApacheSlingHapiToolsSearchpaths != null &&
                    this.OrgApacheSlingHapiToolsSearchpaths.Equals(input.OrgApacheSlingHapiToolsSearchpaths))
                ) && 
                (
                    this.OrgApacheSlingHapiToolsExternalurl == input.OrgApacheSlingHapiToolsExternalurl ||
                    (this.OrgApacheSlingHapiToolsExternalurl != null &&
                    this.OrgApacheSlingHapiToolsExternalurl.Equals(input.OrgApacheSlingHapiToolsExternalurl))
                ) && 
                (
                    this.OrgApacheSlingHapiToolsEnabled == input.OrgApacheSlingHapiToolsEnabled ||
                    (this.OrgApacheSlingHapiToolsEnabled != null &&
                    this.OrgApacheSlingHapiToolsEnabled.Equals(input.OrgApacheSlingHapiToolsEnabled))
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
                if (this.OrgApacheSlingHapiToolsResourcetype != null)
                    hashCode = hashCode * 59 + this.OrgApacheSlingHapiToolsResourcetype.GetHashCode();
                if (this.OrgApacheSlingHapiToolsCollectionresourcetype != null)
                    hashCode = hashCode * 59 + this.OrgApacheSlingHapiToolsCollectionresourcetype.GetHashCode();
                if (this.OrgApacheSlingHapiToolsSearchpaths != null)
                    hashCode = hashCode * 59 + this.OrgApacheSlingHapiToolsSearchpaths.GetHashCode();
                if (this.OrgApacheSlingHapiToolsExternalurl != null)
                    hashCode = hashCode * 59 + this.OrgApacheSlingHapiToolsExternalurl.GetHashCode();
                if (this.OrgApacheSlingHapiToolsEnabled != null)
                    hashCode = hashCode * 59 + this.OrgApacheSlingHapiToolsEnabled.GetHashCode();
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
