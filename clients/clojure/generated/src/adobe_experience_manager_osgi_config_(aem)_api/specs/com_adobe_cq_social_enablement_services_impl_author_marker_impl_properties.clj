(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties
     :spec com-adobe-cq-social-enablement-services-impl-author-marker-impl-properties-data}))
