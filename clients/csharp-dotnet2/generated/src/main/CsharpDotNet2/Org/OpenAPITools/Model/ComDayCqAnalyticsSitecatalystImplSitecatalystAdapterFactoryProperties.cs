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
  public class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {
    /// <summary>
    /// Gets or Sets CqAnalyticsAdapterfactoryContextstores
    /// </summary>
    [DataMember(Name="cq.analytics.adapterfactory.contextstores", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.adapterfactory.contextstores")]
    public ConfigNodePropertyArray CqAnalyticsAdapterfactoryContextstores { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAnalyticsSitecatalystImplSitecatalystAdapterFactoryProperties {\n");
      sb.Append("  CqAnalyticsAdapterfactoryContextstores: ").Append(CqAnalyticsAdapterfactoryContextstores).Append("\n");
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
