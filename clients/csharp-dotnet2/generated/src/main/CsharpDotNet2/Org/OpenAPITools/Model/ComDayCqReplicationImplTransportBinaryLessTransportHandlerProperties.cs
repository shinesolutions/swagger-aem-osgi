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
  public class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties {
    /// <summary>
    /// Gets or Sets DisabledCipherSuites
    /// </summary>
    [DataMember(Name="disabled.cipher.suites", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "disabled.cipher.suites")]
    public ConfigNodePropertyArray DisabledCipherSuites { get; set; }

    /// <summary>
    /// Gets or Sets EnabledCipherSuites
    /// </summary>
    [DataMember(Name="enabled.cipher.suites", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled.cipher.suites")]
    public ConfigNodePropertyArray EnabledCipherSuites { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties {\n");
      sb.Append("  DisabledCipherSuites: ").Append(DisabledCipherSuites).Append("\n");
      sb.Append("  EnabledCipherSuites: ").Append(EnabledCipherSuites).Append("\n");
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
