(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-resourcemerger-picker-overriding-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-resourcemerger-picker-overriding-properties-data
  {
   (ds/opt :mergeroot) config-node-property-string-spec
   (ds/opt :mergereadOnly) config-node-property-boolean-spec
   })

(def org-apache-sling-resourcemerger-picker-overriding-properties-spec
  (ds/spec
    {:name ::org-apache-sling-resourcemerger-picker-overriding-properties
     :spec org-apache-sling-resourcemerger-picker-overriding-properties-data}))
