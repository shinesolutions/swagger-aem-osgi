(ns adobe-experience-manager-osgi-config-(aem)-api.specs.org-apache-felix-http-properties
  (:require [clojure.spec.alpha :as s]
            [spec-tools.data-spec :as ds]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-drop-down :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-string :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-integer :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-array :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            [adobe-experience-manager-osgi-config-(aem)-api.specs.config-node-property-boolean :refer :all]
            )
  (:import (java.io File)))


(def org-apache-felix-http-properties-data
  {
   (ds/opt :orgapachefelixhttphost) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpenable) config-node-property-boolean-spec
   (ds/opt :orgosgiservicehttpport) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttptimeout) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpsenable) config-node-property-boolean-spec
   (ds/opt :orgosgiservicehttpportsecure) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpskeystore) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpskeystorepassword) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpskeystorekeypassword) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpstruststore) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpstruststorepassword) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpsclientcertificate) config-node-property-drop-down-spec
   (ds/opt :orgapachefelixhttpcontext_path) config-node-property-string-spec
   (ds/opt :orgapachefelixhttpmbeans) config-node-property-boolean-spec
   (ds/opt :orgapachefelixhttpsessiontimeout) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettythreadpoolmax) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettyacceptors) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettyselectors) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettyheaderBufferSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettyrequestBufferSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettyresponseBufferSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpjettymaxFormSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttppath_exclusions) config-node-property-array-spec
   (ds/opt :orgapachefelixhttpsjettyciphersuitesexcluded) config-node-property-array-spec
   (ds/opt :orgapachefelixhttpsjettyciphersuitesincluded) config-node-property-array-spec
   (ds/opt :orgapachefelixhttpjettysendServerHeader) config-node-property-boolean-spec
   (ds/opt :orgapachefelixhttpsjettyprotocolsincluded) config-node-property-array-spec
   (ds/opt :orgapachefelixhttpsjettyprotocolsexcluded) config-node-property-array-spec
   (ds/opt :orgapachefelixproxyloadbalancerconnectionenable) config-node-property-boolean-spec
   (ds/opt :orgapachefelixhttpsjettyrenegotiateAllowed) config-node-property-boolean-spec
   (ds/opt :orgapachefelixhttpsjettysessioncookiehttpOnly) config-node-property-boolean-spec
   (ds/opt :orgapachefelixhttpsjettysessioncookiesecure) config-node-property-boolean-spec
   (ds/opt :orgeclipsejettyservletSessionIdPathParameterName) config-node-property-string-spec
   (ds/opt :orgeclipsejettyservletCheckingRemoteSessionIdEncoding) config-node-property-boolean-spec
   (ds/opt :orgeclipsejettyservletSessionCookie) config-node-property-string-spec
   (ds/opt :orgeclipsejettyservletSessionDomain) config-node-property-string-spec
   (ds/opt :orgeclipsejettyservletSessionPath) config-node-property-string-spec
   (ds/opt :orgeclipsejettyservletMaxAge) config-node-property-integer-spec
   (ds/opt :orgapachefelixhttpname) config-node-property-string-spec
   (ds/opt :orgapachefelixjettygziphandlerenable) config-node-property-boolean-spec
   (ds/opt :orgapachefelixjettygzipminGzipSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixjettygzipcompressionLevel) config-node-property-integer-spec
   (ds/opt :orgapachefelixjettygzipinflateBufferSize) config-node-property-integer-spec
   (ds/opt :orgapachefelixjettygzipsyncFlush) config-node-property-boolean-spec
   (ds/opt :orgapachefelixjettygzipexcludedUserAgents) config-node-property-array-spec
   (ds/opt :orgapachefelixjettygzipincludedMethods) config-node-property-array-spec
   (ds/opt :orgapachefelixjettygzipexcludedMethods) config-node-property-array-spec
   (ds/opt :orgapachefelixjettygzipincludedPaths) config-node-property-array-spec
   (ds/opt :orgapachefelixjettygzipexcludedPaths) config-node-property-array-spec
   (ds/opt :orgapachefelixjettygzipincludedMimeTypes) config-node-property-array-spec
   (ds/opt :orgapachefelixjettygzipexcludedMimeTypes) config-node-property-array-spec
   (ds/opt :orgapachefelixhttpsessioninvalidate) config-node-property-boolean-spec
   (ds/opt :orgapachefelixhttpsessionuniqueid) config-node-property-boolean-spec
   })

(def org-apache-felix-http-properties-spec
  (ds/spec
    {:name ::org-apache-felix-http-properties
     :spec org-apache-felix-http-properties-data}))
