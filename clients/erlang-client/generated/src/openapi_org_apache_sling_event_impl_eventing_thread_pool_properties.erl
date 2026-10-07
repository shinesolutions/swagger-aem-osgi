-module(openapi_org_apache_sling_event_impl_eventing_thread_pool_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_event_impl_eventing_thread_pool_properties/0]).

-type openapi_org_apache_sling_event_impl_eventing_thread_pool_properties() ::
    #{ 'minPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer()
     }.

encode(#{ 'minPoolSize' := MinPoolSize
        }) ->
    #{ 'minPoolSize' => MinPoolSize
     }.
