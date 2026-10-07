(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-properties-data
  {
   (ds/opt :includedPaths) config-node-property-array-spec
   (ds/opt :enableAsyncObserver) config-node-property-boolean-spec
   (ds/opt :observerQueueSize) config-node-property-integer-spec
   })

(def org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-properties-spec
  (ds/spec
    {:name ::org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-properties
     :spec org-apache-jackrabbit-oak-plugins-document-secondary-secondary-store-cac-properties-data}))
