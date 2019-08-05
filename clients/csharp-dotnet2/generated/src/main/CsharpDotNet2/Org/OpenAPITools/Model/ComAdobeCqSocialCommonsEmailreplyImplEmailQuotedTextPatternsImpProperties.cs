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
  public class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {
    /// <summary>
    /// Gets or Sets PatternTime
    /// </summary>
    [DataMember(Name="pattern.time", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.time")]
    public ConfigNodePropertyString PatternTime { get; set; }

    /// <summary>
    /// Gets or Sets PatternNewline
    /// </summary>
    [DataMember(Name="pattern.newline", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.newline")]
    public ConfigNodePropertyString PatternNewline { get; set; }

    /// <summary>
    /// Gets or Sets PatternDayOfMonth
    /// </summary>
    [DataMember(Name="pattern.dayOfMonth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.dayOfMonth")]
    public ConfigNodePropertyString PatternDayOfMonth { get; set; }

    /// <summary>
    /// Gets or Sets PatternMonth
    /// </summary>
    [DataMember(Name="pattern.month", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.month")]
    public ConfigNodePropertyString PatternMonth { get; set; }

    /// <summary>
    /// Gets or Sets PatternYear
    /// </summary>
    [DataMember(Name="pattern.year", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.year")]
    public ConfigNodePropertyString PatternYear { get; set; }

    /// <summary>
    /// Gets or Sets PatternDate
    /// </summary>
    [DataMember(Name="pattern.date", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.date")]
    public ConfigNodePropertyString PatternDate { get; set; }

    /// <summary>
    /// Gets or Sets PatternDateTime
    /// </summary>
    [DataMember(Name="pattern.dateTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.dateTime")]
    public ConfigNodePropertyString PatternDateTime { get; set; }

    /// <summary>
    /// Gets or Sets PatternEmail
    /// </summary>
    [DataMember(Name="pattern.email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "pattern.email")]
    public ConfigNodePropertyString PatternEmail { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsEmailreplyImplEmailQuotedTextPatternsImpProperties {\n");
      sb.Append("  PatternTime: ").Append(PatternTime).Append("\n");
      sb.Append("  PatternNewline: ").Append(PatternNewline).Append("\n");
      sb.Append("  PatternDayOfMonth: ").Append(PatternDayOfMonth).Append("\n");
      sb.Append("  PatternMonth: ").Append(PatternMonth).Append("\n");
      sb.Append("  PatternYear: ").Append(PatternYear).Append("\n");
      sb.Append("  PatternDate: ").Append(PatternDate).Append("\n");
      sb.Append("  PatternDateTime: ").Append(PatternDateTime).Append("\n");
      sb.Append("  PatternEmail: ").Append(PatternEmail).Append("\n");
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
