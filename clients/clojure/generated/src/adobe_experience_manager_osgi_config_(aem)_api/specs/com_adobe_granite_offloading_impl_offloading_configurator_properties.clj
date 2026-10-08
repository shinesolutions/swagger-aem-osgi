(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-offloading-impl-offloading-configurator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-offloading-impl-offloading-configurator-properties-data
  {
   (ds/opt :offloadingtransporter) config-node-property-string-spec
   (ds/opt :offloadingcleanuppayload) config-node-property-boolean-spec
   })

(def com-adobe-granite-offloading-impl-offloading-configurator-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-offloading-impl-offloading-configurator-properties
     :spec com-adobe-granite-offloading-impl-offloading-configurator-properties-data}))
