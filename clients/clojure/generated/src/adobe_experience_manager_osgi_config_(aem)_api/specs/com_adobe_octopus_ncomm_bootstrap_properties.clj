(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-octopus-ncomm-bootstrap-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-octopus-ncomm-bootstrap-properties-data
  {
   (ds/opt :maxConnections) config-node-property-integer-spec
   (ds/opt :maxRequests) config-node-property-integer-spec
   (ds/opt :requestTimeout) config-node-property-integer-spec
   (ds/opt :requestRetries) config-node-property-integer-spec
   (ds/opt :launchTimeout) config-node-property-integer-spec
   })

(def com-adobe-octopus-ncomm-bootstrap-properties-spec
  (ds/spec
    {:name ::com-adobe-octopus-ncomm-bootstrap-properties
     :spec com-adobe-octopus-ncomm-bootstrap-properties-data}))
