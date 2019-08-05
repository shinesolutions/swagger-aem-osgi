using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiSolrQueryIndexProvidInfo(
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