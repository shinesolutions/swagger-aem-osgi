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
    /// ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties
    /// </summary>
    [DataContract]
    public partial class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties :  IEquatable<ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties" /> class.
        /// </summary>
        /// <param name="notifyOnupdate">notifyOnupdate.</param>
        /// <param name="notifyOncomplete">notifyOncomplete.</param>
        public ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties(ConfigNodePropertyBoolean notifyOnupdate = default(ConfigNodePropertyBoolean), ConfigNodePropertyBoolean notifyOncomplete = default(ConfigNodePropertyBoolean))
        {
            this.NotifyOnupdate = notifyOnupdate;
            this.NotifyOncomplete = notifyOncomplete;
        }
        
        /// <summary>
        /// Gets or Sets NotifyOnupdate
        /// </summary>
        [DataMember(Name="notify.onupdate", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean NotifyOnupdate { get; set; }

        /// <summary>
        /// Gets or Sets NotifyOncomplete
        /// </summary>
        [DataMember(Name="notify.oncomplete", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean NotifyOncomplete { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties {\n");
            sb.Append("  NotifyOnupdate: ").Append(NotifyOnupdate).Append("\n");
            sb.Append("  NotifyOncomplete: ").Append(NotifyOncomplete).Append("\n");
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
            return this.Equals(input as ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties);
        }

        /// <summary>
        /// Returns true if ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComDayCqWorkflowImplEmailTaskEMailNotificationServiceProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.NotifyOnupdate == input.NotifyOnupdate ||
                    (this.NotifyOnupdate != null &&
                    this.NotifyOnupdate.Equals(input.NotifyOnupdate))
                ) && 
                (
                    this.NotifyOncomplete == input.NotifyOncomplete ||
                    (this.NotifyOncomplete != null &&
                    this.NotifyOncomplete.Equals(input.NotifyOncomplete))
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
                if (this.NotifyOnupdate != null)
                    hashCode = hashCode * 59 + this.NotifyOnupdate.GetHashCode();
                if (this.NotifyOncomplete != null)
                    hashCode = hashCode * 59 + this.NotifyOncomplete.GetHashCode();
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