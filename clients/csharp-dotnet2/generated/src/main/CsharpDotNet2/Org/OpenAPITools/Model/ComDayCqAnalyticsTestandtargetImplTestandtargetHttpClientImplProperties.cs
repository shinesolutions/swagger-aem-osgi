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
  public class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {
    /// <summary>
    /// Gets or Sets CqAnalyticsTestandtargetApiUrl
    /// </summary>
    [DataMember(Name="cq.analytics.testandtarget.api.url", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.testandtarget.api.url")]
    public ConfigNodePropertyString CqAnalyticsTestandtargetApiUrl { get; set; }

    /// <summary>
    /// Gets or Sets CqAnalyticsTestandtargetTimeout
    /// </summary>
    [DataMember(Name="cq.analytics.testandtarget.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.testandtarget.timeout")]
    public ConfigNodePropertyInteger CqAnalyticsTestandtargetTimeout { get; set; }

    /// <summary>
    /// Gets or Sets CqAnalyticsTestandtargetSockettimeout
    /// </summary>
    [DataMember(Name="cq.analytics.testandtarget.sockettimeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.testandtarget.sockettimeout")]
    public ConfigNodePropertyInteger CqAnalyticsTestandtargetSockettimeout { get; set; }

    /// <summary>
    /// Gets or Sets CqAnalyticsTestandtargetRecommendationsUrlReplace
    /// </summary>
    [DataMember(Name="cq.analytics.testandtarget.recommendations.url.replace", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.testandtarget.recommendations.url.replace")]
    public ConfigNodePropertyString CqAnalyticsTestandtargetRecommendationsUrlReplace { get; set; }

    /// <summary>
    /// Gets or Sets CqAnalyticsTestandtargetRecommendationsUrlReplacewith
    /// </summary>
    [DataMember(Name="cq.analytics.testandtarget.recommendations.url.replacewith", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.testandtarget.recommendations.url.replacewith")]
    public ConfigNodePropertyString CqAnalyticsTestandtargetRecommendationsUrlReplacewith { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAnalyticsTestandtargetImplTestandtargetHttpClientImplProperties {\n");
      sb.Append("  CqAnalyticsTestandtargetApiUrl: ").Append(CqAnalyticsTestandtargetApiUrl).Append("\n");
      sb.Append("  CqAnalyticsTestandtargetTimeout: ").Append(CqAnalyticsTestandtargetTimeout).Append("\n");
      sb.Append("  CqAnalyticsTestandtargetSockettimeout: ").Append(CqAnalyticsTestandtargetSockettimeout).Append("\n");
      sb.Append("  CqAnalyticsTestandtargetRecommendationsUrlReplace: ").Append(CqAnalyticsTestandtargetRecommendationsUrlReplace).Append("\n");
      sb.Append("  CqAnalyticsTestandtargetRecommendationsUrlReplacewith: ").Append(CqAnalyticsTestandtargetRecommendationsUrlReplacewith).Append("\n");
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
