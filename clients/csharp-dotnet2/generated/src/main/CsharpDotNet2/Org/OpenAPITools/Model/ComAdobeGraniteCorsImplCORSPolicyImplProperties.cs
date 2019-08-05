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
  public class ComAdobeGraniteCorsImplCORSPolicyImplProperties {
    /// <summary>
    /// Gets or Sets Alloworigin
    /// </summary>
    [DataMember(Name="alloworigin", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alloworigin")]
    public ConfigNodePropertyArray Alloworigin { get; set; }

    /// <summary>
    /// Gets or Sets Alloworiginregexp
    /// </summary>
    [DataMember(Name="alloworiginregexp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "alloworiginregexp")]
    public ConfigNodePropertyArray Alloworiginregexp { get; set; }

    /// <summary>
    /// Gets or Sets Allowedpaths
    /// </summary>
    [DataMember(Name="allowedpaths", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "allowedpaths")]
    public ConfigNodePropertyArray Allowedpaths { get; set; }

    /// <summary>
    /// Gets or Sets Exposedheaders
    /// </summary>
    [DataMember(Name="exposedheaders", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "exposedheaders")]
    public ConfigNodePropertyArray Exposedheaders { get; set; }

    /// <summary>
    /// Gets or Sets Maxage
    /// </summary>
    [DataMember(Name="maxage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxage")]
    public ConfigNodePropertyInteger Maxage { get; set; }

    /// <summary>
    /// Gets or Sets Supportedheaders
    /// </summary>
    [DataMember(Name="supportedheaders", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supportedheaders")]
    public ConfigNodePropertyArray Supportedheaders { get; set; }

    /// <summary>
    /// Gets or Sets Supportedmethods
    /// </summary>
    [DataMember(Name="supportedmethods", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supportedmethods")]
    public ConfigNodePropertyArray Supportedmethods { get; set; }

    /// <summary>
    /// Gets or Sets Supportscredentials
    /// </summary>
    [DataMember(Name="supportscredentials", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "supportscredentials")]
    public ConfigNodePropertyBoolean Supportscredentials { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteCorsImplCORSPolicyImplProperties {\n");
      sb.Append("  Alloworigin: ").Append(Alloworigin).Append("\n");
      sb.Append("  Alloworiginregexp: ").Append(Alloworiginregexp).Append("\n");
      sb.Append("  Allowedpaths: ").Append(Allowedpaths).Append("\n");
      sb.Append("  Exposedheaders: ").Append(Exposedheaders).Append("\n");
      sb.Append("  Maxage: ").Append(Maxage).Append("\n");
      sb.Append("  Supportedheaders: ").Append(Supportedheaders).Append("\n");
      sb.Append("  Supportedmethods: ").Append(Supportedmethods).Append("\n");
      sb.Append("  Supportscredentials: ").Append(Supportscredentials).Append("\n");
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
