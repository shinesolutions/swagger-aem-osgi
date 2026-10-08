(ns adobe-experience-manager-osgi-config-(aem)-api.specs.messaging-user-component-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def messaging-user-component-factory-properties-data
  {
   (ds/opt :priority) config-node-property-integer-spec
   })

(def messaging-user-component-factory-properties-spec
  (ds/spec
    {:name ::messaging-user-component-factory-properties
     :spec messaging-user-component-factory-properties-data}))
