using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties
    /// </summary>
    public sealed class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties:  IEquatable<ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties>
    { 
        /// <summary>
        /// TranslateLanguage
        /// </summary>
        public ConfigNodePropertyDropDown TranslateLanguage { get; private set; }

        /// <summary>
        /// TranslateDisplay
        /// </summary>
        public ConfigNodePropertyDropDown TranslateDisplay { get; private set; }

        /// <summary>
        /// TranslateAttribution
        /// </summary>
        public ConfigNodePropertyBoolean TranslateAttribution { get; private set; }

        /// <summary>
        /// TranslateCaching
        /// </summary>
        public ConfigNodePropertyDropDown TranslateCaching { get; private set; }

        /// <summary>
        /// TranslateSmartRendering
        /// </summary>
        public ConfigNodePropertyDropDown TranslateSmartRendering { get; private set; }

        /// <summary>
        /// TranslateCachingDuration
        /// </summary>
        public ConfigNodePropertyString TranslateCachingDuration { get; private set; }

        /// <summary>
        /// TranslateSessionSaveInterval
        /// </summary>
        public ConfigNodePropertyString TranslateSessionSaveInterval { get; private set; }

        /// <summary>
        /// TranslateSessionSaveBatchLimit
        /// </summary>
        public ConfigNodePropertyString TranslateSessionSaveBatchLimit { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties()
        {
        }

        private ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(ConfigNodePropertyDropDown TranslateLanguage, ConfigNodePropertyDropDown TranslateDisplay, ConfigNodePropertyBoolean TranslateAttribution, ConfigNodePropertyDropDown TranslateCaching, ConfigNodePropertyDropDown TranslateSmartRendering, ConfigNodePropertyString TranslateCachingDuration, ConfigNodePropertyString TranslateSessionSaveInterval, ConfigNodePropertyString TranslateSessionSaveBatchLimit)
        {
            
            this.TranslateLanguage = TranslateLanguage;
            
            this.TranslateDisplay = TranslateDisplay;
            
            this.TranslateAttribution = TranslateAttribution;
            
            this.TranslateCaching = TranslateCaching;
            
            this.TranslateSmartRendering = TranslateSmartRendering;
            
            this.TranslateCachingDuration = TranslateCachingDuration;
            
            this.TranslateSessionSaveInterval = TranslateSessionSaveInterval;
            
            this.TranslateSessionSaveBatchLimit = TranslateSessionSaveBatchLimit;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
        /// </summary>
        /// <returns>ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder</returns>
        public static ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder Builder()
        {
            return new ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder</returns>
        public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder With()
        {
            return Builder()
                .TranslateLanguage(TranslateLanguage)
                .TranslateDisplay(TranslateDisplay)
                .TranslateAttribution(TranslateAttribution)
                .TranslateCaching(TranslateCaching)
                .TranslateSmartRendering(TranslateSmartRendering)
                .TranslateCachingDuration(TranslateCachingDuration)
                .TranslateSessionSaveInterval(TranslateSessionSaveInterval)
                .TranslateSessionSaveBatchLimit(TranslateSessionSaveBatchLimit);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties left, ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties</param>
        /// <param name="right">Compared (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties left, ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
        /// </summary>
        public sealed class ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder
        {
            private ConfigNodePropertyDropDown _TranslateLanguage;
            private ConfigNodePropertyDropDown _TranslateDisplay;
            private ConfigNodePropertyBoolean _TranslateAttribution;
            private ConfigNodePropertyDropDown _TranslateCaching;
            private ConfigNodePropertyDropDown _TranslateSmartRendering;
            private ConfigNodePropertyString _TranslateCachingDuration;
            private ConfigNodePropertyString _TranslateSessionSaveInterval;
            private ConfigNodePropertyString _TranslateSessionSaveBatchLimit;

            internal ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateLanguage property.
            /// </summary>
            /// <param name="value">TranslateLanguage</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateLanguage(ConfigNodePropertyDropDown value)
            {
                _TranslateLanguage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateDisplay property.
            /// </summary>
            /// <param name="value">TranslateDisplay</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateDisplay(ConfigNodePropertyDropDown value)
            {
                _TranslateDisplay = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateAttribution property.
            /// </summary>
            /// <param name="value">TranslateAttribution</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateAttribution(ConfigNodePropertyBoolean value)
            {
                _TranslateAttribution = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateCaching property.
            /// </summary>
            /// <param name="value">TranslateCaching</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateCaching(ConfigNodePropertyDropDown value)
            {
                _TranslateCaching = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateSmartRendering property.
            /// </summary>
            /// <param name="value">TranslateSmartRendering</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateSmartRendering(ConfigNodePropertyDropDown value)
            {
                _TranslateSmartRendering = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateCachingDuration property.
            /// </summary>
            /// <param name="value">TranslateCachingDuration</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateCachingDuration(ConfigNodePropertyString value)
            {
                _TranslateCachingDuration = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateSessionSaveInterval property.
            /// </summary>
            /// <param name="value">TranslateSessionSaveInterval</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateSessionSaveInterval(ConfigNodePropertyString value)
            {
                _TranslateSessionSaveInterval = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.TranslateSessionSaveBatchLimit property.
            /// </summary>
            /// <param name="value">TranslateSessionSaveBatchLimit</param>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerPropertiesBuilder TranslateSessionSaveBatchLimit(ConfigNodePropertyString value)
            {
                _TranslateSessionSaveBatchLimit = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties.
            /// </summary>
            /// <returns>ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties</returns>
            public ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties Build()
            {
                Validate();
                return new ComAdobeCqSocialTranslationImplTranslationServiceConfigManagerProperties(
                    TranslateLanguage: _TranslateLanguage,
                    TranslateDisplay: _TranslateDisplay,
                    TranslateAttribution: _TranslateAttribution,
                    TranslateCaching: _TranslateCaching,
                    TranslateSmartRendering: _TranslateSmartRendering,
                    TranslateCachingDuration: _TranslateCachingDuration,
                    TranslateSessionSaveInterval: _TranslateSessionSaveInterval,
                    TranslateSessionSaveBatchLimit: _TranslateSessionSaveBatchLimit
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}