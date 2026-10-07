(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties-data
  {
   (ds/opt :totalWidth) config-node-property-integer-spec
   (ds/opt :colWidthName) config-node-property-integer-spec
   (ds/opt :colWidthResult) config-node-property-integer-spec
   (ds/opt :colWidthTiming) config-node-property-integer-spec
   })

(def org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties-spec
  (ds/spec
    {:name ::org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties
     :spec org-apache-sling-hc-core-impl-servlet-result-txt-verbose-serializer-properties-data}))
