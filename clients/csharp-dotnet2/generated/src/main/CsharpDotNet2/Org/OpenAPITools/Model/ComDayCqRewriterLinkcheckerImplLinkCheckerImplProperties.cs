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
  public class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {
    /// <summary>
    /// Gets or Sets SchedulerPeriod
    /// </summary>
    [DataMember(Name="scheduler.period", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.period")]
    public ConfigNodePropertyInteger SchedulerPeriod { get; set; }

    /// <summary>
    /// Gets or Sets SchedulerConcurrent
    /// </summary>
    [DataMember(Name="scheduler.concurrent", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "scheduler.concurrent")]
    public ConfigNodePropertyBoolean SchedulerConcurrent { get; set; }

    /// <summary>
    /// Gets or Sets ServiceBadLinkToleranceInterval
    /// </summary>
    [DataMember(Name="service.bad_link_tolerance_interval", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.bad_link_tolerance_interval")]
    public ConfigNodePropertyInteger ServiceBadLinkToleranceInterval { get; set; }

    /// <summary>
    /// Gets or Sets ServiceCheckOverridePatterns
    /// </summary>
    [DataMember(Name="service.check_override_patterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.check_override_patterns")]
    public ConfigNodePropertyArray ServiceCheckOverridePatterns { get; set; }

    /// <summary>
    /// Gets or Sets ServiceCacheBrokenInternalLinks
    /// </summary>
    [DataMember(Name="service.cache_broken_internal_links", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.cache_broken_internal_links")]
    public ConfigNodePropertyBoolean ServiceCacheBrokenInternalLinks { get; set; }

    /// <summary>
    /// Gets or Sets ServiceSpecialLinkPrefix
    /// </summary>
    [DataMember(Name="service.special_link_prefix", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.special_link_prefix")]
    public ConfigNodePropertyArray ServiceSpecialLinkPrefix { get; set; }

    /// <summary>
    /// Gets or Sets ServiceSpecialLinkPatterns
    /// </summary>
    [DataMember(Name="service.special_link_patterns", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "service.special_link_patterns")]
    public ConfigNodePropertyArray ServiceSpecialLinkPatterns { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqRewriterLinkcheckerImplLinkCheckerImplProperties {\n");
      sb.Append("  SchedulerPeriod: ").Append(SchedulerPeriod).Append("\n");
      sb.Append("  SchedulerConcurrent: ").Append(SchedulerConcurrent).Append("\n");
      sb.Append("  ServiceBadLinkToleranceInterval: ").Append(ServiceBadLinkToleranceInterval).Append("\n");
      sb.Append("  ServiceCheckOverridePatterns: ").Append(ServiceCheckOverridePatterns).Append("\n");
      sb.Append("  ServiceCacheBrokenInternalLinks: ").Append(ServiceCacheBrokenInternalLinks).Append("\n");
      sb.Append("  ServiceSpecialLinkPrefix: ").Append(ServiceSpecialLinkPrefix).Append("\n");
      sb.Append("  ServiceSpecialLinkPatterns: ").Append(ServiceSpecialLinkPatterns).Append("\n");
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
