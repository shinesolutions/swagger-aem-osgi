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
  public class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {
    /// <summary>
    /// Gets or Sets EventTopics
    /// </summary>
    [DataMember(Name="event.topics", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.topics")]
    public ConfigNodePropertyString EventTopics { get; set; }

    /// <summary>
    /// Gets or Sets EventFilter
    /// </summary>
    [DataMember(Name="event.filter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "event.filter")]
    public ConfigNodePropertyString EventFilter { get; set; }

    /// <summary>
    /// Gets or Sets TranslateListenerType
    /// </summary>
    [DataMember(Name="translate.listener.type", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.listener.type")]
    public ConfigNodePropertyArray TranslateListenerType { get; set; }

    /// <summary>
    /// Gets or Sets TranslatePropertyList
    /// </summary>
    [DataMember(Name="translate.property.list", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.property.list")]
    public ConfigNodePropertyArray TranslatePropertyList { get; set; }

    /// <summary>
    /// Gets or Sets PoolSize
    /// </summary>
    [DataMember(Name="poolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "poolSize")]
    public ConfigNodePropertyInteger PoolSize { get; set; }

    /// <summary>
    /// Gets or Sets MaxPoolSize
    /// </summary>
    [DataMember(Name="maxPoolSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxPoolSize")]
    public ConfigNodePropertyInteger MaxPoolSize { get; set; }

    /// <summary>
    /// Gets or Sets QueueSize
    /// </summary>
    [DataMember(Name="queueSize", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "queueSize")]
    public ConfigNodePropertyInteger QueueSize { get; set; }

    /// <summary>
    /// Gets or Sets KeepAliveTime
    /// </summary>
    [DataMember(Name="keepAliveTime", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "keepAliveTime")]
    public ConfigNodePropertyInteger KeepAliveTime { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialTranslationImplUGCLanguageDetectorProperties {\n");
      sb.Append("  EventTopics: ").Append(EventTopics).Append("\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
      sb.Append("  TranslateListenerType: ").Append(TranslateListenerType).Append("\n");
      sb.Append("  TranslatePropertyList: ").Append(TranslatePropertyList).Append("\n");
      sb.Append("  PoolSize: ").Append(PoolSize).Append("\n");
      sb.Append("  MaxPoolSize: ").Append(MaxPoolSize).Append("\n");
      sb.Append("  QueueSize: ").Append(QueueSize).Append("\n");
      sb.Append("  KeepAliveTime: ").Append(KeepAliveTime).Append("\n");
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
