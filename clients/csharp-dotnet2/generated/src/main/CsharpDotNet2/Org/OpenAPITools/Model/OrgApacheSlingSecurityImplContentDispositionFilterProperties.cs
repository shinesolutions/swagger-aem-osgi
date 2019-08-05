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
  public class OrgApacheSlingSecurityImplContentDispositionFilterProperties {
    /// <summary>
    /// Gets or Sets SlingContentDispositionPaths
    /// </summary>
    [DataMember(Name="sling.content.disposition.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.content.disposition.paths")]
    public ConfigNodePropertyArray SlingContentDispositionPaths { get; set; }

    /// <summary>
    /// Gets or Sets SlingContentDispositionExcludedPaths
    /// </summary>
    [DataMember(Name="sling.content.disposition.excluded.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.content.disposition.excluded.paths")]
    public ConfigNodePropertyArray SlingContentDispositionExcludedPaths { get; set; }

    /// <summary>
    /// Gets or Sets SlingContentDispositionAllPaths
    /// </summary>
    [DataMember(Name="sling.content.disposition.all.paths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.content.disposition.all.paths")]
    public ConfigNodePropertyBoolean SlingContentDispositionAllPaths { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingSecurityImplContentDispositionFilterProperties {\n");
      sb.Append("  SlingContentDispositionPaths: ").Append(SlingContentDispositionPaths).Append("\n");
      sb.Append("  SlingContentDispositionExcludedPaths: ").Append(SlingContentDispositionExcludedPaths).Append("\n");
      sb.Append("  SlingContentDispositionAllPaths: ").Append(SlingContentDispositionAllPaths).Append("\n");
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
