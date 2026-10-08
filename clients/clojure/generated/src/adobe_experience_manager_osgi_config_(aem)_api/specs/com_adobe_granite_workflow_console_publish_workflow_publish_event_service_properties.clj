(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-console-publish-workflow-publish-event-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-console-publish-workflow-publish-event-service-properties-data
  {
   (ds/opt :graniteworkflowWorkflowPublishEventServiceenabled) config-node-property-boolean-spec
   })

(def com-adobe-granite-workflow-console-publish-workflow-publish-event-service-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-console-publish-workflow-publish-event-service-properties
     :spec com-adobe-granite-workflow-console-publish-workflow-publish-event-service-properties-data}))
