(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-polling-importer-impl-managed-poll-config-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-polling-importer-impl-managed-poll-config-impl-properties-data
  {
   (ds/opt :id) config-node-property-string-spec
   (ds/opt :enabled) config-node-property-boolean-spec
   (ds/opt :reference) config-node-property-boolean-spec
   (ds/opt :interval) config-node-property-integer-spec
   (ds/opt :expression) config-node-property-string-spec
   (ds/opt :source) config-node-property-string-spec
   (ds/opt :target) config-node-property-string-spec
   (ds/opt :login) config-node-property-string-spec
   (ds/opt :password) config-node-property-string-spec
   })

(def com-day-cq-polling-importer-impl-managed-poll-config-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-polling-importer-impl-managed-poll-config-impl-properties
     :spec com-day-cq-polling-importer-impl-managed-poll-config-impl-properties-data}))
