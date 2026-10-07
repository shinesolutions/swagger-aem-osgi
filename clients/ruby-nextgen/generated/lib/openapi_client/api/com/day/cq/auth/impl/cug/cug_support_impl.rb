# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComDayCqAuthImplCugCugSupportImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cug_exempted_principals: nil, cug_enabled: nil, cug_principals_regex: nil, cug_principals_replacement: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.day.cq.auth.impl.cug.CugSupportImpl',
          type: OpenapiClient::Models::ComDayCqAuthImplCugCugSupportImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cug.exempted.principals' => cug_exempted_principals, 'cug.enabled' => cug_enabled, 'cug.principals.regex' => cug_principals_regex, 'cug.principals.replacement' => cug_principals_replacement }
        )
      end
    end
  end
end
