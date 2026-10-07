-module(openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties/0]).

-type openapi_com_adobe_cq_social_commons_emailreply_impl_email_quoted_text_patterns_imp_properties() ::
    #{ 'pattern_time' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_newline' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_dayOfMonth' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_month' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_year' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_date' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_dateTime' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'pattern_email' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'pattern_time' := PatternTime,
          'pattern_newline' := PatternNewline,
          'pattern_dayOfMonth' := PatternDayOfMonth,
          'pattern_month' := PatternMonth,
          'pattern_year' := PatternYear,
          'pattern_date' := PatternDate,
          'pattern_dateTime' := PatternDateTime,
          'pattern_email' := PatternEmail
        }) ->
    #{ 'pattern.time' => PatternTime,
       'pattern.newline' => PatternNewline,
       'pattern.dayOfMonth' => PatternDayOfMonth,
       'pattern.month' => PatternMonth,
       'pattern.year' => PatternYear,
       'pattern.date' => PatternDate,
       'pattern.dateTime' => PatternDateTime,
       'pattern.email' => PatternEmail
     }.
