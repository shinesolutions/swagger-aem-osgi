# OrgApacheFelixSystemreadyImplServicesCheckInfo


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheFelixSystemreadyImplServicesCheckProperties**](OrgApacheFelixSystemreadyImplServicesCheckProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_felix_systemready_impl_services_check_info import OrgApacheFelixSystemreadyImplServicesCheckInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixSystemreadyImplServicesCheckInfo from a JSON string
org_apache_felix_systemready_impl_services_check_info_instance = OrgApacheFelixSystemreadyImplServicesCheckInfo.from_json(json)
# print the JSON string representation of the object
print(OrgApacheFelixSystemreadyImplServicesCheckInfo.to_json())

# convert the object into a dict
org_apache_felix_systemready_impl_services_check_info_dict = org_apache_felix_systemready_impl_services_check_info_instance.to_dict()
# create an instance of OrgApacheFelixSystemreadyImplServicesCheckInfo from a dict
org_apache_felix_systemready_impl_services_check_info_from_dict = OrgApacheFelixSystemreadyImplServicesCheckInfo.from_dict(org_apache_felix_systemready_impl_services_check_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


