-module(openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties/0]).

-type openapi_com_adobe_granite_rest_impl_servlet_default_get_servlet_properties() ::
    #{ 'default_limit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'use_absolute_uri' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'default_limit' := DefaultLimit,
          'use_absolute_uri' := UseAbsoluteUri
        }) ->
    #{ 'default.limit' => DefaultLimit,
       'use.absolute.uri' => UseAbsoluteUri
     }.
