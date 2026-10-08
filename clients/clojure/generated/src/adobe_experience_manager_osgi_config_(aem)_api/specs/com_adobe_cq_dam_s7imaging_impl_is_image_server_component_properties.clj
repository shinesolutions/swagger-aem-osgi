(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-s7imaging-impl-is-image-server-component-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-s7imaging-impl-is-image-server-component-properties-data
  {
   (ds/opt :TcpPort) config-node-property-string-spec
   (ds/opt :AllowRemoteAccess) config-node-property-boolean-spec
   (ds/opt :MaxRenderRgnPixels) config-node-property-string-spec
   (ds/opt :MaxMessageSize) config-node-property-string-spec
   (ds/opt :RandomAccessUrlTimeout) config-node-property-integer-spec
   (ds/opt :WorkerThreads) config-node-property-integer-spec
   })

(def com-adobe-cq-dam-s7imaging-impl-is-image-server-component-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-s7imaging-impl-is-image-server-component-properties
     :spec com-adobe-cq-dam-s7imaging-impl-is-image-server-component-properties-data}))
