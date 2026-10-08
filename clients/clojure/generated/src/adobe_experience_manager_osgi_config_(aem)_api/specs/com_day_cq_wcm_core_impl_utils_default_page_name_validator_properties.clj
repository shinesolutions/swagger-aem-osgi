(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-utils-default-page-name-validator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-utils-default-page-name-validator-properties-data
  {
   (ds/opt :nonValidChars) config-node-property-string-spec
   })

(def com-day-cq-wcm-core-impl-utils-default-page-name-validator-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-utils-default-page-name-validator-properties
     :spec com-day-cq-wcm-core-impl-utils-default-page-name-validator-properties-data}))
