(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-properties-data
  {
   (ds/opt :versionid) config-node-property-string-spec
   (ds/opt :cacheon) config-node-property-boolean-spec
   (ds/opt :concurrencylevel) config-node-property-integer-spec
   (ds/opt :cachestartsize) config-node-property-integer-spec
   (ds/opt :cachettl) config-node-property-integer-spec
   (ds/opt :cachesize) config-node-property-integer-spec
   (ds/opt :timelimit) config-node-property-integer-spec
   })

(def com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-properties
     :spec com-adobe-cq-social-datastore-as-impl-as-resource-provider-factory-properties-data}))
