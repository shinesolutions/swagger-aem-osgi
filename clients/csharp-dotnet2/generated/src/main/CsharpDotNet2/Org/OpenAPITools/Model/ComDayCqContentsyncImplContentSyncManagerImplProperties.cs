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
  public class ComDayCqContentsyncImplContentSyncManagerImplProperties {
    /// <summary>
    /// Gets or Sets ContentsyncFallbackAuthorizable
    /// </summary>
    [DataMember(Name="contentsync.fallback.authorizable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contentsync.fallback.authorizable")]
    public ConfigNodePropertyString ContentsyncFallbackAuthorizable { get; set; }

    /// <summary>
    /// Gets or Sets ContentsyncFallbackUpdateuser
    /// </summary>
    [DataMember(Name="contentsync.fallback.updateuser", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "contentsync.fallback.updateuser")]
    public ConfigNodePropertyString ContentsyncFallbackUpdateuser { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqContentsyncImplContentSyncManagerImplProperties {\n");
      sb.Append("  ContentsyncFallbackAuthorizable: ").Append(ContentsyncFallbackAuthorizable).Append("\n");
      sb.Append("  ContentsyncFallbackUpdateuser: ").Append(ContentsyncFallbackUpdateuser).Append("\n");
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
