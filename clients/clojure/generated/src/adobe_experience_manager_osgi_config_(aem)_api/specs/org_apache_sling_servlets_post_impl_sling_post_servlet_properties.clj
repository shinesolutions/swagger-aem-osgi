(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-sling-servlets-post-impl-sling-post-servlet-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            )
  (:import (java.io File)))


(def org-apache-sling-servlets-post-impl-sling-post-servlet-properties-data
  {
   (ds/opt :servletpostdateFormats) config-node-property-array-spec
   (ds/opt :servletpostnodeNameHints) config-node-property-array-spec
   (ds/opt :servletpostnodeNameMaxLength) config-node-property-integer-spec
   (ds/opt :servletpostcheckinNewVersionableNodes) config-node-property-boolean-spec
   (ds/opt :servletpostautoCheckout) config-node-property-boolean-spec
   (ds/opt :servletpostautoCheckin) config-node-property-boolean-spec
   (ds/opt :servletpostignorePattern) config-node-property-string-spec
   })

(def org-apache-sling-servlets-post-impl-sling-post-servlet-properties-spec
  (ds/spec
    {:name ::org-apache-sling-servlets-post-impl-sling-post-servlet-properties
     :spec org-apache-sling-servlets-post-impl-sling-post-servlet-properties-data}))
