-module(openapi_com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_properties).

-export([encode/1]).

-export_type([openapi_com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_properties/0]).

-type openapi_com_day_cq_dam_core_impl_jmx_asset_migration_m_bean_impl_properties() ::
    #{ 'jmx_objectname' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'jmx_objectname' := JmxObjectname
        }) ->
    #{ 'jmx.objectname' => JmxObjectname
     }.
