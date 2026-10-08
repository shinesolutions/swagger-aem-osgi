(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-eventadmin-impl-event-admin-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-eventadmin-impl-event-admin-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-eventadmin-impl-event-admin-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-eventadmin-impl-event-admin-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-felix-eventadmin-impl-event-admin-info-spec
  (ds/spec
    {:name ::org-apache-felix-eventadmin-impl-event-admin-info
     :spec org-apache-felix-eventadmin-impl-event-admin-info-data}))
