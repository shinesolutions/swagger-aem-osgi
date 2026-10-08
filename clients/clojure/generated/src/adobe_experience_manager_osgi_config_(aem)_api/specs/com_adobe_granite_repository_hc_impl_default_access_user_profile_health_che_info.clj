(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-properties-spec
   })

(def com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-info-spec
  (ds/spec
    {:name ::com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-info
     :spec com-adobe-granite-repository-hc-impl-default-access-user-profile-health-che-info-data}))
