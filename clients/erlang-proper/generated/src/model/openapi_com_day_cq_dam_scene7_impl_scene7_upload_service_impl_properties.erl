-module(openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties/0]).

-export([openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties/1]).

-export_type([openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties/0]).

-type openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties() ::
  [ {'cq_dam_scene7_uploadservice_activejobtimeout_label', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  | {'cq_dam_scene7_uploadservice_connectionmaxperroute_label', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties() ->
    openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties([]).

openapi_com_day_cq_dam_scene7_impl_scene7_upload_service_impl_properties(Fields) ->
  Default = [ {'cq.dam.scene7.uploadservice.activejobtimeout.label', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            , {'cq.dam.scene7.uploadservice.connectionmaxperroute.label', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

