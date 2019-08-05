using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// GuideLocalizationServiceProperties
    /// </summary>
    public sealed class GuideLocalizationServiceProperties:  IEquatable<GuideLocalizationServiceProperties>
    { 
        /// <summary>
        /// SupportedLocales
        /// </summary>
        public ConfigNodePropertyArray SupportedLocales { get; private set; }

        /// <summary>
        /// LocalizableProperties
        /// </summary>
        public ConfigNodePropertyArray LocalizableProperties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use GuideLocalizationServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public GuideLocalizationServiceProperties()
        {
        }

        private GuideLocalizationServiceProperties(ConfigNodePropertyArray SupportedLocales, ConfigNodePropertyArray LocalizableProperties)
        {
            
            this.SupportedLocales = SupportedLocales;
            
            this.LocalizableProperties = LocalizableProperties;
            
        }

        /// <summary>
        /// Returns builder of GuideLocalizationServiceProperties.
        /// </summary>
        /// <returns>GuideLocalizationServicePropertiesBuilder</returns>
        public static GuideLocalizationServicePropertiesBuilder Builder()
        {
            return new GuideLocalizationServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns GuideLocalizationServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>GuideLocalizationServicePropertiesBuilder</returns>
        public GuideLocalizationServicePropertiesBuilder With()
        {
            return Builder()
                .SupportedLocales(SupportedLocales)
                .LocalizableProperties(LocalizableProperties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(GuideLocalizationServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (GuideLocalizationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (GuideLocalizationServiceProperties</param>
        /// <param name="right">Compared (GuideLocalizationServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (GuideLocalizationServiceProperties left, GuideLocalizationServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (GuideLocalizationServiceProperties.
        /// </summary>
        /// <param name="left">Compared (GuideLocalizationServiceProperties</param>
        /// <param name="right">Compared (GuideLocalizationServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (GuideLocalizationServiceProperties left, GuideLocalizationServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of GuideLocalizationServiceProperties.
        /// </summary>
        public sealed class GuideLocalizationServicePropertiesBuilder
        {
            private ConfigNodePropertyArray _SupportedLocales;
            private ConfigNodePropertyArray _LocalizableProperties;

            internal GuideLocalizationServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for GuideLocalizationServiceProperties.SupportedLocales property.
            /// </summary>
            /// <param name="value">SupportedLocales</param>
            public GuideLocalizationServicePropertiesBuilder SupportedLocales(ConfigNodePropertyArray value)
            {
                _SupportedLocales = value;
                return this;
            }

            /// <summary>
            /// Sets value for GuideLocalizationServiceProperties.LocalizableProperties property.
            /// </summary>
            /// <param name="value">LocalizableProperties</param>
            public GuideLocalizationServicePropertiesBuilder LocalizableProperties(ConfigNodePropertyArray value)
            {
                _LocalizableProperties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of GuideLocalizationServiceProperties.
            /// </summary>
            /// <returns>GuideLocalizationServiceProperties</returns>
            public GuideLocalizationServiceProperties Build()
            {
                Validate();
                return new GuideLocalizationServiceProperties(
                    SupportedLocales: _SupportedLocales,
                    LocalizableProperties: _LocalizableProperties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}