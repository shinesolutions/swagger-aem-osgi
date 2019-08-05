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
  public class ComDayCqWcmCoreImplServletsThumbnailServletProperties {
    /// <summary>
    /// Gets or Sets Workspace
    /// </summary>
    [DataMember(Name="workspace", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "workspace")]
    public ConfigNodePropertyString Workspace { get; set; }

    /// <summary>
    /// Gets or Sets Dimensions
    /// </summary>
    [DataMember(Name="dimensions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "dimensions")]
    public ConfigNodePropertyArray Dimensions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplServletsThumbnailServletProperties {\n");
      sb.Append("  Workspace: ").Append(Workspace).Append("\n");
      sb.Append("  Dimensions: ").Append(Dimensions).Append("\n");
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
