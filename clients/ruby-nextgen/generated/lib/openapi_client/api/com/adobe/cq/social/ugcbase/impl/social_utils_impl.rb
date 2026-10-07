# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqSocialUgcbaseImplSocialUtilsImpl
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, legacy_cloud_ugc_path_mapping: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.social.ugcbase.impl.SocialUtilsImpl',
          type: OpenapiClient::Models::ComAdobeCqSocialUgcbaseImplSocialUtilsImplInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'legacyCloudUGCPathMapping' => legacy_cloud_ugc_path_mapping }
        )
      end
    end
  end
end
