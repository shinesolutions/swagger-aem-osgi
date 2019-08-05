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
  public class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {
    /// <summary>
    /// Gets or Sets LocaleDefault
    /// </summary>
    [DataMember(Name="locale.default", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "locale.default")]
    public ConfigNodePropertyString LocaleDefault { get; set; }

    /// <summary>
    /// Gets or Sets PreloadBundles
    /// </summary>
    [DataMember(Name="preload.bundles", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "preload.bundles")]
    public ConfigNodePropertyBoolean PreloadBundles { get; set; }

    /// <summary>
    /// Gets or Sets InvalidationDelay
    /// </summary>
    [DataMember(Name="invalidation.delay", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "invalidation.delay")]
    public ConfigNodePropertyInteger InvalidationDelay { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingI18nImplJcrResourceBundleProviderProperties {\n");
      sb.Append("  LocaleDefault: ").Append(LocaleDefault).Append("\n");
      sb.Append("  PreloadBundles: ").Append(PreloadBundles).Append("\n");
      sb.Append("  InvalidationDelay: ").Append(InvalidationDelay).Append("\n");
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
