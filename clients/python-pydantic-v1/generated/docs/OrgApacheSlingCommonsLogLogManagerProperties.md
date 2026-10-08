# OrgApacheSlingCommonsLogLogManagerProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_sling_commons_log_level** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**org_apache_sling_commons_log_file** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org_apache_sling_commons_log_file_number** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org_apache_sling_commons_log_file_size** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org_apache_sling_commons_log_pattern** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org_apache_sling_commons_log_configuration_file** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org_apache_sling_commons_log_packaging_data_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org_apache_sling_commons_log_max_caller_data_depth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org_apache_sling_commons_log_max_old_file_count_in_dump** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org_apache_sling_commons_log_num_of_lines** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_commons_log_log_manager_properties import OrgApacheSlingCommonsLogLogManagerProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingCommonsLogLogManagerProperties from a JSON string
org_apache_sling_commons_log_log_manager_properties_instance = OrgApacheSlingCommonsLogLogManagerProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingCommonsLogLogManagerProperties.to_json()

# convert the object into a dict
org_apache_sling_commons_log_log_manager_properties_dict = org_apache_sling_commons_log_log_manager_properties_instance.to_dict()
# create an instance of OrgApacheSlingCommonsLogLogManagerProperties from a dict
org_apache_sling_commons_log_log_manager_properties_from_dict = OrgApacheSlingCommonsLogLogManagerProperties.from_dict(org_apache_sling_commons_log_log_manager_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


