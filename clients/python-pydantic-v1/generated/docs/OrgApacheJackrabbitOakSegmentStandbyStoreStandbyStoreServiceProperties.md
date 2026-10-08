# OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org_apache_sling_installer_configuration_persist** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**mode** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**primary_host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**primary_allowed_client_ip_ranges** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**secure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**standby_readtimeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**standby_autoclean** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

## Example

```python
from openapi_client.models.org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties import OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties from a JSON string
org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_instance = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.from_json(json)
# print the JSON string representation of the object
print OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.to_json()

# convert the object into a dict
org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_dict = org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_instance.to_dict()
# create an instance of OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties from a dict
org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_from_dict = OrgApacheJackrabbitOakSegmentStandbyStoreStandbyStoreServiceProperties.from_dict(org_apache_jackrabbit_oak_segment_standby_store_standby_store_service_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


