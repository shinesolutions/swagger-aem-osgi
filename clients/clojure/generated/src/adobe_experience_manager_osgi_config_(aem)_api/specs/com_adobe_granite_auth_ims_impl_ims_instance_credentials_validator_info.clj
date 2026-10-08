(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-properties-spec
   })

(def com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-info-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-info
     :spec com-adobe-granite-auth-ims-impl-ims-instance-credentials-validator-info-data}))
