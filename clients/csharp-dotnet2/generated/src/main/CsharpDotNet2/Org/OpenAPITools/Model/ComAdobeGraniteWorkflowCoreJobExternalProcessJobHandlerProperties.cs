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
  public class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {
    /// <summary>
    /// Gets or Sets DefaultTimeout
    /// </summary>
    [DataMember(Name="default.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.timeout")]
    public ConfigNodePropertyInteger DefaultTimeout { get; set; }

    /// <summary>
    /// Gets or Sets MaxTimeout
    /// </summary>
    [DataMember(Name="max.timeout", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "max.timeout")]
    public ConfigNodePropertyInteger MaxTimeout { get; set; }

    /// <summary>
    /// Gets or Sets DefaultPeriod
    /// </summary>
    [DataMember(Name="default.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.period")]
    public ConfigNodePropertyInteger DefaultPeriod { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteWorkflowCoreJobExternalProcessJobHandlerProperties {\n");
      sb.Append("  DefaultTimeout: ").Append(DefaultTimeout).Append("\n");
      sb.Append("  MaxTimeout: ").Append(MaxTimeout).Append("\n");
      sb.Append("  DefaultPeriod: ").Append(DefaultPeriod).Append("\n");
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
