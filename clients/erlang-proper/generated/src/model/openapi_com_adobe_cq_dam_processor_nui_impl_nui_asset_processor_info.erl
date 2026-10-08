-module(openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info/0]).

-export([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info/1]).

-export_type([openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info/0]).

-type openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties:openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties() }
  ].


openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info() ->
    openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info([]).

openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties:openapi_com_adobe_cq_dam_processor_nui_impl_nui_asset_processor_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

