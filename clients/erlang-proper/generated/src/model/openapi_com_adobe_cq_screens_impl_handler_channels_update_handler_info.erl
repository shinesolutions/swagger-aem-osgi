-module(openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info/0]).

-export([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info/1]).

-export_type([openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info/0]).

-type openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties:openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties() }
  ].


openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info() ->
    openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info([]).

openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties:openapi_com_adobe_cq_screens_impl_handler_channels_update_handler_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

