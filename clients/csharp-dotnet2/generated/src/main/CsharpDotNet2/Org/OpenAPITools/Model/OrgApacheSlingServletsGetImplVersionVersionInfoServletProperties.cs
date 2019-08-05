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
  public class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {
    /// <summary>
    /// Gets or Sets SlingServletSelectors
    /// </summary>
    [DataMember(Name="sling.servlet.selectors", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sling.servlet.selectors")]
    public ConfigNodePropertyArray SlingServletSelectors { get; set; }

    /// <summary>
    /// Gets or Sets EcmaSuport
    /// </summary>
    [DataMember(Name="ecmaSuport", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ecmaSuport")]
    public ConfigNodePropertyBoolean EcmaSuport { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingServletsGetImplVersionVersionInfoServletProperties {\n");
      sb.Append("  SlingServletSelectors: ").Append(SlingServletSelectors).Append("\n");
      sb.Append("  EcmaSuport: ").Append(EcmaSuport).Append("\n");
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
