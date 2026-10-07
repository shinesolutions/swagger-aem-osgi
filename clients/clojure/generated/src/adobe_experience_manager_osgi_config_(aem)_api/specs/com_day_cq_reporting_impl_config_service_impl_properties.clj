(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-reporting-impl-config-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-reporting-impl-config-service-impl-properties-data
  {
   (ds/opt :repconftimezone) config-node-property-string-spec
   (ds/opt :repconflocale) config-node-property-string-spec
   (ds/opt :repconfsnapshots) config-node-property-string-spec
   (ds/opt :repconfrepdir) config-node-property-string-spec
   (ds/opt :repconfhourofday) config-node-property-integer-spec
   (ds/opt :repconfminofhour) config-node-property-integer-spec
   (ds/opt :repconfmaxrows) config-node-property-integer-spec
   (ds/opt :repconffakedata) config-node-property-boolean-spec
   (ds/opt :repconfsnapshotuser) config-node-property-string-spec
   (ds/opt :repconfenforcesnapshotuser) config-node-property-boolean-spec
   })

(def com-day-cq-reporting-impl-config-service-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-reporting-impl-config-service-impl-properties
     :spec com-day-cq-reporting-impl-config-service-impl-properties-data}))
