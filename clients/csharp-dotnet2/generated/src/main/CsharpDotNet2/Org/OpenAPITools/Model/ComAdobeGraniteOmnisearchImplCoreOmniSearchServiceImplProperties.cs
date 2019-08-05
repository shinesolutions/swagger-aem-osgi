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
  public class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {
    /// <summary>
    /// Gets or Sets OmnisearchSuggestionRequiretextMin
    /// </summary>
    [DataMember(Name="omnisearch.suggestion.requiretext.min", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "omnisearch.suggestion.requiretext.min")]
    public ConfigNodePropertyInteger OmnisearchSuggestionRequiretextMin { get; set; }

    /// <summary>
    /// Gets or Sets OmnisearchSuggestionSpellcheckRequire
    /// </summary>
    [DataMember(Name="omnisearch.suggestion.spellcheck.require", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "omnisearch.suggestion.spellcheck.require")]
    public ConfigNodePropertyBoolean OmnisearchSuggestionSpellcheckRequire { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeGraniteOmnisearchImplCoreOmniSearchServiceImplProperties {\n");
      sb.Append("  OmnisearchSuggestionRequiretextMin: ").Append(OmnisearchSuggestionRequiretextMin).Append("\n");
      sb.Append("  OmnisearchSuggestionSpellcheckRequire: ").Append(OmnisearchSuggestionSpellcheckRequire).Append("\n");
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
