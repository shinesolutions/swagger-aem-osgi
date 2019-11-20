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
    /// ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties :  IEquatable<ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties" /> class.
        /// </summary>
        /// <param name="schedulerExpression">schedulerExpression.</param>
        /// <param name="jmxObjectname">jmxObjectname.</param>
        public ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties(ConfigNodePropertyString schedulerExpression = default(ConfigNodePropertyString), ConfigNodePropertyString jmxObjectname = default(ConfigNodePropertyString))
        {
            this.SchedulerExpression = schedulerExpression;
            this.JmxObjectname = jmxObjectname;
        }
        
        /// <summary>
        /// Gets or Sets SchedulerExpression
        /// </summary>
        [DataMember(Name="scheduler.expression", EmitDefaultValue=false)]
        public ConfigNodePropertyString SchedulerExpression { get; set; }

        /// <summary>
        /// Gets or Sets JmxObjectname
        /// </summary>
        [DataMember(Name="jmx.objectname", EmitDefaultValue=false)]
        public ConfigNodePropertyString JmxObjectname { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties {\n");
            sb.Append("  SchedulerExpression: ").Append(SchedulerExpression).Append("\n");
            sb.Append("  JmxObjectname: ").Append(JmxObjectname).Append("\n");
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
            return this.Equals(input as ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeGraniteSystemMonitoringImplSystemStatsMBeanImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SchedulerExpression == input.SchedulerExpression ||
                    (this.SchedulerExpression != null &&
                    this.SchedulerExpression.Equals(input.SchedulerExpression))
                ) && 
                (
                    this.JmxObjectname == input.JmxObjectname ||
                    (this.JmxObjectname != null &&
                    this.JmxObjectname.Equals(input.JmxObjectname))
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
                if (this.SchedulerExpression != null)
                    hashCode = hashCode * 59 + this.SchedulerExpression.GetHashCode();
                if (this.JmxObjectname != null)
                    hashCode = hashCode * 59 + this.JmxObjectname.GetHashCode();
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