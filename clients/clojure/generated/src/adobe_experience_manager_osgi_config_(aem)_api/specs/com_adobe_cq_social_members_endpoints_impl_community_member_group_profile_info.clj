(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-properties-spec
   })

(def com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-info-spec
  (ds/spec
    {:name ::com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-info
     :spec com-adobe-cq-social-members-endpoints-impl-community-member-group-profile-info-data}))
