(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-webdav-impl-io-asset-io-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-webdav-impl-io-asset-io-handler-properties-data
  {
   (ds/opt :serviceranking) config-node-property-integer-spec
   (ds/opt :pathPrefix) config-node-property-string-spec
   (ds/opt :createVersion) config-node-property-boolean-spec
   })

(def com-adobe-cq-dam-webdav-impl-io-asset-io-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-webdav-impl-io-asset-io-handler-properties
     :spec com-adobe-cq-dam-webdav-impl-io-asset-io-handler-properties-data}))
