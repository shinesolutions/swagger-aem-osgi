(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-properties-data
  {
   (ds/opt :disabled) config-node-property-boolean-spec
   })

(def com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-properties
     :spec com-adobe-granite-analyzer-scripts-compile-all-scripts-compiler-servlet-properties-data}))
