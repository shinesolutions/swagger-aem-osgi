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
  public class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {
    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets ConfigPath
    /// </summary>
    [DataMember(Name="configPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configPath")]
    public ConfigNodePropertyString ConfigPath { get; set; }

    /// <summary>
    /// Gets or Sets FallbackPaths
    /// </summary>
    [DataMember(Name="fallbackPaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fallbackPaths")]
    public ConfigNodePropertyArray FallbackPaths { get; set; }

    /// <summary>
    /// Gets or Sets ConfigCollectionInheritancePropertyNames
    /// </summary>
    [DataMember(Name="configCollectionInheritancePropertyNames", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "configCollectionInheritancePropertyNames")]
    public ConfigNodePropertyArray ConfigCollectionInheritancePropertyNames { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingCaconfigResourceImplDefDefaultConfigurationResourProperties {\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  ConfigPath: ").Append(ConfigPath).Append("\n");
      sb.Append("  FallbackPaths: ").Append(FallbackPaths).Append("\n");
      sb.Append("  ConfigCollectionInheritancePropertyNames: ").Append(ConfigCollectionInheritancePropertyNames).Append("\n");
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
