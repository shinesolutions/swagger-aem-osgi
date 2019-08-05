-module(openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties/0]).

-type openapi_com_adobe_granite_monitoring_impl_script_config_impl_properties() ::
    #{ 'script_filename' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'script_display' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'script_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'script_platform' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'interval' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'jmxdomain' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'script_filename' := ScriptFilename,
          'script_display' := ScriptDisplay,
          'script_path' := ScriptPath,
          'script_platform' := ScriptPlatform,
          'interval' := Interval,
          'jmxdomain' := Jmxdomain
        }) ->
    #{ 'script.filename' => ScriptFilename,
       'script.display' => ScriptDisplay,
       'script.path' => ScriptPath,
       'script.platform' => ScriptPlatform,
       'interval' => Interval,
       'jmxdomain' => Jmxdomain
     }.
