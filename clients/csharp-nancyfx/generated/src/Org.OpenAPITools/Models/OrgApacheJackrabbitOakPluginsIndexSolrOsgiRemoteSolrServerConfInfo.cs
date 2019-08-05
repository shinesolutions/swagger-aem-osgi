using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiRemoteSolrServerConfInfo(
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