(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-properties-data
  {
   (ds/opt :isEnabled) config-node-property-boolean-spec
   })

(def com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-properties
     :spec com-day-cq-dam-core-impl-assethome-asset-home-page-configuration-properties-data}))
