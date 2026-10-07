(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-jaas-configuration-spi-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-jaas-configuration-spi-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-jaas-configuration-spi-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-jaas-configuration-spi-properties-spec
   (ds/opt :bundle_location) string?
   (ds/opt :service_location) string?
   })

(def org-apache-felix-jaas-configuration-spi-info-spec
  (ds/spec
    {:name ::org-apache-felix-jaas-configuration-spi-info
     :spec org-apache-felix-jaas-configuration-spi-info-data}))
