(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-properties-spec
   })

(def com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-info-spec
  (ds/spec
    {:name ::com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-info
     :spec com-adobe-granite-auth-ims-impl-external-user-id-mapping-provider-extension-info-data}))
