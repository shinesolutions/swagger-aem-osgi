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
  public class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {
    /// <summary>
    /// Gets or Sets TranslateLanguage
    /// </summary>
    [DataMember(Name="translate.language", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.language")]
    public ConfigNodePropertyDropDown TranslateLanguage { get; set; }

    /// <summary>
    /// Gets or Sets TranslateDisplay
    /// </summary>
    [DataMember(Name="translate.display", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.display")]
    public ConfigNodePropertyDropDown TranslateDisplay { get; set; }

    /// <summary>
    /// Gets or Sets TranslateAttribution
    /// </summary>
    [DataMember(Name="translate.attribution", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.attribution")]
    public ConfigNodePropertyBoolean TranslateAttribution { get; set; }

    /// <summary>
    /// Gets or Sets TranslateCaching
    /// </summary>
    [DataMember(Name="translate.caching", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.caching")]
    public ConfigNodePropertyDropDown TranslateCaching { get; set; }

    /// <summary>
    /// Gets or Sets TranslateSmartRendering
    /// </summary>
    [DataMember(Name="translate.smart.rendering", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.smart.rendering")]
    public ConfigNodePropertyDropDown TranslateSmartRendering { get; set; }

    /// <summary>
    /// Gets or Sets TranslateCachingDuration
    /// </summary>
    [DataMember(Name="translate.caching.duration", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.caching.duration")]
    public ConfigNodePropertyString TranslateCachingDuration { get; set; }

    /// <summary>
    /// Gets or Sets TranslateSessionSaveInterval
    /// </summary>
    [DataMember(Name="translate.session.save.interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.session.save.interval")]
    public ConfigNodePropertyString TranslateSessionSaveInterval { get; set; }

    /// <summary>
    /// Gets or Sets TranslateSessionSaveBatchLimit
    /// </summary>
    [DataMember(Name="translate.session.save.batchLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "translate.session.save.batchLimit")]
    public ConfigNodePropertyString TranslateSessionSaveBatchLimit { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties {\n");
      sb.Append("  TranslateLanguage: ").Append(TranslateLanguage).Append("\n");
      sb.Append("  TranslateDisplay: ").Append(TranslateDisplay).Append("\n");
      sb.Append("  TranslateAttribution: ").Append(TranslateAttribution).Append("\n");
      sb.Append("  TranslateCaching: ").Append(TranslateCaching).Append("\n");
      sb.Append("  TranslateSmartRendering: ").Append(TranslateSmartRendering).Append("\n");
      sb.Append("  TranslateCachingDuration: ").Append(TranslateCachingDuration).Append("\n");
      sb.Append("  TranslateSessionSaveInterval: ").Append(TranslateSessionSaveInterval).Append("\n");
      sb.Append("  TranslateSessionSaveBatchLimit: ").Append(TranslateSessionSaveBatchLimit).Append("\n");
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
