(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-properties-data
  {
   (ds/opt :slingpostoperation) config-node-property-string-spec
   (ds/opt :slingservletmethods) config-node-property-string-spec
   })

(def com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-properties
     :spec com-day-cq-dam-s7dam-common-post-servlets-set-modify-handler-properties-data}))
