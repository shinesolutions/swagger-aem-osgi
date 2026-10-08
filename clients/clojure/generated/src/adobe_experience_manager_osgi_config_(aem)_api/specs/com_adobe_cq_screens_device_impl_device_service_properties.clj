(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-device-impl-device-service-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-device-impl-device-service-properties-data
  {
   (ds/opt :comadobeaemscreensplayerpingfrequency) config-node-property-integer-spec
   (ds/opt :comadobeaemscreensdevicepaswordspecialchars) config-node-property-string-spec
   (ds/opt :comadobeaemscreensdevicepaswordminlowercasechars) config-node-property-integer-spec
   (ds/opt :comadobeaemscreensdevicepaswordminuppercasechars) config-node-property-integer-spec
   (ds/opt :comadobeaemscreensdevicepaswordminnumberchars) config-node-property-integer-spec
   (ds/opt :comadobeaemscreensdevicepaswordminspecialchars) config-node-property-integer-spec
   (ds/opt :comadobeaemscreensdevicepaswordminlength) config-node-property-integer-spec
   })

(def com-adobe-cq-screens-device-impl-device-service-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-device-impl-device-service-properties
     :spec com-adobe-cq-screens-device-impl-device-service-properties-data}))
