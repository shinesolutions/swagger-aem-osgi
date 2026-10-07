-module(openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_tasks_impl_consistency_check_task_impl_properties() ::
    #{ 'root_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'fix_inconsistencies' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'root_path' := RootPath,
          'fix_inconsistencies' := FixInconsistencies
        }) ->
    #{ 'root.path' => RootPath,
       'fix.inconsistencies' => FixInconsistencies
     }.
