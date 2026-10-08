(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-properties-spec
   })

(def org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-info-spec
  (ds/spec
    {:name ::org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-info
     :spec org-apache-felix-webconsole-plugins-memoryusage-internal-memory-usage-co-info-data}))
