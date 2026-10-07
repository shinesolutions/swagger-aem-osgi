-module(openapi_com_day_cq_widget_impl_html_library_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_widget_impl_html_library_manager_impl_properties/0]).

-export([openapi_com_day_cq_widget_impl_html_library_manager_impl_properties/1]).

-export_type([openapi_com_day_cq_widget_impl_html_library_manager_impl_properties/0]).

-type openapi_com_day_cq_widget_impl_html_library_manager_impl_properties() ::
  [ {'htmllibmanager_clientmanager', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_debug_console', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_debug_init_js', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_defaultthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_defaultuserthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_firebuglite_path', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_forceCQUrlInfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_gzip', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_maxage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'htmllibmanager_maxDataUriSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'htmllibmanager_minify', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_path_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmllibmanager_timing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  ].


openapi_com_day_cq_widget_impl_html_library_manager_impl_properties() ->
    openapi_com_day_cq_widget_impl_html_library_manager_impl_properties([]).

openapi_com_day_cq_widget_impl_html_library_manager_impl_properties(Fields) ->
  Default = [ {'htmllibmanager.clientmanager', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.debug.console', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.debug.init.js', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.defaultthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.defaultuserthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.firebuglite.path', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.forceCQUrlInfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.gzip', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.maxage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'htmllibmanager.maxDataUriSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'htmllibmanager.minify', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.path.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmllibmanager.timing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

