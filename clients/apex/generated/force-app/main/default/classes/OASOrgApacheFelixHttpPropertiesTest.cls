@isTest
private class OASOrgApacheFelixHttpPropertiesTest {
    @isTest
    private static void equalsSameInstance() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = orgApacheFelixHttpProperties1;
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties4 = orgApacheFelixHttpProperties3;

        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties2));
        System.assert(orgApacheFelixHttpProperties2.equals(orgApacheFelixHttpProperties1));
        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties1));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties4));
        System.assert(orgApacheFelixHttpProperties4.equals(orgApacheFelixHttpProperties3));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties4 = new OASOrgApacheFelixHttpProperties();

        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties2));
        System.assert(orgApacheFelixHttpProperties2.equals(orgApacheFelixHttpProperties1));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties4));
        System.assert(orgApacheFelixHttpProperties4.equals(orgApacheFelixHttpProperties3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = new OASOrgApacheFelixHttpProperties();

        System.assertEquals(false, orgApacheFelixHttpProperties1.equals('foo'));
        System.assertEquals(false, orgApacheFelixHttpProperties2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3;

        System.assertEquals(false, orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties3));
        System.assertEquals(false, orgApacheFelixHttpProperties2.equals(orgApacheFelixHttpProperties3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = new OASOrgApacheFelixHttpProperties();

        System.assertEquals(orgApacheFelixHttpProperties1.hashCode(), orgApacheFelixHttpProperties1.hashCode());
        System.assertEquals(orgApacheFelixHttpProperties2.hashCode(), orgApacheFelixHttpProperties2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties1 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties2 = OASOrgApacheFelixHttpProperties.getExample();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties3 = new OASOrgApacheFelixHttpProperties();
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties4 = new OASOrgApacheFelixHttpProperties();

        System.assert(orgApacheFelixHttpProperties1.equals(orgApacheFelixHttpProperties2));
        System.assert(orgApacheFelixHttpProperties3.equals(orgApacheFelixHttpProperties4));
        System.assertEquals(orgApacheFelixHttpProperties1.hashCode(), orgApacheFelixHttpProperties2.hashCode());
        System.assertEquals(orgApacheFelixHttpProperties3.hashCode(), orgApacheFelixHttpProperties4.hashCode());
    }

    @isTest
    private static void maintainRenamedProperties() {
        OASOrgApacheFelixHttpProperties orgApacheFelixHttpProperties = new OASOrgApacheFelixHttpProperties();
        Map<String, String> propertyMappings = orgApacheFelixHttpProperties.getPropertyMappings();
        System.assertEquals('orgApacheFelixHttpHost', propertyMappings.get('org.apache.felix.http.host'));
        System.assertEquals('orgApacheFelixHttpEnable', propertyMappings.get('org.apache.felix.http.enable'));
        System.assertEquals('orgOsgiServiceHttpPort', propertyMappings.get('org.osgi.service.http.port'));
        System.assertEquals('orgApacheFelixHttpTimeout', propertyMappings.get('org.apache.felix.http.timeout'));
        System.assertEquals('orgApacheFelixHttpsEnable', propertyMappings.get('org.apache.felix.https.enable'));
        System.assertEquals('orgOsgiServiceHttpPortSecure', propertyMappings.get('org.osgi.service.http.port.secure'));
        System.assertEquals('orgApacheFelixHttpsKeystore', propertyMappings.get('org.apache.felix.https.keystore'));
        System.assertEquals('orgApacheFelixHttpsKeystorePassword', propertyMappings.get('org.apache.felix.https.keystore.password'));
        System.assertEquals('orgApacheFelixHttpsKeystoreKeyPassword', propertyMappings.get('org.apache.felix.https.keystore.key.password'));
        System.assertEquals('orgApacheFelixHttpsTruststore', propertyMappings.get('org.apache.felix.https.truststore'));
        System.assertEquals('orgApacheFelixHttpsTruststorePassword', propertyMappings.get('org.apache.felix.https.truststore.password'));
        System.assertEquals('orgApacheFelixHttpsClientcertificate', propertyMappings.get('org.apache.felix.https.clientcertificate'));
        System.assertEquals('orgApacheFelixHttpContextPath', propertyMappings.get('org.apache.felix.http.context_path'));
        System.assertEquals('orgApacheFelixHttpMbeans', propertyMappings.get('org.apache.felix.http.mbeans'));
        System.assertEquals('orgApacheFelixHttpSessionTimeout', propertyMappings.get('org.apache.felix.http.session.timeout'));
        System.assertEquals('orgApacheFelixHttpJettyThreadpoolMax', propertyMappings.get('org.apache.felix.http.jetty.threadpool.max'));
        System.assertEquals('orgApacheFelixHttpJettyAcceptors', propertyMappings.get('org.apache.felix.http.jetty.acceptors'));
        System.assertEquals('orgApacheFelixHttpJettySelectors', propertyMappings.get('org.apache.felix.http.jetty.selectors'));
        System.assertEquals('orgApacheFelixHttpJettyHeaderBufferSize', propertyMappings.get('org.apache.felix.http.jetty.headerBufferSize'));
        System.assertEquals('orgApacheFelixHttpJettyRequestBufferSize', propertyMappings.get('org.apache.felix.http.jetty.requestBufferSize'));
        System.assertEquals('orgApacheFelixHttpJettyResponseBufferSize', propertyMappings.get('org.apache.felix.http.jetty.responseBufferSize'));
        System.assertEquals('orgApacheFelixHttpJettyMaxFormSize', propertyMappings.get('org.apache.felix.http.jetty.maxFormSize'));
        System.assertEquals('orgApacheFelixHttpPathExclusions', propertyMappings.get('org.apache.felix.http.path_exclusions'));
        System.assertEquals('orgApacheFelixHttpsJettyCiphersuitesExcluded', propertyMappings.get('org.apache.felix.https.jetty.ciphersuites.excluded'));
        System.assertEquals('orgApacheFelixHttpsJettyCiphersuitesIncluded', propertyMappings.get('org.apache.felix.https.jetty.ciphersuites.included'));
        System.assertEquals('orgApacheFelixHttpJettySendServerHeader', propertyMappings.get('org.apache.felix.http.jetty.sendServerHeader'));
        System.assertEquals('orgApacheFelixHttpsJettyProtocolsIncluded', propertyMappings.get('org.apache.felix.https.jetty.protocols.included'));
        System.assertEquals('orgApacheFelixHttpsJettyProtocolsExcluded', propertyMappings.get('org.apache.felix.https.jetty.protocols.excluded'));
        System.assertEquals('orgApacheFelixProxyLoadBalancerConnectionEnable', propertyMappings.get('org.apache.felix.proxy.load.balancer.connection.enable'));
        System.assertEquals('orgApacheFelixHttpsJettyRenegotiateAllowed', propertyMappings.get('org.apache.felix.https.jetty.renegotiateAllowed'));
        System.assertEquals('orgApacheFelixHttpsJettySessionCookieHttpOnly', propertyMappings.get('org.apache.felix.https.jetty.session.cookie.httpOnly'));
        System.assertEquals('orgApacheFelixHttpsJettySessionCookieSecure', propertyMappings.get('org.apache.felix.https.jetty.session.cookie.secure'));
        System.assertEquals('orgEclipseJettyServletSessionIdPathParameterName', propertyMappings.get('org.eclipse.jetty.servlet.SessionIdPathParameterName'));
        System.assertEquals('orgEclipseJettyServletCheckingRemoteSessionIdEncoding', propertyMappings.get('org.eclipse.jetty.servlet.CheckingRemoteSessionIdEncoding'));
        System.assertEquals('orgEclipseJettyServletSessionCookie', propertyMappings.get('org.eclipse.jetty.servlet.SessionCookie'));
        System.assertEquals('orgEclipseJettyServletSessionDomain', propertyMappings.get('org.eclipse.jetty.servlet.SessionDomain'));
        System.assertEquals('orgEclipseJettyServletSessionPath', propertyMappings.get('org.eclipse.jetty.servlet.SessionPath'));
        System.assertEquals('orgEclipseJettyServletMaxAge', propertyMappings.get('org.eclipse.jetty.servlet.MaxAge'));
        System.assertEquals('orgApacheFelixHttpName', propertyMappings.get('org.apache.felix.http.name'));
        System.assertEquals('orgApacheFelixJettyGziphandlerEnable', propertyMappings.get('org.apache.felix.jetty.gziphandler.enable'));
        System.assertEquals('orgApacheFelixJettyGzipMinGzipSize', propertyMappings.get('org.apache.felix.jetty.gzip.minGzipSize'));
        System.assertEquals('orgApacheFelixJettyGzipCompressionLevel', propertyMappings.get('org.apache.felix.jetty.gzip.compressionLevel'));
        System.assertEquals('orgApacheFelixJettyGzipInflateBufferSize', propertyMappings.get('org.apache.felix.jetty.gzip.inflateBufferSize'));
        System.assertEquals('orgApacheFelixJettyGzipSyncFlush', propertyMappings.get('org.apache.felix.jetty.gzip.syncFlush'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedUserAgents', propertyMappings.get('org.apache.felix.jetty.gzip.excludedUserAgents'));
        System.assertEquals('orgApacheFelixJettyGzipIncludedMethods', propertyMappings.get('org.apache.felix.jetty.gzip.includedMethods'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedMethods', propertyMappings.get('org.apache.felix.jetty.gzip.excludedMethods'));
        System.assertEquals('orgApacheFelixJettyGzipIncludedPaths', propertyMappings.get('org.apache.felix.jetty.gzip.includedPaths'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedPaths', propertyMappings.get('org.apache.felix.jetty.gzip.excludedPaths'));
        System.assertEquals('orgApacheFelixJettyGzipIncludedMimeTypes', propertyMappings.get('org.apache.felix.jetty.gzip.includedMimeTypes'));
        System.assertEquals('orgApacheFelixJettyGzipExcludedMimeTypes', propertyMappings.get('org.apache.felix.jetty.gzip.excludedMimeTypes'));
        System.assertEquals('orgApacheFelixHttpSessionInvalidate', propertyMappings.get('org.apache.felix.http.session.invalidate'));
        System.assertEquals('orgApacheFelixHttpSessionUniqueid', propertyMappings.get('org.apache.felix.http.session.uniqueid'));
    }
}
