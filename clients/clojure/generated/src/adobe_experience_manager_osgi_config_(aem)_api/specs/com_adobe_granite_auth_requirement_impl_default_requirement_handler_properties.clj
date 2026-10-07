(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-requirement-impl-default-requirement-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-requirement-impl-default-requirement-handler-properties-data
  {
   (ds/opt :supportedPaths) config-node-property-array-spec
   })

(def com-adobe-granite-auth-requirement-impl-default-requirement-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-requirement-impl-default-requirement-handler-properties
     :spec com-adobe-granite-auth-requirement-impl-default-requirement-handler-properties-data}))
