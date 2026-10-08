-module(openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info/0]).

-export([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info/1]).

-export_type([openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info/0]).

-type openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties:openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties() }
  ].


openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info() ->
    openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info([]).

openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties:openapi_com_adobe_cq_dam_s7imaging_impl_is_image_server_component_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

