(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-deserfw-impl-deserialization-firewall-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-deserfw-impl-deserialization-firewall-impl-properties-data
  {
   (ds/opt :firewalldeserializationwhitelist) config-node-property-array-spec
   (ds/opt :firewalldeserializationblacklist) config-node-property-array-spec
   (ds/opt :firewalldeserializationdiagnostics) config-node-property-string-spec
   })

(def com-adobe-cq-deserfw-impl-deserialization-firewall-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-deserfw-impl-deserialization-firewall-impl-properties
     :spec com-adobe-cq-deserfw-impl-deserialization-firewall-impl-properties-data}))
