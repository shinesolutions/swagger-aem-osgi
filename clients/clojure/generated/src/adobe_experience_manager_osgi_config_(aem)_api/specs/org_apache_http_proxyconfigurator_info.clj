(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-http-proxyconfigurator-info
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-http-proxyconfigurator-properties :refer :all]
            )
  (:import (java.io File)))


(def org-apache-http-proxyconfigurator-info-data
  {
   (ds/opt :pid) string?
   (ds/opt :title) string?
   (ds/opt :description) string?
   (ds/opt :properties) org-apache-http-proxyconfigurator-properties-spec
   })

(def org-apache-http-proxyconfigurator-info-spec
  (ds/spec
    {:name ::org-apache-http-proxyconfigurator-info
     :spec org-apache-http-proxyconfigurator-info-data}))
