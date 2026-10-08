# OrgApacheHttpProxyconfiguratorProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**proxy_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**proxy_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**proxy_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**proxy_exceptions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_http_proxyconfigurator_properties import OrgApacheHttpProxyconfiguratorProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheHttpProxyconfiguratorProperties from a JSON string
org_apache_http_proxyconfigurator_properties_instance = OrgApacheHttpProxyconfiguratorProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheHttpProxyconfiguratorProperties.to_json())

# convert the object into a dict
org_apache_http_proxyconfigurator_properties_dict = org_apache_http_proxyconfigurator_properties_instance.to_dict()
# create an instance of OrgApacheHttpProxyconfiguratorProperties from a dict
org_apache_http_proxyconfigurator_properties_from_dict = OrgApacheHttpProxyconfiguratorProperties.from_dict(org_apache_http_proxyconfigurator_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


