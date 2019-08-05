using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo:  IEquatable<OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo>
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
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo left, OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfoBuilder Properties(OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo</returns>
            public OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsDocumentDocumentNodeStoreServiceInfo(
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