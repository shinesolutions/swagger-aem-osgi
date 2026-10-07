(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-members-impl-community-member-group-profile-component-f-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-members-impl-community-member-group-profile-component-f-properties-data
  {
   (ds/opt :everyoneLimit) config-node-property-integer-spec
   (ds/opt :priority) config-node-property-integer-spec
   })

(def com-adobe-cq-social-members-impl-community-member-group-profile-component-f-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-members-impl-community-member-group-profile-component-f-properties
     :spec com-adobe-cq-social-members-impl-community-member-group-profile-component-f-properties-data}))
