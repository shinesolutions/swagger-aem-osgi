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
  public class OrgApacheSlingServletsGetDefaultGetServletProperties {
    /// <summary>
    /// Gets or Sets Aliases
    /// </summary>
    [DataMember(Name="aliases", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "aliases")]
    public ConfigNodePropertyArray Aliases { get; set; }

    /// <summary>
    /// Gets or Sets Index
    /// </summary>
    [DataMember(Name="index", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "index")]
    public ConfigNodePropertyBoolean Index { get; set; }

    /// <summary>
    /// Gets or Sets IndexFiles
    /// </summary>
    [DataMember(Name="index.files", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "index.files")]
    public ConfigNodePropertyArray IndexFiles { get; set; }

    /// <summary>
    /// Gets or Sets EnableHtml
    /// </summary>
    [DataMember(Name="enable.html", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.html")]
    public ConfigNodePropertyBoolean EnableHtml { get; set; }

    /// <summary>
    /// Gets or Sets EnableJson
    /// </summary>
    [DataMember(Name="enable.json", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.json")]
    public ConfigNodePropertyBoolean EnableJson { get; set; }

    /// <summary>
    /// Gets or Sets EnableTxt
    /// </summary>
    [DataMember(Name="enable.txt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.txt")]
    public ConfigNodePropertyBoolean EnableTxt { get; set; }

    /// <summary>
    /// Gets or Sets EnableXml
    /// </summary>
    [DataMember(Name="enable.xml", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "enable.xml")]
    public ConfigNodePropertyBoolean EnableXml { get; set; }

    /// <summary>
    /// Gets or Sets JsonMaximumresults
    /// </summary>
    [DataMember(Name="json.maximumresults", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "json.maximumresults")]
    public ConfigNodePropertyInteger JsonMaximumresults { get; set; }

    /// <summary>
    /// Gets or Sets EcmaSuport
    /// </summary>
    [DataMember(Name="ecmaSuport", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "ecmaSuport")]
    public ConfigNodePropertyBoolean EcmaSuport { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrgApacheSlingServletsGetDefaultGetServletProperties {\n");
      sb.Append("  Aliases: ").Append(Aliases).Append("\n");
      sb.Append("  Index: ").Append(Index).Append("\n");
      sb.Append("  IndexFiles: ").Append(IndexFiles).Append("\n");
      sb.Append("  EnableHtml: ").Append(EnableHtml).Append("\n");
      sb.Append("  EnableJson: ").Append(EnableJson).Append("\n");
      sb.Append("  EnableTxt: ").Append(EnableTxt).Append("\n");
      sb.Append("  EnableXml: ").Append(EnableXml).Append("\n");
      sb.Append("  JsonMaximumresults: ").Append(JsonMaximumresults).Append("\n");
      sb.Append("  EcmaSuport: ").Append(EcmaSuport).Append("\n");
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
