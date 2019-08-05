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
  public class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {
    /// <summary>
    /// Gets or Sets CqDamMissingmetadataNotificationSchedulerIstimebased
    /// </summary>
    [DataMember(Name="cq.dam.missingmetadata.notification.scheduler.istimebased", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.scheduler.istimebased")]
    public ConfigNodePropertyBoolean CqDamMissingmetadataNotificationSchedulerIstimebased { get; set; }

    /// <summary>
    /// Gets or Sets CqDamMissingmetadataNotificationSchedulerTimebasedRule
    /// </summary>
    [DataMember(Name="cq.dam.missingmetadata.notification.scheduler.timebased.rule", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.scheduler.timebased.rule")]
    public ConfigNodePropertyString CqDamMissingmetadataNotificationSchedulerTimebasedRule { get; set; }

    /// <summary>
    /// Gets or Sets CqDamMissingmetadataNotificationSchedulerPeriodRule
    /// </summary>
    [DataMember(Name="cq.dam.missingmetadata.notification.scheduler.period.rule", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.scheduler.period.rule")]
    public ConfigNodePropertyInteger CqDamMissingmetadataNotificationSchedulerPeriodRule { get; set; }

    /// <summary>
    /// Gets or Sets CqDamMissingmetadataNotificationRecipient
    /// </summary>
    [DataMember(Name="cq.dam.missingmetadata.notification.recipient", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.missingmetadata.notification.recipient")]
    public ConfigNodePropertyString CqDamMissingmetadataNotificationRecipient { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplMissingMetadataNotificationJobProperties {\n");
      sb.Append("  CqDamMissingmetadataNotificationSchedulerIstimebased: ").Append(CqDamMissingmetadataNotificationSchedulerIstimebased).Append("\n");
      sb.Append("  CqDamMissingmetadataNotificationSchedulerTimebasedRule: ").Append(CqDamMissingmetadataNotificationSchedulerTimebasedRule).Append("\n");
      sb.Append("  CqDamMissingmetadataNotificationSchedulerPeriodRule: ").Append(CqDamMissingmetadataNotificationSchedulerPeriodRule).Append("\n");
      sb.Append("  CqDamMissingmetadataNotificationRecipient: ").Append(CqDamMissingmetadataNotificationRecipient).Append("\n");
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
