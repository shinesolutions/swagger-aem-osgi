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
  public class ComDayCqDamIdsImplIDSJobProcessorProperties {
    /// <summary>
    /// Gets or Sets EnableMultisession
    /// </summary>
    [DataMember(Name="enable.multisession", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.multisession")]
    public ConfigNodePropertyBoolean EnableMultisession { get; set; }

    /// <summary>
    /// Gets or Sets IdsCcEnable
    /// </summary>
    [DataMember(Name="ids.cc.enable", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ids.cc.enable")]
    public ConfigNodePropertyBoolean IdsCcEnable { get; set; }

    /// <summary>
    /// Gets or Sets EnableRetry
    /// </summary>
    [DataMember(Name="enable.retry", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.retry")]
    public ConfigNodePropertyBoolean EnableRetry { get; set; }

    /// <summary>
    /// Gets or Sets EnableRetryScripterror
    /// </summary>
    [DataMember(Name="enable.retry.scripterror", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.retry.scripterror")]
    public ConfigNodePropertyBoolean EnableRetryScripterror { get; set; }

    /// <summary>
    /// Gets or Sets ExternalizerDomainCqhost
    /// </summary>
    [DataMember(Name="externalizer.domain.cqhost", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalizer.domain.cqhost")]
    public ConfigNodePropertyString ExternalizerDomainCqhost { get; set; }

    /// <summary>
    /// Gets or Sets ExternalizerDomainHttp
    /// </summary>
    [DataMember(Name="externalizer.domain.http", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "externalizer.domain.http")]
    public ConfigNodePropertyString ExternalizerDomainHttp { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamIdsImplIDSJobProcessorProperties {\n");
      sb.Append("  EnableMultisession: ").Append(EnableMultisession).Append("\n");
      sb.Append("  IdsCcEnable: ").Append(IdsCcEnable).Append("\n");
      sb.Append("  EnableRetry: ").Append(EnableRetry).Append("\n");
      sb.Append("  EnableRetryScripterror: ").Append(EnableRetryScripterror).Append("\n");
      sb.Append("  ExternalizerDomainCqhost: ").Append(ExternalizerDomainCqhost).Append("\n");
      sb.Append("  ExternalizerDomainHttp: ").Append(ExternalizerDomainHttp).Append("\n");
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
