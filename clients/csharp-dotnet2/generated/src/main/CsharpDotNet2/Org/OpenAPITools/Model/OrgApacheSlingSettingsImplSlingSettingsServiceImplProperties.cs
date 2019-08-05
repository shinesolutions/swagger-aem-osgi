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
  public class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {
    /// <summary>
    /// Gets or Sets SlingName
    /// </summary>
    [DataMember(Name="sling.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.name")]
    public ConfigNodePropertyString SlingName { get; set; }

    /// <summary>
    /// Gets or Sets SlingDescription
    /// </summary>
    [DataMember(Name="sling.description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.description")]
    public ConfigNodePropertyString SlingDescription { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingSettingsImplSlingSettingsServiceImplProperties {\n");
      sb.Append("  SlingName: ").Append(SlingName).Append("\n");
      sb.Append("  SlingDescription: ").Append(SlingDescription).Append("\n");
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
