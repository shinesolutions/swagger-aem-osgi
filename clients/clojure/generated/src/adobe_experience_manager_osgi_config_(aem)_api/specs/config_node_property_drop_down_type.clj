(ns adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down-type
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs. :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs. :refer :all]
            )
  (:import (java.io File)))


(def config-node-property-drop-down-type-data
  {
   (ds/opt :labels) any-type-spec
   (ds/opt :values) any-type-spec
   })

(def config-node-property-drop-down-type-spec
  (ds/spec
    {:name ::config-node-property-drop-down-type
     :spec config-node-property-drop-down-type-data}))
