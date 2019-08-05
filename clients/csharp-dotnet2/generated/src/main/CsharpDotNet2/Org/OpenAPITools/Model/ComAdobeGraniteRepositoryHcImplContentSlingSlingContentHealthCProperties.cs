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
  public class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {
    /// <summary>
    /// Gets or Sets HcTags
    /// </summary>
    [DataMember(Name="hc.tags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "hc.tags")]
    public ConfigNodePropertyArray HcTags { get; set; }

    /// <summary>
    /// Gets or Sets ExcludeSearchPath
    /// </summary>
    [DataMember(Name="exclude.search.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exclude.search.path")]
    public ConfigNodePropertyArray ExcludeSearchPath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRepositoryHcImplContentSlingSlingContentHealthCProperties {\n");
      sb.Append("  HcTags: ").Append(HcTags).Append("\n");
      sb.Append("  ExcludeSearchPath: ").Append(ExcludeSearchPath).Append("\n");
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
