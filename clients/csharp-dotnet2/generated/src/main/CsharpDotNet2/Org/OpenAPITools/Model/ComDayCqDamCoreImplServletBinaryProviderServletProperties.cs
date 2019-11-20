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
  public class ComDayCqDamCoreImplServletBinaryProviderServletProperties {
    /// <summary>
    /// Gets or Sets SlingServletResourceTypes
    /// </summary>
    [DataMember(Name="sling.servlet.resourceTypes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.resourceTypes")]
    public ConfigNodePropertyArray SlingServletResourceTypes { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletMethods
    /// </summary>
    [DataMember(Name="sling.servlet.methods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.methods")]
    public ConfigNodePropertyArray SlingServletMethods { get; set; }

    /// <summary>
    /// Gets or Sets CqDamDrmEnable
    /// </summary>
    [DataMember(Name="cq.dam.drm.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.drm.enable")]
    public ConfigNodePropertyBoolean CqDamDrmEnable { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplServletBinaryProviderServletProperties {\n");
      sb.Append("  SlingServletResourceTypes: ").Append(SlingServletResourceTypes).Append("\n");
      sb.Append("  SlingServletMethods: ").Append(SlingServletMethods).Append("\n");
      sb.Append("  CqDamDrmEnable: ").Append(CqDamDrmEnable).Append("\n");
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