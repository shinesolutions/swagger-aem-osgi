-module(openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties/0]).

-type openapi_com_day_cq_compat_codeupgrade_impl_upgrade_task_ignore_list_properties() ::
    #{ 'upgradeTaskIgnoreList' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'upgradeTaskIgnoreList' := UpgradeTaskIgnoreList
        }) ->
    #{ 'upgradeTaskIgnoreList' => UpgradeTaskIgnoreList
     }.
