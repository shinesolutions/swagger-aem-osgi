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
  public class ComDayCqDamInddImplServletSnippetCreationServletProperties {
    /// <summary>
    /// Gets or Sets SnippetcreationMaxcollections
    /// </summary>
    [DataMember(Name="snippetcreation.maxcollections", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "snippetcreation.maxcollections")]
    public ConfigNodePropertyInteger SnippetcreationMaxcollections { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqDamInddImplServletSnippetCreationServletProperties {\n");
      sb.Append("  SnippetcreationMaxcollections: ").Append(SnippetcreationMaxcollections).Append("\n");
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
