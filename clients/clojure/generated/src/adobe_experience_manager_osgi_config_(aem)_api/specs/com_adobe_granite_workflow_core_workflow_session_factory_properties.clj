(ns adobe-experience-manager-osgi-config-(aem)-api.specs.com-adobe-granite-workflow-core-workflow-session-factory-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            )
  (:import (java.io File)))


(def com-adobe-granite-workflow-core-workflow-session-factory-properties-data
  {
   (ds/opt :graniteworkflowinboxsortpropertyName) config-node-property-drop-down-spec
   (ds/opt :graniteworkflowinboxsortorder) config-node-property-string-spec
   (ds/opt :cqworkflowjobretry) config-node-property-integer-spec
   (ds/opt :cqworkflowsuperuser) config-node-property-array-spec
   (ds/opt :graniteworkflowinboxQuerySize) config-node-property-integer-spec
   (ds/opt :graniteworkflowadminUserGroupFilter) config-node-property-boolean-spec
   (ds/opt :graniteworkflowenforceWorkitemAssigneePermissions) config-node-property-boolean-spec
   (ds/opt :graniteworkflowenforceWorkflowInitiatorPermissions) config-node-property-boolean-spec
   (ds/opt :graniteworkflowinjectTenantIdInJobTopics) config-node-property-boolean-spec
   (ds/opt :graniteworkflowmaxPurgeSaveThreshold) config-node-property-integer-spec
   (ds/opt :graniteworkflowmaxPurgeQueryCount) config-node-property-integer-spec
   })

(def com-adobe-granite-workflow-core-workflow-session-factory-properties-spec
  (ds/spec
    {:name ::com-adobe-granite-workflow-core-workflow-session-factory-properties
     :spec com-adobe-granite-workflow-core-workflow-session-factory-properties-data}))
