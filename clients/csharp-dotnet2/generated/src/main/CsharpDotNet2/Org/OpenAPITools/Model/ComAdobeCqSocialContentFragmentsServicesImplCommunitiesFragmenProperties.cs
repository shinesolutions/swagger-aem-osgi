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
  public class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {
    /// <summary>
    /// Gets or Sets CqSocialContentFragmentsServicesEnabled
    /// </summary>
    [DataMember(Name="cq.social.content.fragments.services.enabled", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.social.content.fragments.services.enabled")]
    public ConfigNodePropertyBoolean CqSocialContentFragmentsServicesEnabled { get; set; }

    /// <summary>
    /// Gets or Sets CqSocialContentFragmentsServicesWaitTimeSeconds
    /// </summary>
    [DataMember(Name="cq.social.content.fragments.services.waitTimeSeconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cq.social.content.fragments.services.waitTimeSeconds")]
    public ConfigNodePropertyInteger CqSocialContentFragmentsServicesWaitTimeSeconds { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {\n");
      sb.Append("  CqSocialContentFragmentsServicesEnabled: ").Append(CqSocialContentFragmentsServicesEnabled).Append("\n");
      sb.Append("  CqSocialContentFragmentsServicesWaitTimeSeconds: ").Append(CqSocialContentFragmentsServicesWaitTimeSeconds).Append("\n");
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
