(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-properties-data
  {
   (ds/opt :cacheenable) config-node-property-boolean-spec
   (ds/opt :cacherootPaths) config-node-property-array-spec
   (ds/opt :cachemaxSize) config-node-property-integer-spec
   (ds/opt :cachemaxEntries) config-node-property-integer-spec
   })

(def com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-properties
     :spec com-adobe-cq-dam-s7imaging-impl-ps-platform-server-servlet-properties-data}))
