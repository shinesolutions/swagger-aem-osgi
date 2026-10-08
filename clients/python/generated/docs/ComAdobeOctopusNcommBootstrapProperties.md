# ComAdobeOctopusNcommBootstrapProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**max_connections** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_requests** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**request_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**request_retries** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**launch_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_octopus_ncomm_bootstrap_properties import ComAdobeOctopusNcommBootstrapProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeOctopusNcommBootstrapProperties from a JSON string
com_adobe_octopus_ncomm_bootstrap_properties_instance = ComAdobeOctopusNcommBootstrapProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeOctopusNcommBootstrapProperties.to_json())

# convert the object into a dict
com_adobe_octopus_ncomm_bootstrap_properties_dict = com_adobe_octopus_ncomm_bootstrap_properties_instance.to_dict()
# create an instance of ComAdobeOctopusNcommBootstrapProperties from a dict
com_adobe_octopus_ncomm_bootstrap_properties_from_dict = ComAdobeOctopusNcommBootstrapProperties.from_dict(com_adobe_octopus_ncomm_bootstrap_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


