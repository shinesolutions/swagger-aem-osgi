-module(openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties).

-include("openapi.hrl").

-export([openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties/0]).

-export([openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties/1]).

-export_type([openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties/0]).

-type openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties() ::
  [ {'default_attachment_type_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  | {'baseline_attachment_type_blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
  ].


openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties() ->
    openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties([]).

openapi_com_day_cq_wcm_foundation_security_impl_default_attachment_type_blacklist_properties(Fields) ->
  Default = [ {'default.attachment.type.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            , {'baseline.attachment.type.blacklist', openapi_config_node_property_array:openapi_config_node_property_array() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

