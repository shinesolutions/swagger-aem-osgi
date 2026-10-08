(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-properties-data
  {
   (ds/opt :orgapacheslingscriptingjavascriptrhinooptLevel) config-node-property-integer-spec
   })

(def org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-properties-spec
  (ds/spec
    {:name ::org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-properties
     :spec org-apache-sling-scripting-javascript-internal-rhino-java-script-engine-fa-properties-data}))
