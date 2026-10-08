-module(openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info/0]).

-export([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info/1]).

-export_type([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info/0]).

-type openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties:openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties() }
  ].


openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info() ->
    openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info([]).

openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties:openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

