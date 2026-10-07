# OrgApacheSlingEngineParametersProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sling_default_parameter_encoding** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**sling_default_max_parameters** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**file_location** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**file_threshold** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**file_max** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**request_max** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**sling_default_parameter_check_for_additional_container_parameters** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_sling_engine_parameters_properties import OrgApacheSlingEngineParametersProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingEngineParametersProperties from a JSON string
org_apache_sling_engine_parameters_properties_instance = OrgApacheSlingEngineParametersProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheSlingEngineParametersProperties.to_json()

# convert the object into a dict
org_apache_sling_engine_parameters_properties_dict = org_apache_sling_engine_parameters_properties_instance.to_dict()
# create an instance of OrgApacheSlingEngineParametersProperties from a dict
org_apache_sling_engine_parameters_properties_from_dict = OrgApacheSlingEngineParametersProperties.from_dict(org_apache_sling_engine_parameters_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


