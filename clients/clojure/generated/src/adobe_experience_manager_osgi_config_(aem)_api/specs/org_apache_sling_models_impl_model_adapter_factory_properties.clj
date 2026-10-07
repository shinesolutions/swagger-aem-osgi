(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-models-impl-model-adapter-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-models-impl-model-adapter-factory-properties-data
  {
   (ds/opt :osgihttpwhiteboardlistener) config-node-property-string-spec
   (ds/opt :osgihttpwhiteboardcontextselect) config-node-property-string-spec
   (ds/opt :maxrecursiondepth) config-node-property-integer-spec
   (ds/opt :cleanupjobperiod) config-node-property-integer-spec
   })

(def org-apache-sling-models-impl-model-adapter-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-models-impl-model-adapter-factory-properties
     :spec org-apache-sling-models-impl-model-adapter-factory-properties-data}))
