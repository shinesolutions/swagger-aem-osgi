using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrServerProviderSeInfo(
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