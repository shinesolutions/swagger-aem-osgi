(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties-data
  {
   (ds/opt :notifyonupdate) config-node-property-boolean-spec
   (ds/opt :notifyoncomplete) config-node-property-boolean-spec
   })

(def com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties-spec
  (ds/spec
    {:name ::com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties
     :spec com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties-data}))
