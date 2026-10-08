# OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query_limit_in_memory** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**query_limit_reads** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**query_fail_traversal** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**fast_query_size** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_query_query_engine_settings_service_properties import OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties from a JSON string
org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_instance = OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_dict = org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties from a dict
org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_from_dict = OrgApacheJackrabbitOakQueryQueryEngineSettingsServiceProperties.from_dict(org_apache_jackrabbit_oak_query_query_engine_settings_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


