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
  public class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {
    /// <summary>
    /// Gets or Sets IgnorePropertyNameRegex
    /// </summary>
    [DataMember(Name="ignorePropertyNameRegex", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ignorePropertyNameRegex")]
    public ConfigNodePropertyArray IgnorePropertyNameRegex { get; set; }

    /// <summary>
    /// Gets or Sets ConfigCollectionPropertiesResourceNames
    /// </summary>
    [DataMember(Name="configCollectionPropertiesResourceNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configCollectionPropertiesResourceNames")]
    public ConfigNodePropertyArray ConfigCollectionPropertiesResourceNames { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCaconfigManagementImplConfigurationManagementSettiProperties {\n");
      sb.Append("  IgnorePropertyNameRegex: ").Append(IgnorePropertyNameRegex).Append("\n");
      sb.Append("  ConfigCollectionPropertiesResourceNames: ").Append(ConfigCollectionPropertiesResourceNames).Append("\n");
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
