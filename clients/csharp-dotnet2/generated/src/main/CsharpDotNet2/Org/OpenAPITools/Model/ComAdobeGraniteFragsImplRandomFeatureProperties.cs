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
  public class ComAdobeGraniteFragsImplRandomFeatureProperties {
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
    /// Gets or Sets ActivePercentage
    /// </summary>
    [DataMember(Name="active.percentage", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "active.percentage")]
    public ConfigNodePropertyString ActivePercentage { get; set; }

    /// <summary>
    /// Gets or Sets CookieName
    /// </summary>
    [DataMember(Name="cookie.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cookie.name")]
    public ConfigNodePropertyString CookieName { get; set; }

    /// <summary>
    /// Gets or Sets CookieMaxAge
    /// </summary>
    [DataMember(Name="cookie.maxAge", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "cookie.maxAge")]
    public ConfigNodePropertyInteger CookieMaxAge { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteFragsImplRandomFeatureProperties {\n");
      sb.Append("  FeatureName: ").Append(FeatureName).Append("\n");
      sb.Append("  FeatureDescription: ").Append(FeatureDescription).Append("\n");
      sb.Append("  ActivePercentage: ").Append(ActivePercentage).Append("\n");
      sb.Append("  CookieName: ").Append(CookieName).Append("\n");
      sb.Append("  CookieMaxAge: ").Append(CookieMaxAge).Append("\n");
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
