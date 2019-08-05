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
  public class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {
    /// <summary>
    /// Gets or Sets NameWhitelist
    /// </summary>
    [DataMember(Name="name.whitelist", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name.whitelist")]
    public ConfigNodePropertyString NameWhitelist { get; set; }

    /// <summary>
    /// Gets or Sets AllowExpressions
    /// </summary>
    [DataMember(Name="allow.expressions", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allow.expressions")]
    public ConfigNodePropertyBoolean AllowExpressions { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmFoundationFormsImplFormsHandlingServletProperties {\n");
      sb.Append("  NameWhitelist: ").Append(NameWhitelist).Append("\n");
      sb.Append("  AllowExpressions: ").Append(AllowExpressions).Append("\n");
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
