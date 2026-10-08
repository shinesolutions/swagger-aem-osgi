(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-wcm-core-impl-version-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-wcm-core-impl-version-manager-impl-properties-data
  {
   (ds/opt :versionmanagercreateVersionOnActivation) config-node-property-boolean-spec
   (ds/opt :versionmanagerpurgingEnabled) config-node-property-boolean-spec
   (ds/opt :versionmanagerpurgePaths) config-node-property-array-spec
   (ds/opt :versionmanagerivPaths) config-node-property-array-spec
   (ds/opt :versionmanagermaxAgeDays) config-node-property-integer-spec
   (ds/opt :versionmanagermaxNumberVersions) config-node-property-integer-spec
   (ds/opt :versionmanagerminNumberVersions) config-node-property-integer-spec
   })

(def com-day-cq-wcm-core-impl-version-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-wcm-core-impl-version-manager-impl-properties
     :spec com-day-cq-wcm-core-impl-version-manager-impl-properties-data}))
