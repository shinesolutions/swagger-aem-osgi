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
  public class AnalyticsComponentQueryCacheServiceProperties {
    /// <summary>
    /// Gets or Sets CqAnalyticsComponentQueryCacheSize
    /// </summary>
    [DataMember(Name="cq.analytics.component.query.cache.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.component.query.cache.size")]
    public ConfigNodePropertyInteger CqAnalyticsComponentQueryCacheSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class AnalyticsComponentQueryCacheServiceProperties {\n");
      sb.Append("  CqAnalyticsComponentQueryCacheSize: ").Append(CqAnalyticsComponentQueryCacheSize).Append("\n");
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
