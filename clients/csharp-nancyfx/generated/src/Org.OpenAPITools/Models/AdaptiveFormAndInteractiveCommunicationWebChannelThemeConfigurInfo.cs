using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo
    /// </summary>
    public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo:  IEquatable<AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo()
        {
        }

        private AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo(string Pid, string Title, string Description, AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder</returns>
        public static AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder Builder()
        {
            return new AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder();
        }

        /// <summary>
        /// Returns AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder</returns>
        public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo left, AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo left, AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.
        /// </summary>
        public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties _Properties;

            internal AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfoBuilder Properties(AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo.
            /// </summary>
            /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo</returns>
            public AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo Build()
            {
                Validate();
                return new AdaptiveFormAndInteractiveCommunicationWebChannelThemeConfigurInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}