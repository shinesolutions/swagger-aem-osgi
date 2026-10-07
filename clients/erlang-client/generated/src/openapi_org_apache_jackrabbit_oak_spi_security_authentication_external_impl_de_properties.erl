-module(openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties).

-export([encode/1]).

-export_type([openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties/0]).

-type openapi_org_apache_jackrabbit_oak_spi_security_authentication_external_impl_de_properties() ::
    #{ 'handler_name' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'user_expirationTime' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'user_autoMembership' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'user_propertyMapping' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'user_pathPrefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'user_membershipExpTime' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'user_membershipNestingDepth' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'user_dynamicMembership' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'user_disableMissing' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'group_expirationTime' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'group_autoMembership' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'group_propertyMapping' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'group_pathPrefix' => openapi_config_node_property_string:openapi_config_node_property_string(),
       'enableRFC7613UsercaseMappedProfile' => openapi_config_node_property_boolean:openapi_config_node_property_boolean()
     }.

encode(#{ 'handler_name' := HandlerName,
          'user_expirationTime' := UserExpirationTime,
          'user_autoMembership' := UserAutoMembership,
          'user_propertyMapping' := UserPropertyMapping,
          'user_pathPrefix' := UserPathPrefix,
          'user_membershipExpTime' := UserMembershipExpTime,
          'user_membershipNestingDepth' := UserMembershipNestingDepth,
          'user_dynamicMembership' := UserDynamicMembership,
          'user_disableMissing' := UserDisableMissing,
          'group_expirationTime' := GroupExpirationTime,
          'group_autoMembership' := GroupAutoMembership,
          'group_propertyMapping' := GroupPropertyMapping,
          'group_pathPrefix' := GroupPathPrefix,
          'enableRFC7613UsercaseMappedProfile' := EnableRFC7613UsercaseMappedProfile
        }) ->
    #{ 'handler.name' => HandlerName,
       'user.expirationTime' => UserExpirationTime,
       'user.autoMembership' => UserAutoMembership,
       'user.propertyMapping' => UserPropertyMapping,
       'user.pathPrefix' => UserPathPrefix,
       'user.membershipExpTime' => UserMembershipExpTime,
       'user.membershipNestingDepth' => UserMembershipNestingDepth,
       'user.dynamicMembership' => UserDynamicMembership,
       'user.disableMissing' => UserDisableMissing,
       'group.expirationTime' => GroupExpirationTime,
       'group.autoMembership' => GroupAutoMembership,
       'group.propertyMapping' => GroupPropertyMapping,
       'group.pathPrefix' => GroupPathPrefix,
       'enableRFC7613UsercaseMappedProfile' => EnableRFC7613UsercaseMappedProfile
     }.
