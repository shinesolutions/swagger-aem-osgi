-module(openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info/0]).

-export([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info/1]).

-export_type([openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info/0]).

-type openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties:openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties() }
  ].


openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info() ->
    openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info([]).

openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties:openapi_org_apache_sling_hc_core_impl_servlet_result_txt_verbose_serializer_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

