(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-collection-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-collection-servlet-properties-data
  {
   (ds/opt :cqdambatchcollectionproperties) config-node-property-array-spec
   (ds/opt :cqdambatchcollectionmaxcollections) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-servlet-collection-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-collection-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-collection-servlet-properties-data}))
