-module(openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties() ::
    #{ 'pre_upgrade_maintenance_tasks' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'pre_upgrade_hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'pre_upgrade_maintenance_tasks' := PreUpgradeMaintenanceTasks,
          'pre_upgrade_hc_tags' := PreUpgradeHcTags
        }) ->
    #{ 'pre-upgrade.maintenance.tasks' => PreUpgradeMaintenanceTasks,
       'pre-upgrade.hc.tags' => PreUpgradeHcTags
     }.
