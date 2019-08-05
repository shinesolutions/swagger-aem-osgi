using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties
    /// </summary>
    public sealed class OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties:  IEquatable<OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties>
    { 
        /// <summary>
        /// HandlerSchemes
        /// </summary>
        public ConfigNodePropertyArray HandlerSchemes { get; private set; }

        /// <summary>
        /// SlingJcrinstallFolderNameRegexp
        /// </summary>
        public ConfigNodePropertyString SlingJcrinstallFolderNameRegexp { get; private set; }

        /// <summary>
        /// SlingJcrinstallFolderMaxDepth
        /// </summary>
        public ConfigNodePropertyInteger SlingJcrinstallFolderMaxDepth { get; private set; }

        /// <summary>
        /// SlingJcrinstallSearchPath
        /// </summary>
        public ConfigNodePropertyArray SlingJcrinstallSearchPath { get; private set; }

        /// <summary>
        /// SlingJcrinstallNewConfigPath
        /// </summary>
        public ConfigNodePropertyString SlingJcrinstallNewConfigPath { get; private set; }

        /// <summary>
        /// SlingJcrinstallSignalPath
        /// </summary>
        public ConfigNodePropertyString SlingJcrinstallSignalPath { get; private set; }

        /// <summary>
        /// SlingJcrinstallEnableWriteback
        /// </summary>
        public ConfigNodePropertyBoolean SlingJcrinstallEnableWriteback { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties()
        {
        }

        private OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(ConfigNodePropertyArray HandlerSchemes, ConfigNodePropertyString SlingJcrinstallFolderNameRegexp, ConfigNodePropertyInteger SlingJcrinstallFolderMaxDepth, ConfigNodePropertyArray SlingJcrinstallSearchPath, ConfigNodePropertyString SlingJcrinstallNewConfigPath, ConfigNodePropertyString SlingJcrinstallSignalPath, ConfigNodePropertyBoolean SlingJcrinstallEnableWriteback)
        {
            
            this.HandlerSchemes = HandlerSchemes;
            
            this.SlingJcrinstallFolderNameRegexp = SlingJcrinstallFolderNameRegexp;
            
            this.SlingJcrinstallFolderMaxDepth = SlingJcrinstallFolderMaxDepth;
            
            this.SlingJcrinstallSearchPath = SlingJcrinstallSearchPath;
            
            this.SlingJcrinstallNewConfigPath = SlingJcrinstallNewConfigPath;
            
            this.SlingJcrinstallSignalPath = SlingJcrinstallSignalPath;
            
            this.SlingJcrinstallEnableWriteback = SlingJcrinstallEnableWriteback;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
        /// </summary>
        /// <returns>OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder</returns>
        public static OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder Builder()
        {
            return new OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder();
        }

        /// <summary>
        /// Returns OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder</returns>
        public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder With()
        {
            return Builder()
                .HandlerSchemes(HandlerSchemes)
                .SlingJcrinstallFolderNameRegexp(SlingJcrinstallFolderNameRegexp)
                .SlingJcrinstallFolderMaxDepth(SlingJcrinstallFolderMaxDepth)
                .SlingJcrinstallSearchPath(SlingJcrinstallSearchPath)
                .SlingJcrinstallNewConfigPath(SlingJcrinstallNewConfigPath)
                .SlingJcrinstallSignalPath(SlingJcrinstallSignalPath)
                .SlingJcrinstallEnableWriteback(SlingJcrinstallEnableWriteback);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties left, OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
        /// </summary>
        /// <param name="left">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties</param>
        /// <param name="right">Compared (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties left, OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
        /// </summary>
        public sealed class OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder
        {
            private ConfigNodePropertyArray _HandlerSchemes;
            private ConfigNodePropertyString _SlingJcrinstallFolderNameRegexp;
            private ConfigNodePropertyInteger _SlingJcrinstallFolderMaxDepth;
            private ConfigNodePropertyArray _SlingJcrinstallSearchPath;
            private ConfigNodePropertyString _SlingJcrinstallNewConfigPath;
            private ConfigNodePropertyString _SlingJcrinstallSignalPath;
            private ConfigNodePropertyBoolean _SlingJcrinstallEnableWriteback;

            internal OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.HandlerSchemes property.
            /// </summary>
            /// <param name="value">HandlerSchemes</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder HandlerSchemes(ConfigNodePropertyArray value)
            {
                _HandlerSchemes = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.SlingJcrinstallFolderNameRegexp property.
            /// </summary>
            /// <param name="value">SlingJcrinstallFolderNameRegexp</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder SlingJcrinstallFolderNameRegexp(ConfigNodePropertyString value)
            {
                _SlingJcrinstallFolderNameRegexp = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.SlingJcrinstallFolderMaxDepth property.
            /// </summary>
            /// <param name="value">SlingJcrinstallFolderMaxDepth</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder SlingJcrinstallFolderMaxDepth(ConfigNodePropertyInteger value)
            {
                _SlingJcrinstallFolderMaxDepth = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.SlingJcrinstallSearchPath property.
            /// </summary>
            /// <param name="value">SlingJcrinstallSearchPath</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder SlingJcrinstallSearchPath(ConfigNodePropertyArray value)
            {
                _SlingJcrinstallSearchPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.SlingJcrinstallNewConfigPath property.
            /// </summary>
            /// <param name="value">SlingJcrinstallNewConfigPath</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder SlingJcrinstallNewConfigPath(ConfigNodePropertyString value)
            {
                _SlingJcrinstallNewConfigPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.SlingJcrinstallSignalPath property.
            /// </summary>
            /// <param name="value">SlingJcrinstallSignalPath</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder SlingJcrinstallSignalPath(ConfigNodePropertyString value)
            {
                _SlingJcrinstallSignalPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.SlingJcrinstallEnableWriteback property.
            /// </summary>
            /// <param name="value">SlingJcrinstallEnableWriteback</param>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerPropertiesBuilder SlingJcrinstallEnableWriteback(ConfigNodePropertyBoolean value)
            {
                _SlingJcrinstallEnableWriteback = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties.
            /// </summary>
            /// <returns>OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties</returns>
            public OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties Build()
            {
                Validate();
                return new OrgApacheSlingInstallerProviderJcrImplJcrInstallerProperties(
                    HandlerSchemes: _HandlerSchemes,
                    SlingJcrinstallFolderNameRegexp: _SlingJcrinstallFolderNameRegexp,
                    SlingJcrinstallFolderMaxDepth: _SlingJcrinstallFolderMaxDepth,
                    SlingJcrinstallSearchPath: _SlingJcrinstallSearchPath,
                    SlingJcrinstallNewConfigPath: _SlingJcrinstallNewConfigPath,
                    SlingJcrinstallSignalPath: _SlingJcrinstallSignalPath,
                    SlingJcrinstallEnableWriteback: _SlingJcrinstallEnableWriteback
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}