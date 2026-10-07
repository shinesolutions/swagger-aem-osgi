-module(openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties/0]).

-export([openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties/1]).

-export_type([openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties/0]).

-type openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties() ::
  [ {'script_filename', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'script_display', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'script_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'script_platform', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'jmxdomain', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties() ->
    openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties([]).

openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties(Fields) ->
  Default = [ {'script.filename', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'script.display', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'script.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'script.platform', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'interval', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'jmxdomain', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

