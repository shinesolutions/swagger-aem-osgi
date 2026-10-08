# ComDayCqSecurityACLSetupInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComDayCqSecurityACLSetupProperties**](ComDayCqSecurityACLSetupProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.com_day_cq_security_acl_setup_info import ComDayCqSecurityACLSetupInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComDayCqSecurityACLSetupInfo from a JSON string
com_day_cq_security_acl_setup_info_instance = ComDayCqSecurityACLSetupInfo.from_json(json)
# print the JSON string representation of the object
print ComDayCqSecurityACLSetupInfo.to_json()

# convert the object into a dict
com_day_cq_security_acl_setup_info_dict = com_day_cq_security_acl_setup_info_instance.to_dict()
# create an instance of ComDayCqSecurityACLSetupInfo from a dict
com_day_cq_security_acl_setup_info_from_dict = ComDayCqSecurityACLSetupInfo.from_dict(com_day_cq_security_acl_setup_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


