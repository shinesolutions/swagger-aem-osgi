(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-auth-impl-cug-cug-support-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-auth-impl-cug-cug-support-impl-properties-data
  {
   (ds/opt :cugexemptedprincipals) config-node-property-array-spec
   (ds/opt :cugenabled) config-node-property-boolean-spec
   (ds/opt :cugprincipalsregex) config-node-property-string-spec
   (ds/opt :cugprincipalsreplacement) config-node-property-string-spec
   })

(def com-day-cq-auth-impl-cug-cug-support-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-auth-impl-cug-cug-support-impl-properties
     :spec com-day-cq-auth-impl-cug-cug-support-impl-properties-data}))
