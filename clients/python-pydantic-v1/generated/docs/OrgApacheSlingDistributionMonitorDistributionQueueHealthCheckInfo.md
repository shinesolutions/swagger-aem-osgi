# OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties**](OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_distribution_monitor_distribution_queue_health_check_info import OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo from a JSON string
org_apache_sling_distribution_monitor_distribution_queue_health_check_info_instance = OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.to_json()

# convert the object into a dict
org_apache_sling_distribution_monitor_distribution_queue_health_check_info_dict = org_apache_sling_distribution_monitor_distribution_queue_health_check_info_instance.to_dict()
# create an instance of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo from a dict
org_apache_sling_distribution_monitor_distribution_queue_health_check_info_from_dict = OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckInfo.from_dict(org_apache_sling_distribution_monitor_distribution_queue_health_check_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


