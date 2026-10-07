(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-metadata-get-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-metadata-get-servlet-properties-data
  {
   (ds/opt :slingservletresourceTypes) config-node-property-string-spec
   (ds/opt :slingservletmethods) config-node-property-string-spec
   (ds/opt :slingservletextensions) config-node-property-string-spec
   (ds/opt :slingservletselectors) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-servlet-metadata-get-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-metadata-get-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-metadata-get-servlet-properties-data}))
