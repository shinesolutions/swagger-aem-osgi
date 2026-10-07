(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-parameters-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-parameters-properties-data
  {
   (ds/opt :slingdefaultparameterencoding) config-node-property-string-spec
   (ds/opt :slingdefaultmaxparameters) config-node-property-integer-spec
   (ds/opt :filelocation) config-node-property-string-spec
   (ds/opt :filethreshold) config-node-property-integer-spec
   (ds/opt :filemax) config-node-property-integer-spec
   (ds/opt :requestmax) config-node-property-integer-spec
   (ds/opt :slingdefaultparametercheckForAdditionalContainerParameters) config-node-property-boolean-spec
   })

(def org-apache-sling-engine-parameters-properties-spec
  (ds/spec
    {:name ::org-apache-sling-engine-parameters-properties
     :spec org-apache-sling-engine-parameters-properties-data}))
