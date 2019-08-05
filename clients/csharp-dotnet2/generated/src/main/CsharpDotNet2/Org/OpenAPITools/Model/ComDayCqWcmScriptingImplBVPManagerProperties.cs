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
  public class ComDayCqWcmScriptingImplBVPManagerProperties {
    /// <summary>
    /// Gets or Sets ComDayCqWcmScriptingBvpScriptEngines
    /// </summary>
    [DataMember(Name="com.day.cq.wcm.scripting.bvp.script.engines", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "com.day.cq.wcm.scripting.bvp.script.engines")]
    public ConfigNodePropertyArray ComDayCqWcmScriptingBvpScriptEngines { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmScriptingImplBVPManagerProperties {\n");
      sb.Append("  ComDayCqWcmScriptingBvpScriptEngines: ").Append(ComDayCqWcmScriptingBvpScriptEngines).Append("\n");
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
