using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties
    /// </summary>
    public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties:  IEquatable<ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties>
    { 
        /// <summary>
        /// DefaultTransportAgentToWorkerPrefix
        /// </summary>
        public ConfigNodePropertyString DefaultTransportAgentToWorkerPrefix { get; private set; }

        /// <summary>
        /// DefaultTransportAgentToMasterPrefix
        /// </summary>
        public ConfigNodePropertyString DefaultTransportAgentToMasterPrefix { get; private set; }

        /// <summary>
        /// DefaultTransportInputPackage
        /// </summary>
        public ConfigNodePropertyString DefaultTransportInputPackage { get; private set; }

        /// <summary>
        /// DefaultTransportOutputPackage
        /// </summary>
        public ConfigNodePropertyString DefaultTransportOutputPackage { get; private set; }

        /// <summary>
        /// DefaultTransportReplicationSynchronous
        /// </summary>
        public ConfigNodePropertyBoolean DefaultTransportReplicationSynchronous { get; private set; }

        /// <summary>
        /// DefaultTransportContentpackage
        /// </summary>
        public ConfigNodePropertyBoolean DefaultTransportContentpackage { get; private set; }

        /// <summary>
        /// OffloadingTransporterDefaultEnabled
        /// </summary>
        public ConfigNodePropertyBoolean OffloadingTransporterDefaultEnabled { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties()
        {
        }

        private ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(ConfigNodePropertyString DefaultTransportAgentToWorkerPrefix, ConfigNodePropertyString DefaultTransportAgentToMasterPrefix, ConfigNodePropertyString DefaultTransportInputPackage, ConfigNodePropertyString DefaultTransportOutputPackage, ConfigNodePropertyBoolean DefaultTransportReplicationSynchronous, ConfigNodePropertyBoolean DefaultTransportContentpackage, ConfigNodePropertyBoolean OffloadingTransporterDefaultEnabled)
        {
            
            this.DefaultTransportAgentToWorkerPrefix = DefaultTransportAgentToWorkerPrefix;
            
            this.DefaultTransportAgentToMasterPrefix = DefaultTransportAgentToMasterPrefix;
            
            this.DefaultTransportInputPackage = DefaultTransportInputPackage;
            
            this.DefaultTransportOutputPackage = DefaultTransportOutputPackage;
            
            this.DefaultTransportReplicationSynchronous = DefaultTransportReplicationSynchronous;
            
            this.DefaultTransportContentpackage = DefaultTransportContentpackage;
            
            this.OffloadingTransporterDefaultEnabled = OffloadingTransporterDefaultEnabled;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder</returns>
        public static ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder</returns>
        public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder With()
        {
            return Builder()
                .DefaultTransportAgentToWorkerPrefix(DefaultTransportAgentToWorkerPrefix)
                .DefaultTransportAgentToMasterPrefix(DefaultTransportAgentToMasterPrefix)
                .DefaultTransportInputPackage(DefaultTransportInputPackage)
                .DefaultTransportOutputPackage(DefaultTransportOutputPackage)
                .DefaultTransportReplicationSynchronous(DefaultTransportReplicationSynchronous)
                .DefaultTransportContentpackage(DefaultTransportContentpackage)
                .OffloadingTransporterDefaultEnabled(OffloadingTransporterDefaultEnabled);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties left, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties left, ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
        /// </summary>
        public sealed class ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder
        {
            private ConfigNodePropertyString _DefaultTransportAgentToWorkerPrefix;
            private ConfigNodePropertyString _DefaultTransportAgentToMasterPrefix;
            private ConfigNodePropertyString _DefaultTransportInputPackage;
            private ConfigNodePropertyString _DefaultTransportOutputPackage;
            private ConfigNodePropertyBoolean _DefaultTransportReplicationSynchronous;
            private ConfigNodePropertyBoolean _DefaultTransportContentpackage;
            private ConfigNodePropertyBoolean _OffloadingTransporterDefaultEnabled;

            internal ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.DefaultTransportAgentToWorkerPrefix property.
            /// </summary>
            /// <param name="value">DefaultTransportAgentToWorkerPrefix</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder DefaultTransportAgentToWorkerPrefix(ConfigNodePropertyString value)
            {
                _DefaultTransportAgentToWorkerPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.DefaultTransportAgentToMasterPrefix property.
            /// </summary>
            /// <param name="value">DefaultTransportAgentToMasterPrefix</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder DefaultTransportAgentToMasterPrefix(ConfigNodePropertyString value)
            {
                _DefaultTransportAgentToMasterPrefix = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.DefaultTransportInputPackage property.
            /// </summary>
            /// <param name="value">DefaultTransportInputPackage</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder DefaultTransportInputPackage(ConfigNodePropertyString value)
            {
                _DefaultTransportInputPackage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.DefaultTransportOutputPackage property.
            /// </summary>
            /// <param name="value">DefaultTransportOutputPackage</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder DefaultTransportOutputPackage(ConfigNodePropertyString value)
            {
                _DefaultTransportOutputPackage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.DefaultTransportReplicationSynchronous property.
            /// </summary>
            /// <param name="value">DefaultTransportReplicationSynchronous</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder DefaultTransportReplicationSynchronous(ConfigNodePropertyBoolean value)
            {
                _DefaultTransportReplicationSynchronous = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.DefaultTransportContentpackage property.
            /// </summary>
            /// <param name="value">DefaultTransportContentpackage</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder DefaultTransportContentpackage(ConfigNodePropertyBoolean value)
            {
                _DefaultTransportContentpackage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.OffloadingTransporterDefaultEnabled property.
            /// </summary>
            /// <param name="value">OffloadingTransporterDefaultEnabled</param>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoPropertiesBuilder OffloadingTransporterDefaultEnabled(ConfigNodePropertyBoolean value)
            {
                _OffloadingTransporterDefaultEnabled = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties</returns>
            public ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties Build()
            {
                Validate();
                return new ComAdobeGraniteOffloadingImplTransporterOffloadingDefaultTranspoProperties(
                    DefaultTransportAgentToWorkerPrefix: _DefaultTransportAgentToWorkerPrefix,
                    DefaultTransportAgentToMasterPrefix: _DefaultTransportAgentToMasterPrefix,
                    DefaultTransportInputPackage: _DefaultTransportInputPackage,
                    DefaultTransportOutputPackage: _DefaultTransportOutputPackage,
                    DefaultTransportReplicationSynchronous: _DefaultTransportReplicationSynchronous,
                    DefaultTransportContentpackage: _DefaultTransportContentpackage,
                    OffloadingTransporterDefaultEnabled: _OffloadingTransporterDefaultEnabled
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}