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
  public class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {
    /// <summary>
    /// Gets or Sets CqDamS7damDynamicmediaconfigeventlistenerEnabled
    /// </summary>
    [DataMember(Name="cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.s7dam.dynamicmediaconfigeventlistener.enabled")]
    public ConfigNodePropertyBoolean CqDamS7damDynamicmediaconfigeventlistenerEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamS7damCommonAnalyticsImplS7damDynamicMediaConfigEvenProperties {\n");
      sb.Append("  CqDamS7damDynamicmediaconfigeventlistenerEnabled: ").Append(CqDamS7damDynamicmediaconfigeventlistenerEnabled).Append("\n");
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
