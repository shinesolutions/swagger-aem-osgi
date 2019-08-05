using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo
    /// </summary>
    public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo:  IEquatable<AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo>
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
        public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo()
        {
        }

        private AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo(string Pid, string Title, string Description, AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder</returns>
        public static AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder Builder()
        {
            return new AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder();
        }

        /// <summary>
        /// Returns AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder</returns>
        public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder With()
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

        public bool Equals(AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo left, AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.
        /// </summary>
        /// <param name="left">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo</param>
        /// <param name="right">Compared (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo left, AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.
        /// </summary>
        public sealed class AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties _Properties;

            internal AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfoBuilder Properties(AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo.
            /// </summary>
            /// <returns>AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo</returns>
            public AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo Build()
            {
                Validate();
                return new AdaptiveFormAndInteractiveCommunicationWebChannelConfigurationInfo(
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