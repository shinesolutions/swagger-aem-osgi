# OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_sling_commons_log_level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**org_apache_sling_commons_log_file** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org_apache_sling_commons_log_pattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org_apache_sling_commons_log_names** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org_apache_sling_commons_log_additiv** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_commons_log_log_manager_factory_config_properties import OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties from a JSON string
org_apache_sling_commons_log_log_manager_factory_config_properties_instance = OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.to_json()

# convert the object into a dict
org_apache_sling_commons_log_log_manager_factory_config_properties_dict = org_apache_sling_commons_log_log_manager_factory_config_properties_instance.to_dict()
# create an instance of OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties from a dict
org_apache_sling_commons_log_log_manager_factory_config_properties_from_dict = OrgApacheSlingCommonsLogLogManagerFactoryConfigProperties.from_dict(org_apache_sling_commons_log_log_manager_factory_config_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


