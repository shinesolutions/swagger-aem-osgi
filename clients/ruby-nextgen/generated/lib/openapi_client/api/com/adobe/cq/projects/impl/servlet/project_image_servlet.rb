# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqProjectsImplServletProjectImageServlet
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, image_quality: nil, image_supported_resolutions: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.projects.impl.servlet.ProjectImageServlet',
          type: OpenapiClient::Models::ComAdobeCqProjectsImplServletProjectImageServletInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'image.quality' => image_quality, 'image.supported.resolutions' => image_supported_resolutions }
        )
      end
    end
  end
end
