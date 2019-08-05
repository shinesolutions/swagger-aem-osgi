using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiEmbeddedSolrServerCoInfo(
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