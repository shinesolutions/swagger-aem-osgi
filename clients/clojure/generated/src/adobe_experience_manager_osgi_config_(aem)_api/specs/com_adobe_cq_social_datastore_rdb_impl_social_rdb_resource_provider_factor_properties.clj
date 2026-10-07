(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-properties-data
  {
   (ds/opt :solrzktimeout) config-node-property-string-spec
   (ds/opt :solrcommit) config-node-property-string-spec
   (ds/opt :cacheon) config-node-property-boolean-spec
   (ds/opt :concurrencylevel) config-node-property-integer-spec
   (ds/opt :cachestartsize) config-node-property-integer-spec
   (ds/opt :cachettl) config-node-property-integer-spec
   (ds/opt :cachesize) config-node-property-integer-spec
   })

(def com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-properties
     :spec com-adobe-cq-social-datastore-rdb-impl-social-rdb-resource-provider-factor-properties-data}))
