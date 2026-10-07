# OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**hc_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**hc_tags** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**hc_mbean_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties import OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties from a JSON string
org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties_instance = OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.to_json()

# convert the object into a dict
org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties_dict = org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties_instance.to_dict()
# create an instance of OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties from a dict
org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties_from_dict = OrgApacheSlingDiscoveryOakSynchronizedClocksHealthCheckProperties.from_dict(org_apache_sling_discovery_oak_synchronized_clocks_health_check_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


