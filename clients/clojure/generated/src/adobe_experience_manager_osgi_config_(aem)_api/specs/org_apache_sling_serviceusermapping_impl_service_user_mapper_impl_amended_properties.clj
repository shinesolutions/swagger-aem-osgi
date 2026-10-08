(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :usermapping) config-node-property-array-spec
   })

(def org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-properties-spec
  (ds/spec
    {:name ::org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-properties
     :spec org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-amended-properties-data}))
