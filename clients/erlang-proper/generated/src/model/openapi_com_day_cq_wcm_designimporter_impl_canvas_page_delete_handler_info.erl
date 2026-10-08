-module(openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info/0]).

-export([openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info/1]).

-export_type([openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info/0]).

-type openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties:openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties() }
  ].


openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info() ->
    openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info([]).

openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties:openapi_com_day_cq_wcm_designimporter_impl_canvas_page_delete_handler_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

