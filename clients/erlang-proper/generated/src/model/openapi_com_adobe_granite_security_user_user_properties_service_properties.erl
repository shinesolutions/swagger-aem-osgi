-module(openapi_com_adobe_granite_security_user_user_properties_service_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_security_user_user_properties_service_properties/0]).

-export([openapi_com_adobe_granite_security_user_user_properties_service_properties/1]).

-export_type([openapi_com_adobe_granite_security_user_user_properties_service_properties/0]).

-type openapi_com_adobe_granite_security_user_user_properties_service_properties() ::
  [ {'adapter_condition', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'granite_userproperties_nodetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'granite_userproperties_resourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_security_user_user_properties_service_properties() ->
    openapi_com_adobe_granite_security_user_user_properties_service_properties([]).

openapi_com_adobe_granite_security_user_user_properties_service_properties(Fields) ->
  Default = [ {'adapter.condition', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'granite.userproperties.nodetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'granite.userproperties.resourcetypes', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

