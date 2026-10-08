(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties-data
  {
   (ds/opt :maxConnections) config-node-property-string-spec
   (ds/opt :maxRequests) config-node-property-string-spec
   (ds/opt :requestTimeout) config-node-property-string-spec
   (ds/opt :logDir) config-node-property-string-spec
   })

(def com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties-spec
  (ds/spec
    {:name ::com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties
     :spec com-adobe-xmp-worker-files-ncomm-xmp-files-n-comm-properties-data}))
