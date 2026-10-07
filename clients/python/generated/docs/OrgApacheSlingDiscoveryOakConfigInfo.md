# OrgApacheSlingDiscoveryOakConfigInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingDiscoveryOakConfigProperties**](OrgApacheSlingDiscoveryOakConfigProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_discovery_oak_config_info import OrgApacheSlingDiscoveryOakConfigInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDiscoveryOakConfigInfo from a JSON string
org_apache_sling_discovery_oak_config_info_instance = OrgApacheSlingDiscoveryOakConfigInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingDiscoveryOakConfigInfo.to_json())

# convert the object into a dict
org_apache_sling_discovery_oak_config_info_dict = org_apache_sling_discovery_oak_config_info_instance.to_dict()
# create an instance of OrgApacheSlingDiscoveryOakConfigInfo from a dict
org_apache_sling_discovery_oak_config_info_from_dict = OrgApacheSlingDiscoveryOakConfigInfo.from_dict(org_apache_sling_discovery_oak_config_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


