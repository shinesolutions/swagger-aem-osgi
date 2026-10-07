# WWW::OpenAPIClient::Object::OrgApacheFelixHttpProperties

## Load the model package
```perl
use WWW::OpenAPIClient::Object::OrgApacheFelixHttpProperties;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**org/apache/felix/http/host** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/http/enable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/osgi/service/http/port** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/https/enable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/osgi/service/http/port/secure** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/https/keystore** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/https/keystore/password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/https/keystore/key/password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/https/truststore** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/https/truststore/password** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/https/clientcertificate** | [**ConfigNodePropertyDropDown**](ConfigNodePropertyDropDown.md) |  | [optional] 
**org/apache/felix/http/context_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/http/mbeans** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/http/session/timeout** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/threadpool/max** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/acceptors** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/selectors** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/header_buffer_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/request_buffer_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/response_buffer_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/jetty/max_form_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/path_exclusions** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/https/jetty/ciphersuites/excluded** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/https/jetty/ciphersuites/included** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/http/jetty/send_server_header** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/https/jetty/protocols/included** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/https/jetty/protocols/excluded** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/proxy/load/balancer/connection/enable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/https/jetty/renegotiate_allowed** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/https/jetty/session/cookie/http_only** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/https/jetty/session/cookie/secure** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/eclipse/jetty/servlet/session_id_path_parameter_name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/eclipse/jetty/servlet/checking_remote_session_id_encoding** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/eclipse/jetty/servlet/session_cookie** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/eclipse/jetty/servlet/session_domain** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/eclipse/jetty/servlet/session_path** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/eclipse/jetty/servlet/max_age** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/http/name** | [**ConfigNodePropertyString**](ConfigNodePropertyString.md) |  | [optional] 
**org/apache/felix/jetty/gziphandler/enable** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/jetty/gzip/min_gzip_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/jetty/gzip/compression_level** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/jetty/gzip/inflate_buffer_size** | [**ConfigNodePropertyInteger**](ConfigNodePropertyInteger.md) |  | [optional] 
**org/apache/felix/jetty/gzip/sync_flush** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/jetty/gzip/excluded_user_agents** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/jetty/gzip/included_methods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/jetty/gzip/excluded_methods** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/jetty/gzip/included_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/jetty/gzip/excluded_paths** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/jetty/gzip/included_mime_types** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/jetty/gzip/excluded_mime_types** | [**ConfigNodePropertyArray**](ConfigNodePropertyArray.md) |  | [optional] 
**org/apache/felix/http/session/invalidate** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 
**org/apache/felix/http/session/uniqueid** | [**ConfigNodePropertyBoolean**](ConfigNodePropertyBoolean.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


