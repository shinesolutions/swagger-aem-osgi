(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-experiencelog-impl-experience-log-config-servlet-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-experiencelog-impl-experience-log-config-servlet-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties-spec
   (ds/opt :additionalProperties) string?
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-cq-experiencelog-impl-experience-log-config-servlet-info-spec
  (ds/spec
    {:name ::com-adobe-cq-experiencelog-impl-experience-log-config-servlet-info
     :spec com-adobe-cq-experiencelog-impl-experience-log-config-servlet-info-data}))
