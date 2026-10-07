# frozen_string_literal: true

module OpenapiClient
  module Api
    class OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationConfigurationImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, permissions_jr2: nil, import_behavior: nil, read_paths: nil, administrative_principals: nil, configuration_ranking: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/org.apache.jackrabbit.oak.security.authorization.AuthorizationConfigurationImpl',
          type: OpenapiClient::Models::OrgApacheJackrabbitOakSecurityAuthorizationAuthorizationH90ce3ef0,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'permissionsJr2' => permissions_jr2, 'importBehavior' => import_behavior, 'readPaths' => read_paths, 'administrativePrincipals' => administrative_principals, 'configurationRanking' => configuration_ranking }
        )
      end
    end
  end
end
