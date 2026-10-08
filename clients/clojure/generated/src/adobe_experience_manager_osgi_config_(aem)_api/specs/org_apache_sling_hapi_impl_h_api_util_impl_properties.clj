(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hapi-impl-h-api-util-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hapi-impl-h-api-util-impl-properties-data
  {
   (ds/opt :orgapacheslinghapitoolsresourcetype) config-node-property-string-spec
   (ds/opt :orgapacheslinghapitoolscollectionresourcetype) config-node-property-string-spec
   (ds/opt :orgapacheslinghapitoolssearchpaths) config-node-property-array-spec
   (ds/opt :orgapacheslinghapitoolsexternalurl) config-node-property-string-spec
   (ds/opt :orgapacheslinghapitoolsenabled) config-node-property-boolean-spec
   })

(def org-apache-sling-hapi-impl-h-api-util-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-hapi-impl-h-api-util-impl-properties
     :spec org-apache-sling-hapi-impl-h-api-util-impl-properties-data}))
