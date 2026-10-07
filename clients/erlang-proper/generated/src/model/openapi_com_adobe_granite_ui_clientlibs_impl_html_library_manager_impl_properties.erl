-module(openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties/0]).

-export([openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties/1]).

-export_type([openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties/0]).

-type openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties() ::
  [ {'htmllibmanager_timing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_debug_init_js', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_minify', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_gzip', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_maxDataUriSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'htmllibmanager_maxage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'htmllibmanager_forceCQUrlInfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_defaultthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_defaultuserthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_clientmanager', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_path_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmllibmanager_excluded_path_list', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmllibmanager_processor_js', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmllibmanager_processor_css', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmllibmanager_longcache_patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'htmllibmanager_longcache_format', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_useFileSystemOutputCache', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'htmllibmanager_fileSystemOutputCacheLocation', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'htmllibmanager_disable_replacement', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties() ->
    openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties([]).

openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties(Fields) ->
  Default = [ {'htmllibmanager.timing', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.debug.init.js', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.minify', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.debug', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.gzip', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.maxDataUriSize', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'htmllibmanager.maxage', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'htmllibmanager.forceCQUrlInfo', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.defaultthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.defaultuserthemename', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.clientmanager', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.path.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmllibmanager.excluded.path.list', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmllibmanager.processor.js', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmllibmanager.processor.css', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmllibmanager.longcache.patterns', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'htmllibmanager.longcache.format', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.useFileSystemOutputCache', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'htmllibmanager.fileSystemOutputCacheLocation', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'htmllibmanager.disable.replacement', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

