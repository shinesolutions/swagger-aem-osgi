-module(openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties/0]).

-export([openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties/1]).

-export_type([openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties/0]).

-type openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties() ::
  [ {'com_adobe_cq_screens_offlinecontent_impl_BulkOfflineUpdateServiceImpl_projectPath', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'com_adobe_cq_screens_offlinecontent_impl_BulkOfflineUpdateServiceImpl_scheduleFrequency', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties() ->
    openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties([]).

openapi_com_adobe_cq_screens_offlinecontent_impl_bulk_offline_update_service_impl_properties(Fields) ->
  Default = [ {'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.projectPath', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'com.adobe.cq.screens.offlinecontent.impl.BulkOfflineUpdateServiceImpl.scheduleFrequency', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

