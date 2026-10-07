# OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**hc_mbean_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**number_of_retries_allowed** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_distribution_monitor_distribution_queue_health_check_properties import OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties from a JSON string
org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_instance = OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.to_json())

# convert the object into a dict
org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_dict = org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_instance.to_dict()
# create an instance of OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties from a dict
org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_from_dict = OrgApacheSlingDistributionMonitorDistributionQueueHealthCheckProperties.from_dict(org_apache_sling_distribution_monitor_distribution_queue_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


