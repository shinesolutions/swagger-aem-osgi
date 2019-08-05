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
  public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {
    /// <summary>
    /// Gets or Sets CqDamExpiryNotificationSchedulerIstimebased
    /// </summary>
    [DataMember(Name="cq.dam.expiry.notification.scheduler.istimebased", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.expiry.notification.scheduler.istimebased")]
    public ConfigNodePropertyBoolean CqDamExpiryNotificationSchedulerIstimebased { get; set; }

    /// <summary>
    /// Gets or Sets CqDamExpiryNotificationSchedulerTimebasedRule
    /// </summary>
    [DataMember(Name="cq.dam.expiry.notification.scheduler.timebased.rule", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.expiry.notification.scheduler.timebased.rule")]
    public ConfigNodePropertyString CqDamExpiryNotificationSchedulerTimebasedRule { get; set; }

    /// <summary>
    /// Gets or Sets CqDamExpiryNotificationSchedulerPeriodRule
    /// </summary>
    [DataMember(Name="cq.dam.expiry.notification.scheduler.period.rule", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.expiry.notification.scheduler.period.rule")]
    public ConfigNodePropertyInteger CqDamExpiryNotificationSchedulerPeriodRule { get; set; }

    /// <summary>
    /// Gets or Sets SendEmail
    /// </summary>
    [DataMember(Name="send_email", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "send_email")]
    public ConfigNodePropertyBoolean SendEmail { get; set; }

    /// <summary>
    /// Gets or Sets AssetExpiredLimit
    /// </summary>
    [DataMember(Name="asset_expired_limit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "asset_expired_limit")]
    public ConfigNodePropertyInteger AssetExpiredLimit { get; set; }

    /// <summary>
    /// Gets or Sets PriorNotificationSeconds
    /// </summary>
    [DataMember(Name="prior_notification_seconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "prior_notification_seconds")]
    public ConfigNodePropertyInteger PriorNotificationSeconds { get; set; }

    /// <summary>
    /// Gets or Sets CqDamExpiryNotificationUrlProtocol
    /// </summary>
    [DataMember(Name="cq.dam.expiry.notification.url.protocol", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.dam.expiry.notification.url.protocol")]
    public ConfigNodePropertyString CqDamExpiryNotificationUrlProtocol { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamCoreImplExpiryNotificationJobImplProperties {\n");
      sb.Append("  CqDamExpiryNotificationSchedulerIstimebased: ").Append(CqDamExpiryNotificationSchedulerIstimebased).Append("\n");
      sb.Append("  CqDamExpiryNotificationSchedulerTimebasedRule: ").Append(CqDamExpiryNotificationSchedulerTimebasedRule).Append("\n");
      sb.Append("  CqDamExpiryNotificationSchedulerPeriodRule: ").Append(CqDamExpiryNotificationSchedulerPeriodRule).Append("\n");
      sb.Append("  SendEmail: ").Append(SendEmail).Append("\n");
      sb.Append("  AssetExpiredLimit: ").Append(AssetExpiredLimit).Append("\n");
      sb.Append("  PriorNotificationSeconds: ").Append(PriorNotificationSeconds).Append("\n");
      sb.Append("  CqDamExpiryNotificationUrlProtocol: ").Append(CqDamExpiryNotificationUrlProtocol).Append("\n");
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
