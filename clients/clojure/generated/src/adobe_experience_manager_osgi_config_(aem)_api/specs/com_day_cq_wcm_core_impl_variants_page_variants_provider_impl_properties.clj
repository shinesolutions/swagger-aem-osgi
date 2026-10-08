(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-properties-data
  {
   (ds/opt :defaultexternalizerdomain) config-node-property-string-spec
   })

(def com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-properties
     :spec com-day-cq-wcm-core-impl-variants-page-variants-provider-impl-properties-data}))
