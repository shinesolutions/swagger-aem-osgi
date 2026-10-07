-module(openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties).

-export([encode/1]).

-export_type([openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties/0]).

-type openapi_org_apache_sling_servlets_post_impl_sling_post_servlet_properties() ::
    #{ 'servlet_post_dateFormats' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'servlet_post_nodeNameHints' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'servlet_post_nodeNameMaxLength' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'servlet_post_checkinNewVersionableNodes' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'servlet_post_autoCheckout' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'servlet_post_autoCheckin' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'servlet_post_ignorePattern' => openapi_config_node_property_string:openapi_config_node_property_string()
     }.

encode(#{ 'servlet_post_dateFormats' := ServletPostDateFormats,
          'servlet_post_nodeNameHints' := ServletPostNodeNameHints,
          'servlet_post_nodeNameMaxLength' := ServletPostNodeNameMaxLength,
          'servlet_post_checkinNewVersionableNodes' := ServletPostCheckinNewVersionableNodes,
          'servlet_post_autoCheckout' := ServletPostAutoCheckout,
          'servlet_post_autoCheckin' := ServletPostAutoCheckin,
          'servlet_post_ignorePattern' := ServletPostIgnorePattern
        }) ->
    #{ 'servlet.post.dateFormats' => ServletPostDateFormats,
       'servlet.post.nodeNameHints' => ServletPostNodeNameHints,
       'servlet.post.nodeNameMaxLength' => ServletPostNodeNameMaxLength,
       'servlet.post.checkinNewVersionableNodes' => ServletPostCheckinNewVersionableNodes,
       'servlet.post.autoCheckout' => ServletPostAutoCheckout,
       'servlet.post.autoCheckin' => ServletPostAutoCheckin,
       'servlet.post.ignorePattern' => ServletPostIgnorePattern
     }.
