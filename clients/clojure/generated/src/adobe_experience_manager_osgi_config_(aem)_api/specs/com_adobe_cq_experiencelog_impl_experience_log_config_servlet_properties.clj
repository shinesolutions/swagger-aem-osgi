(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties-data
  {
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :disabledForGroups) config-node-property-array-spec
   })

(def com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties
     :spec com-adobe-cq-experiencelog-impl-experience-log-config-servlet-properties-data}))
