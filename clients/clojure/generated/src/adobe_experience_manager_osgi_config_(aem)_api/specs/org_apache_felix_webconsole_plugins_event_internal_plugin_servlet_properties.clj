(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-properties-data
  {
   (ds/opt :maxsize) config-node-property-integer-spec
   })

(def org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-properties
     :spec org-apache-felix-webconsole-plugins-event-internal-plugin-servlet-properties-data}))
