using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties
    /// </summary>
    public sealed class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties:  IEquatable<ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties>
    { 
        /// <summary>
        /// TranslationFactory
        /// </summary>
        public ConfigNodePropertyString TranslationFactory { get; private set; }

        /// <summary>
        /// DefaultConnectorLabel
        /// </summary>
        public ConfigNodePropertyString DefaultConnectorLabel { get; private set; }

        /// <summary>
        /// DefaultConnectorAttribution
        /// </summary>
        public ConfigNodePropertyString DefaultConnectorAttribution { get; private set; }

        /// <summary>
        /// DefaultConnectorWorkspaceId
        /// </summary>
        public ConfigNodePropertyString DefaultConnectorWorkspaceId { get; private set; }

        /// <summary>
        /// DefaultConnectorSubscriptionKey
        /// </summary>
        public ConfigNodePropertyString DefaultConnectorSubscriptionKey { get; private set; }

        /// <summary>
        /// LanguageMapLocation
        /// </summary>
        public ConfigNodePropertyString LanguageMapLocation { get; private set; }

        /// <summary>
        /// CategoryMapLocation
        /// </summary>
        public ConfigNodePropertyString CategoryMapLocation { get; private set; }

        /// <summary>
        /// RetryAttempts
        /// </summary>
        public ConfigNodePropertyInteger RetryAttempts { get; private set; }

        /// <summary>
        /// TimeoutCount
        /// </summary>
        public ConfigNodePropertyInteger TimeoutCount { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties()
        {
        }

        private ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(ConfigNodePropertyString TranslationFactory, ConfigNodePropertyString DefaultConnectorLabel, ConfigNodePropertyString DefaultConnectorAttribution, ConfigNodePropertyString DefaultConnectorWorkspaceId, ConfigNodePropertyString DefaultConnectorSubscriptionKey, ConfigNodePropertyString LanguageMapLocation, ConfigNodePropertyString CategoryMapLocation, ConfigNodePropertyInteger RetryAttempts, ConfigNodePropertyInteger TimeoutCount)
        {
            
            this.TranslationFactory = TranslationFactory;
            
            this.DefaultConnectorLabel = DefaultConnectorLabel;
            
            this.DefaultConnectorAttribution = DefaultConnectorAttribution;
            
            this.DefaultConnectorWorkspaceId = DefaultConnectorWorkspaceId;
            
            this.DefaultConnectorSubscriptionKey = DefaultConnectorSubscriptionKey;
            
            this.LanguageMapLocation = LanguageMapLocation;
            
            this.CategoryMapLocation = CategoryMapLocation;
            
            this.RetryAttempts = RetryAttempts;
            
            this.TimeoutCount = TimeoutCount;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder</returns>
        public static ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder Builder()
        {
            return new ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder</returns>
        public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder With()
        {
            return Builder()
                .TranslationFactory(TranslationFactory)
                .DefaultConnectorLabel(DefaultConnectorLabel)
                .DefaultConnectorAttribution(DefaultConnectorAttribution)
                .DefaultConnectorWorkspaceId(DefaultConnectorWorkspaceId)
                .DefaultConnectorSubscriptionKey(DefaultConnectorSubscriptionKey)
                .LanguageMapLocation(LanguageMapLocation)
                .CategoryMapLocation(CategoryMapLocation)
                .RetryAttempts(RetryAttempts)
                .TimeoutCount(TimeoutCount);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties left, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties</param>
        /// <param name="right">Compared (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties left, ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
        /// </summary>
        public sealed class ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder
        {
            private ConfigNodePropertyString _TranslationFactory;
            private ConfigNodePropertyString _DefaultConnectorLabel;
            private ConfigNodePropertyString _DefaultConnectorAttribution;
            private ConfigNodePropertyString _DefaultConnectorWorkspaceId;
            private ConfigNodePropertyString _DefaultConnectorSubscriptionKey;
            private ConfigNodePropertyString _LanguageMapLocation;
            private ConfigNodePropertyString _CategoryMapLocation;
            private ConfigNodePropertyInteger _RetryAttempts;
            private ConfigNodePropertyInteger _TimeoutCount;

            internal ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.TranslationFactory property.
            /// </summary>
            /// <param name="value">TranslationFactory</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder TranslationFactory(ConfigNodePropertyString value)
            {
                _TranslationFactory = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.DefaultConnectorLabel property.
            /// </summary>
            /// <param name="value">DefaultConnectorLabel</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder DefaultConnectorLabel(ConfigNodePropertyString value)
            {
                _DefaultConnectorLabel = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.DefaultConnectorAttribution property.
            /// </summary>
            /// <param name="value">DefaultConnectorAttribution</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder DefaultConnectorAttribution(ConfigNodePropertyString value)
            {
                _DefaultConnectorAttribution = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.DefaultConnectorWorkspaceId property.
            /// </summary>
            /// <param name="value">DefaultConnectorWorkspaceId</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder DefaultConnectorWorkspaceId(ConfigNodePropertyString value)
            {
                _DefaultConnectorWorkspaceId = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.DefaultConnectorSubscriptionKey property.
            /// </summary>
            /// <param name="value">DefaultConnectorSubscriptionKey</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder DefaultConnectorSubscriptionKey(ConfigNodePropertyString value)
            {
                _DefaultConnectorSubscriptionKey = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.LanguageMapLocation property.
            /// </summary>
            /// <param name="value">LanguageMapLocation</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder LanguageMapLocation(ConfigNodePropertyString value)
            {
                _LanguageMapLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.CategoryMapLocation property.
            /// </summary>
            /// <param name="value">CategoryMapLocation</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder CategoryMapLocation(ConfigNodePropertyString value)
            {
                _CategoryMapLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.RetryAttempts property.
            /// </summary>
            /// <param name="value">RetryAttempts</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder RetryAttempts(ConfigNodePropertyInteger value)
            {
                _RetryAttempts = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.TimeoutCount property.
            /// </summary>
            /// <param name="value">TimeoutCount</param>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslPropertiesBuilder TimeoutCount(ConfigNodePropertyInteger value)
            {
                _TimeoutCount = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties.
            /// </summary>
            /// <returns>ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties</returns>
            public ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties Build()
            {
                Validate();
                return new ComAdobeGraniteTranslationConnectorMsftCoreImplMicrosoftTranslProperties(
                    TranslationFactory: _TranslationFactory,
                    DefaultConnectorLabel: _DefaultConnectorLabel,
                    DefaultConnectorAttribution: _DefaultConnectorAttribution,
                    DefaultConnectorWorkspaceId: _DefaultConnectorWorkspaceId,
                    DefaultConnectorSubscriptionKey: _DefaultConnectorSubscriptionKey,
                    LanguageMapLocation: _LanguageMapLocation,
                    CategoryMapLocation: _CategoryMapLocation,
                    RetryAttempts: _RetryAttempts,
                    TimeoutCount: _TimeoutCount
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}