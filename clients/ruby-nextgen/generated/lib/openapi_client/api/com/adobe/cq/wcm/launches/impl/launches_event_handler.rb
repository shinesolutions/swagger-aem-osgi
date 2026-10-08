# frozen_string_literal: true

module OpenapiClient
  module Api
    class ComAdobeCqWcmLaunchesImplLaunchesEventHandler
      def initialize(connection)
        @connection = connection
      end

      def create(post: nil, apply: nil, delete: nil, action: nil, location: nil, propertylist: nil, event_filter: nil, launches_eventhandler_threadpool_maxsize: nil, launches_eventhandler_threadpool_priority: nil, launches_eventhandler_updatelastmodification: nil)
        @connection.call(
          :POST,
          '/system/console/configMgr/com.adobe.cq.wcm.launches.impl.LaunchesEventHandler',
          type: OpenapiClient::Models::ComAdobeCqWcmLaunchesImplLaunchesEventHandlerInfo,
          auth: ['aemAuth'],
          query: { 'post' => post, 'apply' => apply, 'delete' => delete, 'action' => action, '$location' => location, 'propertylist' => propertylist, 'event.filter' => event_filter, 'launches.eventhandler.threadpool.maxsize' => launches_eventhandler_threadpool_maxsize, 'launches.eventhandler.threadpool.priority' => launches_eventhandler_threadpool_priority, 'launches.eventhandler.updatelastmodification' => launches_eventhandler_updatelastmodification }
        )
      end
    end
  end
end
