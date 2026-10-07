(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-properties-data
  {
   (ds/opt :archivingenabled) config-node-property-boolean-spec
   (ds/opt :schedulerexpression) config-node-property-string-spec
   (ds/opt :archivesincedayscompleted) config-node-property-integer-spec
   })

(def com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-properties
     :spec com-adobe-granite-taskmanagement-impl-jcr-task-archive-service-properties-data}))
