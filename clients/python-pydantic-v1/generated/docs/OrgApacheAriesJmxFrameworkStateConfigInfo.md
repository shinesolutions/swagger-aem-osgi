# OrgApacheAriesJmxFrameworkStateConfigInfo


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pid** | **str** |  | [optional] 
**title** | **str** |  | [optional] 
**description** | **str** |  | [optional] 
**properties** | [**OrgApacheAriesJmxFrameworkStateConfigProperties**](OrgApacheAriesJmxFrameworkStateConfigProperties.md) |  | [optional] 
**bundle_location** | **str** |  | [optional] 
**service_location** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_aries_jmx_framework_state_config_info import OrgApacheAriesJmxFrameworkStateConfigInfo

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheAriesJmxFrameworkStateConfigInfo from a JSON string
org_apache_aries_jmx_framework_state_config_info_instance = OrgApacheAriesJmxFrameworkStateConfigInfo.from_json(json)
# print the JSON string representation of the object
print OrgApacheAriesJmxFrameworkStateConfigInfo.to_json()

# convert the object into a dict
org_apache_aries_jmx_framework_state_config_info_dict = org_apache_aries_jmx_framework_state_config_info_instance.to_dict()
# create an instance of OrgApacheAriesJmxFrameworkStateConfigInfo from a dict
org_apache_aries_jmx_framework_state_config_info_from_dict = OrgApacheAriesJmxFrameworkStateConfigInfo.from_dict(org_apache_aries_jmx_framework_state_config_info_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


