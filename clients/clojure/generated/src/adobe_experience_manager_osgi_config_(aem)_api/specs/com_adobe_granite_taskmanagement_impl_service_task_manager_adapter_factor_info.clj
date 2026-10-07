(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties-spec
   })

(def com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-info-spec
  (ds/spec
    {:name ::com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-info
     :spec com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-info-data}))
