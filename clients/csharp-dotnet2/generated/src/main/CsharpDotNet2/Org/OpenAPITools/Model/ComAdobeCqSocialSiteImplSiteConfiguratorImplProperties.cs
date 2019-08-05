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
  public class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {
    /// <summary>
    /// Gets or Sets ComponentsUsingTags
    /// </summary>
    [DataMember(Name="componentsUsingTags", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "componentsUsingTags")]
    public ConfigNodePropertyArray ComponentsUsingTags { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialSiteImplSiteConfiguratorImplProperties {\n");
      sb.Append("  ComponentsUsingTags: ").Append(ComponentsUsingTags).Append("\n");
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
