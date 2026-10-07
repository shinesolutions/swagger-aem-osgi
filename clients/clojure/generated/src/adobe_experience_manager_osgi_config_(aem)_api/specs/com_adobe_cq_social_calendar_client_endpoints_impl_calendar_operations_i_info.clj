(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-properties-spec
   })

(def com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-info
     :spec com-adobe-cq-social-calendar-client-endpoints-impl-calendar-operations-i-info-data}))
