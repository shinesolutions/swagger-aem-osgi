(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-extwidget-servlets-image-sprite-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-extwidget-servlets-image-sprite-servlet-properties-data
  {
   (ds/opt :maxWidth) config-node-property-integer-spec
   (ds/opt :maxHeight) config-node-property-integer-spec
   })

(def com-day-cq-extwidget-servlets-image-sprite-servlet-properties-spec
  (ds/spec
    {:name ::com-day-cq-extwidget-servlets-image-sprite-servlet-properties
     :spec com-day-cq-extwidget-servlets-image-sprite-servlet-properties-data}))
