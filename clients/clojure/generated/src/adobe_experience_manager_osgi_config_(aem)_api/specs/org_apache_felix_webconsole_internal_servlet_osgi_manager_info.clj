(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-internal-servlet-osgi-manager-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-internal-servlet-osgi-manager-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-webconsole-internal-servlet-osgi-manager-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-webconsole-internal-servlet-osgi-manager-properties-spec
   })

(def org-apache-felix-webconsole-internal-servlet-osgi-manager-info-spec
  (ds/spec
    {:name ::org-apache-felix-webconsole-internal-servlet-osgi-manager-info
     :spec org-apache-felix-webconsole-internal-servlet-osgi-manager-info-data}))
