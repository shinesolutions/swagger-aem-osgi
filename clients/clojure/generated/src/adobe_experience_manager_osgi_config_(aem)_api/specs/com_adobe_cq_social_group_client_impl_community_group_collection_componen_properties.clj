(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-group-client-impl-community-group-collection-componen-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-group-client-impl-community-group-collection-componen-properties-data
  {
   (ds/opt :grouplistingpaginationenable) config-node-property-boolean-spec
   (ds/opt :grouplistinglazyloadingenable) config-node-property-boolean-spec
   (ds/opt :pagesize) config-node-property-integer-spec
   (ds/opt :priority) config-node-property-integer-spec
   })

(def com-adobe-cq-social-group-client-impl-community-group-collection-componen-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-group-client-impl-community-group-collection-componen-properties
     :spec com-adobe-cq-social-group-client-impl-community-group-collection-componen-properties-data}))
