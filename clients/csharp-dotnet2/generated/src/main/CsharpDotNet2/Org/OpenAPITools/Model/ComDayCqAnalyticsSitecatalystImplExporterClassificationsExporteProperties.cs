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
  public class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {
    /// <summary>
    /// Gets or Sets AllowedPaths
    /// </summary>
    [DataMember(Name="allowed.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allowed.paths")]
    public ConfigNodePropertyArray AllowedPaths { get; set; }

    /// <summary>
    /// Gets or Sets CqAnalyticsSaintExporterPagesize
    /// </summary>
    [DataMember(Name="cq.analytics.saint.exporter.pagesize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.analytics.saint.exporter.pagesize")]
    public ConfigNodePropertyInteger CqAnalyticsSaintExporterPagesize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAnalyticsSitecatalystImplExporterClassificationsExporteProperties {\n");
      sb.Append("  AllowedPaths: ").Append(AllowedPaths).Append("\n");
      sb.Append("  CqAnalyticsSaintExporterPagesize: ").Append(CqAnalyticsSaintExporterPagesize).Append("\n");
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
