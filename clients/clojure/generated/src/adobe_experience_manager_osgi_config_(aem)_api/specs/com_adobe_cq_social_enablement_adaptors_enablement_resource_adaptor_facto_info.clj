(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-properties-spec
   })

(def com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-info
     :spec com-adobe-cq-social-enablement-adaptors-enablement-resource-adaptor-facto-info-data}))
