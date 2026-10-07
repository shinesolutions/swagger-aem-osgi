(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-properties :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-properties-spec
   })

(def com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-info-spec
  (ds/spec
    {:name ::com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-info
     :spec com-day-cq-dam-core-impl-foldermetadataschema-folder-metadata-schema-feat-info-data}))
