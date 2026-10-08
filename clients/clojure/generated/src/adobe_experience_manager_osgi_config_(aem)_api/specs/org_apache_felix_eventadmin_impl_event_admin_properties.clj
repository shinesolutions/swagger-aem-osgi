(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-eventadmin-impl-event-admin-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-float :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-eventadmin-impl-event-admin-properties-data
  {
   (ds/opt :orgapachefelixeventadminThreadPoolSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixeventadminAsyncToSyncThreadRatio) config-node-property-float-spec
   (ds/opt :orgapachefelixeventadminTimeout) config-node-property-integer-spec
   (ds/opt :orgapachefelixeventadminRequireTopic) config-node-property-boolean-spec
   (ds/opt :orgapachefelixeventadminIgnoreTimeout) config-node-property-array-spec
   (ds/opt :orgapachefelixeventadminIgnoreTopic) config-node-property-array-spec
   })

(def org-apache-felix-eventadmin-impl-event-admin-properties-spec
  (ds/spec
    {:name ::org-apache-felix-eventadmin-impl-event-admin-properties
     :spec org-apache-felix-eventadmin-impl-event-admin-properties-data}))
