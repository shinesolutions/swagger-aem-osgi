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
  public class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {
    /// <summary>
    /// Gets or Sets CqMimeTypeBlacklist
    /// </summary>
    [DataMember(Name="cq.mime.type.blacklist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.mime.type.blacklist")]
    public ConfigNodePropertyArray CqMimeTypeBlacklist { get; set; }

    /// <summary>
    /// Gets or Sets CqDamEmptyMime
    /// </summary>
    [DataMember(Name="cq.dam.empty.mime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.empty.mime")]
    public ConfigNodePropertyBoolean CqDamEmptyMime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletDamContentDispositionFilterProperties {\n");
      sb.Append("  CqMimeTypeBlacklist: ").Append(CqMimeTypeBlacklist).Append("\n");
      sb.Append("  CqDamEmptyMime: ").Append(CqDamEmptyMime).Append("\n");
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
