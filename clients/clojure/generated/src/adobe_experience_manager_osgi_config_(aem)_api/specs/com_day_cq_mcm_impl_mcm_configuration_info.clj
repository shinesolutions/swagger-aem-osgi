(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-impl-mcm-configuration-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-mcm-impl-mcm-configuration-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-mcm-impl-mcm-configuration-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-mcm-impl-mcm-configuration-properties-spec
   })

(def com-day-cq-mcm-impl-mcm-configuration-info-spec
  (ds/spec
    {:name ::com-day-cq-mcm-impl-mcm-configuration-info
     :spec com-day-cq-mcm-impl-mcm-configuration-info-data}))
