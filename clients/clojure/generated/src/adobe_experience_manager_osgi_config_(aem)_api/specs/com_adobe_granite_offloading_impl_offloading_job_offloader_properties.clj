(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-offloading-impl-offloading-job-offloader-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-offloading-impl-offloading-job-offloader-properties-data
  {
   (ds/opt :offloadingoffloaderenabled) config-node-property-boolean-spec
   })

(def com-adobe-granite-offloading-impl-offloading-job-offloader-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-offloading-impl-offloading-job-offloader-properties
     :spec com-adobe-granite-offloading-impl-offloading-job-offloader-properties-data}))
