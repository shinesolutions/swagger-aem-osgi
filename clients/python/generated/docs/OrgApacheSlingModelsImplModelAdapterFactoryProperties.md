# OrgApacheSlingModelsImplModelAdapterFactoryProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**osgi_http_whiteboard_listener** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**osgi_http_whiteboard_context_select** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**max_recursion_depth** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cleanup_job_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_models_impl_model_adapter_factory_properties import OrgApacheSlingModelsImplModelAdapterFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingModelsImplModelAdapterFactoryProperties from a JSON string
org_apache_sling_models_impl_model_adapter_factory_properties_instance = OrgApacheSlingModelsImplModelAdapterFactoryProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingModelsImplModelAdapterFactoryProperties.to_json())

# convert the object into a dict
org_apache_sling_models_impl_model_adapter_factory_properties_dict = org_apache_sling_models_impl_model_adapter_factory_properties_instance.to_dict()
# create an instance of OrgApacheSlingModelsImplModelAdapterFactoryProperties from a dict
org_apache_sling_models_impl_model_adapter_factory_properties_from_dict = OrgApacheSlingModelsImplModelAdapterFactoryProperties.from_dict(org_apache_sling_models_impl_model_adapter_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


