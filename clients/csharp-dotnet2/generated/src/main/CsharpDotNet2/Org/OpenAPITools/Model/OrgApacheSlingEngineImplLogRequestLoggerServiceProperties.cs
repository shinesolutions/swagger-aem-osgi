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
  public class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {
    /// <summary>
    /// Gets or Sets RequestLogServiceFormat
    /// </summary>
    [DataMember(Name="request.log.service.format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.service.format")]
    public ConfigNodePropertyString RequestLogServiceFormat { get; set; }

    /// <summary>
    /// Gets or Sets RequestLogServiceOutput
    /// </summary>
    [DataMember(Name="request.log.service.output", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.service.output")]
    public ConfigNodePropertyString RequestLogServiceOutput { get; set; }

    /// <summary>
    /// Gets or Sets RequestLogServiceOutputtype
    /// </summary>
    [DataMember(Name="request.log.service.outputtype", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.service.outputtype")]
    public ConfigNodePropertyDropDown RequestLogServiceOutputtype { get; set; }

    /// <summary>
    /// Gets or Sets RequestLogServiceOnentry
    /// </summary>
    [DataMember(Name="request.log.service.onentry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.service.onentry")]
    public ConfigNodePropertyBoolean RequestLogServiceOnentry { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEngineImplLogRequestLoggerServiceProperties {\n");
      sb.Append("  RequestLogServiceFormat: ").Append(RequestLogServiceFormat).Append("\n");
      sb.Append("  RequestLogServiceOutput: ").Append(RequestLogServiceOutput).Append("\n");
      sb.Append("  RequestLogServiceOutputtype: ").Append(RequestLogServiceOutputtype).Append("\n");
      sb.Append("  RequestLogServiceOnentry: ").Append(RequestLogServiceOnentry).Append("\n");
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
