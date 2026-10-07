# ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inbox_impl_typeprovider_registrypaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**inbox_impl_typeprovider_legacypaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**inbox_impl_typeprovider_defaulturl_failureitem** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**inbox_impl_typeprovider_defaulturl_workitem** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**inbox_impl_typeprovider_defaulturl_task** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties import ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties from a JSON string
com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_instance = ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.to_json()

# convert the object into a dict
com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_dict = com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_instance.to_dict()
# create an instance of ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties from a dict
com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_from_dict = ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties.from_dict(com_adobe_cq_inbox_impl_typeprovider_item_type_provider_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


