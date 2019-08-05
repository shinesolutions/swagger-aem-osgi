-module(openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info/0]).

-type openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties:openapi_com_adobe_cq_cdn_rewriter_impl_cdn_rewriter_properties()
     }.

encode(#{ 'pid' := Pid,
          'title' := Title,
          'description' := Description,
          'properties' := Properties
        }) ->
    #{ 'pid' => Pid,
       'title' => Title,
       'description' => Description,
       'properties' => Properties
     }.
