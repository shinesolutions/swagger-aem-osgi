-module(openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties/0]).

-export([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties/1]).

-export_type([openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties/0]).

-type openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties() ::
  [ {'cq_social_content_fragments_services_enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
  | {'cq_social_content_fragments_services_waitTimeSeconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
  ].


openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties() ->
    openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties([]).

openapi_com_adobe_cq_social_content_fragments_services_impl_communities_fragmen_properties(Fields) ->
  Default = [ {'cq.social.content.fragments.services.enabled', openapi_config_node_property_boolean:openapi_config_node_property_boolean() }
            , {'cq.social.content.fragments.services.waitTimeSeconds', openapi_config_node_property_integer:openapi_config_node_property_integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

