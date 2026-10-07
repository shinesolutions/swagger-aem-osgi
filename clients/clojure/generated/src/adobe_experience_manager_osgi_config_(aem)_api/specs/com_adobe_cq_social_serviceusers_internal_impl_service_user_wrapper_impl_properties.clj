(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-properties-data
  {
   (ds/opt :enableFallback) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-properties
     :spec com-adobe-cq-social-serviceusers-internal-impl-service-user-wrapper-impl-properties-data}))
