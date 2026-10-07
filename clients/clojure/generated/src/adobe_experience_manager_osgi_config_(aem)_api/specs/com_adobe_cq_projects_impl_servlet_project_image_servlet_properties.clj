(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-projects-impl-servlet-project-image-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-projects-impl-servlet-project-image-servlet-properties-data
  {
   (ds/opt :imagequality) config-node-property-string-spec
   (ds/opt :imagesupportedresolutions) config-node-property-string-spec
   })

(def com-adobe-cq-projects-impl-servlet-project-image-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-projects-impl-servlet-project-image-servlet-properties
     :spec com-adobe-cq-projects-impl-servlet-project-image-servlet-properties-data}))
