(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties-data
  {
   (ds/opt :adaptercondition) config-node-property-string-spec
   (ds/opt :taskmanageradmingroups) config-node-property-array-spec
   })

(def com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties
     :spec com-adobe-granite-taskmanagement-impl-service-task-manager-adapter-factor-properties-data}))
