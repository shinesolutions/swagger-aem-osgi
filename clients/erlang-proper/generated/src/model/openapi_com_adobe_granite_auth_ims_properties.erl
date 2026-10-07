-module(openapi_com_adobe_granite_auth_ims_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_auth_ims_properties/0]).

-export([openapi_com_adobe_granite_auth_ims_properties/1]).

-export_type([openapi_com_adobe_granite_auth_ims_properties/0]).

-type openapi_com_adobe_granite_auth_ims_properties() ::
  [ {'configid', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'scope', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_auth_ims_properties() ->
    openapi_com_adobe_granite_auth_ims_properties([]).

openapi_com_adobe_granite_auth_ims_properties(Fields) ->
  Default = [ {'configid', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'scope', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

