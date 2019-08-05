using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class OrgApacheFelixHttpSslfilterSslFilterProperties {
    /// <summary>
    /// Gets or Sets SslForwardHeader
    /// </summary>
    [DataMember(Name="ssl-forward.header", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ssl-forward.header")]
    public ConfigNodePropertyString SslForwardHeader { get; set; }

    /// <summary>
    /// Gets or Sets SslForwardValue
    /// </summary>
    [DataMember(Name="ssl-forward.value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ssl-forward.value")]
    public ConfigNodePropertyString SslForwardValue { get; set; }

    /// <summary>
    /// Gets or Sets SslForwardCertHeader
    /// </summary>
    [DataMember(Name="ssl-forward-cert.header", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ssl-forward-cert.header")]
    public ConfigNodePropertyString SslForwardCertHeader { get; set; }

    /// <summary>
    /// Gets or Sets RewriteAbsoluteUrls
    /// </summary>
    [DataMember(Name="rewrite.absolute.urls", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "rewrite.absolute.urls")]
    public ConfigNodePropertyBoolean RewriteAbsoluteUrls { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
