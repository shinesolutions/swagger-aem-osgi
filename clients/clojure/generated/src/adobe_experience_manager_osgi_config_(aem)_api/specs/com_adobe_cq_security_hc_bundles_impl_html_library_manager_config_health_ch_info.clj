(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-properties-spec
   })

(def com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-info-spec
  (ds/spec
    {:name ::com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-info
     :spec com-adobe-cq-security-hc-bundles-impl-html-library-manager-config-health-ch-info-data}))
