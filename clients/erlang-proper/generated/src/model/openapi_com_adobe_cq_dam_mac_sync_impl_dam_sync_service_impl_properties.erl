-module(openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties/0]).

-export([openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties/0]).

-type openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties() ::
  [ {'com_adobe_cq_dam_mac_sync_damsyncservice_registered_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'com_adobe_cq_dam_mac_sync_damsyncservice_sync_renditions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'com_adobe_cq_dam_mac_sync_damsyncservice_replicate_thread_wait_ms', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'com_adobe_cq_dam_mac_sync_damsyncservice_platform', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
  ].


openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties() ->
    openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties([]).

openapi_com_adobe_cq_dam_mac_sync_impl_dam_sync_service_impl_properties(Fields) ->
  Default = [ {'com.adobe.cq.dam.mac.sync.damsyncservice.registered_paths', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'com.adobe.cq.dam.mac.sync.damsyncservice.sync.renditions', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'com.adobe.cq.dam.mac.sync.damsyncservice.replicate.thread.wait.ms', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'com.adobe.cq.dam.mac.sync.damsyncservice.platform', openapi_config_node_property_drop_down:openapi_config_node_property_drop_down() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

