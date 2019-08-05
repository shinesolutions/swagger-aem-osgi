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
  public class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {
    /// <summary>
    /// Gets or Sets SkipBufferedcache
    /// </summary>
    [DataMember(Name="skip.bufferedcache", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "skip.bufferedcache")]
    public ConfigNodePropertyBoolean SkipBufferedcache { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplGfxCommonsGfxRendererProperties {\n");
      sb.Append("  SkipBufferedcache: ").Append(SkipBufferedcache).Append("\n");
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
