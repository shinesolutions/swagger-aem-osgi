(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties-data
  {
   (ds/opt :hctags) config-node-property-array-spec
   })

(def com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties
     :spec com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties-data}))
