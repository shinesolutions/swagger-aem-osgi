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
    /// ComAdobeCqDtmImplServiceDTMWebServiceImplProperties
    /// </summary>
    [DataContract]
    public partial class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties :  IEquatable<ComAdobeCqDtmImplServiceDTMWebServiceImplProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ComAdobeCqDtmImplServiceDTMWebServiceImplProperties" /> class.
        /// </summary>
        /// <param name="connectionTimeout">connectionTimeout.</param>
        /// <param name="socketTimeout">socketTimeout.</param>
        public ComAdobeCqDtmImplServiceDTMWebServiceImplProperties(ConfigNodePropertyInteger connectionTimeout = default(ConfigNodePropertyInteger), ConfigNodePropertyInteger socketTimeout = default(ConfigNodePropertyInteger))
        {
            this.ConnectionTimeout = connectionTimeout;
            this.SocketTimeout = socketTimeout;
        }
        
        /// <summary>
        /// Gets or Sets ConnectionTimeout
        /// </summary>
        [DataMember(Name="connection.timeout", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger ConnectionTimeout { get; set; }

        /// <summary>
        /// Gets or Sets SocketTimeout
        /// </summary>
        [DataMember(Name="socket.timeout", EmitDefaultValue=false)]
        public ConfigNodePropertyInteger SocketTimeout { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class ComAdobeCqDtmImplServiceDTMWebServiceImplProperties {\n");
            sb.Append("  ConnectionTimeout: ").Append(ConnectionTimeout).Append("\n");
            sb.Append("  SocketTimeout: ").Append(SocketTimeout).Append("\n");
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
            return this.Equals(input as ComAdobeCqDtmImplServiceDTMWebServiceImplProperties);
        }

        /// <summary>
        /// Returns true if ComAdobeCqDtmImplServiceDTMWebServiceImplProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of ComAdobeCqDtmImplServiceDTMWebServiceImplProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(ComAdobeCqDtmImplServiceDTMWebServiceImplProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.ConnectionTimeout == input.ConnectionTimeout ||
                    (this.ConnectionTimeout != null &&
                    this.ConnectionTimeout.Equals(input.ConnectionTimeout))
                ) && 
                (
                    this.SocketTimeout == input.SocketTimeout ||
                    (this.SocketTimeout != null &&
                    this.SocketTimeout.Equals(input.SocketTimeout))
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
                if (this.ConnectionTimeout != null)
                    hashCode = hashCode * 59 + this.ConnectionTimeout.GetHashCode();
                if (this.SocketTimeout != null)
                    hashCode = hashCode * 59 + this.SocketTimeout.GetHashCode();
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