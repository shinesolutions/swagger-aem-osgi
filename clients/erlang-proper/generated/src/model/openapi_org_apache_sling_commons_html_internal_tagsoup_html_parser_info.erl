-module(openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info/0]).

-export([openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info/1]).

-export_type([openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info/0]).

-type openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties:openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties() }
  ].


openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info() ->
    openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info([]).

openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties:openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

