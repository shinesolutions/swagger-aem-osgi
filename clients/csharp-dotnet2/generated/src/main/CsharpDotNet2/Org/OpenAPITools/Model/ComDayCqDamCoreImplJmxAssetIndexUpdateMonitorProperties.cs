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
  public class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {
    /// <summary>
    /// Gets or Sets JmxObjectname
    /// </summary>
    [DataMember(Name="jmx.objectname", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "jmx.objectname")]
    public ConfigNodePropertyString JmxObjectname { get; set; }

    /// <summary>
    /// Gets or Sets PropertyMeasureEnabled
    /// </summary>
    [DataMember(Name="property.measure.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.measure.enabled")]
    public ConfigNodePropertyBoolean PropertyMeasureEnabled { get; set; }

    /// <summary>
    /// Gets or Sets PropertyName
    /// </summary>
    [DataMember(Name="property.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.name")]
    public ConfigNodePropertyString PropertyName { get; set; }

    /// <summary>
    /// Gets or Sets PropertyMaxWaitMs
    /// </summary>
    [DataMember(Name="property.max.wait.ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.max.wait.ms")]
    public ConfigNodePropertyInteger PropertyMaxWaitMs { get; set; }

    /// <summary>
    /// Gets or Sets PropertyMaxRate
    /// </summary>
    [DataMember(Name="property.max.rate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "property.max.rate")]
    public ConfigNodePropertyFloat PropertyMaxRate { get; set; }

    /// <summary>
    /// Gets or Sets FulltextMeasureEnabled
    /// </summary>
    [DataMember(Name="fulltext.measure.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fulltext.measure.enabled")]
    public ConfigNodePropertyBoolean FulltextMeasureEnabled { get; set; }

    /// <summary>
    /// Gets or Sets FulltextName
    /// </summary>
    [DataMember(Name="fulltext.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fulltext.name")]
    public ConfigNodePropertyString FulltextName { get; set; }

    /// <summary>
    /// Gets or Sets FulltextMaxWaitMs
    /// </summary>
    [DataMember(Name="fulltext.max.wait.ms", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fulltext.max.wait.ms")]
    public ConfigNodePropertyInteger FulltextMaxWaitMs { get; set; }

    /// <summary>
    /// Gets or Sets FulltextMaxRate
    /// </summary>
    [DataMember(Name="fulltext.max.rate", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "fulltext.max.rate")]
    public ConfigNodePropertyFloat FulltextMaxRate { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplJmxAssetIndexUpdateMonitorProperties {\n");
      sb.Append("  JmxObjectname: ").Append(JmxObjectname).Append("\n");
      sb.Append("  PropertyMeasureEnabled: ").Append(PropertyMeasureEnabled).Append("\n");
      sb.Append("  PropertyName: ").Append(PropertyName).Append("\n");
      sb.Append("  PropertyMaxWaitMs: ").Append(PropertyMaxWaitMs).Append("\n");
      sb.Append("  PropertyMaxRate: ").Append(PropertyMaxRate).Append("\n");
      sb.Append("  FulltextMeasureEnabled: ").Append(FulltextMeasureEnabled).Append("\n");
      sb.Append("  FulltextName: ").Append(FulltextName).Append("\n");
      sb.Append("  FulltextMaxWaitMs: ").Append(FulltextMaxWaitMs).Append("\n");
      sb.Append("  FulltextMaxRate: ").Append(FulltextMaxRate).Append("\n");
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
