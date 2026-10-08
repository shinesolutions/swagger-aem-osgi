(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties-data
  {
   (ds/opt :hcname) config-node-property-string-spec
   (ds/opt :hctags) config-node-property-array-spec
   (ds/opt :hcmbeanname) config-node-property-string-spec
   })

(def com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties-spec
  (ds/spec
    {:name ::com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties
     :spec com-adobe-aem-upgrade-prechecks-hc-impl-deprecate-indexes-hc-properties-data}))
