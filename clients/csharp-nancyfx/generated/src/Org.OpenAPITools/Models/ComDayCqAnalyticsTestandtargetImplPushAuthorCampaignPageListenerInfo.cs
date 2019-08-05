using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo:  IEquatable<ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo>
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
        public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo()
        {
        }

        private ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo(string Pid, string Title, string Description, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder</returns>
        public static ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder</returns>
        public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo left, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo left, ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder Properties(ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo</returns>
            public ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsTestandtargetImplPushAuthorCampaignPageListenerInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}