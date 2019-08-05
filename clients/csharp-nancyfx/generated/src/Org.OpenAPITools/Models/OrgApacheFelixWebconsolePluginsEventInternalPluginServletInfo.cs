using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo
    /// </summary>
    public sealed class OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo:  IEquatable<OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo>
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
        public OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo()
        {
        }

        private OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo(string Pid, string Title, string Description, OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder</returns>
        public static OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder Builder()
        {
            return new OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder();
        }

        /// <summary>
        /// Returns OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder</returns>
        public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder With()
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

        public bool Equals(OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo left, OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.
        /// </summary>
        /// <param name="left">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo</param>
        /// <param name="right">Compared (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo left, OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.
        /// </summary>
        public sealed class OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties _Properties;

            internal OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfoBuilder Properties(OrgApacheFelixWebconsolePluginsEventInternalPluginServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo.
            /// </summary>
            /// <returns>OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo</returns>
            public OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo Build()
            {
                Validate();
                return new OrgApacheFelixWebconsolePluginsEventInternalPluginServletInfo(
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