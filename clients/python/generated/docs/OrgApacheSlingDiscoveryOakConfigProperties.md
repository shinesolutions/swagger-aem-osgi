# OrgApacheSlingDiscoveryOakConfigProperties


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**connector_ping_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**connector_ping_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**discovery_lite_check_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_sync_service_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_sync_service_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**enable_sync_token** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**min_event_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**socket_connect_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**so_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**topology_connector_urls** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**topology_connector_whitelist** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**auto_stop_local_loop_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**gzip_connector_requests_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**hmac_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**enable_encryption** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**shared_key** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**hmac_shared_key_ttl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**backoff_standby_factor** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**backoff_stable_factor** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 

## Example

```python
from swaggeraemosgi.models.org_apache_sling_discovery_oak_config_properties import OrgApacheSlingDiscoveryOakConfigProperties

# TODO update the JSON string below
json = "{}"
# create an instance of OrgApacheSlingDiscoveryOakConfigProperties from a JSON string
org_apache_sling_discovery_oak_config_properties_instance = OrgApacheSlingDiscoveryOakConfigProperties.from_json(json)
# print the JSON string representation of the object
print(OrgApacheSlingDiscoveryOakConfigProperties.to_json())

# convert the object into a dict
org_apache_sling_discovery_oak_config_properties_dict = org_apache_sling_discovery_oak_config_properties_instance.to_dict()
# create an instance of OrgApacheSlingDiscoveryOakConfigProperties from a dict
org_apache_sling_discovery_oak_config_properties_from_dict = OrgApacheSlingDiscoveryOakConfigProperties.from_dict(org_apache_sling_discovery_oak_config_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


