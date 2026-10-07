-module(openapi_org_apache_felix_systemready_impl_framework_start_check_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_systemready_impl_framework_start_check_properties/0]).

-type openapi_org_apache_felix_systemready_impl_framework_start_check_properties() ::
    #{ 'timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'target_start_level' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'target_start_level_prop_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'type' => openapi_config_node_property_drop_down:openapi_config_node_property_drop_down()
     }.

encode(#{ 'timeout' := Timeout,
          'target_start_level' := TargetStartLevel,
          'target_start_level_prop_name' := TargetStartLevelPropName,
          'type' := Type
        }) ->
    #{ 'timeout' => Timeout,
       'target.start.level' => TargetStartLevel,
       'target.start.level.prop.name' => TargetStartLevelPropName,
       'type' => Type
     }.
