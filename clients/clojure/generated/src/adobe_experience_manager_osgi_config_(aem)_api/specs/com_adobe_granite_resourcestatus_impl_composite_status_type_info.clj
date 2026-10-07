(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-resourcestatus-impl-composite-status-type-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-resourcestatus-impl-composite-status-type-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-resourcestatus-impl-composite-status-type-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-resourcestatus-impl-composite-status-type-properties-spec
   })

(def com-adobe-granite-resourcestatus-impl-composite-status-type-info-spec
  (ds/spec
    {:name ::com-adobe-granite-resourcestatus-impl-composite-status-type-info
     :spec com-adobe-granite-resourcestatus-impl-composite-status-type-info-data}))
