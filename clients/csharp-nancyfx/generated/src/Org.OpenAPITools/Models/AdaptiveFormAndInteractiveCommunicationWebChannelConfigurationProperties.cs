using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties
    /// </summary>
    public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties:  IEquatable<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties>
    { 
        /// <summary>
        /// ShowPlaceholder
        /// </summary>
        public ConfigNodePropertyBoolean ShowPlaceholder { get; private set; }

        /// <summary>
        /// MaximumCacheEntries
        /// </summary>
        public ConfigNodePropertyInteger MaximumCacheEntries { get; private set; }

        /// <summary>
        /// AfScriptingCompatversion
        /// </summary>
        public ConfigNodePropertyDropDown AfScriptingCompatversion { get; private set; }

        /// <summary>
        /// MakeFileNameUnique
        /// </summary>
        public ConfigNodePropertyBoolean MakeFileNameUnique { get; private set; }

        /// <summary>
        /// GeneratingCompliantData
        /// </summary>
        public ConfigNodePropertyBoolean GeneratingCompliantData { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties()
        {
        }

        private AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(ConfigNodePropertyBoolean ShowPlaceholder, ConfigNodePropertyInteger MaximumCacheEntries, ConfigNodePropertyDropDown AfScriptingCompatversion, ConfigNodePropertyBoolean MakeFileNameUnique, ConfigNodePropertyBoolean GeneratingCompliantData)
        {
            
            this.ShowPlaceholder = ShowPlaceholder;
            
            this.MaximumCacheEntries = MaximumCacheEntries;
            
            this.AfScriptingCompatversion = AfScriptingCompatversion;
            
            this.MakeFileNameUnique = MakeFileNameUnique;
            
            this.GeneratingCompliantData = GeneratingCompliantData;
            
        }

        /// <summary>
        /// Returns builder of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder</returns>
        public static AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder Builder()
        {
            return new AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder();
        }

        /// <summary>
        /// Returns AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder</returns>
        public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder With()
        {
            return Builder()
                .ShowPlaceholder(ShowPlaceholder)
                .MaximumCacheEntries(MaximumCacheEntries)
                .AfScriptingCompatversion(AfScriptingCompatversion)
                .MakeFileNameUnique(MakeFileNameUnique)
                .GeneratingCompliantData(GeneratingCompliantData);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties left, AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties left, AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
        /// </summary>
        public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder
        {
            private ConfigNodePropertyBoolean _ShowPlaceholder;
            private ConfigNodePropertyInteger _MaximumCacheEntries;
            private ConfigNodePropertyDropDown _AfScriptingCompatversion;
            private ConfigNodePropertyBoolean _MakeFileNameUnique;
            private ConfigNodePropertyBoolean _GeneratingCompliantData;

            internal AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.ShowPlaceholder property.
            /// </summary>
            /// <param name="value">ShowPlaceholder</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder ShowPlaceholder(ConfigNodePropertyBoolean value)
            {
                _ShowPlaceholder = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.MaximumCacheEntries property.
            /// </summary>
            /// <param name="value">MaximumCacheEntries</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder MaximumCacheEntries(ConfigNodePropertyInteger value)
            {
                _MaximumCacheEntries = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.AfScriptingCompatversion property.
            /// </summary>
            /// <param name="value">AfScriptingCompatversion</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder AfScriptingCompatversion(ConfigNodePropertyDropDown value)
            {
                _AfScriptingCompatversion = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.MakeFileNameUnique property.
            /// </summary>
            /// <param name="value">MakeFileNameUnique</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder MakeFileNameUnique(ConfigNodePropertyBoolean value)
            {
                _MakeFileNameUnique = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.GeneratingCompliantData property.
            /// </summary>
            /// <param name="value">GeneratingCompliantData</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationPropertiesBuilder GeneratingCompliantData(ConfigNodePropertyBoolean value)
            {
                _GeneratingCompliantData = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties.
            /// </summary>
            /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties</returns>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties Build()
            {
                Validate();
                return new AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties(
                    ShowPlaceholder: _ShowPlaceholder,
                    MaximumCacheEntries: _MaximumCacheEntries,
                    AfScriptingCompatversion: _AfScriptingCompatversion,
                    MakeFileNameUnique: _MakeFileNameUnique,
                    GeneratingCompliantData: _GeneratingCompliantData
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}