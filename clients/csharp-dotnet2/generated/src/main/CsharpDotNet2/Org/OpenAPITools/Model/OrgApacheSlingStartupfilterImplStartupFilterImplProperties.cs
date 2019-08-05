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
  public class OrgApacheSlingStartupfilterImplStartupFilterImplProperties {
    /// <summary>
    /// Gets or Sets ActiveByDefault
    /// </summary>
    [DataMember(Name="active.by.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "active.by.default")]
    public ConfigNodePropertyBoolean ActiveByDefault { get; set; }

    /// <summary>
    /// Gets or Sets DefaultMessage
    /// </summary>
    [DataMember(Name="default.message", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "default.message")]
    public ConfigNodePropertyString DefaultMessage { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingStartupfilterImplStartupFilterImplProperties {\n");
      sb.Append("  ActiveByDefault: ").Append(ActiveByDefault).Append("\n");
      sb.Append("  DefaultMessage: ").Append(DefaultMessage).Append("\n");
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
