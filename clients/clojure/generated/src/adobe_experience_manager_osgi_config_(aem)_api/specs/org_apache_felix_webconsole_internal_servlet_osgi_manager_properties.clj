(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-webconsole-internal-servlet-osgi-manager-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-webconsole-internal-servlet-osgi-manager-properties-data
  {
   (ds/opt :managerroot) config-node-property-string-spec
   (ds/opt :httpservicefilter) config-node-property-string-spec
   (ds/opt :defaultrender) config-node-property-string-spec
   (ds/opt :realm) config-node-property-string-spec
   (ds/opt :username) config-node-property-string-spec
   (ds/opt :password) config-node-property-string-spec
   (ds/opt :category) config-node-property-string-spec
   (ds/opt :locale) config-node-property-string-spec
   (ds/opt :loglevel) config-node-property-drop-down-spec
   (ds/opt :plugins) config-node-property-drop-down-spec
   })

(def org-apache-felix-webconsole-internal-servlet-osgi-manager-properties-spec
  (ds/spec
    {:name ::org-apache-felix-webconsole-internal-servlet-osgi-manager-properties
     :spec org-apache-felix-webconsole-internal-servlet-osgi-manager-properties-data}))
