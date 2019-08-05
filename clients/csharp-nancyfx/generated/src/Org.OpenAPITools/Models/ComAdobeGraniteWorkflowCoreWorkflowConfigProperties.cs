using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCoreWorkflowConfigProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCoreWorkflowConfigProperties:  IEquatable<ComAdobeGraniteWorkflowCoreWorkflowConfigProperties>
    { 
        /// <summary>
        /// CqWorkflowConfigWorkflowPackagesRootPath
        /// </summary>
        public ConfigNodePropertyArray CqWorkflowConfigWorkflowPackagesRootPath { get; private set; }

        /// <summary>
        /// CqWorkflowConfigWorkflowProcessLegacyMode
        /// </summary>
        public ConfigNodePropertyBoolean CqWorkflowConfigWorkflowProcessLegacyMode { get; private set; }

        /// <summary>
        /// CqWorkflowConfigAllowLocking
        /// </summary>
        public ConfigNodePropertyBoolean CqWorkflowConfigAllowLocking { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties()
        {
        }

        private ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(ConfigNodePropertyArray CqWorkflowConfigWorkflowPackagesRootPath, ConfigNodePropertyBoolean CqWorkflowConfigWorkflowProcessLegacyMode, ConfigNodePropertyBoolean CqWorkflowConfigAllowLocking)
        {
            
            this.CqWorkflowConfigWorkflowPackagesRootPath = CqWorkflowConfigWorkflowPackagesRootPath;
            
            this.CqWorkflowConfigWorkflowProcessLegacyMode = CqWorkflowConfigWorkflowProcessLegacyMode;
            
            this.CqWorkflowConfigAllowLocking = CqWorkflowConfigAllowLocking;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder With()
        {
            return Builder()
                .CqWorkflowConfigWorkflowPackagesRootPath(CqWorkflowConfigWorkflowPackagesRootPath)
                .CqWorkflowConfigWorkflowProcessLegacyMode(CqWorkflowConfigWorkflowProcessLegacyMode)
                .CqWorkflowConfigAllowLocking(CqWorkflowConfigAllowLocking);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCoreWorkflowConfigProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties left, ComAdobeGraniteWorkflowCoreWorkflowConfigProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCoreWorkflowConfigProperties left, ComAdobeGraniteWorkflowCoreWorkflowConfigProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder
        {
            private ConfigNodePropertyArray _CqWorkflowConfigWorkflowPackagesRootPath;
            private ConfigNodePropertyBoolean _CqWorkflowConfigWorkflowProcessLegacyMode;
            private ConfigNodePropertyBoolean _CqWorkflowConfigAllowLocking;

            internal ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.CqWorkflowConfigWorkflowPackagesRootPath property.
            /// </summary>
            /// <param name="value">CqWorkflowConfigWorkflowPackagesRootPath</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder CqWorkflowConfigWorkflowPackagesRootPath(ConfigNodePropertyArray value)
            {
                _CqWorkflowConfigWorkflowPackagesRootPath = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.CqWorkflowConfigWorkflowProcessLegacyMode property.
            /// </summary>
            /// <param name="value">CqWorkflowConfigWorkflowProcessLegacyMode</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder CqWorkflowConfigWorkflowProcessLegacyMode(ConfigNodePropertyBoolean value)
            {
                _CqWorkflowConfigWorkflowProcessLegacyMode = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.CqWorkflowConfigAllowLocking property.
            /// </summary>
            /// <param name="value">CqWorkflowConfigAllowLocking</param>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigPropertiesBuilder CqWorkflowConfigAllowLocking(ConfigNodePropertyBoolean value)
            {
                _CqWorkflowConfigAllowLocking = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCoreWorkflowConfigProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCoreWorkflowConfigProperties</returns>
            public ComAdobeGraniteWorkflowCoreWorkflowConfigProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCoreWorkflowConfigProperties(
                    CqWorkflowConfigWorkflowPackagesRootPath: _CqWorkflowConfigWorkflowPackagesRootPath,
                    CqWorkflowConfigWorkflowProcessLegacyMode: _CqWorkflowConfigWorkflowProcessLegacyMode,
                    CqWorkflowConfigAllowLocking: _CqWorkflowConfigAllowLocking
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}