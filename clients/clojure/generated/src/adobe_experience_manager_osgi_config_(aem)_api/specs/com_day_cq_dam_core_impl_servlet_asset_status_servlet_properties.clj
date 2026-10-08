(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-servlet-asset-status-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-servlet-asset-status-servlet-properties-data
  {
   (ds/opt :cqdambatchstatusmaxassets) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-servlet-asset-status-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-servlet-asset-status-servlet-properties
     :spec com-day-cq-dam-core-impl-servlet-asset-status-servlet-properties-data}))
