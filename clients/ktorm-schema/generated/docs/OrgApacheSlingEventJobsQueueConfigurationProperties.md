
# Table `orgApacheSlingEventJobsQueueConfigurationProperties`
(mapped from: OrgApacheSlingEventJobsQueueConfigurationProperties)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**queueName** | queuename | long |  | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  |  [optional] [foreignkey]
**queueTopics** | queuetopics | long |  | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  |  [optional] [foreignkey]
**queueType** | queuetype | long |  | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  |  [optional] [foreignkey]
**queuePriority** | queuepriority | long |  | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  |  [optional] [foreignkey]
**queueRetries** | queueretries | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]
**queueRetrydelay** | queueretrydelay | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]
**queueMaxparallel** | queuemaxparallel | long |  | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  |  [optional] [foreignkey]
**queueKeepJobs** | queuekeepJobs | long |  | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  |  [optional] [foreignkey]
**queuePreferRunOnCreationInstance** | queuepreferRunOnCreationInstance | long |  | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  |  [optional] [foreignkey]
**queueThreadPoolSize** | queuethreadPoolSize | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]
**serviceRanking** | serviceranking | long |  | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  |  [optional] [foreignkey]













