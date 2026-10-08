(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-monitoring-impl-script-config-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-monitoring-impl-script-config-impl-properties-data
  {
   (ds/opt :scriptfilename) config-node-property-string-spec
   (ds/opt :scriptdisplay) config-node-property-string-spec
   (ds/opt :scriptpath) config-node-property-string-spec
   (ds/opt :scriptplatform) config-node-property-array-spec
   (ds/opt :interval) config-node-property-integer-spec
   (ds/opt :jmxdomain) config-node-property-string-spec
   })

(def com-adobe-granite-monitoring-impl-script-config-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-monitoring-impl-script-config-impl-properties
     :spec com-adobe-granite-monitoring-impl-script-config-impl-properties-data}))
