(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-bundles-hc-impl-code-cache-health-check-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-bundles-hc-impl-code-cache-health-check-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-bundles-hc-impl-code-cache-health-check-properties-spec
   })

(def com-adobe-granite-bundles-hc-impl-code-cache-health-check-info-spec
  (ds/spec
    {:name ::com-adobe-granite-bundles-hc-impl-code-cache-health-check-info
     :spec com-adobe-granite-bundles-hc-impl-code-cache-health-check-info-data}))
