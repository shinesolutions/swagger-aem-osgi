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
  public class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {
    /// <summary>
    /// Gets or Sets TranslationFactory
    /// </summary>
    [DataMember(Name="translationFactory", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translationFactory")]
    public ConfigNodePropertyString TranslationFactory { get; set; }

    /// <summary>
    /// Gets or Sets DefaultConnectorLabel
    /// </summary>
    [DataMember(Name="defaultConnectorLabel", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultConnectorLabel")]
    public ConfigNodePropertyString DefaultConnectorLabel { get; set; }

    /// <summary>
    /// Gets or Sets DefaultConnectorAttribution
    /// </summary>
    [DataMember(Name="defaultConnectorAttribution", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultConnectorAttribution")]
    public ConfigNodePropertyString DefaultConnectorAttribution { get; set; }

    /// <summary>
    /// Gets or Sets DefaultConnectorWorkspaceId
    /// </summary>
    [DataMember(Name="defaultConnectorWorkspaceId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultConnectorWorkspaceId")]
    public ConfigNodePropertyString DefaultConnectorWorkspaceId { get; set; }

    /// <summary>
    /// Gets or Sets DefaultConnectorSubscriptionKey
    /// </summary>
    [DataMember(Name="defaultConnectorSubscriptionKey", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "defaultConnectorSubscriptionKey")]
    public ConfigNodePropertyString DefaultConnectorSubscriptionKey { get; set; }

    /// <summary>
    /// Gets or Sets LanguageMapLocation
    /// </summary>
    [DataMember(Name="languageMapLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "languageMapLocation")]
    public ConfigNodePropertyString LanguageMapLocation { get; set; }

    /// <summary>
    /// Gets or Sets CategoryMapLocation
    /// </summary>
    [DataMember(Name="categoryMapLocation", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "categoryMapLocation")]
    public ConfigNodePropertyString CategoryMapLocation { get; set; }

    /// <summary>
    /// Gets or Sets RetryAttempts
    /// </summary>
    [DataMember(Name="retryAttempts", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "retryAttempts")]
    public ConfigNodePropertyInteger RetryAttempts { get; set; }

    /// <summary>
    /// Gets or Sets TimeoutCount
    /// </summary>
    [DataMember(Name="timeoutCount", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timeoutCount")]
    public ConfigNodePropertyInteger TimeoutCount { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties {\n");
      sb.Append("  TranslationFactory: ").Append(TranslationFactory).Append("\n");
      sb.Append("  DefaultConnectorLabel: ").Append(DefaultConnectorLabel).Append("\n");
      sb.Append("  DefaultConnectorAttribution: ").Append(DefaultConnectorAttribution).Append("\n");
      sb.Append("  DefaultConnectorWorkspaceId: ").Append(DefaultConnectorWorkspaceId).Append("\n");
      sb.Append("  DefaultConnectorSubscriptionKey: ").Append(DefaultConnectorSubscriptionKey).Append("\n");
      sb.Append("  LanguageMapLocation: ").Append(LanguageMapLocation).Append("\n");
      sb.Append("  CategoryMapLocation: ").Append(CategoryMapLocation).Append("\n");
      sb.Append("  RetryAttempts: ").Append(RetryAttempts).Append("\n");
      sb.Append("  TimeoutCount: ").Append(TimeoutCount).Append("\n");
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
