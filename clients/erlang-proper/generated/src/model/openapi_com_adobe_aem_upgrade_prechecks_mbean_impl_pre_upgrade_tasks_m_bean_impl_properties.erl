-module(openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties/0]).

-export([openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties() ::
  [ {'pre_upgrade_maintenance_tasks', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'pre_upgrade_hc_tags', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties() ->
    openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties([]).

openapi_com_adobe_aem_upgrade_prechecks_mbean_impl_pre_upgrade_tasks_m_bean_impl_properties(Fields) ->
  Default = [ {'pre-upgrade.maintenance.tasks', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'pre-upgrade.hc.tags', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

