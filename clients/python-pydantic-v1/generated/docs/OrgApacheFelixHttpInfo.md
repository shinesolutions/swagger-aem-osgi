# OrgApacheFelixHttpInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheFelixHttpProperties**](OrgApacheFelixHttpProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_felix_http_info import OrgApacheFelixHttpInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixHttpInfo from a JSON string
org_apache_felix_http_info_instance = OrgApacheFelixHttpInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheFelixHttpInfo.to_json()

# convert the object into a dict
org_apache_felix_http_info_dict = org_apache_felix_http_info_instance.to_dict()
# create an instance of OrgApacheFelixHttpInfo from a dict
org_apache_felix_http_info_from_dict = OrgApacheFelixHttpInfo.from_dict(org_apache_felix_http_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


