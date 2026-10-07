(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-properties-spec
   })

(def com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-info
     :spec com-adobe-cq-social-commons-ugclimitsconfig-impl-community-user-ugc-limit-info-data}))
