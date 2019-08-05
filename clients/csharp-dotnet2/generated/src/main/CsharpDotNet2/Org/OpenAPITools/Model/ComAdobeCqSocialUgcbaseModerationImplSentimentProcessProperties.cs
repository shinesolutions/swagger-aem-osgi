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
  public class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {
    /// <summary>
    /// Gets or Sets WatchwordsPositive
    /// </summary>
    [DataMember(Name="watchwords.positive", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "watchwords.positive")]
    public ConfigNodePropertyArray WatchwordsPositive { get; set; }

    /// <summary>
    /// Gets or Sets WatchwordsNegative
    /// </summary>
    [DataMember(Name="watchwords.negative", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "watchwords.negative")]
    public ConfigNodePropertyArray WatchwordsNegative { get; set; }

    /// <summary>
    /// Gets or Sets WatchwordsPath
    /// </summary>
    [DataMember(Name="watchwords.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "watchwords.path")]
    public ConfigNodePropertyString WatchwordsPath { get; set; }

    /// <summary>
    /// Gets or Sets SentimentPath
    /// </summary>
    [DataMember(Name="sentiment.path", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "sentiment.path")]
    public ConfigNodePropertyString SentimentPath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialUgcbaseModerationImplSentimentProcessProperties {\n");
      sb.Append("  WatchwordsPositive: ").Append(WatchwordsPositive).Append("\n");
      sb.Append("  WatchwordsNegative: ").Append(WatchwordsNegative).Append("\n");
      sb.Append("  WatchwordsPath: ").Append(WatchwordsPath).Append("\n");
      sb.Append("  SentimentPath: ").Append(SentimentPath).Append("\n");
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
