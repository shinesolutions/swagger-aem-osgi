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
  public class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {
    /// <summary>
    /// Gets or Sets ResourceTypeFilters
    /// </summary>
    [DataMember(Name="resourceType.filters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "resourceType.filters")]
    public ConfigNodePropertyArray ResourceTypeFilters { get; set; }

    /// <summary>
    /// Gets or Sets Priority
    /// </summary>
    [DataMember(Name="priority", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "priority")]
    public ConfigNodePropertyInteger Priority { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialModerationDashboardApiFilterGroupSocialComponenProperties {\n");
      sb.Append("  ResourceTypeFilters: ").Append(ResourceTypeFilters).Append("\n");
      sb.Append("  Priority: ").Append(Priority).Append("\n");
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
