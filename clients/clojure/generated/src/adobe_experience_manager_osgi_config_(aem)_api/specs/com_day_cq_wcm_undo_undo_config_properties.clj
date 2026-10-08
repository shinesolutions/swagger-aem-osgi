(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-undo-undo-config-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-undo-undo-config-properties-data
  {
   (ds/opt :cqwcmundoenabled) config-node-property-boolean-spec
   (ds/opt :cqwcmundopath) config-node-property-string-spec
   (ds/opt :cqwcmundovalidity) config-node-property-integer-spec
   (ds/opt :cqwcmundosteps) config-node-property-integer-spec
   (ds/opt :cqwcmundopersistence) config-node-property-string-spec
   (ds/opt :cqwcmundopersistencemode) config-node-property-boolean-spec
   (ds/opt :cqwcmundomarkermode) config-node-property-string-spec
   (ds/opt :cqwcmundowhitelist) config-node-property-array-spec
   (ds/opt :cqwcmundoblacklist) config-node-property-array-spec
   })

(def com-day-cq-wcm-undo-undo-config-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-undo-undo-config-properties
     :spec com-day-cq-wcm-undo-undo-config-properties-data}))
