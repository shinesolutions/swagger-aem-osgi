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
  public class ComDayCqReportingImplRLogAnalyzerProperties {
    /// <summary>
    /// Gets or Sets RequestLogOutput
    /// </summary>
    [DataMember(Name="request.log.output", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.output")]
    public ConfigNodePropertyString RequestLogOutput { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReportingImplRLogAnalyzerProperties {\n");
      sb.Append("  RequestLogOutput: ").Append(RequestLogOutput).Append("\n");
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
