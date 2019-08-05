-module(openapi_com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl_properties/0]).

-type openapi_com_adobe_cq_screens_impl_remote_impl_distributed_http_client_impl_properties() ::
    #{ 'com_adobe_aem_screens_impl_remote_request_timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'com_adobe_aem_screens_impl_remote_request_timeout' := ComAdobeAemScreensImplRemoteRequestTimeout
        }) ->
    #{ 'com.adobe.aem.screens.impl.remote.request_timeout' => ComAdobeAemScreensImplRemoteRequestTimeout
     }.
