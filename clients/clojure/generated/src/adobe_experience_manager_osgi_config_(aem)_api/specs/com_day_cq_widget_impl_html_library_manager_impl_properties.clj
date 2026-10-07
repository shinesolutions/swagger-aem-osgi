(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-day-cq-widget-impl-html-library-manager-impl-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def com-day-cq-widget-impl-html-library-manager-impl-properties-data
  {
   (ds/opt :htmllibmanagerclientmanager) config-node-property-string-spec
   (ds/opt :htmllibmanagerdebug) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerdebugconsole) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerdebuginitjs) config-node-property-string-spec
   (ds/opt :htmllibmanagerdefaultthemename) config-node-property-string-spec
   (ds/opt :htmllibmanagerdefaultuserthemename) config-node-property-string-spec
   (ds/opt :htmllibmanagerfirebuglitepath) config-node-property-string-spec
   (ds/opt :htmllibmanagerforceCQUrlInfo) config-node-property-boolean-spec
   (ds/opt :htmllibmanagergzip) config-node-property-boolean-spec
   (ds/opt :htmllibmanagermaxage) config-node-property-integer-spec
   (ds/opt :htmllibmanagermaxDataUriSize) config-node-property-integer-spec
   (ds/opt :htmllibmanagerminify) config-node-property-boolean-spec
   (ds/opt :htmllibmanagerpathlist) config-node-property-array-spec
   (ds/opt :htmllibmanagertiming) config-node-property-boolean-spec
   })

(def com-day-cq-widget-impl-html-library-manager-impl-properties-spec
  (ds/spec
    {:name ::com-day-cq-widget-impl-html-library-manager-impl-properties
     :spec com-day-cq-widget-impl-html-library-manager-impl-properties-data}))
