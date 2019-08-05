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
  public class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {
    /// <summary>
    /// Gets or Sets Enabled
    /// </summary>
    [DataMember(Name="enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enabled")]
    public ConfigNodePropertyBoolean Enabled { get; set; }

    /// <summary>
    /// Gets or Sets IntervalSeconds
    /// </summary>
    [DataMember(Name="intervalSeconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "intervalSeconds")]
    public ConfigNodePropertyInteger IntervalSeconds { get; set; }

    /// <summary>
    /// Gets or Sets CommitsPerIntervalThreshold
    /// </summary>
    [DataMember(Name="commitsPerIntervalThreshold", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "commitsPerIntervalThreshold")]
    public ConfigNodePropertyInteger CommitsPerIntervalThreshold { get; set; }

    /// <summary>
    /// Gets or Sets MaxLocationLength
    /// </summary>
    [DataMember(Name="maxLocationLength", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxLocationLength")]
    public ConfigNodePropertyInteger MaxLocationLength { get; set; }

    /// <summary>
    /// Gets or Sets MaxDetailsShown
    /// </summary>
    [DataMember(Name="maxDetailsShown", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxDetailsShown")]
    public ConfigNodePropertyInteger MaxDetailsShown { get; set; }

    /// <summary>
    /// Gets or Sets MinDetailsPercentage
    /// </summary>
    [DataMember(Name="minDetailsPercentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "minDetailsPercentage")]
    public ConfigNodePropertyInteger MinDetailsPercentage { get; set; }

    /// <summary>
    /// Gets or Sets ThreadMatchers
    /// </summary>
    [DataMember(Name="threadMatchers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "threadMatchers")]
    public ConfigNodePropertyArray ThreadMatchers { get; set; }

    /// <summary>
    /// Gets or Sets MaxGreedyDepth
    /// </summary>
    [DataMember(Name="maxGreedyDepth", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxGreedyDepth")]
    public ConfigNodePropertyInteger MaxGreedyDepth { get; set; }

    /// <summary>
    /// Gets or Sets GreedyStackMatchers
    /// </summary>
    [DataMember(Name="greedyStackMatchers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "greedyStackMatchers")]
    public ConfigNodePropertyString GreedyStackMatchers { get; set; }

    /// <summary>
    /// Gets or Sets StackFilters
    /// </summary>
    [DataMember(Name="stackFilters", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stackFilters")]
    public ConfigNodePropertyArray StackFilters { get; set; }

    /// <summary>
    /// Gets or Sets StackMatchers
    /// </summary>
    [DataMember(Name="stackMatchers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stackMatchers")]
    public ConfigNodePropertyArray StackMatchers { get; set; }

    /// <summary>
    /// Gets or Sets StackCategorizers
    /// </summary>
    [DataMember(Name="stackCategorizers", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stackCategorizers")]
    public ConfigNodePropertyArray StackCategorizers { get; set; }

    /// <summary>
    /// Gets or Sets StackShorteners
    /// </summary>
    [DataMember(Name="stackShorteners", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "stackShorteners")]
    public ConfigNodePropertyArray StackShorteners { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteRepositoryImplCommitStatsConfigProperties {\n");
      sb.Append("  Enabled: ").Append(Enabled).Append("\n");
      sb.Append("  IntervalSeconds: ").Append(IntervalSeconds).Append("\n");
      sb.Append("  CommitsPerIntervalThreshold: ").Append(CommitsPerIntervalThreshold).Append("\n");
      sb.Append("  MaxLocationLength: ").Append(MaxLocationLength).Append("\n");
      sb.Append("  MaxDetailsShown: ").Append(MaxDetailsShown).Append("\n");
      sb.Append("  MinDetailsPercentage: ").Append(MinDetailsPercentage).Append("\n");
      sb.Append("  ThreadMatchers: ").Append(ThreadMatchers).Append("\n");
      sb.Append("  MaxGreedyDepth: ").Append(MaxGreedyDepth).Append("\n");
      sb.Append("  GreedyStackMatchers: ").Append(GreedyStackMatchers).Append("\n");
      sb.Append("  StackFilters: ").Append(StackFilters).Append("\n");
      sb.Append("  StackMatchers: ").Append(StackMatchers).Append("\n");
      sb.Append("  StackCategorizers: ").Append(StackCategorizers).Append("\n");
      sb.Append("  StackShorteners: ").Append(StackShorteners).Append("\n");
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
