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
  public class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties {
    /// <summary>
    /// Gets or Sets ReportFetchAttempts
    /// </summary>
    [DataMember(Name="report.fetch.attempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "report.fetch.attempts")]
    public ConfigNodePropertyInteger ReportFetchAttempts { get; set; }

    /// <summary>
    /// Gets or Sets ReportFetchDelay
    /// </summary>
    [DataMember(Name="report.fetch.delay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "report.fetch.delay")]
    public ConfigNodePropertyInteger ReportFetchDelay { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAnalyticsSitecatalystImplImporterReportImporterProperties {\n");
      sb.Append("  ReportFetchAttempts: ").Append(ReportFetchAttempts).Append("\n");
      sb.Append("  ReportFetchDelay: ").Append(ReportFetchDelay).Append("\n");
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
