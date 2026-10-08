(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-indd-process-indd-media-extract-process-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-indd-process-indd-media-extract-process-properties-data
  {
   (ds/opt :processlabel) config-node-property-string-spec
   (ds/opt :cqdaminddpagesregex) config-node-property-string-spec
   (ds/opt :idsjobdecoupled) config-node-property-boolean-spec
   (ds/opt :idsjobworkflowmodel) config-node-property-string-spec
   })

(def com-day-cq-dam-indd-process-indd-media-extract-process-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-indd-process-indd-media-extract-process-properties
     :spec com-day-cq-dam-indd-process-indd-media-extract-process-properties-data}))
