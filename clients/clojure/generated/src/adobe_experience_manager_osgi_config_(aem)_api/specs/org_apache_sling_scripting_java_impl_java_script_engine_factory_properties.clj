(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-java-impl-java-script-engine-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-java-impl-java-script-engine-factory-properties-data
  {
   (ds/opt :javaclassdebuginfo) config-node-property-boolean-spec
   (ds/opt :javajavaEncoding) config-node-property-string-spec
   (ds/opt :javacompilerSourceVM) config-node-property-string-spec
   (ds/opt :javacompilerTargetVM) config-node-property-string-spec
   })

(def org-apache-sling-scripting-java-impl-java-script-engine-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-java-impl-java-script-engine-factory-properties
     :spec org-apache-sling-scripting-java-impl-java-script-engine-factory-properties-data}))
