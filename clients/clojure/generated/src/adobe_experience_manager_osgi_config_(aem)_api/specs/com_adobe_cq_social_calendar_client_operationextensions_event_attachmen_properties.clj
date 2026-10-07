(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-properties-data
  {
   (ds/opt :attachmentTypeBlacklist) config-node-property-string-spec
   (ds/opt :extensionorder) config-node-property-integer-spec
   })

(def com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-properties
     :spec com-adobe-cq-social-calendar-client-operationextensions-event-attachmen-properties-data}))
