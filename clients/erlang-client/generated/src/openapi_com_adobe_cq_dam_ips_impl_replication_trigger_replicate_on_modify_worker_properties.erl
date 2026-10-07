-module(openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties/0]).

-type openapi_com_adobe_cq_dam_ips_impl_replication_trigger_replicate_on_modify_worker_properties() ::
    #{ 'dmreplicateonmodify_enabled' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'dmreplicateonmodify_forcesyncdeletes' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'dmreplicateonmodify_enabled' := DmreplicateonmodifyEnabled,
          'dmreplicateonmodify_forcesyncdeletes' := DmreplicateonmodifyForcesyncdeletes
        }) ->
    #{ 'dmreplicateonmodify.enabled' => DmreplicateonmodifyEnabled,
       'dmreplicateonmodify.forcesyncdeletes' => DmreplicateonmodifyForcesyncdeletes
     }.
