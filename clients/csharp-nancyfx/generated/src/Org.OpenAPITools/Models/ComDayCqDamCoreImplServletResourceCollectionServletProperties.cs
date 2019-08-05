using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamCoreImplServletResourceCollectionServletProperties
    /// </summary>
    public sealed class ComDayCqDamCoreImplServletResourceCollectionServletProperties:  IEquatable<ComDayCqDamCoreImplServletResourceCollectionServletProperties>
    { 
        /// <summary>
        /// SlingServletResourceTypes
        /// </summary>
        public ConfigNodePropertyArray SlingServletResourceTypes { get; private set; }

        /// <summary>
        /// SlingServletMethods
        /// </summary>
        public ConfigNodePropertyString SlingServletMethods { get; private set; }

        /// <summary>
        /// SlingServletSelectors
        /// </summary>
        public ConfigNodePropertyString SlingServletSelectors { get; private set; }

        /// <summary>
        /// DownloadConfig
        /// </summary>
        public ConfigNodePropertyString DownloadConfig { get; private set; }

        /// <summary>
        /// ViewSelector
        /// </summary>
        public ConfigNodePropertyString ViewSelector { get; private set; }

        /// <summary>
        /// SendEmail
        /// </summary>
        public ConfigNodePropertyBoolean SendEmail { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqDamCoreImplServletResourceCollectionServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamCoreImplServletResourceCollectionServletProperties()
        {
        }

        private ComDayCqDamCoreImplServletResourceCollectionServletProperties(ConfigNodePropertyArray SlingServletResourceTypes, ConfigNodePropertyString SlingServletMethods, ConfigNodePropertyString SlingServletSelectors, ConfigNodePropertyString DownloadConfig, ConfigNodePropertyString ViewSelector, ConfigNodePropertyBoolean SendEmail)
        {
            
            this.SlingServletResourceTypes = SlingServletResourceTypes;
            
            this.SlingServletMethods = SlingServletMethods;
            
            this.SlingServletSelectors = SlingServletSelectors;
            
            this.DownloadConfig = DownloadConfig;
            
            this.ViewSelector = ViewSelector;
            
            this.SendEmail = SendEmail;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamCoreImplServletResourceCollectionServletProperties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder</returns>
        public static ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder Builder()
        {
            return new ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder</returns>
        public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder With()
        {
            return Builder()
                .SlingServletResourceTypes(SlingServletResourceTypes)
                .SlingServletMethods(SlingServletMethods)
                .SlingServletSelectors(SlingServletSelectors)
                .DownloadConfig(DownloadConfig)
                .ViewSelector(ViewSelector)
                .SendEmail(SendEmail);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqDamCoreImplServletResourceCollectionServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamCoreImplServletResourceCollectionServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletResourceCollectionServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletResourceCollectionServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamCoreImplServletResourceCollectionServletProperties left, ComDayCqDamCoreImplServletResourceCollectionServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamCoreImplServletResourceCollectionServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamCoreImplServletResourceCollectionServletProperties</param>
        /// <param name="right">Compared (ComDayCqDamCoreImplServletResourceCollectionServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamCoreImplServletResourceCollectionServletProperties left, ComDayCqDamCoreImplServletResourceCollectionServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamCoreImplServletResourceCollectionServletProperties.
        /// </summary>
        public sealed class ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder
        {
            private ConfigNodePropertyArray _SlingServletResourceTypes;
            private ConfigNodePropertyString _SlingServletMethods;
            private ConfigNodePropertyString _SlingServletSelectors;
            private ConfigNodePropertyString _DownloadConfig;
            private ConfigNodePropertyString _ViewSelector;
            private ConfigNodePropertyBoolean _SendEmail;

            internal ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletProperties.SlingServletResourceTypes property.
            /// </summary>
            /// <param name="value">SlingServletResourceTypes</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder SlingServletResourceTypes(ConfigNodePropertyArray value)
            {
                _SlingServletResourceTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletProperties.SlingServletMethods property.
            /// </summary>
            /// <param name="value">SlingServletMethods</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder SlingServletMethods(ConfigNodePropertyString value)
            {
                _SlingServletMethods = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletProperties.SlingServletSelectors property.
            /// </summary>
            /// <param name="value">SlingServletSelectors</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder SlingServletSelectors(ConfigNodePropertyString value)
            {
                _SlingServletSelectors = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletProperties.DownloadConfig property.
            /// </summary>
            /// <param name="value">DownloadConfig</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder DownloadConfig(ConfigNodePropertyString value)
            {
                _DownloadConfig = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletProperties.ViewSelector property.
            /// </summary>
            /// <param name="value">ViewSelector</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder ViewSelector(ConfigNodePropertyString value)
            {
                _ViewSelector = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamCoreImplServletResourceCollectionServletProperties.SendEmail property.
            /// </summary>
            /// <param name="value">SendEmail</param>
            public ComDayCqDamCoreImplServletResourceCollectionServletPropertiesBuilder SendEmail(ConfigNodePropertyBoolean value)
            {
                _SendEmail = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamCoreImplServletResourceCollectionServletProperties.
            /// </summary>
            /// <returns>ComDayCqDamCoreImplServletResourceCollectionServletProperties</returns>
            public ComDayCqDamCoreImplServletResourceCollectionServletProperties Build()
            {
                Validate();
                return new ComDayCqDamCoreImplServletResourceCollectionServletProperties(
                    SlingServletResourceTypes: _SlingServletResourceTypes,
                    SlingServletMethods: _SlingServletMethods,
                    SlingServletSelectors: _SlingServletSelectors,
                    DownloadConfig: _DownloadConfig,
                    ViewSelector: _ViewSelector,
                    SendEmail: _SendEmail
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}