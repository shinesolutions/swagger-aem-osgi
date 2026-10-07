(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-info-spec
  (ds/spec
    {:name ::com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-info
     :spec com-adobe-aem-upgrade-prechecks-mbean-impl-pre-upgrade-tasks-m-bean-impl-info-data}))
