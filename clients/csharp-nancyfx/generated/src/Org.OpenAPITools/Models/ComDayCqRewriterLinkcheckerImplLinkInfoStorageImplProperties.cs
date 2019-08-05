using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties
    /// </summary>
    public sealed class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties:  IEquatable<ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties>
    { 
        /// <summary>
        /// ServiceMaxLinksPerHost
        /// </summary>
        public ConfigNodePropertyInteger ServiceMaxLinksPerHost { get; private set; }

        /// <summary>
        /// ServiceSaveExternalLinkReferences
        /// </summary>
        public ConfigNodePropertyBoolean ServiceSaveExternalLinkReferences { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties()
        {
        }

        private ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(ConfigNodePropertyInteger ServiceMaxLinksPerHost, ConfigNodePropertyBoolean ServiceSaveExternalLinkReferences)
        {
            
            this.ServiceMaxLinksPerHost = ServiceMaxLinksPerHost;
            
            this.ServiceSaveExternalLinkReferences = ServiceSaveExternalLinkReferences;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder</returns>
        public static ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder Builder()
        {
            return new ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder</returns>
        public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder With()
        {
            return Builder()
                .ServiceMaxLinksPerHost(ServiceMaxLinksPerHost)
                .ServiceSaveExternalLinkReferences(ServiceSaveExternalLinkReferences);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties left, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties</param>
        /// <param name="right">Compared (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties left, ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
        /// </summary>
        public sealed class ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ServiceMaxLinksPerHost;
            private ConfigNodePropertyBoolean _ServiceSaveExternalLinkReferences;

            internal ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.ServiceMaxLinksPerHost property.
            /// </summary>
            /// <param name="value">ServiceMaxLinksPerHost</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder ServiceMaxLinksPerHost(ConfigNodePropertyInteger value)
            {
                _ServiceMaxLinksPerHost = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.ServiceSaveExternalLinkReferences property.
            /// </summary>
            /// <param name="value">ServiceSaveExternalLinkReferences</param>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplPropertiesBuilder ServiceSaveExternalLinkReferences(ConfigNodePropertyBoolean value)
            {
                _ServiceSaveExternalLinkReferences = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties.
            /// </summary>
            /// <returns>ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties</returns>
            public ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties Build()
            {
                Validate();
                return new ComDayCqRewriterLinkcheckerImplLinkInfoStorageImplProperties(
                    ServiceMaxLinksPerHost: _ServiceMaxLinksPerHost,
                    ServiceSaveExternalLinkReferences: _ServiceSaveExternalLinkReferences
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}