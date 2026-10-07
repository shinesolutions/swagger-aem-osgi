(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-rest-impl-servlet-default-get-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-rest-impl-servlet-default-get-servlet-properties-data
  {
   (ds/opt :defaultlimit) config-node-property-integer-spec
   (ds/opt :useabsoluteuri) config-node-property-boolean-spec
   })

(def com-adobe-granite-rest-impl-servlet-default-get-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-rest-impl-servlet-default-get-servlet-properties
     :spec com-adobe-granite-rest-impl-servlet-default-get-servlet-properties-data}))
