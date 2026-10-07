namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComAdobeCqSocialMessagingClientEndpointsImplMessagingOperationProperties 
{
    public ConfigNodePropertyArray MessageProperties { get; set; }
    public ConfigNodePropertyInteger MessageBoxSizeLimit { get; set; }
    public ConfigNodePropertyInteger MessageCountLimit { get; set; }
    public ConfigNodePropertyBoolean NotifyFailure { get; set; }
    public ConfigNodePropertyString FailureMessageFrom { get; set; }
    public ConfigNodePropertyString FailureTemplatePath { get; set; }
    public ConfigNodePropertyInteger MaxRetries { get; set; }
    public ConfigNodePropertyInteger MinWaitBetweenRetries { get; set; }
    public ConfigNodePropertyInteger CountUpdatePoolSize { get; set; }
    public ConfigNodePropertyString InboxPath { get; set; }
    public ConfigNodePropertyString SentitemsPath { get; set; }
    public ConfigNodePropertyBoolean SupportAttachments { get; set; }
    public ConfigNodePropertyBoolean SupportGroupMessaging { get; set; }
    public ConfigNodePropertyInteger MaxTotalRecipients { get; set; }
    public ConfigNodePropertyInteger BatchSize { get; set; }
    public ConfigNodePropertyInteger MaxTotalAttachmentSize { get; set; }
    public ConfigNodePropertyArray AttachmentTypeBlacklist { get; set; }
    public ConfigNodePropertyArray AllowedAttachmentTypes { get; set; }
    public ConfigNodePropertyString ServiceSelector { get; set; }
    public ConfigNodePropertyArray FieldWhitelist { get; set; }
}


