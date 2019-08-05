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
  public class OrgApacheSlingEngineImplLogRequestLoggerProperties {
    /// <summary>
    /// Gets or Sets RequestLogOutput
    /// </summary>
    [DataMember(Name="request.log.output", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.output")]
    public ConfigNodePropertyString RequestLogOutput { get; set; }

    /// <summary>
    /// Gets or Sets RequestLogOutputtype
    /// </summary>
    [DataMember(Name="request.log.outputtype", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.outputtype")]
    public ConfigNodePropertyDropDown RequestLogOutputtype { get; set; }

    /// <summary>
    /// Gets or Sets RequestLogEnabled
    /// </summary>
    [DataMember(Name="request.log.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "request.log.enabled")]
    public ConfigNodePropertyBoolean RequestLogEnabled { get; set; }

    /// <summary>
    /// Gets or Sets AccessLogOutput
    /// </summary>
    [DataMember(Name="access.log.output", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "access.log.output")]
    public ConfigNodePropertyString AccessLogOutput { get; set; }

    /// <summary>
    /// Gets or Sets AccessLogOutputtype
    /// </summary>
    [DataMember(Name="access.log.outputtype", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "access.log.outputtype")]
    public ConfigNodePropertyDropDown AccessLogOutputtype { get; set; }

    /// <summary>
    /// Gets or Sets AccessLogEnabled
    /// </summary>
    [DataMember(Name="access.log.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "access.log.enabled")]
    public ConfigNodePropertyBoolean AccessLogEnabled { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingEngineImplLogRequestLoggerProperties {\n");
      sb.Append("  RequestLogOutput: ").Append(RequestLogOutput).Append("\n");
      sb.Append("  RequestLogOutputtype: ").Append(RequestLogOutputtype).Append("\n");
      sb.Append("  RequestLogEnabled: ").Append(RequestLogEnabled).Append("\n");
      sb.Append("  AccessLogOutput: ").Append(AccessLogOutput).Append("\n");
      sb.Append("  AccessLogOutputtype: ").Append(AccessLogOutputtype).Append("\n");
      sb.Append("  AccessLogEnabled: ").Append(AccessLogEnabled).Append("\n");
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
