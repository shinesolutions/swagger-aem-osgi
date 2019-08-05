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
  public class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {
    /// <summary>
    /// Gets or Sets EnableScheduledPostsSearch
    /// </summary>
    [DataMember(Name="enableScheduledPostsSearch", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enableScheduledPostsSearch")]
    public ConfigNodePropertyBoolean EnableScheduledPostsSearch { get; set; }

    /// <summary>
    /// Gets or Sets NumberOfMinutes
    /// </summary>
    [DataMember(Name="numberOfMinutes", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "numberOfMinutes")]
    public ConfigNodePropertyInteger NumberOfMinutes { get; set; }

    /// <summary>
    /// Gets or Sets MaxSearchLimit
    /// </summary>
    [DataMember(Name="maxSearchLimit", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "maxSearchLimit")]
    public ConfigNodePropertyInteger MaxSearchLimit { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsCommentsSchedulerImplSearchScheduledPosProperties {\n");
      sb.Append("  EnableScheduledPostsSearch: ").Append(EnableScheduledPostsSearch).Append("\n");
      sb.Append("  NumberOfMinutes: ").Append(NumberOfMinutes).Append("\n");
      sb.Append("  MaxSearchLimit: ").Append(MaxSearchLimit).Append("\n");
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
