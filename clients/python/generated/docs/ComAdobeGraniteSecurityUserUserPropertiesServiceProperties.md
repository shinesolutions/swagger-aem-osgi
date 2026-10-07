# ComAdobeGraniteSecurityUserUserPropertiesServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**adapter_condition** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**granite_userproperties_nodetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**granite_userproperties_resourcetypes** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_security_user_user_properties_service_properties import ComAdobeGraniteSecurityUserUserPropertiesServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteSecurityUserUserPropertiesServiceProperties from a JSON string
com_adobe_granite_security_user_user_properties_service_properties_instance = ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.to_json())

# convert the object into a dict
com_adobe_granite_security_user_user_properties_service_properties_dict = com_adobe_granite_security_user_user_properties_service_properties_instance.to_dict()
# create an instance of ComAdobeGraniteSecurityUserUserPropertiesServiceProperties from a dict
com_adobe_granite_security_user_user_properties_service_properties_from_dict = ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.from_dict(com_adobe_granite_security_user_user_properties_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


