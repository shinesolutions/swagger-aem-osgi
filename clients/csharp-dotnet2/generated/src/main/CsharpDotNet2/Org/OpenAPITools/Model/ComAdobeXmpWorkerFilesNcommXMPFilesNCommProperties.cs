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
  public class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {
    /// <summary>
    /// Gets or Sets MaxConnections
    /// </summary>
    [DataMember(Name="maxConnections", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxConnections")]
    public ConfigNodePropertyString MaxConnections { get; set; }

    /// <summary>
    /// Gets or Sets MaxRequests
    /// </summary>
    [DataMember(Name="maxRequests", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxRequests")]
    public ConfigNodePropertyString MaxRequests { get; set; }

    /// <summary>
    /// Gets or Sets RequestTimeout
    /// </summary>
    [DataMember(Name="requestTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "requestTimeout")]
    public ConfigNodePropertyString RequestTimeout { get; set; }

    /// <summary>
    /// Gets or Sets LogDir
    /// </summary>
    [DataMember(Name="logDir", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "logDir")]
    public ConfigNodePropertyString LogDir { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeXmpWorkerFilesNcommXMPFilesNCommProperties {\n");
      sb.Append("  MaxConnections: ").Append(MaxConnections).Append("\n");
      sb.Append("  MaxRequests: ").Append(MaxRequests).Append("\n");
      sb.Append("  RequestTimeout: ").Append(RequestTimeout).Append("\n");
      sb.Append("  LogDir: ").Append(LogDir).Append("\n");
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
