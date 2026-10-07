(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-properties-data
  {
   (ds/opt :fieldWhitelist) config-node-property-array-spec
   })

(def com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-properties
     :spec com-adobe-cq-social-members-endpoints-impl-community-member-user-profile-o-properties-data}))
