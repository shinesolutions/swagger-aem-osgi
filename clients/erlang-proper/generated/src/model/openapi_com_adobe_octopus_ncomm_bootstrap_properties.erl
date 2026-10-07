-module(openapi_com_adobe_octopus_ncomm_bootstrap_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_octopus_ncomm_bootstrap_properties/0]).

-export([openapi_com_adobe_octopus_ncomm_bootstrap_properties/1]).

-export_type([openapi_com_adobe_octopus_ncomm_bootstrap_properties/0]).

-type openapi_com_adobe_octopus_ncomm_bootstrap_properties() ::
  [ {'maxConnections', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'maxRequests', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'requestTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'requestRetries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'launchTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_octopus_ncomm_bootstrap_properties() ->
    openapi_com_adobe_octopus_ncomm_bootstrap_properties([]).

openapi_com_adobe_octopus_ncomm_bootstrap_properties(Fields) ->
  Default = [ {'maxConnections', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'maxRequests', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'requestTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'requestRetries', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'launchTimeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

