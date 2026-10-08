(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-properties-data
  {
   (ds/opt :createPreviewEnabled) config-node-property-boolean-spec
   (ds/opt :updatePreviewEnabled) config-node-property-boolean-spec
   (ds/opt :queueSize) config-node-property-integer-spec
   (ds/opt :folderPreviewRenditionRegex) config-node-property-string-spec
   })

(def com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-properties
     :spec com-day-cq-dam-core-impl-ui-preview-folder-preview-updater-impl-properties-data}))
