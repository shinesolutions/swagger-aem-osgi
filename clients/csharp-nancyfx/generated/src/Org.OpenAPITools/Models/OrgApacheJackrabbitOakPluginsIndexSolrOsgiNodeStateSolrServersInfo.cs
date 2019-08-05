using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo:  IEquatable<OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo>
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
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo left, OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfoBuilder Properties(OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo</returns>
            public OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsIndexSolrOsgiNodeStateSolrServersInfo(
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