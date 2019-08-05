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
  public class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {
    /// <summary>
    /// Gets or Sets TcpPort
    /// </summary>
    [DataMember(Name="TcpPort", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "TcpPort")]
    public ConfigNodePropertyString TcpPort { get; set; }

    /// <summary>
    /// Gets or Sets AllowRemoteAccess
    /// </summary>
    [DataMember(Name="AllowRemoteAccess", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "AllowRemoteAccess")]
    public ConfigNodePropertyBoolean AllowRemoteAccess { get; set; }

    /// <summary>
    /// Gets or Sets MaxRenderRgnPixels
    /// </summary>
    [DataMember(Name="MaxRenderRgnPixels", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MaxRenderRgnPixels")]
    public ConfigNodePropertyString MaxRenderRgnPixels { get; set; }

    /// <summary>
    /// Gets or Sets MaxMessageSize
    /// </summary>
    [DataMember(Name="MaxMessageSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "MaxMessageSize")]
    public ConfigNodePropertyString MaxMessageSize { get; set; }

    /// <summary>
    /// Gets or Sets RandomAccessUrlTimeout
    /// </summary>
    [DataMember(Name="RandomAccessUrlTimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "RandomAccessUrlTimeout")]
    public ConfigNodePropertyInteger RandomAccessUrlTimeout { get; set; }

    /// <summary>
    /// Gets or Sets WorkerThreads
    /// </summary>
    [DataMember(Name="WorkerThreads", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "WorkerThreads")]
    public ConfigNodePropertyInteger WorkerThreads { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqDamS7imagingImplIsImageServerComponentProperties {\n");
      sb.Append("  TcpPort: ").Append(TcpPort).Append("\n");
      sb.Append("  AllowRemoteAccess: ").Append(AllowRemoteAccess).Append("\n");
      sb.Append("  MaxRenderRgnPixels: ").Append(MaxRenderRgnPixels).Append("\n");
      sb.Append("  MaxMessageSize: ").Append(MaxMessageSize).Append("\n");
      sb.Append("  RandomAccessUrlTimeout: ").Append(RandomAccessUrlTimeout).Append("\n");
      sb.Append("  WorkerThreads: ").Append(WorkerThreads).Append("\n");
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
