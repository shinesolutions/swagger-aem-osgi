using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo
    /// </summary>
    public sealed class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo:  IEquatable<OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo>
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
        public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo()
        {
        }

        private OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo(string Pid, string Title, string Description, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder</returns>
        public static OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder Builder()
        {
            return new OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder</returns>
        public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder With()
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

        public bool Equals(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo left, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo</param>
        /// <param name="right">Compared (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo left, OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.
        /// </summary>
        public sealed class OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties _Properties;

            internal OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfoBuilder Properties(OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo.
            /// </summary>
            /// <returns>OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo</returns>
            public OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo Build()
            {
                Validate();
                return new OrgApacheJackrabbitOakPluginsDocumentSecondarySecondaryStoreCacInfo(
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