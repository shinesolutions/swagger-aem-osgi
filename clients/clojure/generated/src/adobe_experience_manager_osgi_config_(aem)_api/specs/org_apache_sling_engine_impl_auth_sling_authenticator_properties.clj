(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-engine-impl-auth-sling-authenticator-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-engine-impl-auth-sling-authenticator-properties-data
  {
   (ds/opt :osgihttpwhiteboardcontextselect) config-node-property-string-spec
   (ds/opt :osgihttpwhiteboardlistener) config-node-property-string-spec
   (ds/opt :authsudocookie) config-node-property-string-spec
   (ds/opt :authsudoparameter) config-node-property-string-spec
   (ds/opt :authannonymous) config-node-property-boolean-spec
   (ds/opt :slingauthrequirements) config-node-property-array-spec
   (ds/opt :slingauthanonymoususer) config-node-property-string-spec
   (ds/opt :slingauthanonymouspassword) config-node-property-string-spec
   (ds/opt :authhttp) config-node-property-drop-down-spec
   (ds/opt :authhttprealm) config-node-property-string-spec
   (ds/opt :authurisuffix) config-node-property-array-spec
   })

(def org-apache-sling-engine-impl-auth-sling-authenticator-properties-spec
  (ds/spec
    {:name ::org-apache-sling-engine-impl-auth-sling-authenticator-properties
     :spec org-apache-sling-engine-impl-auth-sling-authenticator-properties-data}))
