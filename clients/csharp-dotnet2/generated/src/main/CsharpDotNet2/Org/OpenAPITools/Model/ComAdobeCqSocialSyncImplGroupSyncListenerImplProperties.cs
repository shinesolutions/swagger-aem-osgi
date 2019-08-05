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
  public class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {
    /// <summary>
    /// Gets or Sets Nodetypes
    /// </summary>
    [DataMember(Name="nodetypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "nodetypes")]
    public ConfigNodePropertyArray Nodetypes { get; set; }

    /// <summary>
    /// Gets or Sets Ignorableprops
    /// </summary>
    [DataMember(Name="ignorableprops", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ignorableprops")]
    public ConfigNodePropertyArray Ignorableprops { get; set; }

    /// <summary>
    /// Gets or Sets Ignorablenodes
    /// </summary>
    [DataMember(Name="ignorablenodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ignorablenodes")]
    public ConfigNodePropertyString Ignorablenodes { get; set; }

    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets Distfolders
    /// </summary>
    [DataMember(Name="distfolders", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "distfolders")]
    public ConfigNodePropertyString Distfolders { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialSyncImplGroupSyncListenerImplProperties {\n");
      sb.Append("  Nodetypes: ").Append(Nodetypes).Append("\n");
      sb.Append("  Ignorableprops: ").Append(Ignorableprops).Append("\n");
      sb.Append("  Ignorablenodes: ").Append(Ignorablenodes).Append("\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  Distfolders: ").Append(Distfolders).Append("\n");
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
