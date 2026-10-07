(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-workflow-impl-email-task-e-mail-notification-service-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-workflow-impl-email-task-e-mail-notification-service-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-workflow-impl-email-task-e-mail-notification-service-properties-spec
   })

(def com-day-cq-workflow-impl-email-task-e-mail-notification-service-info-spec
  (ds/spec
    {:name ::com-day-cq-workflow-impl-email-task-e-mail-notification-service-info
     :spec com-day-cq-workflow-impl-email-task-e-mail-notification-service-info-data}))
