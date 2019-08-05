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
  public class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {
    /// <summary>
    /// Gets or Sets FeatureName
    /// </summary>
    [DataMember(Name="feature.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feature.name")]
    public ConfigNodePropertyString FeatureName { get; set; }

    /// <summary>
    /// Gets or Sets FeatureDescription
    /// </summary>
    [DataMember(Name="feature.description", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "feature.description")]
    public ConfigNodePropertyString FeatureDescription { get; set; }

    /// <summary>
    /// Gets or Sets HttpHeaderName
    /// </summary>
    [DataMember(Name="http.header.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http.header.name")]
    public ConfigNodePropertyString HttpHeaderName { get; set; }

    /// <summary>
    /// Gets or Sets HttpHeaderValuepattern
    /// </summary>
    [DataMember(Name="http.header.valuepattern", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "http.header.valuepattern")]
    public ConfigNodePropertyString HttpHeaderValuepattern { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteFragsImplCheckHttpHeaderFlagProperties {\n");
      sb.Append("  FeatureName: ").Append(FeatureName).Append("\n");
      sb.Append("  FeatureDescription: ").Append(FeatureDescription).Append("\n");
      sb.Append("  HttpHeaderName: ").Append(HttpHeaderName).Append("\n");
      sb.Append("  HttpHeaderValuepattern: ").Append(HttpHeaderValuepattern).Append("\n");
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
