(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-webdav-impl-io-special-files-handler-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-webdav-impl-io-special-files-handler-properties-data
  {
   (ds/opt :comdaycqdamcoreimplioSpecialFilesHandlerfilepatters) config-node-property-array-spec
   })

(def com-adobe-cq-dam-webdav-impl-io-special-files-handler-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-webdav-impl-io-special-files-handler-properties
     :spec com-adobe-cq-dam-webdav-impl-io-special-files-handler-properties-data}))
