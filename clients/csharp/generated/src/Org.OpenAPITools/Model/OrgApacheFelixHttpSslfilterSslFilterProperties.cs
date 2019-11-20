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
    /// OrgApacheFelixHttpSslfilterSslFilterProperties
    /// </summary>
    [DataContract]
    public partial class OrgApacheFelixHttpSslfilterSslFilterProperties :  IEquatable<OrgApacheFelixHttpSslfilterSslFilterProperties>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrgApacheFelixHttpSslfilterSslFilterProperties" /> class.
        /// </summary>
        /// <param name="sslForwardHeader">sslForwardHeader.</param>
        /// <param name="sslForwardValue">sslForwardValue.</param>
        /// <param name="sslForwardCertHeader">sslForwardCertHeader.</param>
        /// <param name="rewriteAbsoluteUrls">rewriteAbsoluteUrls.</param>
        public OrgApacheFelixHttpSslfilterSslFilterProperties(ConfigNodePropertyString sslForwardHeader = default(ConfigNodePropertyString), ConfigNodePropertyString sslForwardValue = default(ConfigNodePropertyString), ConfigNodePropertyString sslForwardCertHeader = default(ConfigNodePropertyString), ConfigNodePropertyBoolean rewriteAbsoluteUrls = default(ConfigNodePropertyBoolean))
        {
            this.SslForwardHeader = sslForwardHeader;
            this.SslForwardValue = sslForwardValue;
            this.SslForwardCertHeader = sslForwardCertHeader;
            this.RewriteAbsoluteUrls = rewriteAbsoluteUrls;
        }
        
        /// <summary>
        /// Gets or Sets SslForwardHeader
        /// </summary>
        [DataMember(Name="ssl-forward.header", EmitDefaultValue=false)]
        public ConfigNodePropertyString SslForwardHeader { get; set; }

        /// <summary>
        /// Gets or Sets SslForwardValue
        /// </summary>
        [DataMember(Name="ssl-forward.value", EmitDefaultValue=false)]
        public ConfigNodePropertyString SslForwardValue { get; set; }

        /// <summary>
        /// Gets or Sets SslForwardCertHeader
        /// </summary>
        [DataMember(Name="ssl-forward-cert.header", EmitDefaultValue=false)]
        public ConfigNodePropertyString SslForwardCertHeader { get; set; }

        /// <summary>
        /// Gets or Sets RewriteAbsoluteUrls
        /// </summary>
        [DataMember(Name="rewrite.absolute.urls", EmitDefaultValue=false)]
        public ConfigNodePropertyBoolean RewriteAbsoluteUrls { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrgApacheFelixHttpSslfilterSslFilterProperties {\n");
            sb.Append("  SslForwardHeader: ").Append(SslForwardHeader).Append("\n");
            sb.Append("  SslForwardValue: ").Append(SslForwardValue).Append("\n");
            sb.Append("  SslForwardCertHeader: ").Append(SslForwardCertHeader).Append("\n");
            sb.Append("  RewriteAbsoluteUrls: ").Append(RewriteAbsoluteUrls).Append("\n");
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
            return this.Equals(input as OrgApacheFelixHttpSslfilterSslFilterProperties);
        }

        /// <summary>
        /// Returns true if OrgApacheFelixHttpSslfilterSslFilterProperties instances are equal
        /// </summary>
        /// <param name="input">Instance of OrgApacheFelixHttpSslfilterSslFilterProperties to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrgApacheFelixHttpSslfilterSslFilterProperties input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.SslForwardHeader == input.SslForwardHeader ||
                    (this.SslForwardHeader != null &&
                    this.SslForwardHeader.Equals(input.SslForwardHeader))
                ) && 
                (
                    this.SslForwardValue == input.SslForwardValue ||
                    (this.SslForwardValue != null &&
                    this.SslForwardValue.Equals(input.SslForwardValue))
                ) && 
                (
                    this.SslForwardCertHeader == input.SslForwardCertHeader ||
                    (this.SslForwardCertHeader != null &&
                    this.SslForwardCertHeader.Equals(input.SslForwardCertHeader))
                ) && 
                (
                    this.RewriteAbsoluteUrls == input.RewriteAbsoluteUrls ||
                    (this.RewriteAbsoluteUrls != null &&
                    this.RewriteAbsoluteUrls.Equals(input.RewriteAbsoluteUrls))
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
                if (this.SslForwardHeader != null)
                    hashCode = hashCode * 59 + this.SslForwardHeader.GetHashCode();
                if (this.SslForwardValue != null)
                    hashCode = hashCode * 59 + this.SslForwardValue.GetHashCode();
                if (this.SslForwardCertHeader != null)
                    hashCode = hashCode * 59 + this.SslForwardCertHeader.GetHashCode();
                if (this.RewriteAbsoluteUrls != null)
                    hashCode = hashCode * 59 + this.RewriteAbsoluteUrls.GetHashCode();
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