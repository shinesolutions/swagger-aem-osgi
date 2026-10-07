-module(openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties/0]).

-export([openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties/1]).

-export_type([openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties/0]).

-type openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties() ::
  [ {'com_adobe_dam_mac_sync_client_so_timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties() ->
    openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties([]).

openapi_com_adobe_cq_dam_mac_sync_helper_impl_mac_sync_client_impl_properties(Fields) ->
  Default = [ {'com.adobe.dam.mac.sync.client.so.timeout', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

