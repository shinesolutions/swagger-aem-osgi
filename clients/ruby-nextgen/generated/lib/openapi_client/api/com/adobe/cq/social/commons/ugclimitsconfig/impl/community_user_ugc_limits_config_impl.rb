# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUserUGCLimitsConfigImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, enable: nil, ugc_limit: nil, ugc_limit_duration: nil, domains: nil, to_list: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.commons.ugclimitsconfig.impl.CommunityUserUGCLimitsConfigImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialCommonsUgclimitsconfigImplCommunityUseH5ac51c89,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'enable' => enable, 'UGCLimit' => ugc_limit, 'ugcLimitDuration' => ugc_limit_duration, 'domains' => domains, 'toList' => to_list }
        )
      end
    end
  end
end
