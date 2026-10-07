namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class OrgApacheSlingEventJobsQueueConfigurationProperties 
{
    public ConfigNodePropertyString QueueName { get; set; }
    public ConfigNodePropertyArray QueueTopics { get; set; }
    public ConfigNodePropertyDropDown QueueType { get; set; }
    public ConfigNodePropertyDropDown QueuePriority { get; set; }
    public ConfigNodePropertyInteger QueueRetries { get; set; }
    public ConfigNodePropertyInteger QueueRetrydelay { get; set; }
    public ConfigNodePropertyFloat QueueMaxparallel { get; set; }
    public ConfigNodePropertyBoolean QueueKeepJobs { get; set; }
    public ConfigNodePropertyBoolean QueuePreferRunOnCreationInstance { get; set; }
    public ConfigNodePropertyInteger QueueThreadPoolSize { get; set; }
    public ConfigNodePropertyInteger ServiceRanking { get; set; }
}


