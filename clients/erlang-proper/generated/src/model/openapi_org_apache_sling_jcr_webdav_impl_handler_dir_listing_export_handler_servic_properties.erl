-module(openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties/0]).

-export([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties/1]).

-export_type([openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties/0]).

-type openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties() ::
  [ {'service_ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties() ->
    openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties([]).

openapi_org_apache_sling_jcr_webdav_impl_handler_dir_listing_export_handler_servic_properties(Fields) ->
  Default = [ {'service.ranking', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

