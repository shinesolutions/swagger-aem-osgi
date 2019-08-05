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
  public class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {
    /// <summary>
    /// Gets or Sets MailerEmailEmbed
    /// </summary>
    [DataMember(Name="mailer.email.embed", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mailer.email.embed")]
    public ConfigNodePropertyBoolean MailerEmailEmbed { get; set; }

    /// <summary>
    /// Gets or Sets MailerEmailCharset
    /// </summary>
    [DataMember(Name="mailer.email.charset", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mailer.email.charset")]
    public ConfigNodePropertyString MailerEmailCharset { get; set; }

    /// <summary>
    /// Gets or Sets MailerEmailRetrieverUserID
    /// </summary>
    [DataMember(Name="mailer.email.retrieverUserID", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mailer.email.retrieverUserID")]
    public ConfigNodePropertyString MailerEmailRetrieverUserID { get; set; }

    /// <summary>
    /// Gets or Sets MailerEmailRetrieverUserPWD
    /// </summary>
    [DataMember(Name="mailer.email.retrieverUserPWD", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "mailer.email.retrieverUserPWD")]
    public ConfigNodePropertyString MailerEmailRetrieverUserPWD { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComDayCqMailerImplEmailCqRetrieverTemplateFactoryProperties {\n");
      sb.Append("  MailerEmailEmbed: ").Append(MailerEmailEmbed).Append("\n");
      sb.Append("  MailerEmailCharset: ").Append(MailerEmailCharset).Append("\n");
      sb.Append("  MailerEmailRetrieverUserID: ").Append(MailerEmailRetrieverUserID).Append("\n");
      sb.Append("  MailerEmailRetrieverUserPWD: ").Append(MailerEmailRetrieverUserPWD).Append("\n");
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
