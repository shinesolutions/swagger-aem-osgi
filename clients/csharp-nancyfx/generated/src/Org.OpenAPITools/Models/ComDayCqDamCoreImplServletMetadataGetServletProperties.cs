using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletMetadataGetServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletMetadataGetServletProperties:  IEquatable<ComDayCqDamCoreImplServletMetadataGetServletProperties>
    { 
        /// <summary>
        /// SlingServletResourceTypes
        /// </summary>
        public ConfigNodePropertyString SlingServletResourceTypes { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyString SlingServletMethods { get; private set; }

        /// <summary>
        /// SlingServletExtensions
        /// </summary>
        public ConfigNodePropertyString SlingServletExtensions { get; private set; }

        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyString SlingServletSelectors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletMetadataGetServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletMetadataGetServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletMetadataGetServletProperties(ConfigNodePropertyString SlingServletResourceTypes, ConfigNodePropertyString SlingServletMethods, ConfigNodePropertyString SlingServletExtensions, ConfigNodePropertyString SlingServletSelectors)
        {
            
            this.SlingServletResourceTypes = SlingServletResourceTypes;
            
            this.SlingServletMethods = SlingServletMethods;
            
            this.SlingServletExtensions = SlingServletExtensions;
            
            this.SlingServletSelectors = SlingServletSelectors;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletMetadataGetServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletResourceTypes(SlingServletResourceTypes)
                .SlingServletMethods(SlingServletMethods)
                .SlingServletExtensions(SlingServletExtensions)
                .SlingServletSelectors(SlingServletSelectors);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletMetadataGetServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletMetadataGetServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMetadataGetServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMetadataGetServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletMetadataGetServletProperties left, ComDayCqDamCoreImplServletMetadataGetServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletMetadataGetServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletMetadataGetServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletMetadataGetServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletMetadataGetServletProperties left, ComDayCqDamCoreImplServletMetadataGetServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletMetadataGetServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder
        {
            private ConfigNodePropertyString _SlingServletResourceTypes;
            private ConfigNodePropertyString _SlingServletMethods;
            private ConfigNodePropertyString _SlingServletExtensions;
            private ConfigNodePropertyString _SlingServletSelectors;

            internal ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletProperties.SlingServletResourceTypes property.
            /// </summary>
            /// <param name="value">SlingServletResourceTypes</param>
            public ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder SlingServletResourceTypes(ConfigNodePropertyString value)
            {
                _SlingServletResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyString value)
            {
                _SlingServletMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletProperties.SlingServletExtensions property.
            /// </summary>
            /// <param name="value">SlingServletExtensions</param>
            public ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder SlingServletExtensions(ConfigNodePropertyString value)
            {
                _SlingServletExtensions = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletMetadataGetServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComDayCqDamCoreImplServletMetadataGetServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyString value)
            {
                _SlingServletSelectors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletMetadataGetServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletMetadataGetServletProperties</returns>
            public ComDayCqDamCoreImplServletMetadataGetServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletMetadataGetServletProperties(
                    SlingServletResourceTypes: _SlingServletResourceTypes,
                    SlingServletMethods: _SlingServletMethods,
                    SlingServletExtensions: _SlingServletExtensions,
                    SlingServletSelectors: _SlingServletSelectors
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}