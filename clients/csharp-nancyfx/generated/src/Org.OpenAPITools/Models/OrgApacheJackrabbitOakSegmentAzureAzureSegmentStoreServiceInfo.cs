using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo:  IEquatable<OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo>
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
        public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo()
        {
        }

        private OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder</returns>
        public static OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder</returns>
        public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo left, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo left, OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties _Properties;

            internal OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfoBuilder Properties(OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo</returns>
            public OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakSegmentAzureAzureSegmentStoreServiceInfo(
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