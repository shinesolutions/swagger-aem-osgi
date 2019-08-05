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
  public class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {
    /// <summary>
    /// Gets or Sets FormsManagerConfigIncludeOOTBTemplates
    /// </summary>
    [DataMember(Name="formsManagerConfig.includeOOTBTemplates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "formsManagerConfig.includeOOTBTemplates")]
    public ConfigNodePropertyBoolean FormsManagerConfigIncludeOOTBTemplates { get; set; }

    /// <summary>
    /// Gets or Sets FormsManagerConfigIncludeDeprecatedTemplates
    /// </summary>
    [DataMember(Name="formsManagerConfig.includeDeprecatedTemplates", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "formsManagerConfig.includeDeprecatedTemplates")]
    public ConfigNodePropertyBoolean FormsManagerConfigIncludeDeprecatedTemplates { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeAemFormsndocumentsConfigAEMFormsManagerConfigurationProperties {\n");
      sb.Append("  FormsManagerConfigIncludeOOTBTemplates: ").Append(FormsManagerConfigIncludeOOTBTemplates).Append("\n");
      sb.Append("  FormsManagerConfigIncludeDeprecatedTemplates: ").Append(FormsManagerConfigIncludeDeprecatedTemplates).Append("\n");
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
