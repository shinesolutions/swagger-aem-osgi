# ComAdobeCqAccountApiAccountManagementServiceProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cq_accountmanager_token_validity_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cq_accountmanager_config_requestnewaccount_mail** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cq_accountmanager_config_requestnewpwd_mail** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.com_adobe_cq_account_api_account_management_service_properties import ComAdobeCqAccountApiAccountManagementServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqAccountApiAccountManagementServiceProperties from a JSON string
com_adobe_cq_account_api_account_management_service_properties_instance = ComAdobeCqAccountApiAccountManagementServiceProperties.from_json(json)
# print the JSON string representation of the object
print(ComAdobeCqAccountApiAccountManagementServiceProperties.to_json())

# convert the object into a dict
com_adobe_cq_account_api_account_management_service_properties_dict = com_adobe_cq_account_api_account_management_service_properties_instance.to_dict()
# create an instance of ComAdobeCqAccountApiAccountManagementServiceProperties from a dict
com_adobe_cq_account_api_account_management_service_properties_from_dict = ComAdobeCqAccountApiAccountManagementServiceProperties.from_dict(com_adobe_cq_account_api_account_management_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


