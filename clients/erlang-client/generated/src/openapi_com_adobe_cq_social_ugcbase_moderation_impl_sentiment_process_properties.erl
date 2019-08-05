-module(openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties).

-export([encode/1]).

-export_type([openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties/0]).

-type openapi_com_adobe_cq_social_ugcbase_moderation_impl_sentiment_process_properties() ::
    #{ 'watchwords_positive' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'watchwords_negative' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'watchwords_path' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'sentiment_path' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'watchwords_positive' := WatchwordsPositive,
          'watchwords_negative' := WatchwordsNegative,
          'watchwords_path' := WatchwordsPath,
          'sentiment_path' := SentimentPath
        }) ->
    #{ 'watchwords.positive' => WatchwordsPositive,
       'watchwords.negative' => WatchwordsNegative,
       'watchwords.path' => WatchwordsPath,
       'sentiment.path' => SentimentPath
     }.
