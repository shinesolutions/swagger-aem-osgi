(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-jsp-jsp-script-engine-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-jsp-jsp-script-engine-factory-properties-data
  {
   (ds/opt :jaspercompilerTargetVM) config-node-property-string-spec
   (ds/opt :jaspercompilerSourceVM) config-node-property-string-spec
   (ds/opt :jasperclassdebuginfo) config-node-property-boolean-spec
   (ds/opt :jasperenablePooling) config-node-property-boolean-spec
   (ds/opt :jasperieClassId) config-node-property-string-spec
   (ds/opt :jaspergenStringAsCharArray) config-node-property-boolean-spec
   (ds/opt :jasperkeepgenerated) config-node-property-boolean-spec
   (ds/opt :jaspermappedfile) config-node-property-boolean-spec
   (ds/opt :jaspertrimSpaces) config-node-property-boolean-spec
   (ds/opt :jasperdisplaySourceFragments) config-node-property-boolean-spec
   (ds/opt :defaultissession) config-node-property-boolean-spec
   })

(def org-apache-sling-scripting-jsp-jsp-script-engine-factory-properties-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-jsp-jsp-script-engine-factory-properties
     :spec org-apache-sling-scripting-jsp-jsp-script-engine-factory-properties-data}))
