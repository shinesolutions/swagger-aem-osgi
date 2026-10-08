(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-threaddump-thread-dump-collector-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-threaddump-thread-dump-collector-properties-data
  {
   (ds/opt :schedulerperiod) config-node-property-integer-spec
   (ds/opt :schedulerrunOn) config-node-property-drop-down-spec
   (ds/opt :granitethreaddumpenabled) config-node-property-boolean-spec
   (ds/opt :granitethreaddumpdumpsPerFile) config-node-property-integer-spec
   (ds/opt :granitethreaddumpenableGzipCompression) config-node-property-boolean-spec
   (ds/opt :granitethreaddumpenableDirectoriesCompression) config-node-property-boolean-spec
   (ds/opt :granitethreaddumpenableJStack) config-node-property-boolean-spec
   (ds/opt :granitethreaddumpmaxBackupDays) config-node-property-integer-spec
   (ds/opt :granitethreaddumpbackupCleanTrigger) config-node-property-string-spec
   })

(def com-adobe-granite-threaddump-thread-dump-collector-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-threaddump-thread-dump-collector-properties
     :spec com-adobe-granite-threaddump-thread-dump-collector-properties-data}))
