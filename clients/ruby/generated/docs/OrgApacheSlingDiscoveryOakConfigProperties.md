# SwaggerAemOsgiClient::OrgApacheSlingDiscoveryOakConfigProperties

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

## Code Sample

```ruby
require 'SwaggerAemOsgiClient'

instance = SwaggerAemOsgiClient::OrgApacheSlingDiscoveryOakConfigProperties.new(connector_ping_timeout: null,
                                 connector_ping_interval: null,
                                 discovery_lite_check_interval: null,
                                 cluster_sync_service_timeout: null,
                                 cluster_sync_service_interval: null,
                                 enable_sync_token: null,
                                 min_event_delay: null,
                                 socket_connect_timeout: null,
                                 so_timeout: null,
                                 topology_connector_urls: null,
                                 topology_connector_whitelist: null,
                                 auto_stop_local_loop_enabled: null,
                                 gzip_connector_requests_enabled: null,
                                 hmac_enabled: null,
                                 enable_encryption: null,
                                 shared_key: null,
                                 hmac_shared_key_ttl: null,
                                 backoff_standby_factor: null,
                                 backoff_stable_factor: null)
```


