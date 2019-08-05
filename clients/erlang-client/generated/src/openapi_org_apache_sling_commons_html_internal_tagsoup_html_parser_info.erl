-module(openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info).

-export([encode/1]).

-export_type([openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info/0]).

-type openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_info() ::
    #{ 'pid' => binary(),
       'title' => binary(),
       'description' => binary(),
       'properties' => openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties:openapi_org_apache_sling_commons_html_internal_tagsoup_html_parser_properties()
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
