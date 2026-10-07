(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-properties-data
  {
   (ds/opt :offloadingagentmanagerenabled) config-node-property-boolean-spec
   })

(def com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-properties
     :spec com-adobe-granite-offloading-impl-transporter-offloading-agent-manager-properties-data}))
