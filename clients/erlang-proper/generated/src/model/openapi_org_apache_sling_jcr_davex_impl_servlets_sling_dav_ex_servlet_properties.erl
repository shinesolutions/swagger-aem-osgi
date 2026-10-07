-module(openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties).

-include("openapi.hrl").

-export([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties/0]).

-export([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties/1]).

-export_type([openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties/0]).

-type openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties() ::
  [ {'alias', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'dav_create_absolute_uri', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'dav_protectedhandlers', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties() ->
    openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties([]).

openapi_org_apache_sling_jcr_davex_impl_servlets_sling_dav_ex_servlet_properties(Fields) ->
  Default = [ {'alias', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'dav.create-absolute-uri', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'dav.protectedhandlers', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

