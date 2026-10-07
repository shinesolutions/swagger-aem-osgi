(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-properties-data
  {
   (ds/opt :slingservletextensions) config-node-property-string-spec
   (ds/opt :slingservletpaths) config-node-property-string-spec
   (ds/opt :slingservletmethods) config-node-property-string-spec
   })

(def com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-properties
     :spec com-adobe-cq-social-user-endpoints-impl-users-group-from-publish-servlet-properties-data}))
