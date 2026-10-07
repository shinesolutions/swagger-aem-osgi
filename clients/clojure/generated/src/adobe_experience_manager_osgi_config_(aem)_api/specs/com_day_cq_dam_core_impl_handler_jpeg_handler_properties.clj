(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-handler-jpeg-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-handler-jpeg-handler-properties-data
  {
   (ds/opt :cqdamenableextmetaextraction) config-node-property-boolean-spec
   (ds/opt :large_file_threshold) config-node-property-integer-spec
   (ds/opt :large_comment_threshold) config-node-property-integer-spec
   })

(def com-day-cq-dam-core-impl-handler-jpeg-handler-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-handler-jpeg-handler-properties
     :spec com-day-cq-dam-core-impl-handler-jpeg-handler-properties-data}))
