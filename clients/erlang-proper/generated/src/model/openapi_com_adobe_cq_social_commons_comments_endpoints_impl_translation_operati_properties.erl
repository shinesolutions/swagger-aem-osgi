-module(openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties/0]).

-export([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties/0]).

-type openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties() ::
  [ {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties() ->
    openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties([]).

openapi_com_adobe_cq_social_commons_comments_endpoints_impl_translation_operati_properties(Fields) ->
  Default = [ {'fieldWhitelist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'attachmentTypeBlacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

