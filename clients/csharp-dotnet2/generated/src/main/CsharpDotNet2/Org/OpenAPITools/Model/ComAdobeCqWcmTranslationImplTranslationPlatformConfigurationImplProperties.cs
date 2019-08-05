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
  public class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {
    /// <summary>
    /// Gets or Sets SyncTranslationStateSchedulingFormat
    /// </summary>
    [DataMember(Name="syncTranslationState.schedulingFormat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "syncTranslationState.schedulingFormat")]
    public ConfigNodePropertyString SyncTranslationStateSchedulingFormat { get; set; }

    /// <summary>
    /// Gets or Sets SchedulingRepeatTranslationSchedulingFormat
    /// </summary>
    [DataMember(Name="schedulingRepeatTranslation.schedulingFormat", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "schedulingRepeatTranslation.schedulingFormat")]
    public ConfigNodePropertyString SchedulingRepeatTranslationSchedulingFormat { get; set; }

    /// <summary>
    /// Gets or Sets SyncTranslationStateLockTimeoutInMinutes
    /// </summary>
    [DataMember(Name="syncTranslationState.lockTimeoutInMinutes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "syncTranslationState.lockTimeoutInMinutes")]
    public ConfigNodePropertyString SyncTranslationStateLockTimeoutInMinutes { get; set; }

    /// <summary>
    /// Gets or Sets ExportFormat
    /// </summary>
    [DataMember(Name="export.format", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "export.format")]
    public ConfigNodePropertyDropDown ExportFormat { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqWcmTranslationImplTranslationPlatformConfigurationImplProperties {\n");
      sb.Append("  SyncTranslationStateSchedulingFormat: ").Append(SyncTranslationStateSchedulingFormat).Append("\n");
      sb.Append("  SchedulingRepeatTranslationSchedulingFormat: ").Append(SchedulingRepeatTranslationSchedulingFormat).Append("\n");
      sb.Append("  SyncTranslationStateLockTimeoutInMinutes: ").Append(SyncTranslationStateLockTimeoutInMinutes).Append("\n");
      sb.Append("  ExportFormat: ").Append(ExportFormat).Append("\n");
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
