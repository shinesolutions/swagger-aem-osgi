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
  public class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {
    /// <summary>
    /// Gets or Sets PageviewstatisticsTrackingurl
    /// </summary>
    [DataMember(Name="pageviewstatistics.trackingurl", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pageviewstatistics.trackingurl")]
    public ConfigNodePropertyString PageviewstatisticsTrackingurl { get; set; }

    /// <summary>
    /// Gets or Sets PageviewstatisticsTrackingscriptEnabled
    /// </summary>
    [DataMember(Name="pageviewstatistics.trackingscript.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pageviewstatistics.trackingscript.enabled")]
    public ConfigNodePropertyString PageviewstatisticsTrackingscriptEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreStatsPageViewStatisticsImplProperties {\n");
      sb.Append("  PageviewstatisticsTrackingurl: ").Append(PageviewstatisticsTrackingurl).Append("\n");
      sb.Append("  PageviewstatisticsTrackingscriptEnabled: ").Append(PageviewstatisticsTrackingscriptEnabled).Append("\n");
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
