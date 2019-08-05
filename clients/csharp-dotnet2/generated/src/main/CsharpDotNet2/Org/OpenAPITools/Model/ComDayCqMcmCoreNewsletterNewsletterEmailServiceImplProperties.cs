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
  public class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {
    /// <summary>
    /// Gets or Sets FromAddress
    /// </summary>
    [DataMember(Name="from.address", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "from.address")]
    public ConfigNodePropertyString FromAddress { get; set; }

    /// <summary>
    /// Gets or Sets SenderHost
    /// </summary>
    [DataMember(Name="sender.host", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sender.host")]
    public ConfigNodePropertyString SenderHost { get; set; }

    /// <summary>
    /// Gets or Sets MaxBounceCount
    /// </summary>
    [DataMember(Name="max.bounce.count", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.bounce.count")]
    public ConfigNodePropertyString MaxBounceCount { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqMcmCoreNewsletterNewsletterEmailServiceImplProperties {\n");
      sb.Append("  FromAddress: ").Append(FromAddress).Append("\n");
      sb.Append("  SenderHost: ").Append(SenderHost).Append("\n");
      sb.Append("  MaxBounceCount: ").Append(MaxBounceCount).Append("\n");
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
