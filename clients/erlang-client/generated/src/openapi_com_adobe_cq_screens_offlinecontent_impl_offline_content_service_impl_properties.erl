-module(openapi_com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_offlinecontent_impl_offline_content_service_impl_properties() ::
    #{ 'disableSmartSync' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'disableSmartSync' := DisableSmartSync
        }) ->
    #{ 'disableSmartSync' => DisableSmartSync
     }.
