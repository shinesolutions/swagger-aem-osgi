(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-csrf-impl-csrf-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-csrf-impl-csrf-servlet-properties-data
  {
   (ds/opt :csrftokenexpiresin) config-node-property-integer-spec
   (ds/opt :slingauthrequirements) config-node-property-string-spec
   })

(def com-adobe-granite-csrf-impl-csrf-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-csrf-impl-csrf-servlet-properties
     :spec com-adobe-granite-csrf-impl-csrf-servlet-properties-data}))
