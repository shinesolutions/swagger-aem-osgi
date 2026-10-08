# ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**version_id** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cache_on** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**concurrency_level** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_start_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_ttl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**time_limit** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties import ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties from a JSON string
com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_instance = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.to_json()

# convert the object into a dict
com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_dict = com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_instance.to_dict()
# create an instance of ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties from a dict
com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_from_dict = ComAdobeCqSocialDatastoreAsImplASResourceProviderFactoryProperties.from_dict(com_adobe_cq_social_datastore_as_impl_as_resource_provider_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


