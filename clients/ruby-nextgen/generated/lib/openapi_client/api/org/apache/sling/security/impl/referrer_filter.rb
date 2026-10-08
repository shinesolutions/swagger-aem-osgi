# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheSlingSecurityImplReferrerFilter
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, allow_empty: nil, allow_hosts: nil, allow_hosts_regexp: nil, filter_methods: nil, exclude_agents_regexp: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.sling.security.impl.ReferrerFilter',
          type: OpenapiClient::Models::OrgApacheSlingSecurityImplReferrerFilterInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'allow.empty' => allow_empty, 'allow.hosts' => allow_hosts, 'allow.hosts.regexp' => allow_hosts_regexp, 'filter.methods' => filter_methods, 'exclude.agents.regexp' => exclude_agents_regexp }
        )
      end
    end
  end
end
