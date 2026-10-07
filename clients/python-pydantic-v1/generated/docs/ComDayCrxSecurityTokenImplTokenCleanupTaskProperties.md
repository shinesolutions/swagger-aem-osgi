# ComDayCrxSecurityTokenImplTokenCleanupTaskProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**enable_token_cleanup_task** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**scheduler_expression** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**batch_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_day_crx_security_token_impl_token_cleanup_task_properties import ComDayCrxSecurityTokenImplTokenCleanupTaskProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties from a JSON string
com_day_crx_security_token_impl_token_cleanup_task_properties_instance = ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.from_json(json)
# print the JSON string representation of the object
print ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.to_json()

# convert the object into a dict
com_day_crx_security_token_impl_token_cleanup_task_properties_dict = com_day_crx_security_token_impl_token_cleanup_task_properties_instance.to_dict()
# create an instance of ComDayCrxSecurityTokenImplTokenCleanupTaskProperties from a dict
com_day_crx_security_token_impl_token_cleanup_task_properties_from_dict = ComDayCrxSecurityTokenImplTokenCleanupTaskProperties.from_dict(com_day_crx_security_token_impl_token_cleanup_task_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


