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
  public class ComAdobeCqSocialScoringImplScoringEventListenerProperties {
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
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialScoringImplScoringEventListenerProperties {\n");
      sb.Append("  EventTopics: ").Append(EventTopics).Append("\n");
      sb.Append("  EventFilter: ").Append(EventFilter).Append("\n");
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
