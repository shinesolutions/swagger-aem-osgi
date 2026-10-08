# ComAdobeCqAccountApiAccountManagementServiceInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**ComAdobeCqAccountApiAccountManagementServiceProperties**](ComAdobeCqAccountApiAccountManagementServiceProperties.md) |  | [optional] 
**additional_properties** | **str** |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_account_api_account_management_service_info import ComAdobeCqAccountApiAccountManagementServiceInfo

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAccountApiAccountManagementServiceInfo from a JSON string
com_adobe_cq_account_api_account_management_service_info_instance = ComAdobeCqAccountApiAccountManagementServiceInfo.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqAccountApiAccountManagementServiceInfo.to_json())

# convert the object into a dict
com_adobe_cq_account_api_account_management_service_info_dict = com_adobe_cq_account_api_account_management_service_info_instance.to_dict()
# create an instance of ComAdobeCqAccountApiAccountManagementServiceInfo from a dict
com_adobe_cq_account_api_account_management_service_info_from_dict = ComAdobeCqAccountApiAccountManagementServiceInfo.from_dict(com_adobe_cq_account_api_account_management_service_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


