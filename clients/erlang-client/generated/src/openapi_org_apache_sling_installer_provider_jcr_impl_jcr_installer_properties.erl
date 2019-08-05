-module(openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties/0]).

-type openapi_org_apache_sling_installer_provider_jcr_impl_jcr_installer_properties() ::
    #{ 'handler_schemes' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_jcrinstall_folder_name_regexp' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_jcrinstall_folder_max_depth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'sling_jcrinstall_search_path' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'sling_jcrinstall_new_config_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_jcrinstall_signal_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sling_jcrinstall_enable_writeback' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'handler_schemes' := HandlerSchemes,
          'sling_jcrinstall_folder_name_regexp' := SlingJcrinstallFolderNameRegexp,
          'sling_jcrinstall_folder_max_depth' := SlingJcrinstallFolderMaxDepth,
          'sling_jcrinstall_search_path' := SlingJcrinstallSearchPath,
          'sling_jcrinstall_new_config_path' := SlingJcrinstallNewConfigPath,
          'sling_jcrinstall_signal_path' := SlingJcrinstallSignalPath,
          'sling_jcrinstall_enable_writeback' := SlingJcrinstallEnableWriteback
        }) ->
    #{ 'handler.schemes' => HandlerSchemes,
       'sling.jcrinstall.folder.name.regexp' => SlingJcrinstallFolderNameRegexp,
       'sling.jcrinstall.folder.max.depth' => SlingJcrinstallFolderMaxDepth,
       'sling.jcrinstall.search.path' => SlingJcrinstallSearchPath,
       'sling.jcrinstall.new.config.path' => SlingJcrinstallNewConfigPath,
       'sling.jcrinstall.signal.path' => SlingJcrinstallSignalPath,
       'sling.jcrinstall.enable.writeback' => SlingJcrinstallEnableWriteback
     }.
