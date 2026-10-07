# ComDayCqDamCoreImplServletResourceCollectionServletProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sling_servlet_resource_types** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**sling_servlet_methods** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_servlet_selectors** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**download_config** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**view_selector** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**send_email** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties import ComDayCqDamCoreImplServletResourceCollectionServletProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamCoreImplServletResourceCollectionServletProperties from a JSON string
com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_instance = ComDayCqDamCoreImplServletResourceCollectionServletProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqDamCoreImplServletResourceCollectionServletProperties.to_json()

# convert the object into a dict
com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_dict = com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_instance.to_dict()
# create an instance of ComDayCqDamCoreImplServletResourceCollectionServletProperties from a dict
com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_from_dict = ComDayCqDamCoreImplServletResourceCollectionServletProperties.from_dict(com_day_cq_dam_core_impl_servlet_resource_collection_servlet_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


