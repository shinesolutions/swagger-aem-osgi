(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-ims-properties-data
  {
   (ds/opt :configid) config-node-property-string-spec
   (ds/opt :scope) config-node-property-string-spec
   })

(def com-adobe-granite-auth-ims-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-ims-properties
     :spec com-adobe-granite-auth-ims-properties-data}))
