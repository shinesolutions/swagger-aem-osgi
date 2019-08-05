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
  public class ComDayCqAuthImplCugCugSupportImplProperties {
    /// <summary>
    /// Gets or Sets CugExemptedPrincipals
    /// </summary>
    [DataMember(Name="cug.exempted.principals", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cug.exempted.principals")]
    public ConfigNodePropertyArray CugExemptedPrincipals { get; set; }

    /// <summary>
    /// Gets or Sets CugEnabled
    /// </summary>
    [DataMember(Name="cug.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cug.enabled")]
    public ConfigNodePropertyBoolean CugEnabled { get; set; }

    /// <summary>
    /// Gets or Sets CugPrincipalsRegex
    /// </summary>
    [DataMember(Name="cug.principals.regex", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cug.principals.regex")]
    public ConfigNodePropertyString CugPrincipalsRegex { get; set; }

    /// <summary>
    /// Gets or Sets CugPrincipalsReplacement
    /// </summary>
    [DataMember(Name="cug.principals.replacement", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cug.principals.replacement")]
    public ConfigNodePropertyString CugPrincipalsReplacement { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqAuthImplCugCugSupportImplProperties {\n");
      sb.Append("  CugExemptedPrincipals: ").Append(CugExemptedPrincipals).Append("\n");
      sb.Append("  CugEnabled: ").Append(CugEnabled).Append("\n");
      sb.Append("  CugPrincipalsRegex: ").Append(CugPrincipalsRegex).Append("\n");
      sb.Append("  CugPrincipalsReplacement: ").Append(CugPrincipalsReplacement).Append("\n");
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
