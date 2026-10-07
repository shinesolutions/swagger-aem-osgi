# ComAdobeGraniteSecurityUserUserPropertiesServiceInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeGraniteSecurityUserUserPropertiesServiceProperties**](ComAdobeGraniteSecurityUserUserPropertiesServiceProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_security_user_user_properties_service_info import ComAdobeGraniteSecurityUserUserPropertiesServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteSecurityUserUserPropertiesServiceInfo from a JSON string
com_adobe_granite_security_user_user_properties_service_info_instance = ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.to_json())

# convert the object into a dict
com_adobe_granite_security_user_user_properties_service_info_dict = com_adobe_granite_security_user_user_properties_service_info_instance.to_dict()
# create an instance of ComAdobeGraniteSecurityUserUserPropertiesServiceInfo from a dict
com_adobe_granite_security_user_user_properties_service_info_from_dict = ComAdobeGraniteSecurityUserUserPropertiesServiceInfo.from_dict(com_adobe_granite_security_user_user_properties_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


