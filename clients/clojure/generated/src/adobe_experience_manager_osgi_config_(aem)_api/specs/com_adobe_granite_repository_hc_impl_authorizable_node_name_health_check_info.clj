(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-properties-spec
   })

(def com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-info-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-info
     :spec com-adobe-granite-repository-hc-impl-authorizable-node-name-health-check-info-data}))
