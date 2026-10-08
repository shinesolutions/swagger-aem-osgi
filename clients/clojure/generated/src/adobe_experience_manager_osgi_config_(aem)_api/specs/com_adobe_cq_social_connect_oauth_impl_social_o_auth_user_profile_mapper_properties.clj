(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties-data
  {
   (ds/opt :facebook) config-node-property-array-spec
   (ds/opt :twitter) config-node-property-array-spec
   (ds/opt :providerconfiguserfolder) config-node-property-string-spec
   })

(def com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties
     :spec com-adobe-cq-social-connect-oauth-impl-social-o-auth-user-profile-mapper-properties-data}))
