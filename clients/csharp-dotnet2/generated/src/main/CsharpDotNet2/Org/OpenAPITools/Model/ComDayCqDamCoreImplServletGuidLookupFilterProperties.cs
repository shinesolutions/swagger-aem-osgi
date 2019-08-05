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
  public class ComDayCqDamCoreImplServletGuidLookupFilterProperties {
    /// <summary>
    /// Gets or Sets CqDamCoreGuidlookupfilterEnabled
    /// </summary>
    [DataMember(Name="cq.dam.core.guidlookupfilter.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.core.guidlookupfilter.enabled")]
    public ConfigNodePropertyBoolean CqDamCoreGuidlookupfilterEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletGuidLookupFilterProperties {\n");
      sb.Append("  CqDamCoreGuidlookupfilterEnabled: ").Append(CqDamCoreGuidlookupfilterEnabled).Append("\n");
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
