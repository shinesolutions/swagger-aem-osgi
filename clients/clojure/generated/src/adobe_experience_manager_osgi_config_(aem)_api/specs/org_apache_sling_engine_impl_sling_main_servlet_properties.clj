(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-sling-main-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-sling-main-servlet-properties-data
  {
   (ds/opt :slingmaxcalls) config-node-property-integer-spec
   (ds/opt :slingmaxinclusions) config-node-property-integer-spec
   (ds/opt :slingtraceallow) config-node-property-boolean-spec
   (ds/opt :slingmaxrecordrequests) config-node-property-integer-spec
   (ds/opt :slingstorepatternrequests) config-node-property-array-spec
   (ds/opt :slingserverinfo) config-node-property-string-spec
   (ds/opt :slingadditionalresponseheaders) config-node-property-array-spec
   })

(def org-apache-sling-engine-impl-sling-main-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-sling-main-servlet-properties
     :spec org-apache-sling-engine-impl-sling-main-servlet-properties-data}))
