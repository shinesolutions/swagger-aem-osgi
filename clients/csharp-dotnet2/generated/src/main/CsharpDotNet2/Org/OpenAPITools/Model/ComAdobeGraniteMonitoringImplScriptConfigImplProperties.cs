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
  public class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {
    /// <summary>
    /// Gets or Sets ScriptFilename
    /// </summary>
    [DataMember(Name="script.filename", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "script.filename")]
    public ConfigNodePropertyString ScriptFilename { get; set; }

    /// <summary>
    /// Gets or Sets ScriptDisplay
    /// </summary>
    [DataMember(Name="script.display", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "script.display")]
    public ConfigNodePropertyString ScriptDisplay { get; set; }

    /// <summary>
    /// Gets or Sets ScriptPath
    /// </summary>
    [DataMember(Name="script.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "script.path")]
    public ConfigNodePropertyString ScriptPath { get; set; }

    /// <summary>
    /// Gets or Sets ScriptPlatform
    /// </summary>
    [DataMember(Name="script.platform", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "script.platform")]
    public ConfigNodePropertyArray ScriptPlatform { get; set; }

    /// <summary>
    /// Gets or Sets Interval
    /// </summary>
    [DataMember(Name="interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "interval")]
    public ConfigNodePropertyInteger Interval { get; set; }

    /// <summary>
    /// Gets or Sets Jmxdomain
    /// </summary>
    [DataMember(Name="jmxdomain", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jmxdomain")]
    public ConfigNodePropertyString Jmxdomain { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteMonitoringImplScriptConfigImplProperties {\n");
      sb.Append("  ScriptFilename: ").Append(ScriptFilename).Append("\n");
      sb.Append("  ScriptDisplay: ").Append(ScriptDisplay).Append("\n");
      sb.Append("  ScriptPath: ").Append(ScriptPath).Append("\n");
      sb.Append("  ScriptPlatform: ").Append(ScriptPlatform).Append("\n");
      sb.Append("  Interval: ").Append(Interval).Append("\n");
      sb.Append("  Jmxdomain: ").Append(Jmxdomain).Append("\n");
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
