(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-installer-provider-jcr-impl-jcr-installer-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-installer-provider-jcr-impl-jcr-installer-properties-data
  {
   (ds/opt :handlerschemes) config-node-property-array-spec
   (ds/opt :slingjcrinstallfoldernameregexp) config-node-property-string-spec
   (ds/opt :slingjcrinstallfoldermaxdepth) config-node-property-integer-spec
   (ds/opt :slingjcrinstallsearchpath) config-node-property-array-spec
   (ds/opt :slingjcrinstallnewconfigpath) config-node-property-string-spec
   (ds/opt :slingjcrinstallsignalpath) config-node-property-string-spec
   (ds/opt :slingjcrinstallenablewriteback) config-node-property-boolean-spec
   })

(def org-apache-sling-installer-provider-jcr-impl-jcr-installer-properties-spec
  (ds/spec
    {:name ::org-apache-sling-installer-provider-jcr-impl-jcr-installer-properties
     :spec org-apache-sling-installer-provider-jcr-impl-jcr-installer-properties-data}))
