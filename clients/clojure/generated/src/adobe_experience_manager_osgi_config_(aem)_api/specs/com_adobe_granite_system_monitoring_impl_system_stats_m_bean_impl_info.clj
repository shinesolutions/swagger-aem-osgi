(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-properties-spec
   })

(def com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-info-spec
  (ds/spec
    {:name ::com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-info
     :spec com-adobe-granite-system-monitoring-impl-system-stats-m-bean-impl-info-data}))
