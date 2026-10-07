(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-properties-data
  {
   (ds/opt :cqdamwebdavversionlinkingenable) config-node-property-boolean-spec
   (ds/opt :cqdamwebdavversionlinkingschedulerperiod) config-node-property-integer-spec
   (ds/opt :cqdamwebdavversionlinkingstagingtimeout) config-node-property-integer-spec
   })

(def com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-properties-spec
  (ds/spec
    {:name ::com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-properties
     :spec com-adobe-cq-dam-webdav-impl-io-dam-webdav-version-linking-job-properties-data}))
