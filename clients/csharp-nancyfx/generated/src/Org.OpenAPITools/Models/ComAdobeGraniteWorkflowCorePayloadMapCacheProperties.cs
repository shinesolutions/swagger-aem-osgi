using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteWorkflowCorePayloadMapCacheProperties
    /// </summary>
    public sealed class ComAdobeGraniteWorkflowCorePayloadMapCacheProperties:  IEquatable<ComAdobeGraniteWorkflowCorePayloadMapCacheProperties>
    { 
        /// <summary>
        /// GetSystemWorkflowModels
        /// </summary>
        public ConfigNodePropertyArray GetSystemWorkflowModels { get; private set; }

        /// <summary>
        /// GetPackageRootPath
        /// </summary>
        public ConfigNodePropertyString GetPackageRootPath { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties()
        {
        }

        private ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(ConfigNodePropertyArray GetSystemWorkflowModels, ConfigNodePropertyString GetPackageRootPath)
        {
            
            this.GetSystemWorkflowModels = GetSystemWorkflowModels;
            
            this.GetPackageRootPath = GetPackageRootPath;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder</returns>
        public static ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder Builder()
        {
            return new ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder</returns>
        public ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder With()
        {
            return Builder()
                .GetSystemWorkflowModels(GetSystemWorkflowModels)
                .GetPackageRootPath(GetPackageRootPath);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteWorkflowCorePayloadMapCacheProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties left, ComAdobeGraniteWorkflowCorePayloadMapCacheProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteWorkflowCorePayloadMapCacheProperties left, ComAdobeGraniteWorkflowCorePayloadMapCacheProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.
        /// </summary>
        public sealed class ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder
        {
            private ConfigNodePropertyArray _GetSystemWorkflowModels;
            private ConfigNodePropertyString _GetPackageRootPath;

            internal ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.GetSystemWorkflowModels property.
            /// </summary>
            /// <param name="value">GetSystemWorkflowModels</param>
            public ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder GetSystemWorkflowModels(ConfigNodePropertyArray value)
            {
                _GetSystemWorkflowModels = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.GetPackageRootPath property.
            /// </summary>
            /// <param name="value">GetPackageRootPath</param>
            public ComAdobeGraniteWorkflowCorePayloadMapCachePropertiesBuilder GetPackageRootPath(ConfigNodePropertyString value)
            {
                _GetPackageRootPath = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteWorkflowCorePayloadMapCacheProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteWorkflowCorePayloadMapCacheProperties</returns>
            public ComAdobeGraniteWorkflowCorePayloadMapCacheProperties Build()
            {
                Validate();
                return new ComAdobeGraniteWorkflowCorePayloadMapCacheProperties(
                    GetSystemWorkflowModels: _GetSystemWorkflowModels,
                    GetPackageRootPath: _GetPackageRootPath
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}