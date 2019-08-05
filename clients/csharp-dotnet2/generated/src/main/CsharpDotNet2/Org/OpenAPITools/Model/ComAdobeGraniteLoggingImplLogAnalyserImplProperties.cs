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
  public class ComAdobeGraniteLoggingImplLogAnalyserImplProperties {
    /// <summary>
    /// Gets or Sets MessagesQueueSize
    /// </summary>
    [DataMember(Name="messages.queue.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "messages.queue.size")]
    public ConfigNodePropertyInteger MessagesQueueSize { get; set; }

    /// <summary>
    /// Gets or Sets LoggerConfig
    /// </summary>
    [DataMember(Name="logger.config", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "logger.config")]
    public ConfigNodePropertyArray LoggerConfig { get; set; }

    /// <summary>
    /// Gets or Sets MessagesSize
    /// </summary>
    [DataMember(Name="messages.size", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "messages.size")]
    public ConfigNodePropertyInteger MessagesSize { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteLoggingImplLogAnalyserImplProperties {\n");
      sb.Append("  MessagesQueueSize: ").Append(MessagesQueueSize).Append("\n");
      sb.Append("  LoggerConfig: ").Append(LoggerConfig).Append("\n");
      sb.Append("  MessagesSize: ").Append(MessagesSize).Append("\n");
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
