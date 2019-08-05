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
  public class ComDayCqDamCoreImplLightboxLightboxServletProperties {
    /// <summary>
    /// Gets or Sets SlingServletPaths
    /// </summary>
    [DataMember(Name="sling.servlet.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.paths")]
    public ConfigNodePropertyString SlingServletPaths { get; set; }

    /// <summary>
    /// Gets or Sets SlingServletMethods
    /// </summary>
    [DataMember(Name="sling.servlet.methods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.methods")]
    public ConfigNodePropertyArray SlingServletMethods { get; set; }

    /// <summary>
    /// Gets or Sets CqDamEnableAnonymous
    /// </summary>
    [DataMember(Name="cq.dam.enable.anonymous", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.enable.anonymous")]
    public ConfigNodePropertyBoolean CqDamEnableAnonymous { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplLightboxLightboxServletProperties {\n");
      sb.Append("  SlingServletPaths: ").Append(SlingServletPaths).Append("\n");
      sb.Append("  SlingServletMethods: ").Append(SlingServletMethods).Append("\n");
      sb.Append("  CqDamEnableAnonymous: ").Append(CqDamEnableAnonymous).Append("\n");
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
