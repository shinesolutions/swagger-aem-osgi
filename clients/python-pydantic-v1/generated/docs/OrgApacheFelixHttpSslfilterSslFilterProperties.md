# OrgApacheFelixHttpSslfilterSslFilterProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ssl_forward_header** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ssl_forward_value** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**ssl_forward_cert_header** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**rewrite_absolute_urls** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_felix_http_sslfilter_ssl_filter_properties import OrgApacheFelixHttpSslfilterSslFilterProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheFelixHttpSslfilterSslFilterProperties from a JSON string
org_apache_felix_http_sslfilter_ssl_filter_properties_instance = OrgApacheFelixHttpSslfilterSslFilterProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheFelixHttpSslfilterSslFilterProperties.to_json()

# convert the object into a dict
org_apache_felix_http_sslfilter_ssl_filter_properties_dict = org_apache_felix_http_sslfilter_ssl_filter_properties_instance.to_dict()
# create an instance of OrgApacheFelixHttpSslfilterSslFilterProperties from a dict
org_apache_felix_http_sslfilter_ssl_filter_properties_from_dict = OrgApacheFelixHttpSslfilterSslFilterProperties.from_dict(org_apache_felix_http_sslfilter_ssl_filter_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


