(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-cors-cors-authentication-filter-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-cors-cors-authentication-filter-properties-data
  {
   (ds/opt :corsenabling) config-node-property-boolean-spec
   })

(def com-adobe-cq-social-commons-cors-cors-authentication-filter-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-cors-cors-authentication-filter-properties
     :spec com-adobe-cq-social-commons-cors-cors-authentication-filter-properties-data}))
