(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-cert-impl-client-cert-auth-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-cert-impl-client-cert-auth-handler-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   })

(def com-adobe-granite-auth-cert-impl-client-cert-auth-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-cert-impl-client-cert-auth-handler-properties
     :spec com-adobe-granite-auth-cert-impl-client-cert-auth-handler-properties-data}))
