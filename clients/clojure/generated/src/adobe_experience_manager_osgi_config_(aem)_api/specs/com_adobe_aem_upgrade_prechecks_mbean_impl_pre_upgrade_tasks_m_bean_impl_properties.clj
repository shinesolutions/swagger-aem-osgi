(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties-data
  {
   (ds/opt :pre-upgrademaintenancetasks) config-node-property-array-spec
   (ds/opt :pre-upgradehctags) config-node-property-array-spec
   })

(def com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties-spec
  (ds/spec
    {:name ::com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties
     :spec com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties-data}))
