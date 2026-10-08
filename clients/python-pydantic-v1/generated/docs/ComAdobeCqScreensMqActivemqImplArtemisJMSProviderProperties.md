# ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**service_ranking** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**global_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**max_disk_usage** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**persistence_enabled** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**thread_pool_max_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**scheduled_thread_pool_max_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**graceful_shutdown_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**queues** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**topics** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**addresses_max_delivery_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**addresses_expiry_delay** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**addresses_address_full_message_policy** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**addresses_max_size_bytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**addresses_page_size_bytes** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**addresses_page_cache_max_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cluster_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**cluster_call_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_call_failover_timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_client_failure_check_period** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_notification_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_notification_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**id_cache_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_confirmation_window_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_connection_ttl** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_duplicate_detection** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**cluster_initial_connect_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_max_retry_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_min_large_message_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_producer_window_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_reconnect_attempts** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_retry_interval** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**cluster_retry_interval_multiplier** | [**ConfigNodePropertyFloat**](ConfigNodePropertyFloat.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties import ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties from a JSON string
com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_instance = ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.to_json()

# convert the object into a dict
com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_dict = com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_instance.to_dict()
# create an instance of ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties from a dict
com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_from_dict = ComAdobeCqScreensMqActivemqImplArtemisJMSProviderProperties.from_dict(com_adobe_cq_screens_mq_activemq_impl_artemis_jms_provider_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


