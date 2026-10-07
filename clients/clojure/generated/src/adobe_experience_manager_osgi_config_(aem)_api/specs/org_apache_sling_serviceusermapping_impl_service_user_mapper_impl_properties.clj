(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-properties-data
  {
   (ds/opt :usermapping) config-node-property-array-spec
   (ds/opt :userdefault) config-node-property-string-spec
   (ds/opt :userenabledefaultmapping) config-node-property-boolean-spec
   (ds/opt :requirevalidation) config-node-property-boolean-spec
   })

(def org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-properties-spec
  (ds/spec
    {:name ::org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-properties
     :spec org-apache-sling-serviceusermapping-impl-service-user-mapper-impl-properties-data}))
