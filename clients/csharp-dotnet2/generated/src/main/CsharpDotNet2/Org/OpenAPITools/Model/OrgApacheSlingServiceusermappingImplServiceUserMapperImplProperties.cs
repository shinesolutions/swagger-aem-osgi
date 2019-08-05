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
  public class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {
    /// <summary>
    /// Gets or Sets UserMapping
    /// </summary>
    [DataMember(Name="user.mapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.mapping")]
    public ConfigNodePropertyArray UserMapping { get; set; }

    /// <summary>
    /// Gets or Sets UserDefault
    /// </summary>
    [DataMember(Name="user.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.default")]
    public ConfigNodePropertyString UserDefault { get; set; }

    /// <summary>
    /// Gets or Sets UserEnableDefaultMapping
    /// </summary>
    [DataMember(Name="user.enable.default.mapping", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "user.enable.default.mapping")]
    public ConfigNodePropertyBoolean UserEnableDefaultMapping { get; set; }

    /// <summary>
    /// Gets or Sets RequireValidation
    /// </summary>
    [DataMember(Name="require.validation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "require.validation")]
    public ConfigNodePropertyBoolean RequireValidation { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingServiceusermappingImplServiceUserMapperImplProperties {\n");
      sb.Append("  UserMapping: ").Append(UserMapping).Append("\n");
      sb.Append("  UserDefault: ").Append(UserDefault).Append("\n");
      sb.Append("  UserEnableDefaultMapping: ").Append(UserEnableDefaultMapping).Append("\n");
      sb.Append("  RequireValidation: ").Append(RequireValidation).Append("\n");
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
