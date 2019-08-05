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
  public class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {
    /// <summary>
    /// Gets or Sets EmailName
    /// </summary>
    [DataMember(Name="email.name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.name")]
    public ConfigNodePropertyString EmailName { get; set; }

    /// <summary>
    /// Gets or Sets EmailCreatePostFromReply
    /// </summary>
    [DataMember(Name="email.createPostFromReply", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.createPostFromReply")]
    public ConfigNodePropertyBoolean EmailCreatePostFromReply { get; set; }

    /// <summary>
    /// Gets or Sets EmailAddCommentIdTo
    /// </summary>
    [DataMember(Name="email.addCommentIdTo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.addCommentIdTo")]
    public ConfigNodePropertyDropDown EmailAddCommentIdTo { get; set; }

    /// <summary>
    /// Gets or Sets EmailSubjectMaximumLength
    /// </summary>
    [DataMember(Name="email.subjectMaximumLength", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.subjectMaximumLength")]
    public ConfigNodePropertyInteger EmailSubjectMaximumLength { get; set; }

    /// <summary>
    /// Gets or Sets EmailReplyToAddress
    /// </summary>
    [DataMember(Name="email.replyToAddress", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.replyToAddress")]
    public ConfigNodePropertyString EmailReplyToAddress { get; set; }

    /// <summary>
    /// Gets or Sets EmailReplyToDelimiter
    /// </summary>
    [DataMember(Name="email.replyToDelimiter", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.replyToDelimiter")]
    public ConfigNodePropertyString EmailReplyToDelimiter { get; set; }

    /// <summary>
    /// Gets or Sets EmailTrackerIdPrefixInSubject
    /// </summary>
    [DataMember(Name="email.trackerIdPrefixInSubject", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.trackerIdPrefixInSubject")]
    public ConfigNodePropertyString EmailTrackerIdPrefixInSubject { get; set; }

    /// <summary>
    /// Gets or Sets EmailTrackerIdPrefixInBody
    /// </summary>
    [DataMember(Name="email.trackerIdPrefixInBody", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.trackerIdPrefixInBody")]
    public ConfigNodePropertyString EmailTrackerIdPrefixInBody { get; set; }

    /// <summary>
    /// Gets or Sets EmailAsHTML
    /// </summary>
    [DataMember(Name="email.asHTML", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.asHTML")]
    public ConfigNodePropertyBoolean EmailAsHTML { get; set; }

    /// <summary>
    /// Gets or Sets EmailDefaultUserName
    /// </summary>
    [DataMember(Name="email.defaultUserName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.defaultUserName")]
    public ConfigNodePropertyString EmailDefaultUserName { get; set; }

    /// <summary>
    /// Gets or Sets EmailTemplatesRootPath
    /// </summary>
    [DataMember(Name="email.templates.rootPath", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "email.templates.rootPath")]
    public ConfigNodePropertyString EmailTemplatesRootPath { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class ComAdobeCqSocialCommonsEmailreplyImplEmailReplyConfigurationImpProperties {\n");
      sb.Append("  EmailName: ").Append(EmailName).Append("\n");
      sb.Append("  EmailCreatePostFromReply: ").Append(EmailCreatePostFromReply).Append("\n");
      sb.Append("  EmailAddCommentIdTo: ").Append(EmailAddCommentIdTo).Append("\n");
      sb.Append("  EmailSubjectMaximumLength: ").Append(EmailSubjectMaximumLength).Append("\n");
      sb.Append("  EmailReplyToAddress: ").Append(EmailReplyToAddress).Append("\n");
      sb.Append("  EmailReplyToDelimiter: ").Append(EmailReplyToDelimiter).Append("\n");
      sb.Append("  EmailTrackerIdPrefixInSubject: ").Append(EmailTrackerIdPrefixInSubject).Append("\n");
      sb.Append("  EmailTrackerIdPrefixInBody: ").Append(EmailTrackerIdPrefixInBody).Append("\n");
      sb.Append("  EmailAsHTML: ").Append(EmailAsHTML).Append("\n");
      sb.Append("  EmailDefaultUserName: ").Append(EmailDefaultUserName).Append("\n");
      sb.Append("  EmailTemplatesRootPath: ").Append(EmailTemplatesRootPath).Append("\n");
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
