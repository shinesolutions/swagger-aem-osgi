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
  public class ComAdobeOctopusNcommBootstrapProperties {
    /// <summary>
    /// Gets or Sets MaxConnections
    /// </summary>
    [DataMember(Name="maxConnections", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxConnections")]
    public ConfigNodePropertyInteger MaxConnections { get; set; }

    /// <summary>
    /// Gets or Sets MaxRequests
    /// </summary>
    [DataMember(Name="maxRequests", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxRequests")]
    public ConfigNodePropertyInteger MaxRequests { get; set; }

    /// <summary>
    /// Gets or Sets RequestTimeout
    /// </summary>
    [DataMember(Name="requestTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requestTimeout")]
    public ConfigNodePropertyInteger RequestTimeout { get; set; }

    /// <summary>
    /// Gets or Sets RequestRetries
    /// </summary>
    [DataMember(Name="requestRetries", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requestRetries")]
    public ConfigNodePropertyInteger RequestRetries { get; set; }

    /// <summary>
    /// Gets or Sets LaunchTimeout
    /// </summary>
    [DataMember(Name="launchTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "launchTimeout")]
    public ConfigNodePropertyInteger LaunchTimeout { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeOctopusNcommBootstrapProperties {\n");
      sb.Append("  MaxConnections: ").Append(MaxConnections).Append("\n");
      sb.Append("  MaxRequests: ").Append(MaxRequests).Append("\n");
      sb.Append("  RequestTimeout: ").Append(RequestTimeout).Append("\n");
      sb.Append("  RequestRetries: ").Append(RequestRetries).Append("\n");
      sb.Append("  LaunchTimeout: ").Append(LaunchTimeout).Append("\n");
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
