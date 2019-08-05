using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties
    /// </summary>
    public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties:  IEquatable<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties>
    { 
        /// <summary>
        /// FontList
        /// </summary>
        public ConfigNodePropertyArray FontList { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties()
        {
        }

        private AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(ConfigNodePropertyArray FontList)
        {
            
            this.FontList = FontList;
            
        }

        /// <summary>
        /// Returns builder of AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder</returns>
        public static AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder Builder()
        {
            return new AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder();
        }

        /// <summary>
        /// Returns AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder</returns>
        public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder With()
        {
            return Builder()
                .FontList(FontList);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties left, AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties left, AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.
        /// </summary>
        public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder
        {
            private ConfigNodePropertyArray _FontList;

            internal AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.FontList property.
            /// </summary>
            /// <param name="value">FontList</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurPropertiesBuilder FontList(ConfigNodePropertyArray value)
            {
                _FontList = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties.
            /// </summary>
            /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties</returns>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties Build()
            {
                Validate();
                return new AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties(
                    FontList: _FontList
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}