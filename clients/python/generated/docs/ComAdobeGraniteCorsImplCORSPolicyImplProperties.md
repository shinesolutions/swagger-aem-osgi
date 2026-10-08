# ComAdobeGraniteCorsImplCORSPolicyImplProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**alloworigin** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**alloworiginregexp** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**allowedpaths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**exposedheaders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**maxage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**supportedheaders** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**supportedmethods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**supportscredentials** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_cors_impl_cors_policy_impl_properties import ComAdobeGraniteCorsImplCORSPolicyImplProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteCorsImplCORSPolicyImplProperties from a JSON string
com_adobe_granite_cors_impl_cors_policy_impl_properties_instance = ComAdobeGraniteCorsImplCORSPolicyImplProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteCorsImplCORSPolicyImplProperties.to_json())

# convert the object into a dict
com_adobe_granite_cors_impl_cors_policy_impl_properties_dict = com_adobe_granite_cors_impl_cors_policy_impl_properties_instance.to_dict()
# create an instance of ComAdobeGraniteCorsImplCORSPolicyImplProperties from a dict
com_adobe_granite_cors_impl_cors_policy_impl_properties_from_dict = ComAdobeGraniteCorsImplCORSPolicyImplProperties.from_dict(com_adobe_granite_cors_impl_cors_policy_impl_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


