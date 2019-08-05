-module(openapi_org_apache_felix_eventadmin_impl_event_admin_properties).

-export([encode/1]).

-export_type([openapi_org_apache_felix_eventadmin_impl_event_admin_properties/0]).

-type openapi_org_apache_felix_eventadmin_impl_event_admin_properties() ::
    #{ 'org_apache_felix_eventadmin_ThreadPoolSize' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_felix_eventadmin_AsyncToSyncThreadRatio' => openapi_config_node_property_float:openapi_config_node_property_float(),
       'org_apache_felix_eventadmin_Timeout' => openapi_config_node_property_integer:openapi_config_node_property_integer(),
       'org_apache_felix_eventadmin_RequireTopic' => openapi_config_node_property_boolean:openapi_config_node_property_boolean(),
       'org_apache_felix_eventadmin_IgnoreTimeout' => openapi_config_node_property_array:openapi_config_node_property_array(),
       'org_apache_felix_eventadmin_IgnoreTopic' => openapi_config_node_property_array:openapi_config_node_property_array()
     }.

encode(#{ 'org_apache_felix_eventadmin_ThreadPoolSize' := OrgApacheFelixEventadminThreadPoolSize,
          'org_apache_felix_eventadmin_AsyncToSyncThreadRatio' := OrgApacheFelixEventadminAsyncToSyncThreadRatio,
          'org_apache_felix_eventadmin_Timeout' := OrgApacheFelixEventadminTimeout,
          'org_apache_felix_eventadmin_RequireTopic' := OrgApacheFelixEventadminRequireTopic,
          'org_apache_felix_eventadmin_IgnoreTimeout' := OrgApacheFelixEventadminIgnoreTimeout,
          'org_apache_felix_eventadmin_IgnoreTopic' := OrgApacheFelixEventadminIgnoreTopic
        }) ->
    #{ 'org.apache.felix.eventadmin.ThreadPoolSize' => OrgApacheFelixEventadminThreadPoolSize,
       'org.apache.felix.eventadmin.AsyncToSyncThreadRatio' => OrgApacheFelixEventadminAsyncToSyncThreadRatio,
       'org.apache.felix.eventadmin.Timeout' => OrgApacheFelixEventadminTimeout,
       'org.apache.felix.eventadmin.RequireTopic' => OrgApacheFelixEventadminRequireTopic,
       'org.apache.felix.eventadmin.IgnoreTimeout' => OrgApacheFelixEventadminIgnoreTimeout,
       'org.apache.felix.eventadmin.IgnoreTopic' => OrgApacheFelixEventadminIgnoreTopic
     }.
