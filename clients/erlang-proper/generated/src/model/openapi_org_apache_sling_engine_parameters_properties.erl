-module(openapi_org_apache_sling_engine_parameters_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_engine_parameters_properties/0]).

-export([openapi_org_apache_sling_engine_parameters_properties/1]).

-export_type([openapi_org_apache_sling_engine_parameters_properties/0]).

-type openapi_org_apache_sling_engine_parameters_properties() ::
  [ {'sling_default_parameter_encoding', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'sling_default_max_parameters', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'file_location', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'file_threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'file_max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'request_max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'sling_default_parameter_checkForAdditionalContainerParameters', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_org_apache_sling_engine_parameters_properties() ->
    openapi_org_apache_sling_engine_parameters_properties([]).

openapi_org_apache_sling_engine_parameters_properties(Fields) ->
  Default = [ {'sling.default.parameter.encoding', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'sling.default.max.parameters', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'file.location', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'file.threshold', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'file.max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'request.max', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'sling.default.parameter.checkForAdditionalContainerParameters', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

