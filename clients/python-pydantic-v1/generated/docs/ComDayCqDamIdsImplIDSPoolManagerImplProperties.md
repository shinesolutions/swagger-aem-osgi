# ComDayCqDamIdsImplIDSPoolManagerImplProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_errors_to_blacklist** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**retry_interval_to_whitelist** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**connect_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**socket_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**process_label** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**connection_use_max** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties import ComDayCqDamIdsImplIDSPoolManagerImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqDamIdsImplIDSPoolManagerImplProperties from a JSON string
com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_instance = ComDayCqDamIdsImplIDSPoolManagerImplProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCqDamIdsImplIDSPoolManagerImplProperties.to_json()

# convert the object into a dict
com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_dict = com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_instance.to_dict()
# create an instance of ComDayCqDamIdsImplIDSPoolManagerImplProperties from a dict
com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_from_dict = ComDayCqDamIdsImplIDSPoolManagerImplProperties.from_dict(com_day_cq_dam_ids_impl_ids_pool_manager_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


