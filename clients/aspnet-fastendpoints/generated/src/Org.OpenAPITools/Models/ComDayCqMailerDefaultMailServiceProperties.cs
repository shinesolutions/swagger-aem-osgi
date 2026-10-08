namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCqMailerDefaultMailServiceProperties 
{
    public ConfigNodePropertyString SmtpHost { get; set; }
    public ConfigNodePropertyInteger SmtpPort { get; set; }
    public ConfigNodePropertyString SmtpUser { get; set; }
    public ConfigNodePropertyString SmtpPassword { get; set; }
    public ConfigNodePropertyString FromAddress { get; set; }
    public ConfigNodePropertyBoolean SmtpSsl { get; set; }
    public ConfigNodePropertyBoolean SmtpStarttls { get; set; }
    public ConfigNodePropertyBoolean DebugEmail { get; set; }
}


