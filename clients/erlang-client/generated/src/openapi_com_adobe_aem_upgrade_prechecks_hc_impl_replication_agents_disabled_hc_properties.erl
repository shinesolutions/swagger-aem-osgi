-module(openapi_com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties/0]).

-type openapi_com_adobe_aem_upgrade_prechecks_hc_impl_replication_agents_disabled_hc_properties() ::
    #{ 'hc_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'hc_tags' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'hc_mbean_name' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'hc_name' := HcName,
          'hc_tags' := HcTags,
          'hc_mbean_name' := HcMbeanName
        }) ->
    #{ 'hc.name' => HcName,
       'hc.tags' => HcTags,
       'hc.mbean.name' => HcMbeanName
     }.
