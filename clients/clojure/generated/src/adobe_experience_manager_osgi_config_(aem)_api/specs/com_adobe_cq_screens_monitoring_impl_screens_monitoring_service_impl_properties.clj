(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-properties-data
  {
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplprojectPath) config-node-property-array-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplscheduleFrequency) config-node-property-string-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplpingTimeout) config-node-property-integer-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplrecipients) config-node-property-string-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpserver) config-node-property-string-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplsmtpport) config-node-property-integer-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplusetls) config-node-property-boolean-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplusername) config-node-property-string-spec
   (ds/opt :comadobecqscreensmonitoringimplScreensMonitoringServiceImplpassword) config-node-property-string-spec
   })

(def com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-properties
     :spec com-adobe-cq-screens-monitoring-impl-screens-monitoring-service-impl-properties-data}))
