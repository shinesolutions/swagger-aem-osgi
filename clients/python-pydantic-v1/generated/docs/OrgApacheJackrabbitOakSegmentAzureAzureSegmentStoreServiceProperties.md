# OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**account_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**container_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**access_key** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**root_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**connection_url** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties import OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties from a JSON string
org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_instance = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_dict = org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties from a dict
org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_from_dict = OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties.from_dict(org_apache_jackrabbit_oak_segment_azure_azure_segment_store_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


