-module(openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties/0]).

-type openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties() ::
    #{ 'delete_name_regexps' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'delete_name_regexps' := DeleteNameRegexps
        }) ->
    #{ 'delete.name.regexps' => DeleteNameRegexps
     }.
