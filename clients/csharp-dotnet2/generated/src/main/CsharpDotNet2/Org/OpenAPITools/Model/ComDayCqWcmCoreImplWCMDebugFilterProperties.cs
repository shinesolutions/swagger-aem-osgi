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
  public class ComDayCqWcmCoreImplWCMDebugFilterProperties {
    /// <summary>
    /// Gets or Sets WcmdbgfilterEnabled
    /// </summary>
    [DataMember(Name="wcmdbgfilter.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wcmdbgfilter.enabled")]
    public ConfigNodePropertyBoolean WcmdbgfilterEnabled { get; set; }

    /// <summary>
    /// Gets or Sets WcmdbgfilterJspDebug
    /// </summary>
    [DataMember(Name="wcmdbgfilter.jspDebug", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wcmdbgfilter.jspDebug")]
    public ConfigNodePropertyBoolean WcmdbgfilterJspDebug { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplWCMDebugFilterProperties {\n");
      sb.Append("  WcmdbgfilterEnabled: ").Append(WcmdbgfilterEnabled).Append("\n");
      sb.Append("  WcmdbgfilterJspDebug: ").Append(WcmdbgfilterJspDebug).Append("\n");
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
