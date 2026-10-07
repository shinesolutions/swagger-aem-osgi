(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-properties-data
  {
   (ds/opt :numberOfDays) config-node-property-integer-spec
   (ds/opt :ageOfFile) config-node-property-integer-spec
   })

(def com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-properties
     :spec com-adobe-cq-social-commons-maintainance-impl-delete-temp-ugc-image-upload-properties-data}))
