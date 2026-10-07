# ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**com_adobe_granite_jetty_ssl_port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**com_adobe_granite_jetty_ssl_keystore_user** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_granite_jetty_ssl_keystore_password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**com_adobe_granite_jetty_ssl_ciphersuites_excluded** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**com_adobe_granite_jetty_ssl_ciphersuites_included** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**com_adobe_granite_jetty_ssl_client_certificate** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 

## Example

```python
from openapi_client.models.com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties import ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties

# TODO update the JSON string below
json = "{}"
# create an instance of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties from a JSON string
com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_instance = ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.from_json(json)
# print the JSON string representation of the object
print ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.to_json()

# convert the object into a dict
com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_dict = com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_instance.to_dict()
# create an instance of ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties from a dict
com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_from_dict = ComAdobeGraniteJettySslInternalGraniteSslConnectorFactoryProperties.from_dict(com_adobe_granite_jetty_ssl_internal_granite_ssl_connector_factory_properties_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


