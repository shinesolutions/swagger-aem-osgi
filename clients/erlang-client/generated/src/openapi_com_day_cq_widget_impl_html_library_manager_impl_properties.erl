-module(openapi_com_day_cq_widget_impl_html_library_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_widget_impl_html_library_manager_impl_properties/0]).

-type openapi_com_day_cq_widget_impl_html_library_manager_impl_properties() ::
    #{ 'htmllibmanager_clientmanager' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_debug' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_debug_console' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_debug_init_js' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_defaultthemename' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_defaultuserthemename' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_firebuglite_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_forceCQUrlInfo' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_gzip' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_maxage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'htmllibmanager_maxDataUriSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'htmllibmanager_minify' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_path_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmllibmanager_timing' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'htmllibmanager_clientmanager' := HtmllibmanagerClientmanager,
          'htmllibmanager_debug' := HtmllibmanagerDebug,
          'htmllibmanager_debug_console' := HtmllibmanagerDebugConsole,
          'htmllibmanager_debug_init_js' := HtmllibmanagerDebugInitJs,
          'htmllibmanager_defaultthemename' := HtmllibmanagerDefaultthemename,
          'htmllibmanager_defaultuserthemename' := HtmllibmanagerDefaultuserthemename,
          'htmllibmanager_firebuglite_path' := HtmllibmanagerFirebuglitePath,
          'htmllibmanager_forceCQUrlInfo' := HtmllibmanagerForceCQUrlInfo,
          'htmllibmanager_gzip' := HtmllibmanagerGzip,
          'htmllibmanager_maxage' := HtmllibmanagerMaxage,
          'htmllibmanager_maxDataUriSize' := HtmllibmanagerMaxDataUriSize,
          'htmllibmanager_minify' := HtmllibmanagerMinify,
          'htmllibmanager_path_list' := HtmllibmanagerPathList,
          'htmllibmanager_timing' := HtmllibmanagerTiming
        }) ->
    #{ 'htmllibmanager.clientmanager' => HtmllibmanagerClientmanager,
       'htmllibmanager.debug' => HtmllibmanagerDebug,
       'htmllibmanager.debug.console' => HtmllibmanagerDebugConsole,
       'htmllibmanager.debug.init.js' => HtmllibmanagerDebugInitJs,
       'htmllibmanager.defaultthemename' => HtmllibmanagerDefaultthemename,
       'htmllibmanager.defaultuserthemename' => HtmllibmanagerDefaultuserthemename,
       'htmllibmanager.firebuglite.path' => HtmllibmanagerFirebuglitePath,
       'htmllibmanager.forceCQUrlInfo' => HtmllibmanagerForceCQUrlInfo,
       'htmllibmanager.gzip' => HtmllibmanagerGzip,
       'htmllibmanager.maxage' => HtmllibmanagerMaxage,
       'htmllibmanager.maxDataUriSize' => HtmllibmanagerMaxDataUriSize,
       'htmllibmanager.minify' => HtmllibmanagerMinify,
       'htmllibmanager.path.list' => HtmllibmanagerPathList,
       'htmllibmanager.timing' => HtmllibmanagerTiming
     }.
