namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ComDayCqDamCoreImplExpiryNotificationJobImplProperties 
{
    public ConfigNodePropertyBoolean CqDamExpiryNotificationSchedulerIstimebased { get; set; }
    public ConfigNodePropertyString CqDamExpiryNotificationSchedulerTimebasedRule { get; set; }
    public ConfigNodePropertyInteger CqDamExpiryNotificationSchedulerPeriodRule { get; set; }
    public ConfigNodePropertyBoolean SendEmail { get; set; }
    public ConfigNodePropertyInteger AssetExpiredLimit { get; set; }
    public ConfigNodePropertyInteger PriorNotificationSeconds { get; set; }
    public ConfigNodePropertyString CqDamExpiryNotificationUrlProtocol { get; set; }
}


