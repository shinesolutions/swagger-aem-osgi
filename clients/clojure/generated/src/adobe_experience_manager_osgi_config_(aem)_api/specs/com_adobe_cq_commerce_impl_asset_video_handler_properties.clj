(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-commerce-impl-asset-video-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-commerce-impl-asset-video-handler-properties-data
  {
   (ds/opt :cqcommerceassethandleractive) config-node-property-boolean-spec
   (ds/opt :cqcommerceassethandlername) config-node-property-string-spec
   })

(def com-adobe-cq-commerce-impl-asset-video-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-commerce-impl-asset-video-handler-properties
     :spec com-adobe-cq-commerce-impl-asset-video-handler-properties-data}))
