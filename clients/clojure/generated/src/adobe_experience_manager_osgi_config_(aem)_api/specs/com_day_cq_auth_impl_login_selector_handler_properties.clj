(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-auth-impl-login-selector-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-auth-impl-login-selector-handler-properties-data
  {
   (ds/opt :path) config-node-property-string-spec
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :authloginselectormappings) config-node-property-array-spec
   (ds/opt :authloginselectorchangepwmappings) config-node-property-array-spec
   (ds/opt :authloginselectordefaultloginpage) config-node-property-string-spec
   (ds/opt :authloginselectordefaultchangepwpage) config-node-property-string-spec
   (ds/opt :authloginselectorhandle) config-node-property-array-spec
   (ds/opt :authloginselectorhandleallextensions) config-node-property-boolean-spec
   })

(def com-day-cq-auth-impl-login-selector-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-auth-impl-login-selector-handler-properties
     :spec com-day-cq-auth-impl-login-selector-handler-properties-data}))
