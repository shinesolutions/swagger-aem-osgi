-module(openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties/0]).

-type openapi_org_apache_sling_startupfilter_impl_startup_filter_impl_properties() ::
    #{ 'active_by_default' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'default_message' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'active_by_default' := ActiveByDefault,
          'default_message' := DefaultMessage
        }) ->
    #{ 'active.by.default' => ActiveByDefault,
       'default.message' => DefaultMessage
     }.
