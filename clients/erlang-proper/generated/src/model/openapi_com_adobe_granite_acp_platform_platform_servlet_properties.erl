-module(openapi_com_adobe_granite_acp_platform_platform_servlet_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_acp_platform_platform_servlet_properties/0]).

-export([openapi_com_adobe_granite_acp_platform_platform_servlet_properties/1]).

-export_type([openapi_com_adobe_granite_acp_platform_platform_servlet_properties/0]).

-type openapi_com_adobe_granite_acp_platform_platform_servlet_properties() ::
  [ {'query_limit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'file_type_extension_map', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_acp_platform_platform_servlet_properties() ->
    openapi_com_adobe_granite_acp_platform_platform_servlet_properties([]).

openapi_com_adobe_granite_acp_platform_platform_servlet_properties(Fields) ->
  Default = [ {'query.limit', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'file.type.extension.map', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

