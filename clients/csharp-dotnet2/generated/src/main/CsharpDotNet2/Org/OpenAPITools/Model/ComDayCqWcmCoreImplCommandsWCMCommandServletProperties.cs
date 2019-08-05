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
  public class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {
    /// <summary>
    /// Gets or Sets WcmcommandservletDeleteWhitelist
    /// </summary>
    [DataMember(Name="wcmcommandservlet.delete_whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "wcmcommandservlet.delete_whitelist")]
    public ConfigNodePropertyArray WcmcommandservletDeleteWhitelist { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplCommandsWCMCommandServletProperties {\n");
      sb.Append("  WcmcommandservletDeleteWhitelist: ").Append(WcmcommandservletDeleteWhitelist).Append("\n");
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
