(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-sync-impl-user-sync-listener-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-sync-impl-user-sync-listener-impl-properties-data
  {
   (ds/opt :nodetypes) config-node-property-array-spec
   (ds/opt :ignorableprops) config-node-property-array-spec
   (ds/opt :ignorablenodes) config-node-property-array-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :distfolders) config-node-property-array-spec
   })

(def com-adobe-cq-social-sync-impl-user-sync-listener-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-sync-impl-user-sync-listener-impl-properties
     :spec com-adobe-cq-social-sync-impl-user-sync-listener-impl-properties-data}))
