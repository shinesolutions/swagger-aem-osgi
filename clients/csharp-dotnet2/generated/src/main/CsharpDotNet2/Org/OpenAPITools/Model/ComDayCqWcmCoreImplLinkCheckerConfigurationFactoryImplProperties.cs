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
  public class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {
    /// <summary>
    /// Gets or Sets LinkExpiredPrefix
    /// </summary>
    [DataMember(Name="link.expired.prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.expired.prefix")]
    public ConfigNodePropertyString LinkExpiredPrefix { get; set; }

    /// <summary>
    /// Gets or Sets LinkExpiredRemove
    /// </summary>
    [DataMember(Name="link.expired.remove", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.expired.remove")]
    public ConfigNodePropertyBoolean LinkExpiredRemove { get; set; }

    /// <summary>
    /// Gets or Sets LinkExpiredSuffix
    /// </summary>
    [DataMember(Name="link.expired.suffix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.expired.suffix")]
    public ConfigNodePropertyString LinkExpiredSuffix { get; set; }

    /// <summary>
    /// Gets or Sets LinkInvalidPrefix
    /// </summary>
    [DataMember(Name="link.invalid.prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.invalid.prefix")]
    public ConfigNodePropertyString LinkInvalidPrefix { get; set; }

    /// <summary>
    /// Gets or Sets LinkInvalidRemove
    /// </summary>
    [DataMember(Name="link.invalid.remove", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.invalid.remove")]
    public ConfigNodePropertyBoolean LinkInvalidRemove { get; set; }

    /// <summary>
    /// Gets or Sets LinkInvalidSuffix
    /// </summary>
    [DataMember(Name="link.invalid.suffix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.invalid.suffix")]
    public ConfigNodePropertyString LinkInvalidSuffix { get; set; }

    /// <summary>
    /// Gets or Sets LinkPredatedPrefix
    /// </summary>
    [DataMember(Name="link.predated.prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.predated.prefix")]
    public ConfigNodePropertyString LinkPredatedPrefix { get; set; }

    /// <summary>
    /// Gets or Sets LinkPredatedRemove
    /// </summary>
    [DataMember(Name="link.predated.remove", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.predated.remove")]
    public ConfigNodePropertyBoolean LinkPredatedRemove { get; set; }

    /// <summary>
    /// Gets or Sets LinkPredatedSuffix
    /// </summary>
    [DataMember(Name="link.predated.suffix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.predated.suffix")]
    public ConfigNodePropertyString LinkPredatedSuffix { get; set; }

    /// <summary>
    /// Gets or Sets LinkWcmmodes
    /// </summary>
    [DataMember(Name="link.wcmmodes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "link.wcmmodes")]
    public ConfigNodePropertyArray LinkWcmmodes { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqWcmCoreImplLinkCheckerConfigurationFactoryImplProperties {\n");
      sb.Append("  LinkExpiredPrefix: ").Append(LinkExpiredPrefix).Append("\n");
      sb.Append("  LinkExpiredRemove: ").Append(LinkExpiredRemove).Append("\n");
      sb.Append("  LinkExpiredSuffix: ").Append(LinkExpiredSuffix).Append("\n");
      sb.Append("  LinkInvalidPrefix: ").Append(LinkInvalidPrefix).Append("\n");
      sb.Append("  LinkInvalidRemove: ").Append(LinkInvalidRemove).Append("\n");
      sb.Append("  LinkInvalidSuffix: ").Append(LinkInvalidSuffix).Append("\n");
      sb.Append("  LinkPredatedPrefix: ").Append(LinkPredatedPrefix).Append("\n");
      sb.Append("  LinkPredatedRemove: ").Append(LinkPredatedRemove).Append("\n");
      sb.Append("  LinkPredatedSuffix: ").Append(LinkPredatedSuffix).Append("\n");
      sb.Append("  LinkWcmmodes: ").Append(LinkWcmmodes).Append("\n");
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
