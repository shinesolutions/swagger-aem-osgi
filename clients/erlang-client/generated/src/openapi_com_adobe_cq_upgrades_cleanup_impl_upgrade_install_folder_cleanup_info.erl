-module(openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_info/0]).

-type openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties:openapi_com_adobe_cq_upgrades_cleanup_impl_upgrade_install_folder_cleanup_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
