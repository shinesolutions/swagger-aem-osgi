# OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties**](OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_commons_log_log_manager_factory_config_info import OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo from a JSON string
org_apache_sling_commons_log_log_manager_factory_config_info_instance = OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.to_json())

# convert the object into a dict
org_apache_sling_commons_log_log_manager_factory_config_info_dict = org_apache_sling_commons_log_log_manager_factory_config_info_instance.to_dict()
# create an instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo from a dict
org_apache_sling_commons_log_log_manager_factory_config_info_from_dict = OrgApacheSlingCommonsLogLogManagerFactoryConfigInfo.from_dict(org_apache_sling_commons_log_log_manager_factory_config_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


