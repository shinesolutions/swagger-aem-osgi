# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJob
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, cq_dam_webdav_version_linking_enable: nil, cq_dam_webdav_version_linking_scheduler_period: nil, cq_dam_webdav_version_linking_staging_timeout: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.dam.webdav.impl.io.DamWebdavVersionLinkingJob',
          type: OpenapiClient::Models::ComAdobeCqDamWebdavImplIoDamWebdavVersionLinkingJobInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'cq.dam.webdav.version.linking.enable' => cq_dam_webdav_version_linking_enable, 'cq.dam.webdav.version.linking.scheduler.period' => cq_dam_webdav_version_linking_scheduler_period, 'cq.dam.webdav.version.linking.staging.timeout' => cq_dam_webdav_version_linking_staging_timeout }
        )
      end
    end
  end
end
