-module(openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties/0]).

-type openapi_com_adobe_granite_ui_clientlibs_impl_html_library_manager_impl_properties() ::
    #{ 'htmllibmanager_timing' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_debug_init_js' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_minify' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_debug' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_gzip' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_maxDataUriSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'htmllibmanager_maxage' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'htmllibmanager_forceCQUrlInfo' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_defaultthemename' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_defaultuserthemename' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_clientmanager' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_path_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmllibmanager_excluded_path_list' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmllibmanager_processor_js' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmllibmanager_processor_css' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmllibmanager_longcache_patterns' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'htmllibmanager_longcache_format' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_useFileSystemOutputCache' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'htmllibmanager_fileSystemOutputCacheLocation' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'htmllibmanager_disable_replacement' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'htmllibmanager_timing' := HtmllibmanagerTiming,
          'htmllibmanager_debug_init_js' := HtmllibmanagerDebugInitJs,
          'htmllibmanager_minify' := HtmllibmanagerMinify,
          'htmllibmanager_debug' := HtmllibmanagerDebug,
          'htmllibmanager_gzip' := HtmllibmanagerGzip,
          'htmllibmanager_maxDataUriSize' := HtmllibmanagerMaxDataUriSize,
          'htmllibmanager_maxage' := HtmllibmanagerMaxage,
          'htmllibmanager_forceCQUrlInfo' := HtmllibmanagerForceCQUrlInfo,
          'htmllibmanager_defaultthemename' := HtmllibmanagerDefaultthemename,
          'htmllibmanager_defaultuserthemename' := HtmllibmanagerDefaultuserthemename,
          'htmllibmanager_clientmanager' := HtmllibmanagerClientmanager,
          'htmllibmanager_path_list' := HtmllibmanagerPathList,
          'htmllibmanager_excluded_path_list' := HtmllibmanagerExcludedPathList,
          'htmllibmanager_processor_js' := HtmllibmanagerProcessorJs,
          'htmllibmanager_processor_css' := HtmllibmanagerProcessorCss,
          'htmllibmanager_longcache_patterns' := HtmllibmanagerLongcachePatterns,
          'htmllibmanager_longcache_format' := HtmllibmanagerLongcacheFormat,
          'htmllibmanager_useFileSystemOutputCache' := HtmllibmanagerUseFileSystemOutputCache,
          'htmllibmanager_fileSystemOutputCacheLocation' := HtmllibmanagerFileSystemOutputCacheLocation,
          'htmllibmanager_disable_replacement' := HtmllibmanagerDisableReplacement
        }) ->
    #{ 'htmllibmanager.timing' => HtmllibmanagerTiming,
       'htmllibmanager.debug.init.js' => HtmllibmanagerDebugInitJs,
       'htmllibmanager.minify' => HtmllibmanagerMinify,
       'htmllibmanager.debug' => HtmllibmanagerDebug,
       'htmllibmanager.gzip' => HtmllibmanagerGzip,
       'htmllibmanager.maxDataUriSize' => HtmllibmanagerMaxDataUriSize,
       'htmllibmanager.maxage' => HtmllibmanagerMaxage,
       'htmllibmanager.forceCQUrlInfo' => HtmllibmanagerForceCQUrlInfo,
       'htmllibmanager.defaultthemename' => HtmllibmanagerDefaultthemename,
       'htmllibmanager.defaultuserthemename' => HtmllibmanagerDefaultuserthemename,
       'htmllibmanager.clientmanager' => HtmllibmanagerClientmanager,
       'htmllibmanager.path.list' => HtmllibmanagerPathList,
       'htmllibmanager.excluded.path.list' => HtmllibmanagerExcludedPathList,
       'htmllibmanager.processor.js' => HtmllibmanagerProcessorJs,
       'htmllibmanager.processor.css' => HtmllibmanagerProcessorCss,
       'htmllibmanager.longcache.patterns' => HtmllibmanagerLongcachePatterns,
       'htmllibmanager.longcache.format' => HtmllibmanagerLongcacheFormat,
       'htmllibmanager.useFileSystemOutputCache' => HtmllibmanagerUseFileSystemOutputCache,
       'htmllibmanager.fileSystemOutputCacheLocation' => HtmllibmanagerFileSystemOutputCacheLocation,
       'htmllibmanager.disable.replacement' => HtmllibmanagerDisableReplacement
     }.
