(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-http-proxyconfigurator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-http-proxyconfigurator-properties-data
  {
   (ds/opt :proxyenabled) config-node-property-boolean-spec
   (ds/opt :proxyhost) config-node-property-string-spec
   (ds/opt :proxyport) config-node-property-integer-spec
   (ds/opt :proxyuser) config-node-property-string-spec
   (ds/opt :proxypassword) config-node-property-string-spec
   (ds/opt :proxyexceptions) config-node-property-array-spec
   })

(def org-apache-http-proxyconfigurator-properties-spec
  (ds/spec
    {:name ::org-apache-http-proxyconfigurator-properties
     :spec org-apache-http-proxyconfigurator-properties-data}))
