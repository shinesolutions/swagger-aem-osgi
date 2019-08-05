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
  public class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {
    /// <summary>
    /// Gets or Sets FilterOrder
    /// </summary>
    [DataMember(Name="filter.order", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.order")]
    public ConfigNodePropertyString FilterOrder { get; set; }

    /// <summary>
    /// Gets or Sets FilterScope
    /// </summary>
    [DataMember(Name="filter.scope", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "filter.scope")]
    public ConfigNodePropertyString FilterScope { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplWarpTimeWarpFilterProperties {\n");
      sb.Append("  FilterOrder: ").Append(FilterOrder).Append("\n");
      sb.Append("  FilterScope: ").Append(FilterScope).Append("\n");
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
