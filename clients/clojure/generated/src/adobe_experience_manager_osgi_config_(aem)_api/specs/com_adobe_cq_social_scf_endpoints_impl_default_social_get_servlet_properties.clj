(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-properties-data
  {
   (ds/opt :slingservletselectors) config-node-property-array-spec
   (ds/opt :slingservletextensions) config-node-property-string-spec
   })

(def com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-properties
     :spec com-adobe-cq-social-scf-endpoints-impl-default-social-get-servlet-properties-data}))
