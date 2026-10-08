# OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**async_configs** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**lease_time_out_minutes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**failing_index_timeout_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**error_warn_interval_seconds** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties import OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties from a JSON string
org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_instance = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.to_json())

# convert the object into a dict
org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_dict = org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties from a dict
org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_from_dict = OrgApacheJackrabbitOakPluginsIndexAsyncIndexerServiceProperties.from_dict(org_apache_jackrabbit_oak_plugins_index_async_indexer_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


