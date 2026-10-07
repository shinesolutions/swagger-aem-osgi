-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties).

-include("openapi.hrl").

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties/0]).

-export([openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties() ::
  [ {'pattern_time', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_newline', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_dayOfMonth', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_month', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_year', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_date', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_dateTime', openapi_config_node_property_string:openapi_config_node_property_string() }
  | {'pattern_email', openapi_config_node_property_string:openapi_config_node_property_string() }
  ].


openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties() ->
    openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties([]).

openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties(Fields) ->
  Default = [ {'pattern.time', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.newline', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.dayOfMonth', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.month', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.year', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.date', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.dateTime', openapi_config_node_property_string:openapi_config_node_property_string() }
            , {'pattern.email', openapi_config_node_property_string:openapi_config_node_property_string() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

