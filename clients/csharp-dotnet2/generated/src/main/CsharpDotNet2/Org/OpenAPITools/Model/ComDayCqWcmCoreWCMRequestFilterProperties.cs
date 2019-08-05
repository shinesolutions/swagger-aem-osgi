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
  public class ComDayCqWcmCoreWCMRequestFilterProperties {
    /// <summary>
    /// Gets or Sets WcmfilterMode
    /// </summary>
    [DataMember(Name="wcmfilter.mode", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wcmfilter.mode")]
    public ConfigNodePropertyDropDown WcmfilterMode { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreWCMRequestFilterProperties {\n");
      sb.Append("  WcmfilterMode: ").Append(WcmfilterMode).Append("\n");
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
