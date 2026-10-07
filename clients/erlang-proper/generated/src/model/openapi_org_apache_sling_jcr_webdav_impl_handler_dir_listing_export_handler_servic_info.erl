-module(openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info/0]).

-export([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info() ::
  [ {'pid', binary() }
  | {'title', binary() }
  | {'description', binary() }
  | {'properties', openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties:openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties() }
  ].


openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info() ->
    openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info([]).

openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_info(Fields) ->
  Default = [ {'pid', binary() }
            , {'title', binary() }
            , {'description', binary() }
            , {'properties', openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties:openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

