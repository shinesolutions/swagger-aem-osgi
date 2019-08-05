-module(openapi_com_adobe_granite_acp_platform_platform_servlet_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_acp_platform_platform_servlet_properties/0]).

-type openapi_com_adobe_granite_acp_platform_platform_servlet_properties() ::
    #{ 'query_limit' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'file_type_extension_map' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'query_limit' := QueryLimit,
          'file_type_extension_map' := FileTypeExtensionMap
        }) ->
    #{ 'query.limit' => QueryLimit,
       'file.type.extension.map' => FileTypeExtensionMap
     }.
