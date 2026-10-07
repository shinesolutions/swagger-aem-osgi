(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-resource-collection-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-resource-collection-servlet-properties-data
  {
   (ds/opt :slingservletresourceTypes) config-node-property-array-spec
   (ds/opt :slingservletmethods) config-node-property-string-spec
   (ds/opt :slingservletselectors) config-node-property-string-spec
   (ds/opt :downloadconfig) config-node-property-string-spec
   (ds/opt :viewselector) config-node-property-string-spec
   (ds/opt :send_email) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-servlet-resource-collection-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-resource-collection-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-resource-collection-servlet-properties-data}))
