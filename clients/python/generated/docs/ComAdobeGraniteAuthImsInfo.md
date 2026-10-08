# ComAdobeGraniteAuthImsInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeGraniteAuthImsProperties**](ComAdobeGraniteAuthImsProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_granite_auth_ims_info import ComAdobeGraniteAuthImsInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteAuthImsInfo from a JSON string
com_adobe_granite_auth_ims_info_instance = ComAdobeGraniteAuthImsInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeGraniteAuthImsInfo.to_json())

# convert the object into a dict
com_adobe_granite_auth_ims_info_dict = com_adobe_granite_auth_ims_info_instance.to_dict()
# create an instance of ComAdobeGraniteAuthImsInfo from a dict
com_adobe_granite_auth_ims_info_from_dict = ComAdobeGraniteAuthImsInfo.from_dict(com_adobe_granite_auth_ims_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


