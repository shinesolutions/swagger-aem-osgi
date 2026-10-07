-module(openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info/0]).

-export([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties:openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties() }
  ].


openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info() ->
    openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info([]).

openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties:openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

